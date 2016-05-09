<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Product Details</h1>
			<p class="lead">Information about a Product</p>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<img alt="image" src="#" style="width: 100%" height="300px">
				</div>
				<div class="col-md-5">
					<h3>Product Name</h3>
					<p>Product Description</p>
					<p>Manufacturer</p>
					<p>Category</p>
					<p>Condition</p>

				</div>

			</div>
		</div>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>