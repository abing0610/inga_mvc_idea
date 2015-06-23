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
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<script type="text/javascript">
	  $(function(){
		  $("#json").click(function(){
			  //alert("1");
			  var xml = "<xml><ToUserName>inga</ToUserName><FromUserName>inga</FromUserName><CreateTime>1348831860</CreateTime>" +
					  "<MsgType>text</MsgType><Content>北京天气</Content><MsgId>1234567890123456</MsgId></xml>";
			  alert(xml);
			  $.ajax({
				  type: "POST",
				  url: "weixinAction.html",
				  data: {xml:xml},
				  success:function(data){
					  //alert("名字:" + data.name + "年龄:" + data.age);
					  alert(data);
				  }
			  });
		  });
	  });

	  $(function(){
		  $("#pass").click(function(){

			  $.ajax({
				  type: "GET",
				  url: "weixinAction.html",
				  data: {signature:"signature",timestamp:"timestamp",nonce:"nonce",echostr:"echostr"},
				  success:function(data){
					  //alert("名字:" + data.name + "年龄:" + data.age);

					  alert(data);
				  }
			  });
		  });
	  });
	</script>
  </head>
  
  <body>

    <%--<input type="button" class="json" name="json" id="json" value="测试微信" />

	<input type="button" class="pass" name="pass" id="pass" value="测试验证" />--%>
  
  	<form name="test1" action="<%=path %>/helloWorld.html" method="post">
  		ID : <input type="text" name="id" /><br/>
  		用户名 : <input type="text" name="name" /><br/>
  		密码 : <input type="text" name="password" /><br/>
  		<input type="submit" value="提交" />
  	</form>
  	


  <%--<form id = "weixintest" action="weixinAction.html" method="post">

  </form>--%>

  </body>
</html>
