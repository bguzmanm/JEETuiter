<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tuiter with JEE</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-6">
				<h1>Timeline</h1>
			</div>
			<div class="col-6 d-flex justify-content-end">
				<a href="${pageContext.request.contextPath}/login" class="link">Login</a>
			</div>
		</div>

		<div class="container-sm p-2 m-4">
			<div>
				<form action="${pageContext.request.contextPath}/" method="post"
					class="form">
					<div class="row m-2">
						<h3>Hola Pepito,</h3>
					</div>
					<div class="row m-2">
						<div class="form-floating">
							<textarea class="form-control" placeholder="¿Que está pasando?"
								id="message" name="message" style="height: 100px"></textarea>
							<label for="floatingTextarea2">¿Que está pasando?</label>
						</div>
					</div>
					<div class="row m-2">
						<div class="d-flex justify-content-end">
							<button type="submit" class="btn btn-primary">Postear</button>
						</div>
					</div>
				</form>
			</div>
			<c:forEach var="tuit" items="${tuits}">
				<div class="card m-2">
					<div class="card-header">
						<h5 class="card-title">
							<c:out value="${tuit.getUser().getUsername()}"></c:out>
						</h5>
					</div>
					<div class="card-body">
						<p class="card-text">${tuit.getMessage()}</p>
						<div class="d-flex justify-content-end">
							<c:out value="${tuit.getPublicationDate()}"></c:out>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
		crossorigin="anonymous"></script>
</body>
</html>