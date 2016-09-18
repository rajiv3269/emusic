<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Add Products</h1>
			<p class="lead">Add your Products</p>
		</div>

		<form:form
			action="${pageContext.request.contextPath }/admin/productInventory/addProduct"
			method="post" commandName="product">
			<div class="form-group">
				<label for="product_Name">Product Name:</label>
				<form:input path="product_Name" id="product_Name"
					class="form-Control" />
			</div>

			<div class="form-group">
				<label for="product_Category">Product Category:</label> <label
					class="checkbox-in	line"><form:radiobutton
						path="product_Category" id="category" value="Instrument" />Instrument</label>
				<label class="checkbox-inline"><form:radiobutton
						path="product_Category" id="record" value="Record" />Record</label> <label
					class="checkbox-inline"><form:radiobutton
						path="product_Category" id="accessory" value="Accessory" />Accessory</label>
			</div>

			<div class="form-group">
				<label for="product_Description">Product Description:</label>
				<form:textarea path="product_Description" id="product_Description"
					class="form-Control" />
			</div>

			<div class="form-group">
				<label for="product_price">Product Price:</label>
				<form:input path="product_price" id="product_price"
					class="form-Control" />
			</div>

			<div class="form-group">
				<label for="product_Condition">Product Condition:</label> <label
					class="checkbox-inline"><form:radiobutton
						path="product_Condition" id="condition" value="New" />New</label> <label
					class="checkbox-inline"><form:radiobutton
						path="product_Condition" id="condition" value="Used" />Used</label>
			</div>

			<div class="form-group">
				<label for="product_Status">Product Satus:</label> <label
					class="checkbox-inline"><form:radiobutton
						path="product_Status" id="status" value="Active" />Active</label> <label
					class="checkbox-inline"><form:radiobutton
						path="product_Status" id="status" value="Inactive" />Inactive</label>
			</div>
			<div class="form-group">
				<label for="product_unitInStock">Product InStock:</label>
				<form:input path="product_unitInStock" id="stock"
					class="form-Control" />
			</div>

			<div class="form-group">
				<label for="product_Manufacturer">Product Manufacturer:</label>
				<form:input path="product_Manufacturer" id="manufacturer"
					class="form-Control" />
			</div>
			<br>
			<br>
			<input type="submit" value="submit" class="btn btn-default">
			<a href="<c:url value ="/admin/productInventory"/>"
				class="btn btn-default">Cancel</a>
		</form:form>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>