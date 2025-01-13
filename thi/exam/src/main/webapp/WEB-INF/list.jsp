<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/1/2025
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<button class="btn btn-success" onclick="window.location.href='/matbang?action=create'">Thêm mới</button>
<table class="table table-hover">
    <thead>
    <tr>
        <th>#</th>
        <th>Mã mặt bằng</th>
        <th>Diện tích</th>
        <th>Trạng thái</th>
        <th>Tầng</th>
        <th>Loại văn phòng</th>
        <th>Giá cho thuê</th>
        <th>Ngày bắt đầu</th>
        <th>Ngày kết thúc</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="mb" varStatus="temp">
    <tr>
        <td>${temp.count}</td>
        <td>${mb.maMB}</td>
        <td>${mb.trangThai}</td>
        <td>${mb.dienTich}</td>
        <td>${mb.tang}</td>
        <td>${mb.loaiMB}</td>
        <td>${mb.gia}</td>
        <td>${mb.startDate}</td>
        <td>${mb.endDate}</td>
    </tr>
    </c:forEach>

    </tbody>
    <c:if test="${message != null}">
        <div class="alert alert-success" role="alert" id="message">
                ${message}
        </div>
    </c:if>
</table>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<script>
    setTimeout(function (){
        document.getElementById("message").remove();
    },2000)
</script>
</html>
