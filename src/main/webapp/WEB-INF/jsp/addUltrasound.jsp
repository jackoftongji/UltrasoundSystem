<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/7
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>新增超声波信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    超声波数据库管理系统
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增超声波信息</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="" name="userForm">
        超声波编号：<input type="text" name="id"><br><br><br>
        超声波数据：<input type="text" name="waveform"><br><br><br>
        设备名称：<input type="text" name="equipment"><br><br><br>
        试验站点：<input type="text" name="constructionSite"><br><br><br>
        区域：<input type="text" name="section"><br><br><br>
        实验人员：<input type="text" name="author"><br><br><br>
        上传时间：<input type="text" name="uploadDate"><br><br><br>
        创建时间：<input type="text" name="foundDate"><br><br><br>
        <input type="button" value="添加" onclick="addUltrasound()">
    </form>

    <script type="text/javascript">
        function addUltrasound() {
            var form = document.forms[0];
            form.action = "<%=basePath %>ultrasound/addUltrasound";
            form.method = "post";
            form.submit();
        }
    </script>
</div>