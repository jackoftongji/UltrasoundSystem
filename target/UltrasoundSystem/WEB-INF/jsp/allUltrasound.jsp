<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/6
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>超声波信息列表</title>
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
                    <small>超声波信息列表 —— 显示所有超声波信息</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${path}/ultrasound/toAddUltrasound">新增</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>超声波编号</th>
                    <th>超声波数据</th>
                    <th>设备名称</th>
                    <th>试验站点</th>
                    <th>区域</th>
                    <th>实验人员</th>
                    <th>上传时间</th>
                    <th>创建时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="ultrasound" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${ultrasound.id}</td>
                        <td>${ultrasound.waveform}</td>
                        <td>${ultrasound.equipment}</td>
                        <td>${ultrasound.constructionSite}</td>
                        <td>${ultrasound.section}</td>
                        <td>${ultrasound.author}</td>
                        <td>${ultrasound.uploadDate}</td>
                        <td>${ultrasound.foundDate}</td>
                        <td>
<%--                            <a href="${path}/paper/toUpdatePaper?id=${paper.paperId}">更改</a> |--%>
<%--                            <a href="<%=appPath%>/paper/del/${paper.paperId}">删除</a>--%>

                            <a href="<%=appPath%>/ultrasound/del/${ultrasound.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
