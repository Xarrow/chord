<%--
  Created by IntelliJ IDEA.
  User: ZhangJian
  Date: 2017/1/23
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        h2 {
            text-align: center;
        }
    </style>
</head>
<jsp:include page="/header"/>


<body>


<script>
    $(function () {
        $.ajax({
            url: 'http://s.weibo.com/ajax/jsonp/suggestion?&key=a',//API接口
            type: 'GET',
            dataType: 'jsonp',
            jsonp: '_cb',//变量名
            jsonpCallback: 'getDataFromWeibo',//回调函数名称自定义 getDataFromWeibo
            success: function (data) {
                $("body").appendChild("data from weibo:" + data['data']);
                console.log("data from weibo:" + data['data']);
            },
            error: function () {
                console.log("data get fail.");
            }
        });
    })
</script>
</body>
</html>
