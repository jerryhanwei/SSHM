<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<%@ include file="searchBox.jsp" %>
<div class="container">
    <div class="single">  
        	    <%@ include file="leftPage.jsp" %>
        <div class="col-md-8">
	   <div class="form-container">
        <h2>注册账户</h2>
        <form>
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="firstName">用户名</label>
                <div class="col-md-9">
                    <input type="text" path="firstName" id="firstName" class="form-control input-sm"/>
                </div>
            </div>
         </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">密码</label>
                <div class="col-md-9">
                    <input type="text" path="lastName" id="lastName" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Mobile Number</label>
                <div class="col-md-9">
                    <input type="text" path="lastName" id="lastName" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="sex">Sex</label>
                <div class="col-md-9" class="form-control input-sm">
                    <div class="radios">
				        <label for="radio-01" class="label_radio">
				            <input type="radio" checked=""> Male
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio"> Female
				        </label>
	                </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="dob">Date of birth</label>
                <div class="col-md-9">
                    <input type="text" path="dob" id="dob" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="email">Email</label>
                <div class="col-md-9">
                    <input type="text" path="email" id="email" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="country">Country</label>
                <div class="col-md-9">
                    <select path="country" id="country" class="form-control input-sm">
                        <option value="">Select Country</option>
                        <option value="">Japan</option>
                        <option value="">Kenya</option>
                        <option value="">Dubai</option>
                        <option value="">Italy</option>
                        <option value="">Greece</option> 
                        <option value="">Iceland</option> 
                        <option value="">China</option> 
                        <option value="">Doha</option> 
                        <option value="">Irland</option> 
                        <option value="">Srilanka</option> 
                        <option value="">Russia</option> 
                        <option value="">Hong Kong</option> 
                        <option value="">Germany</option>
                        <option value="">Canada</option>  
                        <option value="">Mexico</option> 
                        <option value="">Nepal</option>
                        <option value="">Norway</option> 
                        <option value="">Oman</option>
                        <option value="">Pakistan</option>  
                        <option value="">Kuwait</option> 
                        <option value="">Indonesia</option>  
                        <option value="">Spain</option>
                        <option value="">Thailand</option>  
                        <option value="">Saudi Arabia</option> 
                        <option value="">Poland</option> 
                    </select>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="country">Work Experience</label>
                <div class="col-md-9">
                    <select path="country" id="country" class="form-control input-sm">
                        <option value="">Select</option>
                        <option value="">Fresher</option>
                        <option value="">0</option>
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option> 
                        <option value="">4</option> 
                        <option value="">5</option> 
                        <option value="">6</option> 
                        <option value="">7</option> 
                        <option value="">8</option> 
                        <option value="">9</option> 
                        <option value="">10</option> 
                        <option value="">11</option>
                        <option value="">12</option>  
                        <option value="">13</option>
                        <option value="">14</option>
                        <option value="">15</option>      
                    </select>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="country">Education</label>
                <div class="col-md-9">
                    <select path="country" id="country" class="form-control input-sm">
                        <option value="">Select</option>
                        <option value="">Bsc</option>
                        <option value="">BTech</option>
                        <option value="">Mca</option>
                        <option value="">BCA</option>
                        <option value="">Diploma</option> 
                        <option value="">Other</option> 
                    </select>
               </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">Subjects</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="注册" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form>
    </div>
    </div>
 </div>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>