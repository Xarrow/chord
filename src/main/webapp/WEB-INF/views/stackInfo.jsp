<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2017/1/7
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>服务器线程信息</title>
</head>
<body>
<pre>
    <%
        for (Map.Entry<Thread, StackTraceElement[]> stackTrace :
                Thread.getAllStackTraces().entrySet()) {
            Thread thread = (Thread) stackTrace.getKey();
            StackTraceElement[] stack = (StackTraceElement[]) stackTrace.getValue();
            if (thread.equals(Thread.currentThread())) {
                continue;
            }
            out.print("\n线程:" + thread.getName() + "\n");
            for (StackTraceElement element : stack) {
                out.print("\t" + element + "\n");
            }
        }
    %>
</pre>
</body>
</html>
