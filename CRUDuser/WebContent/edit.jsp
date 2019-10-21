<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>EDIT USER</h1>
<c:forEach items="${userList}" var="userList" >
<form action="Edit" method="post" >

<input name="id" type="hidden" value="${requestScope.id} ">
		<p>Ten:</p>
		<input name="ten"  type="text" value="${userList.getTen()} ">
		<p>Tuoi:</p>
		<input name="tuoi" type="text" value="${userList.getTuoi()}">
		<p>Diachi:</p>
		<input name="diachi" type="text" value="${userList.getDiachi()}" >
		<p>Gioitinh:</p>
		<input name="gioitinh" type="text" value="${userList.getGioitinh()}">
		<p>Anh:</p>
		
		<input name="anh" type="file"  >
		
		<c:if test="${userList.getCheckbox()==1}"> 
				<input type="checkbox" name="checkbox" checked  > 
				</c:if>
				<c:if test="${userList.getCheckbox()==0}"> 
				<input type="checkbox" name="checkbox" > 
				</c:if>
				
		<input type="submit">
	</form>
	</c:forEach>
</body>
</html>