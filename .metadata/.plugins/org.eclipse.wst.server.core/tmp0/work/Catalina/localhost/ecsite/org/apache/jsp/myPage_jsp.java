/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2018-09-25 08:04:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Style-Type\" content=\"text/css\"/>\r\n");
      out.write("\t<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\"/>\r\n");
      out.write("\t<meta http-equiv=\"imagetoolbar\" content=\"no\"/>\r\n");
      out.write("\t<meta name=\"description\" content=\"\"/>\r\n");
      out.write("\t<meta name=\"keywords\" content=\"\"/>\r\n");
      out.write("\t<title>MyPage画面</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t/* ======TAG LAYOUT====== */\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\t\tmargin:0;\r\n");
      out.write("\t\t\tpadding:0;\r\n");
      out.write("\t\t\tline-height:1.6;\r\n");
      out.write("\t\t\tletter-spacing:1px;\r\n");
      out.write("\t\t\tfont-family:Verdana,Helvetica,sans-serif;\r\n");
      out.write("\t\t\tfont-size:12px;\r\n");
      out.write("\t\t\tcolor:#333;\r\n");
      out.write("\t\t\tbackground:#fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ttable{\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t\tmargin:0 auto;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t/* ======ID LAYOUT====== */\r\n");
      out.write("\t\t#top{\r\n");
      out.write("\t\t\twidth:780px;\r\n");
      out.write("\t\t\tmargin:30px auto;\r\n");
      out.write("\t\t\tborder:1px solid #333;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#header{\r\n");
      out.write("\t\t\twidth:100%;\r\n");
      out.write("\t\t\theight:80px;\r\n");
      out.write("\t\t\tbackgroud-color:black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#main{\r\n");
      out.write("\t\t\twidth:100%;\r\n");
      out.write("\t\t\theight:500px;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#footer{\r\n");
      out.write("\t\t\twidth:100%;\r\n");
      out.write("\t\t\theight:80px;\r\n");
      out.write("\t\t\tbackground-color:black;\r\n");
      out.write("\t\t\tclear:both;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#text-right{\r\n");
      out.write("\t\t\tdisplay:inline-block;\r\n");
      out.write("\t\t\ttext-align:right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div id=\"pr\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t<p>MyPage</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<s:if test=\"myPageList==null\">\r\n");
      out.write("\t\t\t<h3>ご購入情報はありません。</h3>\r\n");
      out.write("\t\t</s:if>\r\n");
      out.write("\t\t<s:elseif test=\"message==null\">\r\n");
      out.write("\t\t\t<h3>ご購入情報は以下になります。</h3>\r\n");
      out.write("\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>商品名</th>\r\n");
      out.write("\t\t\t\t<th>値段</th>\r\n");
      out.write("\t\t\t\t<th>購入個数</th>\r\n");
      out.write("\t\t\t\t<th>支払い方法</th>\r\n");
      out.write("\t\t\t\t<th>購入日</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<s:iterator value=\"myPageList\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><s:property value=\"itemName\"/></td>\r\n");
      out.write("\t\t\t\t\t<td><s:property value=\"totalPrice\"/><span>円</span></td>\r\n");
      out.write("\t\t\t\t\t<td><s:property value=\"totalCount\"/><span>個</span>\r\n");
      out.write("\t\t\t\t\t<td><s:property value=\"payment\"/></td>\r\n");
      out.write("\t\t\t\t\t<td><s:property value=\"insert_date\"/></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</s:iterator>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<s:form action=\"MyPageAction\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"deleteFlg\" value=\"1\">\r\n");
      out.write("\t\t\t\t<s:submit value=\"削除\" method=\"delete\"/>\r\n");
      out.write("\t\t\t</s:form>\r\n");
      out.write("\t\t</s:elseif>\r\n");
      out.write("\t\t<s:if test=\"message!=null\">\r\n");
      out.write("\t\t\t<h3><s:property value=\"message\"/></h3>\r\n");
      out.write("\t\t</s:if>\r\n");
      out.write("\t\t<div id=\"text-right\">\r\n");
      out.write("\t\t\t<p>Homeへ戻る場合は<a href='<s:url action=\"GoHomeAction\"/>'>こちら</a></p>\r\n");
      out.write("\t\t\t<p>ログアウトする場合は<a href='<s:url action=\"LogoutAction\"/>'>こちら</a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<div id=\"pr\"></div>\r\n");
      out.write("\t</div>\r\n");
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
