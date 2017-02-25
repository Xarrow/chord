<%--
  Created by IntelliJ IDEA.
  User: zhangjian5
  Date: 2016/9/6
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Nexus</title>

    <style>
        body {
            background: url("/public/images/dev.BMP") no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
            z-index: 1;
        }

        /*content style*/
        #content {
            position: relative;
            height: auto;
            width: 80%;
            text-align: center;
            margin: auto;
            margin-top: 2%;
            padding: 20px 20px;
            background: rgba(0,0,0,0.16);
        }

        /* footer style */
        .footer {
            text-align: center;
            margin: 2%;
            color: #e0f2f1;
        }

        /* Layer with position absolute in order to have it over the video
        * (and hide the video navigation controls on mouse move)
        * --------------------------------------- */
        .layer {
            position: absolute;
            z-index: 4;
            width: 100%;
            left: 0;
            top: 0;
        }
    </style>
</head>
<jsp:include page="header.jsp"/>
<body>

<!--内容部分-->
<div id="content" class="form-control z-index-4">
    <h1 style="text-align: center;color: #040309">测试</h1>
    <h1 style="text-align: center;color: #040309">字体</h1>
    <h1 style="text-align: center;color: white">测试</h1>
    <h1 style="text-align: center;color: white">字体</h1>

    <a href="/exportExcel">导出</a>
    <%--</div>--%>
    <%--<p>${mysqlStr}</p>--%>
</div>
<footer class="footer">Powered By Spring And Mybatis</footer>
<script>
//        if(window.opener){
//            window.opener.location = "https://www.google.com";
//        }
</script>
</body>
</html>
