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
<%--echarts--%>
<script src="<c:url value="/public/js/echarts.min.js"/>"></script>
<link rel="stylesheet" href="<c:url value="/public/css/materialize.min.css"/>">
<style>
    html {
        font-family: GillSans, Calibri, Trebuchet, sans-serif;
    }

    select {
        display: block
    }

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

    #myVideo {
        position: absolute;
        margin: auto;
        right: 0;
        bottom: 0;
        /*top: 0;*/
        width: 100%;
        /*height: 100%;*/
        /* in case the video doesn't fit the whole page*/
        background: rgba(0, 0, 0, 0.3) /* our video */ center center;
        background-size: contain;
        object-fit: cover; /*cover video background */
        opacity: 0.8;
        z-index: -1;
    }

    .footer {
        text-align: center;
        margin: 2%;
        color: #e0f2f1;
    }


</style>
<link rel="stylesheet" href="<c:url value="/public/css/materialize.css"/>">
<body>


<%--<video autoplay="" loop="" id="myVideo">--%>
<%--<source src="http://127.0.0.1:8082/F%3A/tmpfile/Every%20Little%20Bit%20Matters%20Google%20I%20O%202014%20on%20Vimeo.mp4">--%>
<%--</video>--%>
<nav class="top-nav z-depth-4">
    <div class="container">
        <div class="nav-wrapper">
            <a class="brand-logo" href="/music/163">
                <img height="64px" src="/public/images/GDG-program-logo.png"/>
            </a>
        </div>
    </div>
</nav>
</body>
<%--<script>--%>
    <%--window.onload = function () {--%>
        <%--var video = document.createElement("video");--%>
        <%--video.autoplay = "";--%>
        <%--video.loop = true;--%>
        <%--video.id = "myVideo";--%>
        <%--video.autoplay = true;--%>
        <%--video.poster = "";--%>
        <%--var source = document.createElement("source");--%>
        <%--source.src = "http://127.0.0.1:8082/H%3A/%E7%94%B5%E5%BD%B1/Facebook%202015%20Year%20in%20Review%20-%20Story%20of%20the%20Year.mp4";--%>
        <%--video.appendChild(source);--%>
        <%--document.body.appendChild(video);--%>
    <%--}--%>


<%--</script>--%>
</html>
