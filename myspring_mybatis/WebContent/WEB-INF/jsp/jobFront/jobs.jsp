<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

$(document).ready(function(){
	loadJobsJSON();
})

function loadJobsJSON()
{
	var dHtmls='';
	var myurl="getAllJobsJSON.do";
	$.ajax({	   			
		url:myurl,
		method:"GET",
		dataType:"html",
		data:{
		         
		},
		success:function(data){
			var jsonArray = eval("("+data+")");   
			jsonArray.forEach(function(e){  
				var temp='<a href="follow_single.html">'
				+'<img src="<%=basePath%>resource/images/f1.jpg" alt="" class="img-circle img-responsive">'
				+'<div class="title"><h5>'+e.tJobName+'</h5><p>Amazon Inc.</p></div><div class="data"><span class="city"><i class="fa fa-map-marker"></i>'+e.tLocation+'</span><span class="type full-time"><i class="fa fa-clock-o"></i>Full Time</span><span class="sallary"><i class="fa fa-dollar"></i>'+e.tSalary+'</span></div></a>'
				dHtmls=dHtmls+temp;
	            
			})  
			document.getElementById("myJobs").innerHTML=dHtmls;
		}
	});
	

	}


</script>
</head>
<body>
<%@ include file="header.jsp" %>
<%@ include file="searchBox.jsp" %>
<div class="container">
    <div class="single">
        <%@ include file="leftPage.jsp" %>
      <div class="col-sm-6 follow_left">
			<h3>Recent Jobs</h3>
             <div id="myJobs" class="follow_jobs">
			    <a href="follow_single.html">
					<img src="<%=basePath%>resource/images/f1.jpg" alt="" class="img-circle img-responsive">
					<div class="title">
						<h5>Web Designer</h5>
						<p>Amazon Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>New York City</span>
						<span class="type full-time"><i class="fa fa-clock-o"></i>Full Time</span>
						<span class="sallary"><i class="fa fa-dollar"></i>45,000</span>
					</div>
				</a>
				<a href="follow_single.html">
					<div class="featured"></div>
					<img src="<%=basePath%>resource/images/f2.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Senior Web Developer</h5>
						<p>Dropbox Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>Los Angeles</span>
						<span class="type part-time"><i class="fa fa-clock-o"></i>Part Time</span>
						<span class="sallary"><i class="fa fa-dollar"></i>85,000</span>
					</div>
				</a>
				<a href="follow_single.html">
					<img src="<%=basePath%>resource/images/f3.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Project Manager</h5>
						<p>Apple Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>San Francisco</span>
						<span class="type freelance"><i class="fa fa-clock-o"></i>Freelance</span>
						<span class="sallary"><i class="fa fa-dollar"></i>60,000</span>
					</div>
				</a>
				<a href="follow_single.html">
					<img src="<%=basePath%>resource/images/f4.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Key Account Manager</h5>
						<p>Dell Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>Boston</span>
						<span class="type full-time"><i class="fa fa-clock-o"></i>Full Time</span>
						<span class="sallary"><i class="fa fa-dollar"></i>55,000</span>
					</div>
				</a>
				<a href="follow_single.html">
					<div class="featured"></div>
					<img src="<%=basePath%>resource/images/f1.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Front End Developer</h5>
						<p>Ebay Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>Chicago</span>
						<span class="type part-time"><i class="fa fa-clock-o"></i>Part Time</span>
						<span class="sallary"><i class="fa fa-dollar"></i>75,000</span>
					</div>
				</a>
				<a href="follow_single.html" class="hidden-job">
					<img src="<%=basePath%>resource/images/f2.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Web Designer</h5>
						<p>Amazon Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>New York City</span>
						<span class="type full-time"><i class="fa fa-clock-o"></i>Full Time</span>
						<span class="sallary"><i class="fa fa-dollar"></i>45,000</span>
					</div>
				</a>
				<a href="follow_single.html" class="hidden-job">
					<img src="<%=basePath%>resource/images/f3.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Senior Web Developer</h5>
						<p>Dropbox Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>Los Angeles</span>
						<span class="type part-time"><i class="fa fa-clock-o"></i>Part Time</span>
						<span class="sallary"><i class="fa fa-dollar"></i>85,000</span>
					</div>
				</a>
				<a href="follow_single.html" class="hidden-job">
					<img src="<%=basePath%>resource/images/f4.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Project Manager</h5>
						<p>Apple Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>San Francisco</span>
						<span class="type freelance"><i class="fa fa-clock-o"></i>Freelance</span>
						<span class="sallary"><i class="fa fa-dollar"></i>60,000</span>
					</div>
				</a>
				<a href="follow_single.html" class="hidden-job">
					<img src="<%=basePath%>resource/images/f1.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Key Account Manager</h5>
						<p>Dell Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>Boston</span>
						<span class="type full-time"><i class="fa fa-clock-o"></i>Full Time</span>
						<span class="sallary"><i class="fa fa-dollar"></i>55,000</span>
					</div>
				</a>
				<a href="follow_single.html" class="hidden-job">
					<img src="<%=basePath%>resource/images/f2.jpg" alt="" class="img-circle">
					<div class="title">
						<h5>Front End Developer</h5>
						<p>Ebay Inc.</p>
					</div>
					<div class="data">
						<span class="city"><i class="fa fa-map-marker"></i>Chicago</span>
						<span class="type part-time"><i class="fa fa-clock-o"></i>Part Time</span>
						<span class="sallary"><i class="fa fa-dollar"></i>75,000</span>
					</div>
				</a>
				<ul class="pagination">
					<li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
					<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
			   </ul>
		    </div>
		</div>
		<div class="col-sm-2">
			<h4 class="m_1">Career level</h4>
			<table class="table">
                    <tbody>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Senior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Middle
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                </tbody>
             </table>
             <h4 class="m_1">Job type</h4>
             <table class="table">
                    <tbody>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Senior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Middle
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                </tbody>
             </table>
             <h4 class="m_1">Location</h4>
             <table class="table">
                    <tbody>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Senior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Middle
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td class="hidden-xs">
                                Junior
                            </td>
                            <td>
                                (56)
                            </td>
                        </tr>
                </tbody>
             </table>
		</div>
		<div class="clearfix"> </div>
	</div>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>