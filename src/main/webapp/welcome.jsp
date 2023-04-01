<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to My App</title>
</head>
<body>
<h1>Welcome to My App</h1>
<p>Please fill out the form below:</p>
<form method="post" action="myServlet">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
