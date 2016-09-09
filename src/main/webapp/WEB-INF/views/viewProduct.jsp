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
					<h3>${product.product_Name }</h3>
					<p>${product.product_Description }</p>
					<p><strong>Manufacturer</strong>:${product.product_Manufacturer }</p>
					<p><strong>Category</strong>:${product.product_Category }</p>
					<p><strong>Condition</strong>:${product.product_Condition }</p>
					<h1>${product.product_price } USD</h1>

				</div>

			</div>
		</div>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>