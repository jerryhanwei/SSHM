<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include.jsp" %>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="zh-cmn-Hans"> <!--<![endif]-->  
<head>
    <title>大学去哪儿</title>

    <!-- Meta -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="" />

   
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>	

<body>

<%@ include file="header.jsp" %>

<!--=== Content Part ===-->
<div class="body">
	<div class="breadcrumbs margin-bottom-50">
    	<div class="container">
            <h1 class="color-green pull-left">注  册</h1>
            <ul class="pull-right breadcrumb">
                <li><a href="mainPage.jsp">首页</a> <span class="divider">/</span></li>
                <li class="active">注册</li>
            </ul>
        </div><!--/container-->
    </div><!--/breadcrumbs-->

	<div class="container">		
		<div class="row-fluid margin-bottom-10">
        	<form class="reg-page" />
            	<h3>注册账户</h3>
                <div class="controls">    
                    <label>用户名:</label>
                    <input type="text" class="span12" />
                    <label>电子邮箱:<span class="color-red">*</span></label>
                    <input type="text" class="span12" />
                </div>
                <div class="controls">
                    <div class="span6">
                        <label>密码: <span class="color-red">*</span></label>
                        <input type="text" class="span12" />
                    </div>
                    <div class="span6">
                        <label>重复密码: <span class="color-red">*</span></label>
                        <input type="text" class="span12" />
                    </div>
                </div>
                <div class="controls form-inline">
                    <label class="checkbox"><input type="checkbox" />&nbsp; 我同意相关规定</label>
                    <button class="btn-u pull-right" type="submit">GO</button>
                </div>
                <hr />
				<p>已经拥有账户? 点击 <a href="login.jsp" class="color-green">登录</a> </p>
            </form>
        </div><!--/row-fluid-->
	</div><!--/container-->		
</div><!--/body-->
<!--=== End Content Part ===-->

<%@ include file="footer.jsp" %>
</body>
</html> 