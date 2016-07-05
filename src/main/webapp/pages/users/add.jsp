<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<div class=" col-lg-5 col-lg-offset-3 centered">

    <form method="post" action="add">
        <h1>Рэгістрацыя</h1>


        <div class="form-group">
            <label for="username">Логін</label>
            <input required type="text" class="form-control" id="username" name="username" placeholder="Логін">
        </div>

        <div class="form-group">
            <label for="password1">Пароль</label>
            <input required type="password" class="form-control" id="password1" name="password1" placeholder="Пароль">
        </div>

        <div class="form-group">
            <label for="password2">Пароль яшчэ раз</label>
            <input required type="password" class="form-control" id="password2" name="password2" placeholder="Паўтарыце пароль">
        </div>

        <div class="form-group">
            <label for="email">Электронная пошта</label>
            <input required type="email" class="form-control" name="email" id="email" placeholder="Адрас пошты">
        </div>
         <button type="submit" role="group"  class="btn-group btn btn-default">Зарэгістравацца</button>
    </form>




</div>



