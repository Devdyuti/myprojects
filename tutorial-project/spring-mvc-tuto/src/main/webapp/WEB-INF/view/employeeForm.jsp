<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add employee</title>
</head>
<body>
<form name="addEmployee" method="post">
<table>
<tr>
<td>id</td><td><input type="text" name="id"/></td>
</tr>
<tr>
<td>firstName</td><td><input type="text" name="firstName"/></td>
</tr>
<tr>
<td>lastName</td><td><input type="text" name="lastName"/></td>
</tr>
<tr>
<td><input type="submit"></td>
</tr>
<tr>
<th style="color: green;">${msg}</th>
</tr>
</table>
</form>
</body>
</html>