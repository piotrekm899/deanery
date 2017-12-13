<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

    <style>
        .errors {color: red}
    </style>

</head>
<body>

Welcome to the virtual deanery!!!
<br><br>

Please log in as Student or Teacher to continue:
<br><br>

<%--@elvariable id="cred" type="com.example.demo.Credentials"--%>
<form:form action="loggedin" modelAttribute="cred">

    Username: <form:input path="username"/>
    <form:errors path="username" cssClass="errors"/>
    <br><br>

    Password: <form:password path="password"/>
    <form:errors path="password" cssClass="errors"/>
    <br><br>

    <input type="submit" value="submit">

</form:form>

<%--LOGIN FORM--%>

</body>
</html>
