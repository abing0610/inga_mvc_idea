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
	<div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">north region</div>
	<div data-options="region:'west',split:true,title:'West'" style="width:150px;padding:10px;">
		west content
		<input type="button" value="login" onclick="addTab('login','login.jsp')"/>
		<input type="button" value="hello" onclick="addTab('hello','hello.jsp')"/>
	</div>
	<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
	<div  id="tt"  data-options="region:'center',title:'Center'" class="easyui-tabs">
	
	</div>
</body>
</html>
