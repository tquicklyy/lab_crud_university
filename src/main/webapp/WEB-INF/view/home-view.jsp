<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>

<head>
    <title> Main menu </title>

    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .menu a {
            text-decoration: none;
            display: block;
            width: 200px;
            border-radius: 5px;
            background-color: #4CAF50;
            margin-top: 15px;
            padding: 10px;
            color: white;
        }

        .menu a:hover {
            background-color: #45A049;
        }

    </style>

</head>

<body>
<h1> Main menu </h1>

    <div class="menu">
        <a href="/guide-data"> Guide data </a>
        <a href="/operational-data"> Operational data </a>
        <a href="/reports"> Reports </a>
        <a href="/about-program"> About program </a>
    </div>
</body>

</html>