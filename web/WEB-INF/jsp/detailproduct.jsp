<%-- 
    Document   : detailproduct
    Created on : Dec 18, 2017, 2:15:12 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <jsp:include page="head.jsp"/> 
        <div class="container">

            <h1>Detail Product</h1>

            <image src="<c:url value="/resources/images/${dp.images}" />"widht="200px" height="200px"/><br/>
            Name : ${dp.productNama}<br/>
            Price: ${dp.harga}<br/>
            Stok : ${dp.stok}<br/>
            <div class="container"> 
                
                    <c:if test="${not empty sessionScope.user}">
                        <a href="${pageContext.request.contextPath}/carts/add/${dp.id}" >
                            <button type="button" class="btn btn-default btn-sm">
                            <span class="glyphicon glyphicon-shopping-cart"></span> Add to Cart
                            </button>
                        </a>    
                    </c:if>
                
            </div>
        </div>
    </body>
</html>
