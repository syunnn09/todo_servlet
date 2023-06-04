<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.TodoBean, java.util.List" %>
<%
	List<TodoBean> todos = (List<TodoBean>) request.getAttribute("todos");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for (TodoBean todo: todos) { %>
		<p><%= todo.getTitle() %></p>
	<% } %>
</body>
</html>