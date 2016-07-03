<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script src="http://code.jquery.com/jquery-2.0.0.js"></script>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css">
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.js"></script>--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/ui-bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/bootstrap.js"></script>


    <title>Медыя-маркет</title>

</head>

<body>

<jsp:include page="/pages/shared/menu.jsp" />

<div class="container">


    <%
        String path = (String) request.getAttribute("page");

    %>
    <jsp:include page="<%= path %>" />


</div>
</body>
</html>
