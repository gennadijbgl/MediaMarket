<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class="jumbotron">
    <h1>Hello, world!</h1>
    <p>...</p>
    <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
</div>

<div class="panel panel-default">
    <!-- Default panel contents -->
    <div class="panel-heading">Users</div>

    <!-- Table -->
    <table class="table">
        <thead>
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Email</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${persons}" var="item">
            <tr>
                <td><c:out value="${item.getId()}" /></td>
                <td><c:out value="${item.getUsername()}" /></td>
                <td><c:out value="${item.getEmail()}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


