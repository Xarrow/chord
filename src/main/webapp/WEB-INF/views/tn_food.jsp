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
    <title>Nexus</title>

</head>
<jsp:include page="header.jsp"/>
<body>


<div style="text-align: center;"><h4 id="title">订餐分析</h4></div>

<div class="container">
    <div class="col s6">
        <i class="material-icons prefix">mode_edit</i>
        <select id="select_id">
            <option value="" disabled selected>选择地点</option>
            <option value="总部">总部</option>
            <option value="江苏软件园1+5号楼">江苏软件园1+5号楼</option>
            <option value="江苏软件园24号楼">江苏软件园24号楼</option>
            <option value="南大科学园">南大科学园</option>
        </select>
        <label>Materialize Select</label>
    </div>
    <div class="col s6"></div>
</div>

<br>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" class="z-depth-4 material" style="width: 100%;height:600px;"></div>


<script type="text/javascript">
    $(document).ready(function () {
        $('select').material_select();
        $("#select_id").change(function () {
            var area = $("#select_id").val();
            loadAjax(area)
        });

    });

    var loadAjax = function (area) {
        $("#title").html(area+"订餐分析");
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        $.ajax({
            url: "/nexus//tn_food/" + area,
            type: "GET",
            dataType: "json",
            data: '',
            beforeSend: function () {
                //加载
                myChart.showLoading();
            },
            error: function () {
                alert("Ajax Loading Error!");
            },
            success: function (data) {
                myChart.hideLoading();
                if (data.msg == 'success') {

                    var rows = data['data'];
                    var xAxis = rows["totalDate"];
                    var legend = rows["totalNames"];
                    var tmp = rows["nameMap"];
                    //注入自定义风格
                    for (var i in tmp) {
                        tmp[i]['markLine'] = {
                            lineStyle: {
                                normal: {
                                    type: 'solid'
                                }
                            },
                            data: [
                                {type: 'average', name: '平均值'},
                                {xAxis: 160}
                            ]
                        };
                        tmp[i]['markPoint'] = {
                            data: [
                                {type: 'max', name: '最大值'},
                                {type: 'min', name: '最小值'}
                            ]
                        };
                    }

                    var series = tmp;

                    var option = {
                        tooltip: {
                            trigger: 'axis',
                            axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                                type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                            }
                        },
                        toolbox: {
                            show: true,
                            feature: {
                                dataZoom: {
                                    yAxisIndex: 'none'
                                },
                                dataView: {readOnly: false},
                                magicType: {type: ['line', 'bar']},
                                restore: {},
                                saveAsImage: {}
                            }
                        },
                        legend: {
                            data: legend
                        },
                        grid: {
                            left: '3%',
                            right: '4%',
                            bottom: '3%',
                            containLabel: true
                        },
                        xAxis: [
                            {
                                type: 'category',
                                data: xAxis
                            }
                        ],
                        yAxis: [
                            {
                                type: 'value'
                            }
                        ],
                        dataZoom: [
                            {   // 这个dataZoom组件，默认控制x轴。
                                type: 'slider', // 这个 dataZoom 组件是 slider 型 dataZoom 组件
                                start: 10,      // 左边在 10% 的位置。
                                end: 60         // 右边在 60% 的位置。
                            }
                        ],
                        series: series
                    };
                    // 使用刚指定的配置项和数据显示图表。
                    myChart.setOption(option);
                }
            }
        });
    };


</script>
</body>

</html>
