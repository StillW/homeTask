<%@ page pageEncoding="UTF-8" 	contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Still
  Date: 23.05.2015
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
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
</head>
<body>


<p>Hello Admin</p>
<form class="login-form" action="<c:url value="/st"/>" method="post">
  <input type="text" name = "subject"><br>
  <textarea name = "text" ></textarea>
  <button type="submit">Сохранить</button>
  </form>

<a href="<c:url value="/st"/>">text</a>
<script>
  alert("Hello User")
</script>




<button type="submit">Logout</button>


</body>
</html>
