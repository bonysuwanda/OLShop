<%-- 
    Document   : successregister
    Created on : Dec 15, 2017, 3:26:32 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Success</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"/> 
        <div class="container">
        <h1>Register Success!</h1>
        Nama Lengkap : ${data.namaLengkap} <br/>
        E-mail       : ${data.email} <br/>
        No. Telefon  : ${data.notelp} <br/>
        Alamat       : ${data.address} <br/>
        Username     : ${data.username} <br/>
        Password     : ${data.password} <br/>
        
        <br/><a href="${pageContext.request.contextPath}/login">Please Login</a>
        </div>
    </body>
</html>
