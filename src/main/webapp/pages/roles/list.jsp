<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="panel panel-default">

    <div class="panel-heading">Ролі</div>


    <table class="table">
        <thead>
        <tr>
            <th>Ід</th>
            <th>Назва</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${itemsArray}" var="item">
            <tr>
                <td><c:out value="${item.getId()}" /></td>
                <td><c:out value="${item.getTitle()}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>




