<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/12/2024
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
  float rate = Float.parseFloat(request.getParameter("rate"));
  float usd = Float.parseFloat(request.getParameter("usd"));

  double vnd = usd * rate;
%>

<h1>Rate: <%=rate%></h1>
<h1>USD: <%=usd%>$</h1>
<h1>VND: <%=vnd%>đ</h1>
</body>
</html>
