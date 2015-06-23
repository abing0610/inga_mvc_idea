<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title></title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
  <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="css/demo.css">
  <link href="css/login.css" rel="stylesheet" type="text/css"/>
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/jquery.easyui.min.js"></script>


</head>
<body scroll="no">
  <div class="loginwapper">
    <div class="logintop">
      <div class="synthesis"></div>
      <div class="logintit">出入库管理系统̨</div>
    </div>
    <!--<div class="loginimg"></div> -->
    <div class="workarea">
      <h3>出入库管理系统</h3>
      <form id="" >
        <table>
          <tr>
            <td><input type="text" name="username" id="username"  maxlength="18" value="请输入您的用户名" /></td>
          </tr>
          <tr>
            <td><input type="password" name="password" id="password" maxlength="16" value="请输入密码"/></td>
          </tr>
          <tr>
            <td><a class="submitbtn" id="submit" href="#">登&nbsp;&nbsp;录</a></td>
          </tr>
        </table>
      </form>
    </div>
  </div>


</body>
</html>
