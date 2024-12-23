<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
    <style>
        body{
            font-family: Arial;
            width: 200px;
            margin: 10px;
            padding: 10px;
            border: 1px solid black;
        }
        form{
            padding: 10px;
        }
        h2{
            margin: 0;
            text-align: center;
        }
    </style>
</head>
<body>
<h2> Convert </h2>
<form action="/convert" method="get">
    <label>rate: </label> <br/>
    <input type="number" placeholder="rate" name="rate"><br/>
    <label>USD: </label> <br/>
    <input type="number" placeholder="usd" name="usd"><br/>
    <br/><input type="submit" id="submit" value="Converter">
</form>
</body>
</html>