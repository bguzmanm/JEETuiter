<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tuiter - Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<form class="form container" action="${pageContext.request.contextPath}/login" method="post">

			<div class="row g-3 align-items-center">
				<div class="col-auto">
					<label class="col-form-label" for="username">Usuario:</label>
				</div>
				<div class="col-auto">
					<input class="form-control" type="text" name="username"
						id="username" placeholder="username">
				</div>
			</div>

			<div class="row g-3 align-items-center">
				<div class="col-auto">
					<label class="col-form-label" for="password">Contraseña:</label>
				</div>
				<div class="col-auto">
					<input class="form-control" type="password" name="password"
						id="password" placeholder="password">
				</div>
			</div>
			<div class="row g-3 align-items-center">
				<div class="col-auto">
					<button class="btn btn-primary" type="submit">Ingresar</button>
				</div>
				<div class="col-auto">
					<button class="btn btn-secondary" type="reset">Limpiar</button>
				</div>
			</div>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
		crossorigin="anonymous"></script>
</body>
</html>