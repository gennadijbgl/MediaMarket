<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<div class="panel panel-default">

    <div class="panel-heading">Goods</div>


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
                <td><c:out value="${item.getTitle()}" /></td>
                <td><c:out value="${item.getDescription()}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>




