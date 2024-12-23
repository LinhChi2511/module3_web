<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/calculator" method="post">
    Product Description: <input name="Description" type="text" placeholder="Mô tả sản phẩm"/>
    List Price: <input name="Price" type="number" placeholder="Giá niêm yết"/>
    Discount Percent(%): <input name="DiscountPercent" type="number" placeholder="Tỷ lệ chiết khấu %">
    <input type="submit" id="submit" value="Calculate Discount">
</form>
</body>
</html>