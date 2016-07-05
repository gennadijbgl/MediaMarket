<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="panel panel-default">

    <div class="panel-heading">Карыстачы</div>


    <table class="table">
        <thead>
        <tr>
            <th>Ід</th>
            <th>Логін</th>
            <th>Пароль</th>
            <th>Пошта</th>
            <th>Роля</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${itemsArray}" var="item">
            <tr>
                <td><c:out value="${item.getId()}" /></td>
                <td><c:out value="${item.getUsername()}" /></td>
                <td><c:out value="${item.getPassword()}" /></td>
                <td><c:out value="${item.getEmail()}" /></td>
                <td><c:out value="${item.getRole()}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>




