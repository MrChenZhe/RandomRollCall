<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/8
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>陈哲自动点名系统</title>
    <style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
        }
        .container{
            width: 1200px;
            height: 500px;
            margin: auto;
        }
        .tab{
            width: 800px;
            margin: auto;
            background-color: #ddd;
        }
        .tab ul{
            width: 800px;
            list-style: none;
        }
        .tab li{
            width: 150px;
            height: 50px;
            border-style: solid;
            border-color: aqua;
            border-width: 0.5px;
            float: left;
            text-align: center;
            line-height: 50px;
        }
        .forcall{
            width: 1200px;
            height: 100px;
            text-align: center;
            line-height: 100px;
            float: left;
        }
        .add{
            background-color: chartreuse;
        }
    </style>
    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
    <script type="text/javascript">
        $(function (){
            var interval=1;
            var names=new Array();
            $(".name").each(function () {
                var test = $(this).text();
                names.push(test);
            });
            $("#call").click(function () {
                var test = $(this).text();

                if("开始点名"==test){
                    $(this).text("停止");
                    $(".name").removeClass("add");
                    interval = setInterval(start,200);
                    var i=1;
                }else{
                    $(this).text("开始点名");
                    clearInterval(interval);
                }

            });

            function start() {
                var index = consoleLog(names);
                $(".name").each(function () {
                    if ($(this).text()==(names[index])){
                        $(".name").removeClass("add");
                        $(this).addClass("add");
                    }
                });
            }

            //2. 定时刷新调用的方法
            function consoleLog(names){
                var x = names.length-1;
                var y = 0;
                var rand = parseInt(Math.random() * (x - y + 1) + y);
                return rand;
            }
        });

    </script>
</head>
<body>
    <div class="container">
        <div class="tab">
            <ul>
                <c:forEach var="student" items="${students}">
                    <li class="name">${student.stuName}</li>
                </c:forEach>
            </ul>
        </div>
        <div class="forcall"><span id="call" style="border: 1px solid red;font-weight: bold;font-size:40px">开始点名</span></div>
    </div>
</body>
</html>
