<%-- 
    Document   : product
    Created on : Dec 15, 2017, 9:30:06 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <jsp:include page="head.jsp"/> 
        <div class="container">
            
        <h1>Our Product</h1>
        <c:forEach items="${prod}" var="p">
            
            <div align="center" class="col-sm-3" style="margin-bottom: 57px;">
            <a href="${pageContext.request.contextPath}/product/detail/${p.id}">
                <image src="<c:url value="/resources/images/${p.images}" />"widht="200px" height="200px"/>
            </a><br/>
            
             ${p.productNama} <br/>
            Harga       : ${p.harga}       <br/>
            </div>
        </c:forEach>
        </div>
    </body>
</html>
