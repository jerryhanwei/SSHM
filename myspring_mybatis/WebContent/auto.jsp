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
        <script src="<%=basePath%>resource/jqueryAutoComplete/jquery-ui.min.js"></script>
         <link href="<%=basePath%>resource/jqueryAutoComplete/jquery-ui.min.css" rel="stylesheet" />
         
         
         <link href="<%=basePath%>resource/jqueryAutoComplete/autocomplete.min.css" rel="stylesheet" />
         <script src="<%=basePath%>resource/jqueryAutoComplete/autocomplete.min.js"></script>
                 
         <script type="text/javascript">
         
         var words = [
                      "ActionScript",
                      "AppleScript",
                      "Asp",
                      "BASIC",
                      "C",
                      "C++",
                      "Clojure",
                      "COBOL",
                      "ColdFusion",
                      "Erlang",
                      "Fortran",
                      "Groovy",
                      "Haskell",
                      "Java",
                      "JavaScript",
                      "Lisp",
                      "Perl",
                      "PHP",
                      "Python",
                      "Ruby",
                      "Scala",
                      "Scheme"
                    ];
				
         $(document).ready(function(){
        	 $( "#userName" ).autocomplete({
        	      source: words
        	    });
          });

         
         </script>
</head>
<body>
<input type="text" id="userName"></input>
</body>
</html>