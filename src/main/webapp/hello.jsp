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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  
  	<form action="<%=path %>/helloWorld.html" method="post">
  		ID : <input type="text" name="id" /><br/>
  		用户名 : <input type="text" name="name" /><br/>
  		密码 : <input type="text" name="password" /><br/>
  		<input type="submit" value="提交" />
  	</form>
  	
  	
  	
  	<font size="30">你没看错，再点一下，就是链接数据库了，你真的没看错。</font>
    
  </body>
</html>
