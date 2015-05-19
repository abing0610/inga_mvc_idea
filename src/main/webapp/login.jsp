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
	
	function submitForm(){
		$("form:first").submit();
	}
	function clearForm(){
		$('#ff').form('clear');
	}
	
	
	</script>
</head>
<body class="bg" background="images/fugu_zuojiu_rongtu.jpg">
<div align="center">
	<div style="margin:60px 0;"></div>
	<h2>登录页面</h2>
	<p>The form does not perform validation before being submitted.</p>
	<div style="margin:100px 0;"></div>
	<div class="easyui-panel" title="New Topic" style="width:400px">
		<div style="padding:10px 60px 20px 60px">
			<form  id="ff"  method="post"  action="login.html">
		  		<table cellpadding="5">
		    		<tr>
		    			<td>用户:</td>
		    			<td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input></td>
		    		</tr>
		    		<tr>
		    			<td>密码:</td>
		    			<td><input class="easyui-textbox" type="text" name="password" data-options="required:true"></input></td>
		    		</tr>
		    		
		    	</table>
		  	</form>
		  	<div style="text-align:center;padding:5px">
		    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
		    </div>
	  	</div>
	</div>
</div>
</body>
</html>
