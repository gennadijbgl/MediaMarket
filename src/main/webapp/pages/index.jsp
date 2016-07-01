<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html ng-app>
<html>

<head>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
    <link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="../lib/jquery.js"></script>
    <script type="text/javascript" src="../lib/ui-bootstrap.js"></script>

    <title>Медыя-маркет</title>
</head>

<body>


<div>
    <table>
        <c:forEach items="${persons}" var="item">
            <tr>
                <td><c:out value="${item}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>