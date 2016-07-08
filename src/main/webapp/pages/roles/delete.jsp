<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<div class=" col-lg-5 col-lg-offset-3 centered">


    <form method="post" action="delete">
        <input type="hidden" class="hidden" value="<c:out value="${item.getId()}" />" id="id" name = "id" >

        <div class="panel panel-danger">
            <div class="panel-heading">
                <h3 class="panel-title">Выдаленне ролі</h3>
            </div>
            <div class="panel-body">
                <div class="form-group">
                    <h5>Назва: </h5>
                    <c:out value="${item.getTitle()}" />
                </div>


            </div>
        </div>

        <button type="submit" role="group"  class="btn btn-default">Выдаліць</button>
    </form>

</div>



