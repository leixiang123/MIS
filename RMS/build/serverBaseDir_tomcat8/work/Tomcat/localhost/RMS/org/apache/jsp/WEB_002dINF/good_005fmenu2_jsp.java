/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-11-30 12:24:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class good_005fmenu2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/gradle-2.11/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/public/head.jspf", Long.valueOf(1480508133427L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1469237464419L));
    _jspx_dependants.put("jar:file:/C:/gradle-2.11/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<title>权限管理系统</title>\r\n");
      out.write("<!-- 下面是前端页面的样式 \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap-theme.min.css\" />\r\n");
      out.write("-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/themes/default/easyui.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/themes/icon.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/themes/esui.css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/esui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.easyui.mobile.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/good_menu2.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write(" \t\t$(function role(){\r\n");
      out.write(" \t\t\t//数据表格\r\n");
      out.write(" \t\t\t$('#roledg').datagrid({\r\n");
      out.write(" \t\t\t    url:'user_queryUser.action',\r\n");
      out.write(" \t\t\t    width:1460,\r\n");
      out.write(" \t\t\t   \tpagination:true,\r\n");
      out.write(" \t\t\t   \trownumbers:true,\r\n");
      out.write(" \t\t\t   \tstriped:true,\r\n");
      out.write(" \t\t\t   \tsingleSelect:true,\r\n");
      out.write(" \t\t\t   pagination : true,\r\n");
      out.write("\t\t\t\tpageSize : 20,\r\n");
      out.write("\t\t\t\tpageList : [ 5, 10, 15,20 ],\r\n");
      out.write("\t\t\t\tloadMsg : '正在查询学生信息，请等待...',\r\n");
      out.write("\t\t\t\t//指定id字段为标识字段\r\n");
      out.write("\t\t\t\tidField : 'id',\r\n");
      out.write("\t\t\t\t//自动适应列\r\n");
      out.write("\t\t\t\tfitColumns : true,\r\n");
      out.write("\t \t\t\tfrozenColumns : [ [ \r\n");
      out.write("\t \t\t\t    {field : 'xyz',checkbox : true},\r\n");
      out.write("\t \t\t\t    {field : 'id',title : '编号',width : 30}\r\n");
      out.write("\t \t\t\t    ] ],\r\n");
      out.write(" \t\t\t    columns:[[\r\n");
      out.write(" \t\t\t\t\t{field:'realName',title:'客户',width:100,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'title',title:'公司名称',width:100,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'nickName',title:'联系名',width:100,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'RoleDesc',title:'头衔',width:100,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'address',title:'地址',width:200,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'RoleDesc',title:'城市',width:100,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'RoleDesc',title:'区域',width:100,align:'center'},\r\n");
      out.write(" \t\t\t\t\t{field:'RoleDesc',title:'邮政编码',width:700,align:'center'}\r\n");
      out.write(" \t\t\t    ]],\r\n");
      out.write(" \t\t\t //数据表格  \r\n");
      out.write(" \t\t\t   toolbar: [{\r\n");
      out.write(" \t\t\t\t  \ttext:'新增',\r\n");
      out.write("\t\t\t\t\ticonCls: 'icon-add',\r\n");
      out.write("\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\t$(\"#win\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.window(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttitle : '添加客户信息',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\twidth : 500,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theight : 570,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcontent : '<iframe src=\"send_cusmanage_save.action\" width=\"100%\" height=\"100%\" frameborder=\"0\" />'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\twidth:100\r\n");
      out.write(" \t\t\t\t},'-',{\r\n");
      out.write(" \t\t\t\t\ttext:'修改',\r\n");
      out.write(" \t\t\t\t\ticonCls: 'icon-edit',\r\n");
      out.write(" \t\t\t\t\twidth:100,\r\n");
      out.write(" \t\t\t\t\t\r\n");
      out.write(" \t\t\t\t},'-',{\r\n");
      out.write(" \t\t\t\t\ttext:'删除',\r\n");
      out.write(" \t\t\t\t\ticonCls: 'icon-cancel',\r\n");
      out.write(" \t\t\t\t\thandler:function (){$('#roledg').hide()},\r\n");
      out.write(" \t\t\t\t\twidth:100\r\n");
      out.write(" \t\t\t\t},'-',{\r\n");
      out.write(" \t\t\t\t\ttext:'查看',\r\n");
      out.write(" \t\t\t\t\ticonCls: 'icon-users',\r\n");
      out.write(" \t\t\t\t\thandler:function (){$('#roledg').hide()},\r\n");
      out.write(" \t\t\t\t\twidth:100\r\n");
      out.write(" \t\t\t\t}\r\n");
      out.write(" \t\t\t\t]\r\n");
      out.write(" \t\t\t});\r\n");
      out.write(" \t\t\t/* //面板\r\n");
      out.write(" \t\t\t$('#aa').accordion({    \r\n");
      out.write(" \t\t\t    animate:false,\r\n");
      out.write(" \t\t\t   //fit:true\r\n");
      out.write(" \t\t\t   width:1460\t\t\r\n");
      out.write(" \t\t\t});  */\r\n");
      out.write(" \t\t\t$('#ss').searchbox({ \r\n");
      out.write(" \t\t\t\tsearcher:function(value,name){ \r\n");
      out.write(" \t\t\t\talert(value + \",\" + name) \r\n");
      out.write(" \t\t\t\t}, \r\n");
      out.write(" \t\t\t\tmenu:'#mm', \r\n");
      out.write(" \t\t\t\tprompt:'请输入值' \r\n");
      out.write(" \t\t\t\t}); \r\n");
      out.write(" \t\t});\t\r\n");
      out.write(" \t\tfunction qq(value,name){ \r\n");
      out.write(" \t\t\talert(value+\":\"+name) \r\n");
      out.write(" \t\t\t};\r\n");
      out.write("    </script>\r\n");
      out.write("</head> \r\n");
      out.write("<body>\r\n");
      out.write("\t<h3 style=\"color:#0099FF;\">搜索</h3>\r\n");
      out.write("\t<input id=\"ss\" class=\"easyui-searchbox\" style=\"width:300px\" \r\n");
      out.write("\t\tdata-options=\"searcher:qq,prompt:'Please Input Value',menu:'#mm'\"></input> \r\n");
      out.write("\t\t\r\n");
      out.write("\t<div id=\"mm\" style=\"width:120px\"> \r\n");
      out.write("\t\t<div data-options=\"name:'all',iconCls:'icon-ok'\">客户</div> \r\n");
      out.write("\t\t<div data-options=\"name:'sports'\">公司名称</div>\r\n");
      out.write("\t\t<div data-options=\"name:'sports'\">联系名</div>\r\n");
      out.write("\t\t<div data-options=\"name:'sports'\">头衔</div> \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("    <!--表格-->\r\n");
      out.write("    <div class=\"top-area\">\r\n");
      out.write("    \t<table id=\"roledg\" ></table>\r\n");
      out.write("    \t<table id=\"usersdg\" ></table>  \r\n");
      out.write("    </div>\r\n");
      out.write("\t<div id=\"searchGoodWindow\"> </div> \r\n");
      out.write("\t<div id=\"win\" data-options=\"collapsible:false,minimizable:false,maximizable:false,modal:true\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /public/head.jspf(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/public/head.jspf(4,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /public/head.jspf(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("RMS");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
