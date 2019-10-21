<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>trang chu</title>
<link href="<%=request.getContextPath()%>/resource/product.css"
	rel="stylesheet">


</head>
<body>
	<div class="">
		<div class="top-link">
			<div class="container">
				<div class="top-link-inner clearfix">
					<ul class="navTopR menu">
						<li><a href="/cart">My cart</a>
							</li>
						<li><a href="javascript:void(0)">Acount</a>
							</li>
						<li><a class="login_click" href="javascript:void(0)">Search</a>
							</li>
					</ul>
					<ul id="top_hotline">
						<li>Hotline : 1900 633 501</li>
					</ul>
				</div>
			</div>
		</div>
		

		<c:forEach items="${sanphamList}" var="sanphamList">
			<a href="chitietsanpham?id=${sanphamList.getIdsp()}">
				<div class="box">
					<div class="anh">
						<img
							src="https://static.super-shop.com/990646-w1920-polar-skate-default-tshirt-black.jpg">
					</div>
					<div class="gia">
						${sanphamList.getTensp()} <br> ${sanphamList.getGiasp()}<br>
						${sanphamList.getMasp()}<br> ${sanphamList.getAnhsp()}
					</div>
				</div>
			</a>
		</c:forEach>
</body>
</html>