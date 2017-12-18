<%-- 
    Document   : welcom
    Created on : Dec 14, 2017, 4:26:17 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Situs Belanja Online</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"/>
        <div class="container">
        <h1 align="center">${msg} BukaTiker.com</h1>
        <a href="product"><h5 align="center">Our Prodoct</h5></a>
        </div>
    </body>
</html>
