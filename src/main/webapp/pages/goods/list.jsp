<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="panel panel-default">

    <div class="panel-heading">Тавары</div>

<c:if test="${not empty  itemsArray}">
    <table class="table">
        <thead>
        <tr>
            <th>Ід</th>
            <th>Назва</th>
            <th>Апісанне</th>
            <th>Катэгорыя</th>
            <th>Кошт</th>
            <th>Колькасць</th>
            <th>Дзеянні</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${itemsArray}" var="item">
            <tr>
                <td><c:out value="${item.getId()}" /></td>
                <td><c:out value="${item.getTitle()}" /></td>
                <td><c:out value="${item.getDescription()}" /></td>
                <td><c:out value="${item.getCategory().getTitle()}" /></td>
                <td><c:out value="${item.getPrice()}" /></td>
                <td><c:out value="${item.getCount()}" /></td>
                <td><a href="<c:out value="${request.getAttribute('page')}edit?id=${item.getId()}" />">Змяніць</a>
                    <a href="<c:out value="${request.getAttribute('page')}delete?id=${item.getId()}" />">Выдаліць</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</c:if>



