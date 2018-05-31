<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title>EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="js/easyui-1.5/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="js/easyui-1.5/themes/icon.css" />
	<script type="text/javascript" src="js/easyui-1.5/jquery.min.js"></script>
	<script type="text/javascript" src="js/easyui-1.5/jquery.easyui.min.js" ></script>
	<script language="JavaScript">
		$(document).ready(function () {
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
<style>
	.footer {
		width: 100%;
		text-align: center;
		line-height: 35px;
		}
	.top-bg {
		background-color: #d8e4fe;
		height: 80px;
	}
	 #menu .mybutton a {  
		 display: block; 
		 background-color: #00a6ac; 
		 color: #fff; 
		 padding: 5px; 		
		 text-decoration: none; 
		 line-height: 20px;
	  	 margin-bottom: 1px;
	  	 text-align: center;
	 } 
	 #menu  a:hover { 
	 	background-color: #008792; 
	 } 
	
</style>
</head>
<body class="easyui-layout">
	<div data-options="region:'east',title:'East',split:true" style="width:135px;">
	
	</div>

	<div region="north" border="true" split="true" style="overflow: hidden; height: 80px;">
		<div class="top-bg">
			<span>欢迎${sessionScope.y.username }:</span>
		</div>
	</div>
	
	<div region="west" split="true" title="导航菜单" style="width: 200px;" selected="true">
		<div id="menu" class="easyui-accordion" style="position: absolute; top: 27px; left: 0px; right: 0px; bottom: 0px;" data-options="fit:true">
			<div title="系统设定" iconcls="icon-save" style="overflow: auto; padding: 1px;">
				<span class="mybutton"><a href="#"  onclick="addTab('用户列表','a.html')">用户列表</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单管理','brows_order.html')">订单管理</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('供应商资料','a.html')">供应商资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单资料','b.html')">订单资料</a></span>			
			</div>
		
			<div title="基本资料" iconcls="icon-reload">
				<span class="mybutton"><a href="#"  onclick="addTab('用户列表','a.html')">用户列表</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('商品资料','b.html')">商品资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('供应商资料','a.html')">供应商资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单资料','b.html')">订单资料</a></span>	
			</div>
			
			<div title="采购管理" iconcls="icon-reload">
				<span class="mybutton"><a href="#"  onclick="addTab('用户列表','a.html')">用户列表</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('商品资料','b.html')">商品资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('供应商资料','a.html')">供应商资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单资料','b.html')">订单资料</a></span>	
			</div>
			
			<div title="库存管理" iconcls="icon-reload">
				<span class="mybutton"><a href="#"  onclick="addTab('用户列表','a.html')">用户列表</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('商品资料','b.html')">商品资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('供应商资料','a.html')">供应商资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单资料','b.html')">订单资料</a></span>	
			</div>
			
			<div title="销售管理" iconcls="icon-reload">
				<span class="mybutton"><a href="#"  onclick="addTab('用户列表','a.html')">用户列表</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('商品资料','b.html')">商品资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('供应商资料','a.html')">供应商资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单资料','b.html')">订单资料</a></span>	
			</div>
			
			<div title="配送管理" iconcls="icon-reload">
				<span class="mybutton"><a href="#"  onclick="addTab('用户列表','a.html')">用户列表</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('商品资料','b.html')">商品资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('供应商资料','a.html')">供应商资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单资料','b.html')">订单资料</a></span>	
			</div>
			
			<div title="财务管理" iconcls="icon-reload">
				<span class="mybutton"><a href="#"  onclick="addTab('用户列表','a.html')">用户列表</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('商品资料','b.html')">商品资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('供应商资料','a.html')">供应商资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单资料','b.html')">订单资料</a></span>	
			</div>
			
			<div title="人事管理" iconcls="icon-reload">
				<span class="mybutton"><a href="#"  onclick="addTab('用户列表','a.html')">用户列表</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('商品资料','b.html')">商品资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('供应商资料','a.html')">供应商资料</a></span>
				<span class="mybutton"><a href="#"  onclick="addTab('订单资料','b.html')">订单资料</a></span>	
			</div>
		</div>
	</div>
	<div id="mainPanle" region="center" style="overflow: hidden;">
	
		<div id="tt" class="easyui-tabs" style="width:100%;height:100%;">
		
			<div title="Home">
				<!-- <div style="margin-bottom:10px">
				<a href="#" class="easyui-linkbutton" onclick="addTab('google','a.html')"  data-options="fit:true">google</a>
				<a href="#" class="easyui-linkbutton" onclick="addTab('jquery','b.html')"  data-options="fit:true">jquery</a>
				<a href="#" class="easyui-linkbutton" onclick="addTab('easyui','a.html')"  data-options="fit:true">easyui</a> -->
			</div>
		</div>
	</div>
	
		
	<div region="south" border="true" split="true" style="overflow: hidden; height: 40px;">
		<div class="footer">版权所有：<a href="#">公司版权</a></div>
	</div>

</div>
</body>
</html>
