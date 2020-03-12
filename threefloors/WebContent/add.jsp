<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>addStudnet</title>
</head>
<body>
		<form action = "AddServlet"  method = "get" >
		
				牛逼：<input type = "text" name = "Snum"><br/>
				姓名：<input type = "text" name = "Sname"><br/>
				班级：<input type = "text" name = "Sclass"><br/>
				专业：<input type = "text" name = "Spross"><br/>
				<input type = "submit" value = "增加">
				
				
		</form>
		<form method = "get" action = "index.jsp" >
		
				<input type = "submit" value = "返回">
				
		</form>
		
		
</body>
</html>