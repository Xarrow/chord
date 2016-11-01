<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2016/8/21
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="header.jsp"/>
<style>
    div.row {
        margin-top: 10%;
        margin-left: 20%;
    }

    #mainTitle {
        margin-left: 15%;
        margin-right: 25%;
    }
    .footer {
        text-align: center;
        margin: 2%;
        color: #e0f2f1;
    }
</style>
<body>
<div class="row">
    <div id="mainTitle">
        <h3 style="
    height: 80px;
">Search For <span style="color: red; ">< Interest /></span></h3>
    </div>
    <form method="POST" action="/music/view/url" style="
    margin-bottom: 0px;
">
        <div class="col s12 m4 l8  z-depth-2 search-wrapper card waves-effect "
             style="margin-top: 0px;margin-bottom: 0px;">

            <input class="search" name="url" id="search-text" type="text"  placeholder="搜索" style="
        height: 60px;
        margin-bottom: 0px;
        border-bottom-width: 0px;">

        </div>

        <div class="col s12 m4 l2" style="margin-top: 0px">
            <button class="z-depth-3 material btn waves-effect light-blue" id="search-btn" type="submit"
                    style="height: 60px;margin-bottom: 0px;border-bottom-width: 0px;">
                Search
                <i class="material-icons right">search</i>
            </button>
        </div>
    </form>
</div>
<div>
</div>
<footer class="footer">Powered By Spring And Mybatis</footer>
</body>
</html>
