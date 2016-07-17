<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${pageContext.request.contextPath}/index">
                <img alt="Brand" src="${pageContext.request.contextPath}/img/hb.png">
            </a>
        </div>


        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="dropdown active">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Ролі<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/roles/list">Спіс</a></li>
                        <li><a href="${pageContext.request.contextPath}/roles/add">Дадаць</a></li>

                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Карыстачы<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/users/list">Спіс</a></li>
                        <li><a href="${pageContext.request.contextPath}/users/add">Дадаць</a></li>

                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Катэгорыі<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/categories/list">Спіс</a></li>
                        <li><a href="${pageContext.request.contextPath}/categories/add">Дадаць</a></li>

                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Тавары<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${pageContext.request.contextPath}/goods/list">Спіс</a></li>
                        <li><a href="${pageContext.request.contextPath}/goods/add">Дадаць</a></li>
                        <li role="separator" class="divider"></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left" role="search" action="${pageContext.request.contextPath}/goods/search">
                <div class="form-group">
                    <input type="text" id="title" name="title" class="form-control" placeholder="Пошук тавара">
                </div>
                <button type="submit" class="btn btn-default">Добра</button>
            </form>

        </div>
    </div>
</nav>