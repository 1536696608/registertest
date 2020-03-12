
<%@page import="StudentClass.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student-List</title>
</head>
<body>

	<form action = "index.jsp">
		<table border="1">

			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>班级</th>
				<th>专业</th>

			</tr>

			<%
				response.getWriter();
				request.setCharacterEncoding("UTF-8");
				ArrayList<Student> ls = (ArrayList<Student>) request.getAttribute("list");
				for (Student s : ls) {
					
			%>
			<%!
				
			%>
			<tr>
				<th><%=s.getSnum()%></th>
				<th><%=s.getSname()%></th>
				<th><%=s.getSclass()%></th>
				<th><%=s.getSpross()%></th>
				<th><a href = "DeleteServlet?Snum=<%=s.getSnum()%>">删除</a></th>
				
			</tr>
			
			<%
				}
			%>
			
		</table>
		
		<input type = "submit" value = "返回">
		
	</form>
</body>
</html>