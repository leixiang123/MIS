/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-07-16 07:12:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("\t\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"style/all.css\" />\r\n");
      out.write("    <link href=\"style/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"style/test.css\" />\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("<title>注册购网账号</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bodyControl\">\r\n");
      out.write("<div class=\"headerBar\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-12 loginCenter\">\r\n");
      out.write("\t\t\t\t<div class=\"logo loginHead\"> \r\n");
      out.write("\t\t\t\t\t<a href=\"index\"><img class=\"logoImg\" src=\"images/icon/logo.jpg\" onmouseover=\"this.src='images/icon/logo2.png'\" onmouseout=\"this.src='images/icon/logo.jpg'\" alt=\"主页\" /></a>\r\n");
      out.write("\t\t\t\t\t<h2>欢迎注册心网账号</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"loginArea\">\r\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" action=\"register.action\" role=\"form\" method=\"post\">\r\n");
      out.write("   \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("      \t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("         \t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"firstname\" name=\"email\" placeholder=\"请输入邮箱\">\r\n");
      out.write("      \t\t\t\t\t</div>\r\n");
      out.write("   \t\t\t\t\t</div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("      \t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("         \t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"firstname\" name=\"username\" placeholder=\"请输入用户名\">\r\n");
      out.write("      \t\t\t\t\t</div>\r\n");
      out.write("   \t\t\t\t\t</div>\r\n");
      out.write("   \t\t\t\t\t\r\n");
      out.write("   \t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("      \t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("         \t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"firstname\" name=\"password\" placeholder=\"请输入密码\">\r\n");
      out.write("      \t\t\t\t\t</div>\r\n");
      out.write("   \t\t\t\t\t</div>\r\n");
      out.write("   \t\t\t\t\t\r\n");
      out.write("   \t\t\t\t<div class=\"form-group\">\r\n");
      out.write("     \t\t\t\t <div class=\"col-sm-12\">\r\n");
      out.write("         \t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">立即注册</button>\r\n");
      out.write("      \t\t\t\t </div> \r\n");
      out.write("   \t\t\t\t\r\n");
      out.write("                 <div class=\"ohterHelp row\">\r\n");
      out.write("                    <div class=\"col-sm-4\"></div>\r\n");
      out.write("                    <div class=\"col-sm-4 registerLogin\"><hr class=\"fl\" /><a href=\"loginUser\">已有账号登录</a><hr class=\"fr\" /></div>\r\n");
      out.write("                    <div class=\"col-sm-4\"></div>              \r\n");
      out.write("                 </div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <footer class=\"footer loginFooter\">\r\n");
      out.write("    <div id=\"copyright\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\t       <p class=\"copyP\">&copy; 2016 | All Will Be Ok,Belive Youself Please | Designed by<a href=\"#\">DKL</a></p>\r\n");
      out.write("\t   </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer> \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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