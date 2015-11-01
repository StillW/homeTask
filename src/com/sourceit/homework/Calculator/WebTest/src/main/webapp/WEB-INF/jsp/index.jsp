<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
    <link rel="icon" href="http://vladmaxi.net/favicon.ico" type="image/x-icon">
    <link rel="shortcut icon" href="http://vladmaxi.net/favicon.ico" type="image/x-icon">
    <style>
        <%@include file='/resources/css/style.css' %>
    </style>
    <link rel="stylesheet" href="/resources/css/style.css" media="screen" type="text/css" />
    <script src="js/prefixfree.min.js"></script>
</head>

<body>

<!-- vladmaxi top bar -->
<div class="vladmaxi-top">
    <a href="<c:url value="/Registration"/>">Regestration</a>
        <span class="right">
        <a href="<c:url value="/Registration"/>">
            <strong>Вернуться назад к статье</strong>
        </a>
        </span>
    <div class="clr"></div>
</div>
<!--/ vladmaxi top bar -->

<div class="content">
    <div class="form-wrapper">
        <div class="linker">
            <span class="ring"></span>
            <span class="ring"></span>
            <span class="ring"></span>
            <span class="ring"></span>
            <span class="ring"></span>
        </div>
        <form class="login-form" action="<c:url value="/home"/>" method="post">
            <input type="text" name="username" placeholder="Логин" />
            <input type="password" name="password" placeholder="Пароль" />
            <button type="submit">ВОЙТИ</button>

        </form>
    </div>
</div>

<script src="http:"></script>

</body>

</html>