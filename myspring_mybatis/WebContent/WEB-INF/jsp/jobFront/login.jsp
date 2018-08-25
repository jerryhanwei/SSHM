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
	 <div class="col-md-8 single_right">
	 	   <div class="login-form-section">
                <div class="login-content">
                    <form>
                        <div class="section-title">
                            <h3>账号登陆</h3>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon "><i class="fa fa-user"></i></span>
                                <input type="text" required="required" class="form-control" placeholder="Username">
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon "><i class="fa fa-key"></i></span>
                                <input type="password" required="required" class="form-control " placeholder="Password">
                            </div>
                        </div>
                     </form>
			          <div class="clearfix"> </div>
					<div class="login-btn">
					   <input type="submit" value="Log in"> 
					   
					   <h4>还没有账号? <a href="goToRegisterPage.do"> 注册账号</a></h4>
					</div>
                </div>
         </div>
   </div>
  <div class="clearfix"> </div>
 </div>
</div>

<%@ include file="footer.jsp" %>
</body>
</html>