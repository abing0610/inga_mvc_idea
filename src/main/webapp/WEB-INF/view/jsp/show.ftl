<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	${msg}<br/>
    ${user} <br/>
	<#if user=='inga'> ,  you so cool!</#if><br/>

	<ul>
	<#list list as work >
		<li>${work.id}
		<li>${work.name}
		<li>${work.password}
	</#list>
	</ul>
	
	<br/><br/><br/>
	<font size="30">显示的就是数据库，成功啦！</font>
	<br/><br/><br/>
	<#include "jsp/show/body.ftl">
	
</body>
</html>