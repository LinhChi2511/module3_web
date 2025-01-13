<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/12/2024
  Time: 12:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--bộ thư viện hỗ trợ JSTL thêm thư viện trước khi sử dụng taglib--%>
<html>
<head>
    <title>Danh sách học sinh</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h2 style="text-align: center">Danh sách học sinh</h2>
<div class="container">
    <table class="table table-dark table-hover">
        <thead>
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Địa chỉ</th>
            <th>Điểm</th>
            <th>Lớp</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${students}" var="student" varStatus="temp">
            <tr>
                <td>${temp.count}</td>
                <td>${student.name}</td>
                <td>${student.address}</td>
                <td>${student.point}</td>
                <td>${student.className}</td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
    <button type="button" class="btn btn-primary" onclick="window.location.href='/students?action=create'">Thêm mới</button>

</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
