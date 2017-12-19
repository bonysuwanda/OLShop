<%-- 
    Document   : cart
    Created on : Dec 18, 2017, 10:02:59 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Cart Page</title>
    </head>
    <body>
        <jsp:include page="head.jsp"/>
        <div class="container">
            <h1>Keranjang Belanja Anda </h1>

            <table class="table table-hover table-condensed table-responsive">

                <tr>
                    <th>Descirption</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr> 
                <c:forEach var="d" items="${cart.carts}">

                    <tr>
                        <td>${d.value.productNama}</td>
                        <td>${d.value.harga}</td>
                        <td>
                            <div class="input-group">
                               
                                    <button class="input-group-addon">
                                    <i class="glyphicon glyphicon-minus"></i>
                                    <a href=""></a>
                                </button>
                                
                                    <span>1</span>
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-plus"></i></span>
                            </div>
                        </td>
                        <td><a href="${pageContext.request.contextPath}/carts/${d.value.id}/${d.key}"> Remove from Cart</a></td>

                    </tr>
                </c:forEach>
            </table>

            <h2>TOTAL HARGA : ${cartot}</h2>
        </div>

    </body>
</html>
