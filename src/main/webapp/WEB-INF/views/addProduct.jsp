<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Add Products</h1>
			<p class="lead">Add your Products</p>
		</div>

		<form:form action="#" method="post" commandName="product">
			<div class="form-group">
				<label for="product_Name">Product Name:</label>
				<form:input path="product_Name" id="product_Name" class="form-Control" />

			</div>

		</form:form>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>