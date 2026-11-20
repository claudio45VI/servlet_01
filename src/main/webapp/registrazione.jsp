<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registrazione</title>
	</head>
	<body>
	
		<h2>Registrazione doPost</h2>
		<form action="registrazione" method="post">
			<div>
				<label>Nome</label>
				<input type="text" name="nome">
			</div>
			<div>
				<label>E-mail</label>
				<input type="email" name="email">
			</div>
			<button type="submit">Invia</button>
		</form>
		
		<h2>Registrazione doGet</h2>
		<form action="registrazione" method="get">
			<div>
				<label>Nome</label>
				<input type="text" name="nome">
			</div>
			<div>
				<label>E-mail</label>
				<input type="email" name="email">
			</div>
			<button type="submit">Invia</button>
		</form>
		
		<!-- Registrazione utente -->
	</body>
</html>