<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/calculator" method="post">
    <div class="mb-3">
        <label for="description" class="form-label">Product Description</label>
        <input type="text" class="form-control" id="description" name="Description">
    </div>
    <div class="mb-3">
        <label for="price" class="form-label">List Price</label>
        <input type="number" class="form-control" id="price" name="Price">
    </div>
    <div class="mb-3">
        <label for="discount_percent" class="form-label">Discount Percent</label>
        <input type="number" class="form-control" id="discount_percent" name="DiscountPercent">
    </div>
    <button class="btn btn-primary" type="submit" value="Calculate Discount">Calculate</button>

</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>