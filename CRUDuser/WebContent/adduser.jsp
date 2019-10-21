<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD USER</h1>
<form action="Adduser" method="post">
		<p>Ten:</p>
		<input name="ten" type="text">
		<p>Tuoi:</p>
		<input name="tuoi" type="text">
		<p>Diachi:</p>
		<input name="diachi" type="text">
		<p>Gioitinh:</p>
		<input name="gioitinh" type="text">
	<select>
  <option value="dihoc">dihoc</option>
  <option value="dilam">dilam</option>
</select>
		<input type="submit">
	</form>
</body>
</html>
