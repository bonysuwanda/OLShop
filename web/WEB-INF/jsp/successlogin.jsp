<%-- 
    Document   : successlogin
    Created on : Dec 17, 2017, 10:14:21 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Success</title>
    </head>
    <body>
        <h1>${user.username}, Thanks For Login</h1>
        <h3><a href="${pageContext.request.contextPath}/product">See Our Product</a></h3>
        
    </body>
</html>
