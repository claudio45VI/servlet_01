<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Riepilogo</title>
	</head>
	<body>
		<h4>Expression Language</h4>
		
		<p>Nome: ${contengoNomeGet}</p>
		<p>E-mail: ${contengoEmailGet}</p>
		
		<p>Nome: ${contengoNomePost}</p>
		<p>E-mail: ${contengoEmailPost}</p>
		
		
		
		<h4>Scriptlet</h4>
		<% String nomeGet = (String) request.getAttribute("contengoNomeGet"); %>
		<% String emailGet = (String) request.getAttribute("contengoEmailGet"); %>
		<p>Nome: <%= nomeGet %></p>
		<p>Email: <%= emailGet %></p>
		
		<% String nomePost = (String) request.getAttribute("contengoNomePost"); %>
		<% String emailPost = (String) request.getAttribute("contengoEmailPost"); %>
		<p>Nome: <%= nomePost %></p>
		<p>Email: <%= emailPost %></p>
		
		<a href="registrazione.jsp">Torna alla pagina di registrazione</a>
	</body>
</html>