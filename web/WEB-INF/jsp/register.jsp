<%-- 
    Document   : register
    Created on : Dec 15, 2017, 9:02:33 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
         <jsp:include page="head.jsp"/>
         <div class="container">
        <h1>Register Please</h1>
        <form:form action="register/save" modelAttribute="registerBean" method="POST" class="form-horizontal" >
                       
                 <div class="form-group">
                                <form:label path="namaLengkap" class="col-sm-4 control-label">Nama Lengkap</form:label>
                                    <div class="col-sm-4">
                                    <form:input path="namaLengkap" class="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <form:label path="email" class="col-sm-4 control-label">Email</form:label>
                                    <div class="col-sm-4">
                                    <form:input path="email" class="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <form:label path="notelp" class="col-sm-4 control-label">Nomor Telefon</form:label>
                                    <div class="col-sm-4">
                                    <form:input path="notelp" class="form-control" />
                                </div>
                            </div>
                                
                            <div class="form-group">
                                <form:label path="address" class="col-sm-4 control-label">Alamat</form:label>
                                    <div class="col-sm-4">
                                    <form:input path="address" class="form-control" />
                                </div>
                            </div>
                                
                            <div class="form-group">
                                <form:label path="username" class="col-sm-4 control-label">User Name</form:label>
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
                    </div>
    </body>
</html>
