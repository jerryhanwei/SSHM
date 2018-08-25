<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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

    <!-- CSS Global Compulsory-->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/css/style.css" />
    <link rel="stylesheet" href="assets/css/headers/header1.css" />
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="assets/css/style_responsive.css" />
    <link rel="shortcut icon" href="favicon.ico" />        
    <!-- CSS Implementing Plugins -->    
    <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.css" />
    <!-- CSS Theme -->    
    <link rel="stylesheet" href="assets/css/themes/default.css" id="style_color" />
    <link rel="stylesheet" href="assets/css/themes/headers/default.css" id="style_color-header-1" />    
    
    
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head> 

<body>

<%@ include file="header.jsp" %>

<!--=== Breadcrumbs ===-->
<div class="breadcrumbs margin-bottom-40">
	<div class="container">
        <h1 class="color-green pull-left">登录</h1>
        <ul class="pull-right breadcrumb">
            <li><a href="mainPage.jsp">首页</a> <span class="divider">/</span></li>
            <li class="active">登录</li>
        </ul>
    </div><!--/container-->
</div><!--/breadcrumbs-->
<!--=== End Breadcrumbs ===-->

<!--=== Content Part ===-->
<div class="container">		
	<div class="row-fluid">
        <form class="log-page" />
            <h3>请输入用户名 / 密码</h3>    
            <div class="input-prepend">
                <span class="add-on"><i class="icon-user"></i></span>
                <input class="input-xlarge" type="text" placeholder="用户名" />
            </div>
            <div class="input-prepend">
                <span class="add-on"><i class="icon-lock"></i></span>
                <input class="input-xlarge" type="text" placeholder="密  码" />
            </div>
            <div class="controls form-inline">
                <label class="checkbox"><input type="checkbox" />记住用户名</label>
                <button class="btn-u pull-right" type="submit">Go</button>
            </div>
            <hr />
            <h4>忘记密码 ?</h4>
            <p>别担心, <a class="color-green" href="#">点击这里</a> 重置密码</p>
        </form>
    </div><!--/row-fluid-->
</div><!--/container-->		
<!--=== End Content Part ===-->

<%@ include file="footer.jsp" %>
</body>
</html> 