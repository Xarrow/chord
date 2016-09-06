<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2016/8/21
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="<c:url value="/public/js/jquery-3.1.0.min.js"/>"></script>
<script src="<c:url value="/public/js/materialize/js/materialize.min.js"/>"></script>
<%--<link rel="stylesheet" href="<c:url value="/public/css/materialize.min.css"/>">--%>
<style>
    html {
        font-family: GillSans, Calibri, Trebuchet, sans-serif;
    }
    select{display:block}
    .material-icons {
        font-family: 'Material Icons';
        font-weight: normal;
        font-style: normal;
        font-size: 24px; /* Preferred icon size */
        display: inline-block;
        line-height: 1;
        text-transform: none;
        letter-spacing: normal;
        word-wrap: normal;
        white-space: nowrap;
        direction: ltr;

        /* Support for all WebKit browsers. */
        -webkit-font-smoothing: antialiased;
        /* Support for Safari and Chrome. */
        text-rendering: optimizeLegibility;

        /* Support for Firefox. */
        -moz-osx-font-smoothing: grayscale;

        /* Support for IE. */
        font-feature-settings: 'liga';
    }

    /* fallback */
    @font-face {
        font-family: 'Material Icons';
        font-style: normal;
        font-weight: 400;
        src: local('Material Icons'), local('MaterialIcons-Regular'), url(/public/fonts/2fcrYFNaTjcS6g4U3t-Y5ZjZjT5FdEJ140U2DJYC3mY.woff2) format('woff2');
    }

    .material-icons {
        font-family: 'Material Icons';
        font-weight: normal;
        font-style: normal;
        font-size: 24px;
        line-height: 1;
        letter-spacing: normal;
        text-transform: none;
        display: inline-block;
        white-space: nowrap;
        word-wrap: normal;
        direction: ltr;
        -webkit-font-feature-settings: 'liga';
        -webkit-font-smoothing: antialiased;
    }

</style>
<%--dev--%>
<link rel="stylesheet" href="<c:url value="/public/css/materialize.css"/>">
<body>
<!-- Dropdown Structure -->
<%--<ul id="dropdown1" class="dropdown-content">--%>
    <%--<li><a href="#!">one</a></li>--%>
    <%--<li><a href="#!">two</a></li>--%>
    <%--<li class="divider"></li>--%>
    <%--<li><a href="#!">three</a></li>--%>
<%--</ul>--%>
<%--<nav>--%>
    <%--<div class="nav-wrapper">--%>
        <%--<a href="#" class="brand-logo">MUSIC</a>--%>
        <%--<i class="material-icons right">code</i>--%>
        <%--<ul class="right hide-on-med-and-down">--%>
            <%--<!-- Dropdown Trigger -->--%>
            <%--<li>--%>
                <%--<a class="dropdown-button" href="#" data-activates="dropdown1">Dropdown<i class="material-icons right">arrow_drop_down</i></a>--%>
            <%--</li>--%>
        <%--</ul>--%>
    <%--</div>--%>
<%--</nav>--%>
<nav class="top-nav z-depth-4">
    <div class="container">
        <div class="nav-wrapper">
            <a class="brand-logo" href="/music/163">
                <i class="material-icons left">send</i>
                Music</a>
        </div>
    </div>
</nav>
</body>
</html>
