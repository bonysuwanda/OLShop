<%-- 
    Document   : detailproduct
    Created on : Dec 18, 2017, 2:15:12 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Detail Product</title>
    </head>
    <body>
           <jsp:include page="head.jsp"/> 
           <div class="container">
        
        <h1>Detail Product</h1>
        
         <image src="<c:url value="/resources/images/${dp.images}" />"widht="200px" height="200px"/><br/>
         Name : ${dp.productNama}<br/>
         Price: ${dp.harga}<br/>
         Stok : ${dp.stok}<br/>
         <div class="container"> 
        <button type="button" class="btn btn-default btn-sm">
          <span class="glyphicon glyphicon-shopping-cart"></span> Add to Cart
        </button>
        </div>
        </div>
    </body>
</html>
