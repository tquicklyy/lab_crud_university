<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false" language="java" contentType="text/html charset=UTF-8" %>

<html>

<head>

    <title> Login to database </title>

    <style>
        body {
            font-family: Arial, sans-serif;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            border-radius: 5px;
            width: 170px;
            height: 20px;
        }


    </style>

</head>

<body>

<label> Please enter necessary information to login to sports_event DB </label> <br><br>

<form:form action="home" modelAttribute="connectInfo" method="post">
Username <br>
<form:input path="user"/> <br> <br>
Password <br>
<form:input path="password"/> <br> <br>

<c:if test="${not empty errorMessage}">
    <div style="color: red;">${errorMessage} <br><br> </div>
</c:if>

<input type="submit" value="Enter"/>

</form:form>

</body>

</html>