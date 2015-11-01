
<%--
  Created by IntelliJ IDEA.
  User: Still
  Date: 12.05.2015
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
  <a href="<c:url value="/"/>">Sign in</a>
        <span class="right">
        <a href="<c:url value="/"/>">
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
    <form class="login-form" action="<c:url value="/welcome"/>" method="post">
      <input type="text" name="username" placeholder="Логин" />
      <input type="text" name="firstName" placeholder="First Name" />
      <input type="text" name="lastName" placeholder="Last Name" />
      <input type="text" name="email" placeholder="Email" />
      <input type="password" name="password" placeholder="Пароль" />
      <input type="password" name="confirmPassword" placeholder="Пароль" />
      <button type="submit">Registration</button>
    </form>
  </div>
</div>

</body>

</html>