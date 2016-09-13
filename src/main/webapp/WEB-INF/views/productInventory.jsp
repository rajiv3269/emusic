<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Products Inventory Page</h1>
			<p class="lead">This is Products Inventory Page</p>
		</div>
		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-success">
					<th>Photo Thumb</th>
					<th>Product Name</th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
					<th></th>
				</tr>
			</thead>
			<c:forEach items="${productlist}" var="products">
				<tr>
					<td><img alt="image" src="#" /></td>
					<td>${products.product_Name }</td>
					<td>${products.product_Category }</td>
					<td>${products.product_Condition }</td>
					<td>${products.product_price }</td>
					<td><a
						href="<spring:url value="/productList/viewProduct/${products.product_Id}"/>"><span
							class="glyphicon glyphicon-info-sign"></span></a></td>
				</tr>
			</c:forEach>
		</table>

		<a href="<spring:url value="/admin/productInventory/addProduct"/>"class="btn btn-primary">Add
			Products</a>
		<%@include file="/WEB-INF/views/template/footer.jsp"%>