<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/1/2025
  Time: 8:52 PM
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
<form action="/matbang" method="post">
    <div class="mb-3">
        <label for="maMB" class="form-label">Mã Mặt bằng: </label>
        <input type="text" class="form-control" id="maMB" name="maMB">
    </div>
    <div class="mb-3">
        <label for="trangThai" class="form-label">Trạng thái: </label>
        <select class="form-control" id="trangThai" name="trangThai" required>
            <option value="Trống">Trống</option>
            <option value="Hạ Tầng">Hạ Tầng</option>
            <option value="Đầy Đủ">Đầy Đủ</option>
        </select>
    </div>
    <div class="mb-3">
        <label for="dienTich" class="form-label">Diện tích: </label>
        <input type="number" class="form-control" id="dienTich" name="dienTich">
    </div>
    <div class="mb-3">
        <label for="tang" class="form-label">Tầng: </label>
        <select class="form-control" id="tang" name="tang" required>
            <c:forEach var="i" begin="1" end="15">
                <option value="${i}">${i}</option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label for="loaiVP" class="form-label">Loại văn phòng: </label>
        <select class="form-control" id="loaiVP" name="loaiVP" required>
            <option value="Văn phòng chia sẻ">Văn phòng chia sẻ</option>
            <option value="Văn phòng trọn gói">Văn phòng trọn gói</option>
        </select>
    </div>
    <div>
        <label for="gia" class="form-label">Giá: </label>
        <input type="text" class="form-control" id="gia" name="gia">
    </div>
    <div>
        <label for="startDate" class="form-label">Ngày bắt đầu: </label>
        <input type="date" class="form-control" id="startDate" name="startDate">
    </div>
    <div>
        <label for="endDate" class="form-label">Ngày kết thúc: </label>
        <input type="date" class="form-control" id="endDate" name="endDate">
    </div>
    <button type="submit" class="btn btn-primary">Thêm mới</button>
</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
