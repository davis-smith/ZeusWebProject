/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.28
 * Generated at: 2018-02-14 14:14:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"public/css/style.css\">\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<title>Zeus Web Project</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- Fixed navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Zeus</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#about\">About</a></li>\r\n");
      out.write("            <li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown <span class=\"caret\"></span></a>\r\n");
      out.write("              <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                <li class=\"dropdown-header\">Insert Nav header</li>\r\n");
      out.write("                <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write(" \r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container theme-showcase\" role=\"main\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Main jumbotron for a primary marketing message or call to action -->\r\n");
      out.write("      <div class=\"jumbotron\">\r\n");
      out.write("        <h1 class=\"welcome\">Welcome</h1>\r\n");
      out.write("        <p>Use the Zeus Web Project to test your data on our latest routing software.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"page-header\">\r\n");
      out.write("        <h2>Upload</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("   \r\n");
      out.write("      <p>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\">Default</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Primary</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-success\">Success</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-info\">Info</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-warning\">Warning</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-danger\">Danger</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-link\">Link</button>\r\n");
      out.write("      </p>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"page-header\">\r\n");
      out.write("        <h1>Tables</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("          <table class=\"table\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th>#</th>\r\n");
      out.write("                <th>First Name</th>\r\n");
      out.write("                <th>Last Name</th>\r\n");
      out.write("                <th>Username</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>1</td>\r\n");
      out.write("                <td>Mark</td>\r\n");
      out.write("                <td>Otto</td>\r\n");
      out.write("                <td>@mdo</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>2</td>\r\n");
      out.write("                <td>Jacob</td>\r\n");
      out.write("                <td>Thornton</td>\r\n");
      out.write("                <td>@fat</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>3</td>\r\n");
      out.write("                <td>Larry</td>\r\n");
      out.write("                <td>the Bird</td>\r\n");
      out.write("                <td>@twitter</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"page-header\">\r\n");
      out.write("        <h1>Alerts</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"alert alert-success\" role=\"alert\">\r\n");
      out.write("        <strong>Well done!</strong> You successfully read this important alert message.\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"alert alert-info\" role=\"alert\">\r\n");
      out.write("        <strong>Heads up!</strong> This alert needs your attention, but it's not super important.\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"alert alert-warning\" role=\"alert\">\r\n");
      out.write("        <strong>Warning!</strong> Best check yo self, you're not looking too good.\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"alert alert-danger\" role=\"alert\">\r\n");
      out.write("        <strong>Oh snap!</strong> Change a few things up and try submitting again.\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"page-header\">\r\n");
      out.write("        <h1>Progress bars</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"progress\">\r\n");
      out.write("        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\"><span class=\"sr-only\">40% Complete (success)</span></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <div class=\"page-header\">\r\n");
      out.write("        <h1>List groups</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <ul class=\"list-group\">\r\n");
      out.write("            <li class=\"list-group-item\">Cras justo odio</li>\r\n");
      out.write("            <li class=\"list-group-item\">Dapibus ac facilisis in</li>\r\n");
      out.write("            <li class=\"list-group-item\">Morbi leo risus</li>\r\n");
      out.write("            <li class=\"list-group-item\">Porta ac consectetur ac</li>\r\n");
      out.write("            <li class=\"list-group-item\">Vestibulum at eros</li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div><!-- /.col-sm-4 -->\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"list-group\">\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item active\">\r\n");
      out.write("              Cras justo odio\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Dapibus ac facilisis in</a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Morbi leo risus</a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Porta ac consectetur ac</a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Vestibulum at eros</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div><!-- /.col-sm-4 -->\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"list-group\">\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item active\">\r\n");
      out.write("              <h4 class=\"list-group-item-heading\">List group item heading</h4>\r\n");
      out.write("              <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("              <h4 class=\"list-group-item-heading\">List group item heading</h4>\r\n");
      out.write("              <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("              <h4 class=\"list-group-item-heading\">List group item heading</h4>\r\n");
      out.write("              <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div><!-- /.col-sm-4 -->\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"page-header\">\r\n");
      out.write("        <h1>Panels</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("              Panel content\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"panel panel-primary\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("              Panel content\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div><!-- /.col-sm-4 -->\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"panel panel-success\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("              Panel content\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"panel panel-info\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("              Panel content\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div><!-- /.col-sm-4 -->\r\n");
      out.write("        <div class=\"col-sm-4\">\r\n");
      out.write("          <div class=\"panel panel-warning\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("              Panel content\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"panel panel-danger\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("              Panel content\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div><!-- /.col-sm-4 -->\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"page-header\">\r\n");
      out.write("        <h1>Wells</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"well\">\r\n");
      out.write("        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed diam eget risus varius blandit sit amet non magna. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Cras mattis consectetur purus sit amet fermentum. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Aenean lacinia bibendum nulla sed consectetur.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- Latest compiled JavaScript -->\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
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
