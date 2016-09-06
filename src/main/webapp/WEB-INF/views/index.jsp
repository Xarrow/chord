<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2016/7/31
  Time: 1:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cslg leaked data</title>
    <style>
        h1 {
            text-align: center
        }

        h2 {
            text-align: center
        }

        img {
            width: 30%;
            height: 20%
        }

        table, th, td {
            border: 1px solid black;
        }

        footer {
            text-align: center;
            font-size: smaller;
        }

        .footer {
            margin-top: 20%;
        }
    </style>
</head>
<body>
<h1>CSLG LEAKED DATA</h1>

<c:if test="${notfound.equals('NOT FOUND!')}">
    <h2>${notfound.toString()}</h2>
</c:if>
<c:if test="${!notfound.equals('NOT FOUND!')}">
    <table>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>身份证号码</th>
            <th>出生日期</th>
            <th>性别</th>
            <th>籍贯</th>
            <th>政治面貌</th>
            <th>联系电话</th>
            <th>邮箱</th>
            <th>宿舍号</th>
            <th>照片</th>
            <th>家庭住址</th>
        </tr>
        <tr>
            <td>${studentBaseInfo.xh}</td>
            <td>${studentBaseInfo.xm}</td>
            <td>${studentBaseInfo.sfzh}</td>
            <td>${studentBaseInfo.csrq}</td>
            <td>${studentBaseInfo.xb}</td>
            <td>${studentBaseInfo.jg}</td>
            <td>${studentBaseInfo.zzmm}</td>
            <td>${studentBaseInfo.grlxdh}</td>
            <td>${studentBaseInfo.grdzxx}</td>
            <td>${studentBaseInfo.ssh}</td>
            <td><img src="data:img/jpg;base64,${zp}"></td>
            <td>${studentBaseInfo.jtzz}</td>
        </tr>
    </table>
</c:if>

<div class="footer">
    <footer>Powered By Spring And Mybatis</footer>
</div>

</body>
</html>
