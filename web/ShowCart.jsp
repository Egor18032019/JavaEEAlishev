<%--
  Created by IntelliJ IDEA.
  User: Teacher
  Date: 04.09.2021
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<h1>В вашей корзине:</h1>
<%@page import="somePackage.Cart" %>
<% Cart cart = (Cart) session.getAttribute("cart");%>
<ul>
    <li>
        <%=cart.getName() %>
        <span><%=cart.getQuantity()%></span>
    </li>
</ul>
</body>
</html>
