<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page isELIgnored="false" language="java" contentType="text/html charset=UTF-8" %>

<html>

<head>

    <title> Table ${nameOfTable} </title>

    <style>
        body {
            font-family: Arial, sans-serif;
        }

        a {
            text-decoration: none;
            wi
        }

        a:hover {
            background-color: #45A049;
        }

    </style>

</head>

<body>

<label> Table ${nameOfTable} </label> <br><br>

    <table>
        <thead>
            <tr>
                <c:forEach var="name" items = "${columnNames}">
                    <td> ${name} </td>
                </c:forEach>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="listObject" items = "${coaches}">
                <tr>
                    <c:forEach var="object" items = "${listObject}">
                        <td> ${object} </td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    Page #${currentPage + 1}

    <div>
        <c:if test="${currentPage > 0}">
            <button onClick="window.location.href='read?page=${currentPage - 1}'"> Previous page </button>
        </c:if>
        <c:if test="${currentPage < totalPages - 1}">
            <button onClick="window.location.href='read?page=${currentPage + 1}'"> Next page </button>
        </c:if>
    </div>

</body>

</html>