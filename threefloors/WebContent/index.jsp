<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome My Web</title>
</head>
<body>
	<form action = "QuaryServlet" method = "get">
		<table border="1">
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>班级</th>
				<th>专业</th>
			</tr>
			<tr>
				<th>2018217702</th>
				<th>巨</th>
				<th>2班</th>
				<th>计算机科学与技术</th>
			</tr>
		</table>
		
		<input type = "submit" value = "查询所有">
		<a href = "add.jsp">增加</a>
	</form>
</body>
</html>