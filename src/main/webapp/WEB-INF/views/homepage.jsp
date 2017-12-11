<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 01.12.2017
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Homepage</title>
</head>
<body>

Welcome to the virtual deanery!!!
<br><br>

Please log in as Student or Teacher to continue:
<br><br>

<form action="loggedin" method="post">

    <input type="text" name="login" placeholder="What's your login?"/><br>
    <input type="password" name="password" placeholder="What's your password?"/><br>
    <input type="submit" />
    <br><br>
    <p><font color="red">${errormsg}</font></p>

<%--LOGIN FORM--%>

</body>
</html>
