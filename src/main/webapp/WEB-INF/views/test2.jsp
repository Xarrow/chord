<html>
<head>
    <meta name="viewport" content="width=device-width, minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <title></title>
    <style>body {
        margin: 0;
        color: #000;
        overflow: hidden;
        padding: 0;
        height: 100%;
        font-family: Arial
    }

    a {
        cursor: pointer;
        display: block;
        position: absolute;
        border: 0px;
        border-radius: 1em;
        padding-top: 1px;
        background-color: #444;
        color: #fff;
        opacity: .8;
        z-index: 3;
        right: 5px;
        top: 5px;
        height: 10px;
        overflow: hidden;
        text-align: center;
        width: 10px;
        font-size: 8px
    }

    #x {
        position: fixed;
        z-index: 2;
        bottom: 2px;
        width: 100%;
        height: 60px
    }

    #i {
        display: block;
        position: absolute;
        z-index: 1;
        width: 100%;
        height: 100%
    }</style>
</head>
<body onload="a7.u()">
<div id="i">
    <!--<iframe id="m" width="100%" height="100%" frameborder="0"-->
    <!--src="http://iliangqunru.com/?_t_t_t=0.15875153640601236">-->
    <!--</iframe>-->
    <iframe id="m" width="100%" height="100%" frameborder="0"
            src="http://127.0.0.1:8080/test/test1/?_t_t_t=0.15875153640601236">
    </iframe>
</div>
<div id="x" style="display: block;"><a onclick="a7.c()">X</a>
    <iframe id="a" width="100%" height="60" scrolling="no" frameborder="0"
            src="http://news.766ba.net:6578/ssp/adpv/ad/2/1098/1">
    </iframe>
</div>

<script>
    (function (w) {
        var a7 = w.a7 || {};
        var d = document;
        a7.u = function () {
            var f = d.location.href;
            var ua = navigator.userAgent.toLowerCase();
            var im = d.getElementById("m");
            im.src = f + (f.indexOf("?") < 0 ? '?' : '&') + '_t_t_t=' + Math.random();
            if (ua.indexOf("iphone") > 0) {
                im.width = window.innerWidth;
                im.scrolling = "no";
            }
        };
        a7.c = function () {
            d.getElementById('x').style.display = "none";
        };
//        w.a7 = a7;
    })(window);

</script>

<script>
    function s() {
        document.getElementById('x').style.display = 'block';
    }

    setTimeout(function () {
        document.getElementById('a').src = 'http://news.766ba.net:6578/ssp/adpv/ad/2/1098/1';
    }, 500);
    setTimeout("s()", 1000);

</script>
</body>
</html>