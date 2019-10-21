<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of book</title>
<link href="<%=request.getContextPath()%>/resource/dep.css"
	rel="stylesheet">

</head>
<body>
	<h1>CRUD USER</h1>

	<button type="button">
		<a href="upload.jsp" style="text-decoration: none;" s>Adduser</a>
	</button>

	<table>

		<tr>
			<th>Ten</th>
			<th>Tuoi</th>
			<th>Diachi</th>
			<th>GioiTinh</th>
			<th>Hinh Anh</th>
			<th></th>
			<th>checkbox</th>
			<th>Nghe</th>
			<th>Thong Tin</th>
		</tr>
		<c:forEach items="${userList}" var="userList">

			<tr>
				<td>${userList.getTen()}</td>
				<td>${userList.getTuoi()}</td>
				<td>${userList.getDiachi()}</td>
				<td>${userList.getGioitinh()}</td>
				<td><img
					src="<%=request.getContextPath()%>/resource/${userList.getAnh()}"></td>
				<td>
					<button type="button">
						<a href="Edit?id=${userList.getId()}"
							style="text-decoration: none;">Edit</a>
					</button>
					<span> </span>
				<button type="button">
						<a href="Delete?id= ${userList.getId()}"
							style="text-decoration: none;">Delete</a>
					</button>



				</td>

				<td><c:if test="${userList.getCheckbox()==1}">
						<input type="checkbox" name="checkbox" checked disabled>
					</c:if> <c:if test="${userList.getCheckbox()==0}">
						<input type="checkbox" name="checkbox" disabled>
					</c:if></td>

				<td>
						<select name="congviec">
							<option value="dihoc" selected disabled>${userList.getCongviec()}</option>

						</select>
					

						

					</td>
				<td>${userList.getThongtin()}</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>