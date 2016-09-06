<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2016/8/24
  Time: 1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="header.jsp"/>
<style>
    div.row {
        margin-top: 15%;
    }
</style>
<body>
<div class="row container">
<div class="col s12 m7">
    <div class="card horizontal z-depth-4">
        <div class="card-image">
            <img src="${music.urlpic}">
        </div>
        <div class="card-stacked" style="
    /* width: 1000px; */
">
            <div class="card-content">
                <audio controls="">
                    <source src="${music.fullpath}" type="audio/mpeg">
                </audio>
                <p>${music.name}</p><p>${music.collection}</p>
            </div>
            <div class="card-action">
                <a href="http://music.163.com/#/song?id=${music.singid}">${music.name}</a>
                <a href="${music.fullpath}" download="${music.name}.mp3">下载
                    <i class="material-icons right">send</i></a>
            </div>
        </div>
    </div>
</div>
</div>
<%--<div class="col s12 m8 offset-m2 l6 offset-l3">--%>
    <%--<div class="card-panel grey lighten-5 z-depth-1">--%>
        <%--<div class="row valign-wrapper">--%>
            <%--<div class="col s2">--%>
                <%--<img src="${music.urlpic}" alt="" class="responsive-img"> <!-- notice the "circle" class -->--%>
            <%--</div>--%>
            <%--<div class="col s10">--%>
              <%--<span class="black-text">--%>
               <%--<audio controls>--%>
            <%--<source src="${music.fullpath}" type="audio/mpeg">--%>
                <%--</audio>--%>
              <%--</span>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>

<%--<div class="row">--%>
<%--<div class="card-action col s12 m4 l8  z-depth-2 search-wrapper card" style="margin-top: 0px;">--%>
    <%--<p>${music.name}</p>--%>
    <%--<audio controls>--%>
        <%--<source src="${music.fullpath}" type="audio/mpeg">--%>
    <%--</audio>--%>
    <%--<a href="${music.fullpath}" download="${music.name}.mp3">download</a>--%>
    <%--<i class="material-icons right">send</i>--%>
<%--</div>--%>
<%--</div>--%>
</body>
</html>
