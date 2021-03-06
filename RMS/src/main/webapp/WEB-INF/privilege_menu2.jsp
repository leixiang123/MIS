<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品信息</title>

<link rel="stylesheet" type="text/css" href="themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="themes/icon.css" />
<link rel="stylesheet" type="text/css" href="themes/esui.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/esui.js"></script>

<script type="text/javascript">

//查询所有用户
$(function user() {
	//数据表格
	$('#priuserdg').datagrid({
		url : 'pri_user_queryAllUser.action',
		pagination : true,
		rownumbers : true,
		striped : true,
		singleSelect : true,
		columns : [ [ {
			field : 'id',
			title : 'id',
			width : 180,
			align : 'center'
		}, {
			field : 'LoginName',
			title : '用户名',
			width : 250,
			align : 'center'
		}, {
			field : 'Title',
			title : '名称',
			width : 455,
			align : 'center'
		} ] ],
		//数据表格  
		toolbar : [ {
			text : '查看角色',
			iconCls : 'icon-users',
			handler : function() {
				//列表隐藏 显示
				$('#pri-role-area').show();
				$('#pri-user-area').hide()
			}
		} ],
		onLoadSuccess : function() {
			$('#pri-user-area').hide()	
		}

	});

});
	
	//查询所有角色
	$(function role() {
		//数据表格
		$('#priroledg').datagrid({
			url : 'pri_role_queryAllRole.action',
			pagination : true,
			rownumbers : true,
			striped : true,
			singleSelect : true,
			columns : [ [ {
				field : 'id',
				title : 'id',
				width : 180,
				align : 'center'
			}, {
				field : 'RoleName',
				title : '角色名',
				width : 200,
				align : 'center'
			}, {
				field : 'RoleDesc',
				title : '角色描述',
				width : 505,
				align : 'center'
			} ] ],
			//数据表格  
			toolbar : [ {
				text : '查看用户',
				iconCls : 'icon-users',
				handler : function() {
					//列表隐藏 显示
					$('#pri-role-area').hide();
					$('#pri-user-area').show()
				}
			} ]

		});
	});

	

	//权限列表
	$(document)
			.ready(
					function() {
						var parentId = 0;
						$('#pritt')
								.treegrid(
										{
											url : 'pri_pri_queryPrivilege.action?parentId='
													+ parentId,
											rownumbers : true,
											selectOnCheck : true,
											checkbox : true,//定义在每一个节点前显示复选框
											onlyLeafCheck : true,//定义是否仅在叶子节点前显示复选框
											idField : 'id',
											treeField : 'PrivilegeOperation',
											onBeforeExpand : function(row) {
												//动态设置展开查询的url
												$(this).treegrid('options').url = 'pri_pri_queryPrivilege.action?parentId='
														+ row.id;
											},
											columns : [ [ {
												title : 'id',
												field : 'id',
												width : 100
											}, {
												field : 'PrivilegeOperation',
												title : '菜单-按钮',
												width : 400
											}, {
												field : 'RecordStatus',
												title : '编码',
												width : 300
											}, {
												field : 'Icon',
												title : '图标',
												width : 180
											}, ] ],
											//数据表格  
											toolbar : [
													{
														text : '分配权限',
														iconCls : 'icon-ok',
														handler : function() {
															var priMaster = "role";
															var priKey = $(
																	'#priroledg')
																	.datagrid(
																			'getSelected');
															if (priKey == null) {
																var priMaster = "user";
																priKey = $(
																		'#priuserdg')
																		.datagrid(
																				'getSelected');
															}

															if (priKey == null) {
																$.messager
																		.alert(
																				'提示',
																				'请选择一个用户或者角色才能赋予权限！',
																				'info');
															} else {
																var rows = $(
																		'#pritt')
																		.treegrid(
																				'getChildren');
																var cgroup = new Array();
																for (var i = 0; i < rows.length; i++) {
																	if (rows[i].checked == true) {
																		cgroup
																				.push(rows[i].id);
																	}
																}

																if (cgroup.length == 0) {
																	$.messager
																			.alert(
																					'提示',
																					'您还没有选择任何权限哦！',
																					'info');
																} else {
																	console
																			.log(priMaster
																					+ priKey.id);
																	//var postData =JSON.stringify(cgroup);  //把数组转换成json字符串
																	$
																			.ajax({
																				type : "POST",
																				url : "pri_pri_savePrivilege.action",
																				dataType : "json",
																				traditional : true,
																				data : {
																					array : cgroup,
																					priMaster : priMaster,
																					priKey : priKey.id,
																				},
																				success : function(
																						str) {
																					console
																							.log(str[0].successi
																									+ str[0].errori
																									+ str[0].returnpd);
																					var successi = str[0].successi;
																					var updatei = str[0].updatei;
																					var errori = str[0].errori;
																					var returnpd = str[0].returnpd;
																					if (returnpd == "error") {
																						$.messager
																								.alert(
																										'错误',
																										'分配权限出错！'
																												+ '已存在'
																												+ errori
																												+ '条权限',
																										'error',
																										function() {
																											window.location
																													.reload()
																										});

																					} else {
																						//刷新当前tab 
																						$.messager
																								.alert(
																										'提示',
																										'分配权限成功！'
																												+ '新增'
																												+ successi
																												+ '条！'
																												+ '修改'
																												+ updatei
																												+ '条！'
																												+ '失败'
																												+ errori
																												+ '条!',
																										'info',
																										function() {
																											window.location
																													.reload()
																										});
																					}

																				}

																			});
																}

															}

														}

													},
													'-',
													{
														text : '禁用权限',
														iconCls : 'icon-no',
														handler : function() {
															var priMaster = "role";
															var priKey = $(
																	'#priroledg')
																	.datagrid(
																			'getSelected');
															if (priKey == null) {
																var priMaster = "user";
																priKey = $(
																		'#priuserdg')
																		.datagrid(
																				'getSelected');
															}

															if (priKey == null) {
																$.messager
																		.alert(
																				'提示',
																				'请选择一个用户或者角色才能禁用权限！',
																				'info');
															} else {
																var rows = $(
																		'#pritt')
																		.treegrid(
																				'getChildren');
																var cgroup = new Array();
																for (var i = 0; i < rows.length; i++) {
																	if (rows[i].checked == true) {
																		cgroup
																				.push(rows[i].id);
																	}
																}

																if (cgroup.length == 0) {
																	$.messager
																			.alert(
																					'提示',
																					'您还没有选择任何权限哦！',
																					'info');
																} else {

																	//var postData =JSON.stringify(cgroup);  //把数组转换成json字符串
																	$.ajax({
																				type : "POST",
																				url : "pri_pri_updatePrivilege.action",
																				dataType : "json",
																				traditional : true,
																				data : {
																					array : cgroup,
																					priMaster : priMaster,
																					priKey : priKey.id,
																				},
																				success : function(
																						str) {
																					var successi = str[0].successi;
																					var errori = str[0].errori;
																					var returnpd = str[0].returnpd;
																					console
																							.log(returnpd
																									+ successi
																									+ errori);
																					if (returnpd == "error") {
																						$.messager
																								.alert(
																										'错误',
																										'禁用权限出错！'
																												+ '禁用成功'
																												+ successi
																												+ '条！'
																												+ '失败'
																												+ errori
																												+ '条权限',
																										'error',
																										function() {
																											window.location
																													.reload()
																										});
																					} else {
																						$.messager
																								.alert(
																										'提示',
																										'禁用权限成功！'
																												+ '禁用成功'
																												+ successi
																												+ '条！'
																												+ '失败'
																												+ errori
																												+ '条!',
																										'info',
																										function() {
																											window.location
																													.reload()
																										});
																					}

																				}

																			});
																}

															}

														}
													} ]

										});
					});
	
	//隐藏按钮
	$(document).ready(function(){
		//后台页面ID
		var priPageId=8;
		
		$.ajax({
			type : "POST",
			url : "pri_pri_searchBtnPrivilege.action",
			dataType : "json",
			traditional : true,
			data : {
				priPageId : priPageId
			},
			success : function(priId) {
				var viewUser= priId[0].viewUser
				var viewRole= priId[0].viewRole
				var permitPri= priId[0].permitPri
				var forbidPri= priId[0].forbidPri
				console.log(viewUser+viewRole+permitPri+forbidPri);
				if(viewUser==0){
					$('div.datagrid-toolbar a').eq(0).hide()
				}
				if(viewRole==0){
					$('div.datagrid-toolbar a').eq(1).hide()
				}
				if(permitPri==0){
					$('div.datagrid-toolbar a').eq(2).hide()
				}
				if(forbidPri==0){
					$('div.datagrid-toolbar a').eq(3).hide()
				}
				
			}

		});
		//隐藏 
		
	});
</script>
</head>
<!--1. 在整个页面创建布局面板-->
<body>
	<!--表格-->
	<div class="top-area" id="pri-role-area">
		<p class="title">角色</p>
		<table id="priroledg"></table>
	</div>
	<div class="top-area" id="pri-user-area">
		<p class="title">用户</p>
		<table id="priuserdg"></table>
	</div>
	<div class="btm-area">
		<p class="title">权限控制</p>
		<table id="pritt"></table>
	</div>
</body>
</html>