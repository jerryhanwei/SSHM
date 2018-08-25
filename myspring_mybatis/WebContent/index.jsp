<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

        <script src="<%=basePath%>resource/jqueryDataTable/js/jquery.js"></script>
        <script src="<%=basePath%>resource/jqueryDataTable/js/jquery.dataTables.min.js"></script>
         <link href="<%=basePath%>resource/jqueryDataTable/css/jquery.dataTables.min.css" rel="stylesheet" />
        
        <script type="text/javascript">
        $(document).ready(function() {
            $('#example').DataTable( {
            	 "pagingType": "full_numbers",
            	   "processing": true,
                   "serverSide": true,
                   "ajax": "getZhuanyechaxunJSON.do",
            	
                "columns": [
                    { "data": "mcode" },
                    { "data": "mname" },
                    { "data": "mtype" }
                ]
            } );
        } );
     
        </script>
</head>
<body>

    <table id="example" class="display" cellspacing="0" width="100%">
    <thead>
        <tr>
            <th>专业代码</th>
            <th>专业名称</th>
            <th>专业类型</th>
        </tr>
    </thead>
 
   
</table>

</body>
</html>