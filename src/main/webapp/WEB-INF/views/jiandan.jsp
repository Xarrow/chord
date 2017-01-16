<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>
<jsp:include page="/header"/>
<div class="container">
    <div class="card z-depth-3">
        <c:forEach items='${resultMap.get("rows")}' var="i" begin="0"
                   end='${resultMap.get("rows").size()}'>
            <div class="row" style="margin: 10px">
                <div class="col s12 m4 l2"></div>
                <div class="col s12 m4 l8 card-panel hoverable">
                    <div class="card-image"
                         style=" height: 60%;width: 40%">
                        <img class="activator materialboxed lazy" src="<c:out value="${i.fullpath}"/>">
                    </div>
                    <div class="card-action">
                        <a href="${i.fullpath}">${i.fullpath}</a>
                    </div>
                </div>
                <div class="col s12 m4 l2 "><p></p></div>
            </div>
        </c:forEach>

        <div class="row" style="margin: 10px">
            <div class="col s12 m4 l2"></div>
            <div class="col s12 m4 l8">
                <ul class="pagination center">
                    <c:if test="${dto.page>1}">
                        <li class="waves-effect">
                            <a href="${pageContext.request.contextPath}/jiandan/view/test2?page=${dto.page-1}">
                                <i class="material-icons">chevron_left</i>
                            </a>
                        </li>
                    </c:if>
                    <li class="waves-effect"><a
                            href="${pageContext.request.contextPath}/jiandan/view/test2?page=${dto.page+1}">${dto.page+1}</a>
                    </li>
                    <li class="waves-effect"><a
                            href="${pageContext.request.contextPath}/jiandan/view/test2?page=${dto.page+2}">${dto.page+2}</a>
                    </li>
                    <li class="waves-effect"><a
                            href="${pageContext.request.contextPath}/jiandan/view/test2?page=${dto.page+3}">${dto.page+3}</a>
                    </li>
                    <li class="waves-effect"><a
                            href="${pageContext.request.contextPath}/jiandan/view/test2?page=${dto.page+4}">${dto.page+4}</a>
                    </li>
                    <li class="waves-effect"><a
                            href="${pageContext.request.contextPath}/jiandan/view/test2?page=${dto.page+5}">${dto.page+5}</a>
                    </li>
                    <li class="waves-effect"><a
                            href="${pageContext.request.contextPath}/jiandan/view/test2?page=${dto.page+1}">
                        <i class="material-icons">chevron_right</i></a></li>

                </ul>
            </div>
            <div class="col s12 m4 l2"></div>
        </div>


    </div>

    <footer class="footer" style="color: red;margin-top: 20px;margin-bottom: 50px"><p>Powered By Spring And Mybatis
        <p></footer>
</div>
<script>
    $(document).ready(function () {

        $("img.lazy").lazyload({effect: "fadeIn"});
        $('.slider').slider({full_width: true});

    });

</script>

</body>
</html>