import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.isoft.test.DbUtil;
import com.isoft.test.MD5Util;
import com.isoft.test.TSysUser;

public class MyTest {

	@Test
	public void test1() throws NoSuchAlgorithmException, UnsupportedEncodingException
	{
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		TSysUser user = new TSysUser();
		user.setTUserId(UUID.randomUUID().toString());
		user.setTUserName("tom");
		user.setTUserPwd(MD5Util.myMD5("123"));
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
	
	@Test
	public void test2() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		DbUtil dbUtil = DbUtil.getMyDbUtilInstance();
		
		Session session = dbUtil.getHwHibernateSession();
		
		TSysUser user = (TSysUser)session.get(TSysUser.class, "3a8f9a6b-b2ad-43ee-9a6a-181af4342aa7");
	    
	    if(user.getTUserPwd().equals(MD5Util.myMD5("123")))
	    {
	    	System.out.println("密码一样");
	    }else {
	    	System.out.println("密码不一样");
	    }
	
	    session.close();
	}
}
