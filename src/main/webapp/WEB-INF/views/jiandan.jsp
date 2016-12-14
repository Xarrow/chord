<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style type="text/css">
        body {
            background-color: #e0e0e0;
        }

        /*.card-image img {*/
            /*height: 50%;*/
            /*width: 30%;*/
        /*}*/
    </style>
</head>
<body>
<jsp:include page="/header"/>
<div class="container">
    <div class="card z-depth-3">
        <c:forEach items="${JiandanResponseDto.jiandanList}" var="i" begin="0"
                   end="${JiandanResponseDto.jiandanList.size()}">
            <div class="row" style="margin: 10px">
                <div class="col s12 m4 l2"></div>
                <div class="col s12 m4 l8 card-panel hoverable">
                    <div class="card-image"
                         style=" height: 60%;width: 40%">
                        <img class="activator materialboxed " src="<c:out value="${i.fullpath}"/>">
                    </div>
                    <div class="card-action">
                        <a href="${i.fullpath}">${i.fullpath}</a>
                    </div>
                </div>
                <div class="col s12 m4 l2 "><p></p></div>
            </div>
        </c:forEach>
    </div>
</div>
<script>
    $(document).ready(function () {
        $('.slider').slider({full_width: true});
    });

</script>


</body>
</html>