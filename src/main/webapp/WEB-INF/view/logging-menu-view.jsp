<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false" %>

<html>

<body>

<h3> Please enter necessary information to login to sports_event DB </h3>

<c:if test="${not empty errorMessage}">
    <div style="color: red;">${errorMessage}</div>
</c:if> <br>

<form:form action="home" modelAttribute="connectInfo" method="post">

Username: <form:input path="user"/> <br> <br>
Password: <form:input path="password"/> <br> <br>

<input type="submit" value="Enter"/>

</form:form>

</body>

</html>