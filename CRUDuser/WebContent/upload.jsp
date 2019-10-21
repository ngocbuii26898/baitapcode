<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Loadimg" method="Post" enctype="multipart/form-data">
	<p>Ten:</p>
		<input name="ten" type="text">
		<p>Tuoi:</p>
		<input name="tuoi" type="text">
		<p>Diachi:</p>
		<input name="diachi" type="text">
		<p>Gioitinh:</p>
		<input name="gioitinh" type="text">
	

<input name="anh" type="file">

<input type="checkbox" name="checkbox" value="1"> 

<select name ="congviec">
  <option value="dihoc">di hoc</option>
  <option value="dilam">di lam</option>
</select>

<textarea name ="thongtin"rows="4" cols="50">

</textarea>
<input type="submit">
</form>
</body>
</html>