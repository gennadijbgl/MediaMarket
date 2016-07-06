<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<div class=" col-lg-5 col-lg-offset-3 centered">

    <form method="post" action="add">
        <h1>Дадаванне катэгорыі</h1>

        <div class="form-group">
            <label for="title">Назва</label>
            <input type="text" class="form-control" id="title" name = "title" placeholder="Назва (макс 50 сімбаляў)" required pattern="^[A-Za-zА-Яа-яЁё0-9- ]{1,50}$">
        </div>


        <div class="form-group">
            <label for="description">Апісанне</label>
            <textarea class="form-control" rows="3" id = "description" name = "description" placeholder="Апісанне" maxlength="256"></textarea>
        </div>
         <button type="submit" role="group"  class="btn-group btn btn-default">Дадаць тавар</button>
    </form>




</div>



