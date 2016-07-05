<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<div class=" col-lg-5 col-lg-offset-3 centered">

    <form method="post" action="edit">
        <h1>Змяненне катэгорыі</h1>

        <input type="hidden" class="hidden" value="<c:out value="${item.getId()}" />" id="id" name = "id" >

        <div class="form-group">
            <label for="title">Назва</label>
            <input type="text" class="form-control" value="<c:out value="${item.getTitle()}" />" id="title" name = "title" placeholder="Назва (макс 50 сімбаляў)" required pattern="^[A-Za-zА-Яа-яЁё0-9- ]{1,50}$">

        </div>



        <div class="form-group">
            <label for="description">Апісанне</label>
            <textarea class="form-control" rows="3" id = "description"  name = "description" placeholder="Апісанне" maxlength="256"><c:out value="${item.getDescription()}"/></textarea>
        </div>
        <button type="submit" role="group"  class="btn-group btn btn-default">Захаваць</button>
    </form>




</div>



