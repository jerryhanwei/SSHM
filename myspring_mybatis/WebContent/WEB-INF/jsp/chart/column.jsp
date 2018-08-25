<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'chart.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    
     <script type="text/javascript" src="<%=basePath%>js/char/jquery-1.8.2.min.js"></script>
   	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/char/demo.css">
   	
   	<script src="<%=basePath%>js/char/highcharts.js"></script>
	<script src="<%=basePath%>js/char/highcharts-3d.js"></script>
    <script type="text/javascript">
$(function () {
    // Set up the chart
    var chart = new Highcharts.Chart({
        chart: {
            renderTo: 'container',
            type: 'column',
            margin: 75,
            options3d: {
                enabled: true,
                alpha: 15,
                beta: 15,
                depth: 50,
                viewDistance: 15
            }
        },
        title: {
            text: 'Chart rotation demo'
        },
        subtitle: {
            text: 'Test options by dragging the sliders below'
        },
        plotOptions: {
            column: {
                depth: 50
            }
        },
        series: [{
            data: []
        }]
    });

    function showValues() {
        $('#R0-value').html(chart.options.chart.options3d.alpha);
        $('#R1-value').html(chart.options.chart.options3d.beta);
    }

    // Activate the sliders
    $('#R0').on('change', function () {
        chart.options.chart.options3d.alpha = this.value;
        showValues();
        chart.redraw(false);
    });
    $('#R1').on('change', function () {
        chart.options.chart.options3d.beta = this.value;
        showValues();
        chart.redraw(false);
    });

    showValues();
    
      $.ajaxSettings.async = false;
            var data1 = [];
            $.getJSON("ChartServlet?para=column", function (dict) { 
            
                 for (var temp in dict)
                 {
                    alert(temp+"----"+dict[temp]);
                    data1.push(dict[temp]);
                 }
           
                chart.series[0].setData(data1);
            }); 
});
		</script>

  </head>
  
  <body>
  <div id="container" style="height: 400px"></div>
  </body>
</html>
