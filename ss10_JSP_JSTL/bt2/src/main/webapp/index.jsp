<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form action="/calculator" method="post">
    <div class="mb-3">
        <label for="firstNum" class="form-label">First operand</label>
        <input type="email" class="form-control" id="firstNum" name="firstNum">
    </div>
    <select class="form-select" name="operator">
        <option value="+">add</option>
        <option value="-">minus</option>
        <option value="*">times</option>
        <option value="/">divide</option>
    </select>
    <div class="mb-3">
        <label for="secondNum" class="form-label">Second operand</label>
        <input type="email" class="form-control" id="secondNum" name="secondNum">
    </div>
</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>