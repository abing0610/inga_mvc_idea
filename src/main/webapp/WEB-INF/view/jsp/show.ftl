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

	<table border="1">
		<tr>
			<td>work.id</td>
            <td>work.name</td>
            <td>work.password</td>
		</tr>
		<#list list as work >
			<tr>
				<td>${work.id}</td>
				<td>${work.name}</td>
				<td>${work.password}</td>
			</tr>
		</#list>
	</table>
	
	<br/><br/><br/>
	<br/><br/><br/>
	<#include "jsp/show/body.ftl">
	
</body>
</html>