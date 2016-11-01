<%--
  Created by IntelliJ IDEA.
  User: zhangjian5
  Date: 2016/10/18
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>

</head>

<body>
<jsp:include page="/header"/>

<div class="container" style="">
    <div class="col s12"><h3>登录</h3></div>

    <form class="col s8" method="post" action="/nexus/login">
        <div class="row">
            <div class="input-field col s4 ">
                <input id="username" type="text" name="username" class="validate">
                <label for="username">用户名</label>
            </div>
        </div>

        <div class="row">
            <div class="input-field col s4">
                <input id="password" type="password" name="password" class="validate">
                <label for="password">密码</label>
            </div>
        </div>

        <div class="row">
            <button class="col s4 btn waves-effect light-blue z-depth-5" type="submit" name="action">Submit
                <i class="material-icons right">send</i>
            </button>
        </div>
    </form>
</div>

</body>
</html>
