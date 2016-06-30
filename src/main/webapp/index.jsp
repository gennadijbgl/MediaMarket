<%@ page import="entities.User" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>Hello World!</h2>
<h1>Persons</h1>

<c:url var="addUrl" value="/krams/main/persons/add" />
<table style="border: 1px solid; width: 500px; text-align:center">
    <thead style="background:#fcf">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Money</th>
        <th colspan="3"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${persons}" var="person">
        <c:url var="editUrl" value="/krams/main/persons/edit?id=${person.id}" />
        <c:url var="deleteUrl" value="/krams/main/persons/delete?id=${person.id}" />
        <tr>
            <td><c:out value="${person.username}" /></td>
            <td><c:out value="${person.password}" /></td>
            <td><c:out value="${person.money}" /></td>
            <td><a href="${editUrl}">Edit</a></td>
            <td><a href="${deleteUrl}">Delete</a></td>
            <td><a href="${addUrl}">Add</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<c:if test="${empty persons}">
    There are currently no persons in the list. <a href="${addUrl}">Add</a> a person.
</c:if>


<%
    // retrieve your list from the request, with casting
    List<User> list = (List<User>) request.getAttribute("persons");

// print the information about every category of the list
    for(User category : list) {
        out.println(category.getId());
        out.println(category.getEmail());
        out.println(category.getPassword());
    }
%>

</body>
</html>
