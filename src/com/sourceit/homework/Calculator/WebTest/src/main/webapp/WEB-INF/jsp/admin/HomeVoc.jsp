<%--
  Created by IntelliJ IDEA.
  User: Still
  Date: 15.10.2015
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
</head>
<body>

<%--<c:if test="${!empty itemList}">--%>
<table class="item-table">
  <tr>
    <th>Type</th>
    <th>Articles</th>
  </tr>

  <c:forEach items="${itemList}" var="It">
    <tr>
      <td>${it.name}</td>
      <td>${it.description}</td>
      <td>${it.category}</td>
      <td>${it.prce}</td>
    </tr>
  </c:forEach>

</table>
<%--</c:if>--%>

</body>
</html>
