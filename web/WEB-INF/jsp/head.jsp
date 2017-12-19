<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Detail Product</title>
        </head>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Situs Belanja Online</title>
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
</head>
<body>
    <div class="container">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="${pageContext.request.contextPath}">OLShop</a>
                </div>

                <ul class="nav navbar-nav navbar-right">


                    <c:if test="${not empty sessionScope.user}">


                        <li>
                            <a href="${pageContext.request.contextPath}/carts/show">
                            <span class="glyphicon glyphicon-shopping-cart">Cart ${cart.carts.size()}</span></a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/login/out">Logout</a>
                        </li>

                    </c:if>  

                    <c:if test="${empty sessionScope.user}">
                        <li><a href="${pageContext.request.contextPath}/register">
                                <span class="glyphicon glyphicon-user"></span> Sign Up</a>
                        </li>
                        <li><a href="${pageContext.request.contextPath}/login">
                                <span class="glyphicon glyphicon-log-in"></span> Login</a>
                        </li>
                    </c:if>  

                </ul>
            </div>
        </nav>

    </div>
