<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title>出入库管理系统</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="css/demo.css">
  <link href="css/style.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/jquery.easyui.min.js"></script>


</head>
<body>
  <div id="top">
    <div id="header">
      <div id="logo"></div>
      <div id="tools"><a href=""><span class="key"></span>修改密码</a>|<a href=""><span class="exit"></span>注销</a></div>
      <ul id="nav">
        <li><span class="date"></span>星期五2015-01-03 14:14:08</li>
        <li><span class="user"></span>欢迎您<b>超级管理员</b></li>
        <li><span class="org"></span>所属机构<b>默认机构</b></li>
      </ul>
    </div>
  </div>
</body>
</html>
