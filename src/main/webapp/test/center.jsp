<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

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
  <script>
    function switchSysBar(){
      var locate=location.href.replace('center.html','');
      var ssrc=document.all("img1").src.replace(locate,'');
      if (ssrc=="images/switch1.png")
      {
        document.all("img1").src="images/switch2.png";
        document.all("frmTitle").style.display="none"
      }
      else
      {
        document.all("img1").src="images/switch1.png";
        document.all("frmTitle").style.display=""
      }
    }
  </script>

</head>
<body style="overflow:hidden">
<table width="100%" height="100%" style="table-layout:fixed;">
  <tr>
    <td width="186" id=frmTitle noWrap name="fmTitle" align="center" valign="top">
      <iframe name="I1" height="100%" width="186" src="test/left.jsp" border="0" frameborder="0" scrolling="no"> 浏览器不支持嵌入式框架，或被配置为不显示嵌入式框架。</iframe>
    </td>
    <td  onclick=switchSysBar() class="switch" ><span id=switchPoint title="打开/关闭左栏"><img src="images/switch2.png" name="img1" width=6 height=35 id=img1></span></td>
    <td align="center" valign="top">
      <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" style="table-layout:fixed;">
        <tr>
          <td>
            <iframe name="I2" height="100%" width="100%" frameborder="0" src="test/right.jsp"> 浏览器不支持嵌入式框架，或被配置为不显示嵌入式框架。</iframe>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>


</body>
</html>
