<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/12/2024
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h3 style="text-align: center"> Thêm mới học sinh</h3>
<div class="container">
    <form method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Tên: </label>
            <input type="text" class="form-control" id="name" name="name">
        </div>
        <div class="mb-3">
            <label for="name" class="form-label">Địa chỉ: </label>
            <input type="text" class="form-control" id="address" name="address">
        </div>
        <div class="mb-3">
            <label for="name" class="form-label">Điểm: </label>
            <input type="number" class="form-control" id="point" name="point">
        </div>
        <div class="mb-3">
            <label for="name" class="form-label">Tên lớp: </label>
            <input type="text" class="form-control" id="className" name="className">
        </div>
        <button type="submit" class="btn btn-primary"> Thêm mới</button>
    </form>

</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
