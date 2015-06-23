<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title>My JSP 'index.jsp' starting page</title>
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
  <div id="main">
    <div class="position">当前位置：通行记录 >人员记录</div>
    <h3>按条件查询</h3>
    <div class="query">
      <table>
        <tr>
          <td class="label">来访人：</td>
          <td><input name="" type="text" class="input"/></td>
          <td class="label">被访园区：</td>
          <td><input name="" type="text" class="input"/></td>
          <td></td>
        </tr>
        <tr>
          <td class="label">证件号码：</td>
          <td>
            <input name="" type="text" class="input"/>
          </td>
          <td class="label">上传状态：</td>
          <td>
            <select name="" type="text" class="select"/>
          </td>
          <td></td>
        </tr>
        <tr>
          <td class="label">开始时间：</td>
          <td><div class="browse">
            <input name="" type="text" class="input"/>
            <a href=""><img src="images/icon_date.png" width="16" height="16" alt="date" /></a></div></td>
          <td class="label">结束时间：</td>
          <td><div class="browse">
            <input name="" type="text" class="input"/>
            <a href=""><img src="images/icon_date.png" width="16" height="16" alt="date" /></a></div></td>
          <td><div class="btn_query"><a href="">查询</a></div></td>
        </tr>
      </table>
    </div>
    <h3>查询结果</h3>
    <div class="result">
      <table  class="sstab">
        <thead>
        <tr>
          <th width="200">被访园区</th>
          <th width="350">证件号码</th>
          <th>来访人姓名</th>
          <th>来访时间</th>
          <th width="150">上传状态</th>
          <th width="150">详细信息</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <td>神思大楼</td>
          <td>37108319910110****</td>
          <td>刘璐</td>
          <td>2014-01-26 9:57</td>
          <td><a href="#"><span class="upload">未上传</span></a></td>
          <td><a href="#"><span class="details">详细信息</span></a></td>
        </tr>
        <tr>
          <td>神思大楼</td>
          <td>37108319910110****</td>
          <td>刘璐</td>
          <td>2014-01-26 9:57</td>
          <td><a href="#"><span class="upload">未上传</span></a></td>
          <td><a href="#"><span class="details">详细信息</span></a></td>
        </tr>
        <tr>
          <td>神思大楼</td>
          <td>37108319910110****</td>
          <td>刘璐</td>
          <td>2014-01-26 9:57</td>
          <td><a href="#"><span class="upload">未上传</span></a></td>
          <td><a href="#"><span class="details">详细信息</span></a></td>
        </tr>
        <tr>
          <td>神思大楼</td>
          <td>37108319910110****</td>
          <td>刘璐</td>
          <td>2014-01-26 9:57</td>
          <td><a href="#"><span class="upload">未上传</span></a></td>
          <td><a href="#"><span class="details">详细信息</span></a></td>
        </tr>
        <tr>
          <td>神思大楼</td>
          <td>37108319910110****</td>
          <td>刘璐</td>
          <td>2014-01-26 9:57</td>
          <td><a href="#"><span class="upload">未上传</span></a></td>
          <td><a href="#"><span class="details">详细信息</span></a></td>
        </tr>
        </tbody>
      </table>
      <div class="sstabpage">
        <ul>
          <li><a href="#">【首页】</a></li>
          <li><a href="#">【上一页】</a></li>
          <li class="disabled"><a href="#">【下一页】</a></li>
          <li><a href="#">【尾页】</a></li>
          <li>
            <div>转到 <input name="" type="text" size="5"/>页 <span class="go"><a href="#">转</a></span></div>
          </li>
        </ul>
        <div class="record">当前 <strong>1/1</strong> 页，共有 <strong>1</strong> 页，共 <strong>5条</strong> 记录</div>
      </div>
    </div>
  </div>

</body>
</html>
