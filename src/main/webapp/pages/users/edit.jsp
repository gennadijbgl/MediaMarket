<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<div class=" col-lg-5 col-lg-offset-3 centered">

    <form method="post" action="edit">
        <h1>Змяненне карыстача</h1>

        <input type="hidden" class="hidden" value="<c:out value="${item.getId()}" />" id="id" name = "id" >

        <div class="form-group">
            <label for="username">Імя</label>
            <input type="text" class="form-control disabled" value="<c:out value="${item.getUsername()}" />" id="username" name = "username" placeholder="Назва (макс 50 сімбаляў)" required >

        </div>

        <div class="form-group">
            <label for="password1">Пароль</label>
            <input type="text" class="form-control" value="<c:out value="${item.getPassword()}" />" id="password1" name = "password1" placeholder="Назва (макс 50 сімбаляў)" required >

        </div>

        <div class="form-group">
            <label for="email">Пошта</label>
            <input type="text" class="form-control" value="<c:out value="${item.getEmail()}" />" id="email" name = "email" placeholder="Назва (макс 50 сімбаляў)" required >

        </div>

        <div class="form-group">
            <label for="roleId">Роля</label>
            <select  id ="roleId" class="form-control" name = "roleId" placeholder="Абярыце ролю" required>
                <c:forEach items="${roles}" var="role">
                    <option value="${role.getId()}" selected=${role.getId() == item.getRoleId() ? 'selected' : ''}>${role.getTitle()}</option>
                </c:forEach>
            </select>
        </div>

        <button type="submit"  role="group"  class="btn-group btn btn-default">Захаваць</button>
    </form>




</div>



