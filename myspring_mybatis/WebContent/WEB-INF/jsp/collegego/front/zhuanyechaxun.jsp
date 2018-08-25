<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="zh-cmn-Hans">
<!--<![endif]-->
<head>
<title>大学去哪儿</title>

<!-- Meta -->
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="description" content="" />
<meta name="author" content="" />

<%@ include file="include.jsp"%>
	
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<%@ include file="header.jsp"%>

	<!--=== Breadcrumbs ===-->
	<div class="breadcrumbs margin-bottom-40">
		<div class="container">
			<h1 class="color-green pull-left">专业查询</h1>

			<ul class="pull-right breadcrumb">
				<li><a href="mainPage.jsp">首页</a> <span class="divider">/</span></li>
				<li class="active">专业查询</li>
			</ul>
		</div>
		<!--/container-->
	</div>
	<!--/breadcrumbs-->
	<!--=== End Breadcrumbs ===-->
	<div class="container">





		<!-- Search Result -->
		<div class="row-fluid search-page">

			<div>
				<form class="form-search" />
				<input type="text"
					class="border-radius-none input-medium search-query" />
				<button type="submit" class="btn-u">Search</button>
				</form>
			</div>

			<div class="row-fluid">
				<div>
					<table id="grid-data"
						class="table table-condensed table-hover table-striped">
						<thead>
							<tr>
								<th data-column-id="id" data-type="numeric">ID</th>
								<th data-column-id="sender">Sender</th>
								<th data-column-id="received" data-order="desc">Received</th>
								<th data-column-id="link" data-formatter="link"
									data-sortable="false">Link</th>
							</tr>
						</thead>
					</table>
				</div>
			</div>





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
		<!--/row-fluid-->
		<!-- //End Search Result -->
	</div>
	<!--/container-->


	<script type="text/javascript">
		$("#grid-data").bootgrid(
				{
					ajax : true,
					post : function() {
						return {
							id : "123123"
						};
					},
					url : "getZhuanyechaxunJSON.do",
					formatters : {
						"link" : function(column, row) {
							return "<a href=\"#\">" + column.id + ": " + row.id
									+ "</a>";
						}
					}
				});
	</script>


	<%@ include file="footer.jsp"%>
	
</body>
</html>
