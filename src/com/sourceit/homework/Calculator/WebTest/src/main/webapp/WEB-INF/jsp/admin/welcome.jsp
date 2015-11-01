<%--
  Created by IntelliJ IDEA.
  User: Still
  Date: 27.05.2015
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
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

<div class="content">
  <div class="form-wrapper">
    <div class="linker">
      <span class="ring"></span>
      <span class="ring"></span>
      <span class="ring"></span>
      <span class="ring"></span>
      <span class="ring"></span>
    </div>
    <form class="login-form" action="<c:url value="/logout"/>" method="post">
      <button type="button">Hi ${name}</button>
      <button type="button">${firstName}</button>
      <button type="button">${lastName}</button>

      <button type="submit">Logout</button>
    </form>
  </div>
</div>

</body>
</html>
