<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@include file="/public/head.jspf"%>
 <link href="${RMS}/css/login.css" rel="stylesheet" type="text/css"> 
<script type="text/javascript" src="${RMS}/js/login.js"></script>
</head>
<body style="background-color:#3BA8ED">
	<form id="ff" method="post">
		<div id="login">
			<p>账号：<input type="text" id="manager" name="loginName" class="textbox"></p>
			<p>密码：<input type="password" id="password" name="loginPassword" class="textbox"></p>
		</div>
		<div id="btn">
			<a href="#" class="easyui-linkbutton">登录</a> 			
		</div>		
	</form>	 
</body>
</html>
