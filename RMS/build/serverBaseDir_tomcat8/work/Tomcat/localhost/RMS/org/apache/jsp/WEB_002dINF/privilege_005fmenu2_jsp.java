/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-12-02 10:04:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class privilege_005fmenu2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("<title>商品信息</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"themes/default/easyui.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"themes/icon.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"themes/esui.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.easyui.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/esui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \t//查询所有角色\r\n");
      out.write(" \t\t$(function role(){\r\n");
      out.write(" \t\t\t//数据表格\r\n");
      out.write(" \t\t\t$('#priroledg').datagrid({\r\n");
      out.write(" \t\t\t    url:'pri_role_queryAllRole.action',\r\n");
      out.write(" \t\t\t   \tpagination:true,\r\n");
      out.write(" \t\t\t   \trownumbers:true,\r\n");
      out.write(" \t\t\t   \tstriped:true,\r\n");
      out.write(" \t\t\t   \tsingleSelect:true, \t\t\t    \r\n");
      out.write(" \t\t\t    columns:[[\r\n");
      out.write(" \t\t\t\t\t{field:'id',title:'id',width:180,align:'center'},      \r\n");
      out.write(" \t\t\t\t\t{field:'RoleName',title:'角色名',width:200,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'RoleDesc',title:'角色描述',width:505,align:'center'}\r\n");
      out.write(" \t\t\t    ]],\r\n");
      out.write(" \t\t\t \t//数据表格  \r\n");
      out.write(" \t\t\t   toolbar: [{\r\n");
      out.write(" \t\t\t\t\ttext:'查看用户',\r\n");
      out.write(" \t\t\t\t\ticonCls: 'icon-users',\r\n");
      out.write(" \t\t\t\t\thandler:function (){\r\n");
      out.write(" \t\t\t\t\t\t//列表隐藏 显示\r\n");
      out.write(" \t\t\t\t\t\t$('#pri-role-area').hide();\r\n");
      out.write(" \t\t\t\t\t\t$('#pri-user-area').show()\r\n");
      out.write(" \t\t\t\t\t\t}\r\n");
      out.write(" \t\t\t\t}]\r\n");
      out.write("\r\n");
      out.write(" \t\t\t});\r\n");
      out.write(" \t\t});\r\n");
      out.write("    \t\r\n");
      out.write("    \t//查询所有用户\r\n");
      out.write("\t\t$(function user(){\r\n");
      out.write(" \t\t\t//数据表格\r\n");
      out.write(" \t\t\t$('#priuserdg').datagrid({\r\n");
      out.write(" \t\t\t    url:'pri_user_queryAllUser.action',\r\n");
      out.write(" \t\t\t   \tpagination:true,\r\n");
      out.write(" \t\t\t   \trownumbers:true,\r\n");
      out.write(" \t\t\t   \tstriped:true,\r\n");
      out.write(" \t\t\t   \tsingleSelect:true, \t\t\t    \r\n");
      out.write(" \t\t\t    columns:[[\r\n");
      out.write("\t\t\t\t\t{field:'id',title:'id',width:180,align:'center'},      \r\n");
      out.write(" \t\t\t\t\t{field:'LoginName',title:'用户名',width:250,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'Title',title:'名称',width:455,align:'center'}\r\n");
      out.write(" \t\t\t    ]],\r\n");
      out.write(" \t\t\t \t//数据表格  \r\n");
      out.write(" \t\t\t   toolbar: [{\r\n");
      out.write(" \t\t\t\t\ttext:'查看角色',\r\n");
      out.write(" \t\t\t\t\ticonCls: 'icon-users',\r\n");
      out.write(" \t\t\t\t\thandler:function (){\r\n");
      out.write(" \t\t\t\t\t\t\t//列表隐藏 显示\r\n");
      out.write(" \t\t\t\t\t\t\t$('#pri-role-area').show();\r\n");
      out.write("     \t\t\t\t\t\t$('#pri-user-area').hide()\r\n");
      out.write("     \t\t\t\t\t\t}\r\n");
      out.write(" \t\t\t\t}],\r\n");
      out.write(" \t\t\t\tonLoadSuccess:function (){\r\n");
      out.write(" \t\t\t\t\t//一开始将User列表隐藏 \r\n");
      out.write(" \t\t \t\t\t$('#pri-user-area').hide()\t\t\t\t\r\n");
      out.write(" \t\t\t\t}\r\n");
      out.write("\r\n");
      out.write(" \t\t\t});\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t});\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("    \t//权限列表\r\n");
      out.write("\t\t$( document ).ready(\r\n");
      out.write("\t\t\tfunction(){\r\n");
      out.write("\t\t\tvar parentId = 0;\r\n");
      out.write("\t\t\t$('#pritt').treegrid({    \r\n");
      out.write("\t\t\t    url:'pri_pri_queryPrivilege.action?parentId='+parentId,\r\n");
      out.write("\t\t\t    rownumbers:true,\r\n");
      out.write("\t\t\t    selectOnCheck:true,\r\n");
      out.write("\t\t\t    checkbox:true,//定义在每一个节点前显示复选框\r\n");
      out.write("\t\t\t    onlyLeafCheck:true,//定义是否仅在叶子节点前显示复选框\r\n");
      out.write("\t\t\t    idField:'id',    \r\n");
      out.write("\t\t\t    treeField:'PrivilegeOperation',\r\n");
      out.write("\t\t\t    onBeforeExpand:function(row){\r\n");
      out.write("\t\t\t    \t//动态设置展开查询的url\r\n");
      out.write("\t\t\t    \t$(this).treegrid('options').url = 'pri_pri_queryPrivilege.action?parentId='+row.id;   \r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t    columns:[[    \r\n");
      out.write("\t\t\t        {title:'id',field:'id',width:100}, \r\n");
      out.write("\t\t\t        {field:'PrivilegeOperation',title:'菜单-按钮',width:400},\r\n");
      out.write("\t\t\t        {field:'RecordStatus',title:'编码',width:300}, \r\n");
      out.write("\t\t\t        {field:'Icon',title:'图标',width:180}, \r\n");
      out.write("\t\t\t    ]],\r\n");
      out.write("\t\t\t  //数据表格  \r\n");
      out.write("\t \t\t\ttoolbar: [{\r\n");
      out.write("\t \t\t\t\ttext:'分配权限',\r\n");
      out.write("\t\t\t\t\ticonCls: 'icon-ok',\r\n");
      out.write("\t\t\t\t\thandler: function (){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar priMaster = \"role\";\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tvar priKey = $('#priroledg').datagrid('getSelected');\r\n");
      out.write("\t\t\t\t\t\t\t\tif(priKey == null){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar priMaster = \"user\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpriKey = $('#priuserdg').datagrid('getSelected');\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tif(priKey == null){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$.messager.alert('提示','请选择一个用户或者角色才能赋予权限！','info');   \t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\telse{\r\n");
      out.write("\t        \t\t\t\t\t\tvar rows = $('#pritt').treegrid('getChildren');\r\n");
      out.write("\t        \t\t\t\t\t\tvar cgroup = new Array();\r\n");
      out.write("\t        \t\t\t\t\t\tfor (var i = 0; i < rows.length; i++) {        \t\t\t\t\t\t\t\t\r\n");
      out.write("\t        \t\t\t\t\t\t\t\tif(rows[i].checked == true){\r\n");
      out.write("\t        \t\t\t\t\t\t\t\t\tcgroup.push(rows[i].id);\r\n");
      out.write("\t        \t\t\t\t\t\t\t\t}       \t\t\t\t\t\t\t\t\r\n");
      out.write("\t        \t\t\t\t\t\t}\r\n");
      out.write("\t        \t\t\t\t\t\t\r\n");
      out.write("\t        \t\t\t\t\t\tif(cgroup.length==0){\r\n");
      out.write("\t        \t\t\t\t\t\t\t$.messager.alert('提示','您还没有选择任何权限哦！','info');   \t\r\n");
      out.write("\t        \t\t\t\t\t\t}\r\n");
      out.write("\t        \t\t\t\t\t\telse{\t        \t\r\n");
      out.write("\t        \t\t\t\t\t\t\tconsole.log(priMaster+priKey.id);\r\n");
      out.write("\t        \t\t\t\t\t\t\t//var postData =JSON.stringify(cgroup);  //把数组转换成json字符串\r\n");
      out.write("\t        \t\t\t\t\t\t\t$.ajax({            \r\n");
      out.write("\t        \t\t\t\t\t         type: \"POST\",\r\n");
      out.write("\t        \t\t\t\t\t         url: \"pri_pri_savePrivilege.action\",\r\n");
      out.write("\t        \t\t\t\t\t         dataType: \"json\",\r\n");
      out.write("\t        \t\t\t\t\t         traditional: true,\r\n");
      out.write("\t        \t\t\t\t\t         data: {\r\n");
      out.write("\t        \t\t\t\t\t                array: cgroup,\r\n");
      out.write("\t        \t\t\t\t\t                priMaster: priMaster,\r\n");
      out.write("\t        \t\t\t\t\t                priKey: priKey.id,\t        \t\t\t\t\t                \t        \t\t\t\t\t                \r\n");
      out.write("\t        \t\t\t\t\t         },                              \r\n");
      out.write("\t        \t\t\t\t\t         success: function(str){\r\n");
      out.write("\t        \t\t\t\t\t        \t console.log(str[0].successi+str[0].errori+str[0].returnpd);\r\n");
      out.write("\t        \t\t\t\t\t        \t var successi=str[0].successi;\r\n");
      out.write("\t        \t\t\t\t\t        \t var updatei = str[0].updatei;\r\n");
      out.write("\t        \t\t\t\t\t        \t var errori=str[0].errori;\r\n");
      out.write("\t        \t\t\t\t\t        \t var returnpd=str[0].returnpd;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t if(returnpd == \"error\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t $.messager.alert('错误','分配权限出错！'+'已存在'+errori+'条权限',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t  'error',function(){ window.location.reload()}\r\n");
      out.write("\t\t\t\t\t\t\t\t \t\t\t\t );\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//刷新当前tab \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t $.messager.alert('提示','分配权限成功！'+'新增'+successi+'条！'+'修改'+updatei+'条！'+'失败'+errori+'条!',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t'info',function(){ window.location.reload()}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t );\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t        \t\t\t\t\t        \t\r\n");
      out.write("\t        \t\t\t\t\t         }\r\n");
      out.write("\t        \t\t\t\t\t         \r\n");
      out.write("\t        \t\t\t\t\t   \t\t });\t        \t\t\t\t\t\t\t\r\n");
      out.write("\t        \t\t\t\t\t\t}\r\n");
      out.write("\t        \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t \t\t\t\t  \t\r\n");
      out.write("\t \t\t\t},'-',{\r\n");
      out.write("\t \t\t\t\ttext:'禁用权限',\r\n");
      out.write("\t \t\t\t\ticonCls: 'icon-no',\r\n");
      out.write("\t \t\t\t\thandler:function (){\r\n");
      out.write("\t\t\t\t\t\tvar priMaster = \"role\";\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar priKey = $('#priroledg').datagrid('getSelected');\r\n");
      out.write("\t\t\t\t\t\tif(priKey == null){\r\n");
      out.write("\t\t\t\t\t\t\tvar priMaster = \"user\";\r\n");
      out.write("\t\t\t\t\t\t\tpriKey = $('#priuserdg').datagrid('getSelected');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(priKey == null){\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('提示','请选择一个用户或者角色才能禁用权限！','info');   \t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\telse{\r\n");
      out.write("    \t\t\t\t\t\tvar rows = $('#pritt').treegrid('getChildren');\r\n");
      out.write("    \t\t\t\t\t\tvar cgroup = new Array();\r\n");
      out.write("    \t\t\t\t\t\tfor (var i = 0; i < rows.length; i++) {        \t\t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t\tif(rows[i].checked == true){\r\n");
      out.write("    \t\t\t\t\t\t\t\t\tcgroup.push(rows[i].id);\r\n");
      out.write("    \t\t\t\t\t\t\t\t}       \t\t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t}\r\n");
      out.write("    \t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\tif(cgroup.length==0){\r\n");
      out.write("    \t\t\t\t\t\t\t$.messager.alert('提示','您还没有选择任何权限哦！','info');   \t\r\n");
      out.write("    \t\t\t\t\t\t}\r\n");
      out.write("    \t\t\t\t\t\telse{\t        \t\r\n");
      out.write("    \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t\t//var postData =JSON.stringify(cgroup);  //把数组转换成json字符串\r\n");
      out.write("    \t\t\t\t\t\t\t$.ajax({            \r\n");
      out.write("    \t\t\t\t\t         type: \"POST\",\r\n");
      out.write("    \t\t\t\t\t         url: \"pri_pri_updatePrivilege.action\",\r\n");
      out.write("    \t\t\t\t\t         dataType: \"json\",\r\n");
      out.write("    \t\t\t\t\t         traditional: true,\r\n");
      out.write("    \t\t\t\t\t         data: {\r\n");
      out.write("    \t\t\t\t\t                array: cgroup,\r\n");
      out.write("    \t\t\t\t\t                priMaster: priMaster,\r\n");
      out.write("    \t\t\t\t\t                priKey: priKey.id,\t        \t\t\t\t\t                \t        \t\t\t\t\t                \r\n");
      out.write("    \t\t\t\t\t         },                              \r\n");
      out.write("    \t\t\t\t\t         success: function(str){\r\n");
      out.write("    \t\t\t\t\t        \t var successi=str[0].successi;\r\n");
      out.write("    \t\t\t\t\t        \t var errori=str[0].errori;\r\n");
      out.write("    \t\t\t\t\t        \t var returnpd=str[0].returnpd;\r\n");
      out.write("    \t\t\t\t\t        \t console.log(returnpd+successi+errori);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t if(returnpd == \"error\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t $.messager.alert('错误','禁用权限出错！'+'禁用成功'+successi+'条！'+'失败'+errori+'条权限',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t 'error',function(){ window.location.reload()}\r\n");
      out.write("\t\t\t\t\t\t \t\t\t\t  );\r\n");
      out.write("\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t $.messager.alert('提示','禁用权限成功！'+'禁用成功'+successi+'条！'+'失败'+errori+'条!',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t 'info',function(){ window.location.reload()}\r\n");
      out.write("\t\t\t\t\t\t \t\t\t\t  );\r\n");
      out.write("\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("    \t\t\t\t\t        \t\r\n");
      out.write("    \t\t\t\t\t         }\r\n");
      out.write("    \t\t\t\t\t         \r\n");
      out.write("    \t\t\t\t\t   \t\t });\t        \t\t\t\t\t\t\t\r\n");
      out.write("    \t\t\t\t\t\t}\r\n");
      out.write("    \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t \t\t\t}]   \r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t});  \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\r\n");
      out.write(" \t\t\r\n");
      out.write("    </script>\r\n");
      out.write("    </head>\r\n");
      out.write("<!--1. 在整个页面创建布局面板-->\r\n");
      out.write("<body>\r\n");
      out.write("    <!--表格-->\r\n");
      out.write("    <div class=\"top-area\" id=\"pri-role-area\">\r\n");
      out.write("    \t<p class=\"title\">角色</p>\r\n");
      out.write("    \t<table id=\"priroledg\" ></table>   \t\r\n");
      out.write("    </div>\r\n");
      out.write("     <div class=\"top-area\" id=\"pri-user-area\">\r\n");
      out.write("        <p class=\"title\">用户</p>\r\n");
      out.write("        <table id=\"priuserdg\" ></table>   \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"btm-area\">\r\n");
      out.write("    \t<p class=\"title\">权限控制</p>\r\n");
      out.write("    \t<table id=\"pritt\"></table>  \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
