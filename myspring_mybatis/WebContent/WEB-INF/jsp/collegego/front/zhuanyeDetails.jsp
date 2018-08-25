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

     <%@ include file="include.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head> 

<body>
<%@ include file="header.jsp" %>

<!--=== Breadcrumbs ===-->
<div class="breadcrumbs margin-bottom-40">
	<div class="container">
        <h1 class="color-green pull-left">专业详述</h1>
         
        <ul class="pull-right breadcrumb">
            <li><a href="mainPage.jsp">首页</a> <span class="divider">/</span></li>
            <li><a href="zhuanyechaxun.jsp">专业查询</a> <span class="divider">/</span></li>
            <li class="active">专业详述</li>
        </ul>
    </div><!--/container-->
</div><!--/breadcrumbs-->
<!--=== End Breadcrumbs ===-->
<div class="container">		


		   <ul class="nav nav-tabs tabs">
                <li class="active"><a href="#home" data-toggle="tab">专业简介</a></li>
                <li><a href="#profile" data-toggle="tab">开设院校</a></li>
            </ul><!--/tabs-->
            
            <div class="tab-content">
                <div class="tab-pane active" id="home">
                   <p>

业务培养目标：本专业培养具有良好的科学素养，系统地、较好地掌握计算机科学与技术包括计算机硬件、软件与应用的基本理论、基本知识和基本技能与方法，能在科研部门、教育单位、企业、事业、技术和行政管理部门等单位从事计算机教学、科学研究和应用的计算机科学与技术学科的高级专门科学技术人才。
<br><br>
业务培养要求：本专业学生主要学习计算机科学与技术方面的基本理论和基本知识，接受从事研究与应用计算机的基本训练，具有研究和开发计算机系统的基本能力。
<br><br>
毕业生应获得以下几方面的知识和能力：
1．掌握计算机科学与技术的基本理论、基本知识；
2．掌握计算机系统的分析和设计的基本方法；
3．具有研究开发计算机软、硬件的基本能力；
4．了解与计算机有关的法规；
5．了解计算机科学与技术的发展动态；
6．掌握文献检索、资料查询的基本方法，具有获取信息的能力。
<br><br>
主干学科：计算机科学与技术
<br><br>
主要课程：电路原理、模拟电子技术、数字逻辑、数字分析、计算机原理、微型计算机技术、计算机系统结构、计算机网络、高级语言、汇编语言、数据结构、操作系统等。
<br><br>
主要实践性教学环节：包括电子工艺实习、硬件部件设计及调试、计算机基础训练、课程设计、计算机工程实践、生产实习、毕业设计(论文)。
<br><br>
修业年限：四年
<br><br>
授予学位：工学或理学学士
                   </p>
                </div>
                <div class="tab-pane" id="profile">
                    <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>院校代码</th>
                            <th>院校名称</th>
                            <th>区域</th>
                        
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>012234</td>
                            <td><a href="zhuanyeDetails.jsp">北京大学</a></td>
                            <td>北京</td>
                        </tr>
                        <tr>
                            <td>012234</td>
                            <td><a href="zhuanyeDetails.jsp">北京大学</a></td>
                            <td>北京</td>
                        </tr>
                        <tr>
                            <td>012234</td>
                            <td><a href="zhuanyeDetails.jsp">北京大学</a></td>
                            <td>北京</td>
                        </tr>
                        <tr>
                            <td>012234</td>
                            <td><a href="zhuanyeDetails.jsp">北京大学</a></td>
                            <td>北京</td>
                        </tr>
                        <tr>
                            <td>012234</td>
                            <td><a href="zhuanyeDetails.jsp">北京大学</a></td>
                            <td>北京</td>
                        </tr>
                        <tr>
                            <td>012234</td>
                            <td><a href="zhuanyeDetails.jsp">北京大学</a></td>
                            <td>北京</td>
                        </tr>
                        
                        
                    </tbody>
                </table>
                
                <div class="pagination pagination-centered">
            <ul>
              <li><a href="#">Prev</a></li>
              <li><a href="#">1</a></li>
              <li><a href="#">2</a></li>
              <li class="active"><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">5</a></li>
              <li><a href="#">6</a></li>
              <li><a href="#">7</a></li>
              <li><a href="#">8</a></li>
              <li><a href="#">Next</a></li>
            </ul>
        </div>       
                </div>
            </div><!--/tab-content-->
            
 
    
    <!-- //End Search Result -->
</div><!--/container-->		




<%@ include file="footer.jsp" %>
</body>
</html> 