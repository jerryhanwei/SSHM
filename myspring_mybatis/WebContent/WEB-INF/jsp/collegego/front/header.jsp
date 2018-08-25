<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!--=== Style Switcher ===-->    
<i class="style-switcher-btn icon-cogs"></i>
<div class="style-switcher">
    <div class="theme-close"><i class="icon-remove"></i></div>
    <div class="theme-heading">Theme Colors</div>
    <ul class="unstyled">
        <li class="theme-default theme-active" data-style="default" data-header="light"></li>
        <li class="theme-blue" data-style="blue" data-header="light"></li>
        <li class="theme-orange" data-style="orange" data-header="light"></li>
        <li class="theme-red" data-style="red" data-header="light"></li>
        <li class="theme-light" data-style="light" data-header="light"></li>
    </ul>
</div><!--/style-switcher-->
<!--=== End Style Switcher ===-->    

<!--=== Top ===-->    
<div class="top">
    <div class="container">         
        <ul class="loginbar pull-right">
            
        	<i class="icon-globe"></i>
            <li><a href="login.jsp" class="login-btn">登录</a></li>  
            <li class="devider">&nbsp;</li>
            <li><a href="registration.jsp" class="login-btn">注册</a></li>   
            <li class="devider">&nbsp;</li>
            <li><a href="page_login.html" class="login-btn">帮助</a></li>   
        </ul>
    </div>      
</div><!--/top-->
<!--=== End Top ===-->    

<!--=== Header ===-->
<div class="header">               
    <div class="container"> 
        <!-- Logo -->       
        <div class="logo">                                             
            <a href="index.html"><img id="logo-header" src="assets/img/logo1-default.png" alt="Logo" /></a>
        </div><!-- /logo -->        
                                    
        <!-- Menu -->       
        <div class="navbar">                                
            <div class="navbar-inner">                                  
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a><!-- /nav-collapse -->                                  
                <div class="nav-collapse collapse">                                     
                    <ul class="nav top-2">
                       <li>
                            <a href="toIndex.do" >首&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;页
                                          
                            </a>
                                             
                        </li>
                        <li>
                            <a href="toGaoxiaochaxun.do" >高校查询
                                          
                            </a>
                                             
                        </li>
                        <li>
                            <a href="toZhuanyechaxun.do" >专业查询
                            </a>
                            
                                  
                        </li>
                        <li>
                            <a href="" class="dropdown-toggle" data-toggle="dropdown">定校查询
                            </a>
                            
                        </li>
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">估分查询
                            </a>
                            
                        </li>
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">联系我们
                            </a>
                        </li>
                        
                        <li><a class="search"><i class="icon-search search-btn"></i></a></li>                               
                    </ul>
                    <div class="search-open">
                        <div class="input-append">
                            <form />
                                <input type="text" class="span3" placeholder="Search" />
                                <button type="submit" class="btn-u">Go</button>
                            </form>
                        </div>
                    </div>
                </div><!-- /nav-collapse -->                                
            </div><!-- /navbar-inner -->
        </div><!-- /navbar -->                          
    </div><!-- /container -->               
</div><!--/header -->      
<!--=== End Header ===-->