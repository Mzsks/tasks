<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录窗口</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="js/easyui-1.5/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="js/easyui-1.5/themes/icon.css" />
	<link rel="stylesheet" type="text/css" href="js/easyui-1.5/color.css" />
	<link rel="stylesheet" type="text/css" href="js/easyui-1.5/zitishezhi.css" />
	<script type="text/javascript" src="js/myjs/login.js"></script>
	<script type="text/javascript" src="js/easyui-1.5/jquery.min.js"></script>
	<script type="text/javascript" src="js/easyui-1.5/jquery.easyui.min.js" ></script>
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">

#zhuceid{
	display: none;
}


    </style>
	<script type="text/javascript">
		function tijiao(){
			var url="user_list";
			var data=$("#userfom").serialize();
			//alert(data);
			$.ajax({
				url:url,
				data:data,
				type:"post",
				dataType:"json",
				success: function(result) {
					//alert(result.res+","+result.msg);
					if(result.res==true){
						location.href="index";
					}else{
						$.messager.alert("提示",result.msg);
						$("#mimatishiid").html(result.msg);
						$("#mimatishiid").show();
					}
				},
				error : function() { //请求失败后要执行的代码
				}				
			});
		}
		function zhuce(a){
			if(a==0){
				$("#zhuceid").show();
				$("#denluid").hide();
				$("#mimatishiid").hide();
			}else{
				$("#denluid").show();
				$("#zhuceid").hide();
				//$("#mimatishiid").hide();
			}
		}
		function zhuceyh(){
			var url="user_addnew";
			var data=$("#zhuceifom").serialize();
			//alert(data);
			$.ajax({
				url:url,
				data:data,
				type:"post",
				dataType:"json",
				success: function(result) {
					//alert(result.res+","+result.msg);
					if(result.res==true){
						location.href="login.jsp";
					}else{
						$.messager.alert("提示",result.msg);
						//$("#mimatishiid").html(result.msg);
						//$("#mimatishiid").show();
					}
				},
				error : function() { //请求失败后要执行的代码
				}				
			});
		}
		
	</script>
	
  </head>
  
  <body>
  <div id="yanzhentishiid" class="Layer1"><span id="mingsp"></span></div>
  <div id="mimatishiid" class="Layer1" style="left:780px;top:312px;"><span id="mimasp"></span></div>
  <div id="denluid">
  <div class="easyui-window" title="登录窗口" data-options="width:400,height:270,left:480,top:180,inline:true,border:'thin',cls:'c7'">
		<form  name="userfom" id="userfom">
			<table width="300" height="200" border="0">
			  <tr><td width="200px"></td><td></td></tr>
			  <tr>
			    <td align="right"><span class="zitishezhi">登录名：</span></td>
			    <td>
			      <input type="text" id="username" class="easyui-textbox" name="user.username" data-options="prompt:'用户名...',required:true,validType:'length[2,10]'"  missingMessage="登录名不能为空！" invalidMessage="登录名必须是2~10个字符！"/>
			    </td>
			  </tr>
			  <tr>
			    <td align="right"><span class="zitishezhi">密码：</span></td>
			    <td>
			      <input id="userpwdin"  class="easyui-passwordbox" style="background-color: #ffa217" name="user.userpwd" data-options="prompt:'大于或等于六个有效字符！',required:true,required:true,validType:'length[6,12]'"  missingMessage="密码不能为空！" invalidMessage="密码必须是6~12个字符！"/>
			    </td>
			  </tr>
			  <tr >
			  <td align="right"></td>
			  <td align="left"><span class="easyui-linkbutton c7" style="width:80px" onclick="zhuce(0)">注册</span>&nbsp
			  <span class="easyui-linkbutton c7" id="yhdlsp" style="width:80px;" onclick="tijiao()">登录</span>
			  </td>
			  </tr>
			</table>
		</form>
	</div>
	</div>
	
	<div id="zhuceid">
	<div  class="easyui-window" title="注册窗口" data-options="width:400,height:270,left:480,top:180,inline:true,border:'thin',cls:'c7'">
		<form name="zhuceifom" id="zhuceifom">
			<table width="300" height="220" border="0">
			  <tr>
			  	<td></td>
			  	<td></td>
			  </tr>
			  <tr>
			    <td width="120" align="right"><span class="zitishezhi">登录名：</span></td>
			    <td width="170"><input type="text" class="easyui-textbox" name="user.username" style="width:100%;" data-options="prompt:'大于或等于两个有效字符！',required:true,validType:'length[2,10]'"  missingMessage="名称不能为空！" invalidMessage="登录名必须是2~10个字符！"/>    </td>
			  </tr>
			  <tr>
			    <td align="right"><span class="zitishezhi">密码：</span></td>
			    <td><input  class="easyui-passwordbox" name="user.userpwd" style="width:170px;" data-options="prompt:'大于或等于六个有效字符！',required:true,required:true,validType:'length[6,12]'"  missingMessage="密码不能为空！" invalidMessage="密码必须是6~12个字符！"/> </td>
			  </tr>
			  <tr>
			    <td align="right"><span class="zitishezhi">备注：</span></td>
			    <td><input class="easyui-textbox" name="user.userbeizhu" style="width:170px;"/> </td>
			  </tr>
			  <tr>
			    <td align="right"><span class="zitishezhi">权限：</span></td>
			    <td><select name="user.jiaose.jid" class="easyui-combobox" style="width:170px;">
			    	<option>                --请选择--</option>
			    	<option value="1">超级管理员</option>
			    	<option value="2">总经理</option>
			    	<option value="7">员工</option>
			    </select>
			    </td>
			  </tr>
			  <tr>
			    <td>&nbsp;</td>
			    <td align="left"><span class="easyui-linkbutton c7" style="width:80px" onclick="zhuce(1)">返回登录</span>&nbsp
			  	<span class="easyui-linkbutton c7" style="width:80px;" onclick="zhuceyh()">注册</span></td>
			  </tr>
			</table>
		</form>
	</div>
	</div>
  <script type="text/javascript">
		$('.easyui-window').window({
			collapsible: false,
			minimizable: false,
			maximizable: false,
			closable: false
		});
	</script>
  </body>
</html>
