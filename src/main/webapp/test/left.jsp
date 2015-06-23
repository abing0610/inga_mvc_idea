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
  <link href="css/style.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/jquery.easyui.min.js"></script>


</head>
<body>
  <div id="left">
    <div class="treetit"> 主菜单</div>
    <div class="tree_content">
      <h3 class="active"><a href="javascript:void(0)"><span></span>通行记录</a></h3>
      <div class="sub_tree">
        <ul>
          <li><a href="javascript:void(0)"  target="I2">通行数据 </a></li>
          <li><a href="test/demo.jsp" target="I2">数据记录 </a></li>
          <li><a href="test/right.jsp"  target="I2">记录查询</a></li>
        </ul>
      </div>
      <h3><a href="javascript:void(0)"><span></span>设备管理</a></h3>
      <h3><a href="javascript:void(0)"><span></span>安全管理</a></h3>
      <h3><a href="javascript:void(0)"><span></span>系统管理</a></h3>
    </div>
  </div>

</body>
</html>
