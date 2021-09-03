<%--
  Created by IntelliJ IDEA.
  User: Teacher
  Date: 03.09.2021
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>

</head>
<body>
<h1>Testing jsp</h1>
<%--<% может не возвращать %>--%>
<%--<%= должно вернуть %>--%>

<%= "Hello my master" %>
<p>

    <% java.util.Date now = new java.util.Date();
        String somethng = "Текущая дата:" + now.toString().substring(10, 25);%>
    <%= somethng %>
    <% for (int i = 0; i < 9; i++) {
        out.println("<span>" + "I can wright: " + i + "</span>");
    }%>
</p>
<p class="lesson4">
    <%@ page import="java.util.Date" %>
    <%= new Date()%>
</p>
<p>
    <%@ page import="logic.Test" %>

    <%Test testClass = new Test(); %>
    <%= testClass.getInfo() %>
</p>
</body>
</html>
