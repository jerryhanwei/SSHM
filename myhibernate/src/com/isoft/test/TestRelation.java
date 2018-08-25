package com.isoft.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.isoft.model.Department;
import com.isoft.model.District;
import com.isoft.model.Employee;
import com.isoft.model.Person;
import com.isoft.model.Project;
import com.isoft.model.Street;

public class TestRelation {

	@Test
	public void testLazyLoad(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		/*District district = (District)session.load(District.class, 12345);
		System.out.println(district.getDistrictName());*/
		
		Street street = (Street)session.load(Street.class, 134);
		System.out.println(street.getStreetName());
		System.out.println(street.getDistrict().getDistrictName());
		
	}
	
	public void getData(List tempList,Object obj)
	{
		Iterator iterator = tempList.iterator();
		while(iterator.hasNext())
		{
			Object newObj  = (obj)iterator.next();
			System.out.println(employee.getEname());
		}
	}
	
	@Test// 多表查询
	public void testCriteria2(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		Employee emp = new Employee();
		emp.setEname("tom");
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Example.create(emp));
		List tempList = criteria.list();
		Iterator iterator = tempList.iterator();
		while(iterator.hasNext())
		{
			Employee employee = (Employee)iterator.next();
			System.out.println(employee.getEname());
		}
		
	}
	
	@Test// 查询
	public void testCriteria(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("ename","tom"));
		List tempList = criteria.list();
		Iterator iterator = tempList.iterator();
		while(iterator.hasNext())
		{
			Employee employee = (Employee)iterator.next();
			System.out.println(employee.getEname());
		}
		
		}
	
	@Test// 多表查询
	public void testMultipleTable(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		String hql = "select d,e from Department d,Employee e where d.deptid=e.deptid";
		Query query = session.createQuery(hql);
		//String sql = "SELECT d.*,e.* from t_department d LEFT JOIN t_employee e on d.t_dept_id=e.t_deptid";
		//SQLQuery sqlQuery = session.createSQLQuery(sql);
		//List tempList = sqlQuery.list();
		List tempList = query.list();
		Iterator iterator = tempList.iterator();
		while(iterator.hasNext())
		{
			Object[] objArray = (Object[]) iterator.next();
			Department department = (Department) objArray[0];
			Employee employee = (Employee) objArray[1];
			System.out.println(department.getDname()+employee.getEname());
		}
	}
	
	@Test
	public void testMany2Many(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		
		Transaction tx = session.beginTransaction();
		
		Person person1 = new Person();
		Person person2 = new Person();
		Project oneProject = new Project();
		Project twoProject = new Project();
		
		person1.setPersonID("1");
		person1.setPersonName("张三");
		person1.getProjectSet().add(oneProject);
		
		person2.setPersonID("2");
		person2.setPersonName("李四");
		person2.getProjectSet().add(twoProject);
		
		oneProject.setProjectId("a");
		oneProject.setProjectName("医院项目");
		oneProject.getPersonSet().add(person1);

		twoProject.setProjectId("b");
		twoProject.setProjectName("学校项目");
		twoProject.getPersonSet().add(person2);
		
		session.save(person1);
		session.save(person2);
		session.save(oneProject);
		session.save(twoProject);
		tx.commit();
	}
	
	@Test
	public void testDoubleOne2Many(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		Department department = (Department)session.get(Department.class, "5d1616c6-52bb-4c7b-9ed7-fccc62c462bf");
		System.out.println(department.getDname());
		
		Set eSet = department.getEmployees();
		
		Iterator iterator = eSet.iterator();
		while(iterator.hasNext())
		{
			Employee ee = (Employee)iterator.next();
			System.out.println(ee.getEname());
		}
	}
	
	@Test
	public void testDoubleOne2ManyInsert1(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		
		Transaction tx = session.beginTransaction();
		
		Department department = new Department();
		department.setDeptid(UUID.randomUUID().toString());
		department.setDname("综合部");
		
		Employee emp1 = new Employee();
		emp1.setEid(UUID.randomUUID().toString());
		emp1.setEname("小张");
		emp1.setDepartment(department);
		
		
		Employee emp2 = new Employee();
		emp2.setEid(UUID.randomUUID().toString());
		emp2.setEname("小黄");
		emp2.setDepartment(department);
		
		session.save(department);
		session.save(emp1);
		session.save(emp2);
		
		tx.commit();
		
	}
	
	@Test
	public void testDoubleOne2ManyInsert2(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp1 = new Employee();
		emp1.setEid(UUID.randomUUID().toString());
		emp1.setEname("tom");
		
		Employee emp2 = new Employee();
		emp2.setEid(UUID.randomUUID().toString());
		emp2.setEname("jerry");
		
		Set empSet = new HashSet();
		empSet.add(emp1);
		empSet.add(emp2);
		
		
		Department department = new Department();
		department.setDeptid(UUID.randomUUID().toString());
		department.setDname("董事会");
		
		department.setEmployees(empSet);
		
		session.save(emp1);
		session.save(emp2);
		session.save(department);

		
		tx.commit();
		
	}
	
	@Test
	public void testDoubleOne2ManyInsert(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();

		Transaction tx = session.beginTransaction();
		Department department = new Department();
		department.setDeptid(UUID.randomUUID().toString());
		department.setDname("部门2");
		
		session.save(department);
		
		Employee emp1 = new Employee();
		emp1.setEid(UUID.randomUUID().toString());
		emp1.setEname("小王");
		emp1.setDepartment(department);
		
		Employee emp2 = new Employee();
		emp2.setEid(UUID.randomUUID().toString());
		emp2.setEname("小张");
		emp2.setDepartment(department);
		
		session.save(emp1);
		session.save(emp2);
		
		tx.commit();
		
	}
	
	@Test
	public void testManyToOne(){
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		Session session = dbUtil.getHwHibernateSession();
		Transaction tx = session.beginTransaction();

			District district = new District();
			district.setDistrictId(12345);
			district.setDistrictName("曼哈顿区");
			
			Street street1 = new Street();
			street1.setStreetId(134);
			street1.setStreetName("华尔街");
			street1.setDistrict(district);
			
			Street street2 = new Street();
			street2.setStreetId(2234);
			street2.setStreetName("第五大道");
			street2.setDistrict(district);
			
			Street street3 = new Street();
			street3.setStreetId(546);
			street3.setStreetName("唐人街");
			street3.setDistrict(district);
			
			session.save(district);
			session.save(street1);
			session.save(street2);
			session.save(street3);

			tx.commit();
			session.close();

	}
}
