<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@include file = "/WEB-INF/views/template/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="page-header">
				<h1>Administrator Page</h1>
				<p class="lead">This is a administrator page</p>
			</div>
			
			<h3>
			<a href="<c:url value="/admin/productInventory"/>">Product Inventory</a>
			</h3>
			<p>CHECK,VIEW and MODIFY Inventory</p>
			
			<%@include file = "/WEB-INF/views/template/footer.jsp"%>