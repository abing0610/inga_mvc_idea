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
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	
	<style type="text/css">
	.bg{
		background-size:100% 100%;
		-moz-background-size:100% 100%;
		background-repeat:no-repeat;
	}
	</style>
	<script type="text/javascript">
	$(function(){  
        $("#json").click(function(){  
            var name = $("#name").val();  
            var age = $("#age").val();  
            $.ajax({  
                   type: "POST",  
                   url: "index/jsonTest.html",  
                   data: {name:name , age:age},  
                   success:function(data){  
                       //alert("名字:" + data.name + "年龄:" + data.age);  
                       alert(data);
                   }  
            });  
        });  
    }); 
	
	
	function addTab(title, url){
		if ($('#tt').tabs('exists', title)){
			$('#tt').tabs('select', title);
		} else {
			var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
			$('#tt').tabs('add',{
				title:title,
				content:content,
				closable:true
			});
		}
	}
	
	
	</script>
</head>
<body class="easyui-layout" background="images/fugu_zuojiu_rongtu.jpg">
	<%--<div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">north region</div>--%>
	<div data-options="region:'west',split:true,title:'目录'" style="width:170px;padding:10px;">
		<%--west content<br/>
		<input type="button" value="login" onclick="addTab('login','login.jsp')"/><br/>
		<input type="button" value="hello" onclick="addTab('hello','hello.jsp')"/><br/>
		111--%>
		<ul class="easyui-tree">
			<li>
				<span>文档目录</span>
				<ul>
					<%--<li data-options="state:'closed'">--%>
					<li>
						<span>测试页面</span>
						<ul>
							<li>
								<span><a href="#" onclick="addTab('login','login.jsp')">login</a></span>
							</li>
							<li>
								<span><a href="#" onclick="addTab('hello','hello.jsp')">hello</a></span>
							</li>
							<li>
								<span>Company</span>
							</li>
						</ul>
					</li>
					<li>
						<span>Program Files</span>
						<ul>
							<li>Intel</li>
							<li>Java</li>
							<li>Microsof</li>
							<li>Games</li>
						</ul>
					</li>
					<li>index.html</li>
					<li>about.html</li>
					<li>welcome.html</li>
				</ul>
			</li>
		</ul>
	</div>
	<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">
		<div align="center">
			<font align="center">Copyright (c) 2015 <a href="https://github.com/abing0610">InGa Github</a>,All Rights Reserved.</font><br/>

			个人github：https://github.com/abing0610<br/>
		</div>
	</div>
	<div  id="tt"  data-options="region:'center',title:'展示'" class="easyui-tabs">
	
	</div>
</body>
</html>
