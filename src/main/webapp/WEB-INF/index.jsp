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
<!-- <link rel="stylesheet" href="css/style.css"> -->
</head>
<style>
.title {
	width: fit-content;
	padding: 1rem;
	background-color: #faf;
	cursor: pointer;
}
</style>
<body>
	<% for (TodoBean todo: todos) { %>
		<div class="todo">
			<p class="title" data-todoId=<%= todo.getTodoId() %>><%= todo.getTitle() %></p>
			<div id="info<%= todo.getTodoId() %>"></div>
		</div>
	<% } %>
</body>
<script>
	const createHTML = (data) => {
		const info = document.getElementById('info' + data.todoId);
		const html = `
			<p class="info-title">title: \${data.title}</p>
			<p class="info-memo">memo: \${data.memo}</p>
			<p class="info-startTime">startTime: \${data.startTime}</p>
			<p class="info-endTime">endTime: \${data.endTime}</p>
		`;
		info.innerHTML = html;
		info.style.display = 'block';
	}
	
	const getData = async (todoId) => {
		const res = await fetch('http://localhost:8080/todo/api/v1/detail?todoId=' + todoId, {
			method: 'GET',
			mode: 'cors'
		})
			.then((response) => response.json())
			.then((data) => createHTML(data));
	}

	let selectedTodo;

	const titles = document.getElementsByClassName('title');
	Array.from(titles).forEach(title => {
		const todoId = title.dataset.todoid;
		title.addEventListener("mouseover", (e) => {
			selectedTodo = todoId;
			setTimeout(() => {
				if (selectedTodo === todoId) {
					getData(todoId);
				}
			}, 500);
		});
		title.addEventListener("mouseout", (e) => {
			selectedTodo = null;
			const info = document.getElementById('info' + todoId);
			if (info) {
				info.style.display = 'none';
			}
		});
	})
</script>
</html>
