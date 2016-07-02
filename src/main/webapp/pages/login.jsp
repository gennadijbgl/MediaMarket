<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
	<link href="${pageContext.request.contextPath}/css/bootstrap.css"" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/lib/ui-bootstrap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/lib/bootstrap.js"></script>

	<title>Медыя-маркет</title>
</head>


<body onload='document.loginForm.username.focus();'>

<div id="main_container">
	<!-- FRAME -->
	<div id="frame">

		<!-- BEGIN HEADER -->
		<div id="top">
			<div id="logo">
				<div id="pad_logo">
					<a href="index.html"><img src="image/logo.gif" alt="" /></a>
				</div>
			</div>

			<div id="topmenu">
				<div id="nav">
					<ul id="menu">
						<li><a class="active" href="index">Главная</a></li>
						<li><a href="services">Услуги</a></li>
						<li><a href="management">Управление</a></li>
						<li><a href="registration">Регистрация</a></li>
						<li class="last"><a href="#bottom_container">Контакты</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
<div id="loginForm">

	<section class="container">
		<div class="login">

			<h1>Логин</h1>

			<div id = "error" class = "fieldError"></div>
			<form method="post" action="j_security_check">
				<div>
					<input type="text" required name="j_username" placeholder="Логин">
				</div>
				<div><input type="text" required name="j_password" placeholder="Пароль"></div>
				<div class="submit">
					<input type="submit" name="Submit" value="Войти">
				</div>
			</form>


		</div>

	</section>


		</div>


	</div>
</body>
</html>