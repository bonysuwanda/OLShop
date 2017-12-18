<%-- 
    Document   : login
    Created on : Dec 15, 2017, 9:14:59 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
         <jsp:include page="head.jsp"/>
         <div class="container">
             
             <div class="form-group"></div>
        <h1>Login</h1>
         <form:form action="${pageContext.request.contextPath}/login/check" modelAttribute="login" method="POST" class="form-horizontal">

                        <div class="form-group">
                            <form:label  path="username" class="col-sm-4 control-label">Username</form:label>
                                <div class="col-sm-4">
                                <form:input path="username" class="form-control" />
                            </div>
                        </div>
                        <div class="form-group">
                            <form:label path="password" class="col-sm-4 control-label">Password</form:label>
                                <div class="col-sm-4">
                                <form:password path="password" class="form-control" />
                            </div>
                        </div>
                        <div align="center">
                            <form:button name="submitButton" value="Submit" class="btn btn-default">Submit</form:button>
                            </div>
     
                    </form:form>
        <h3>${errMsg}</h3>
         </div>
    </body>
</html>
