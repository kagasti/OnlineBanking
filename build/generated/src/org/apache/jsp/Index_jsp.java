package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Login - Agasti Online Bank</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"background-card\">\n");
      out.write("            <h1>Agasti Online Bank</h1>\n");
      out.write("            <h2 style =\"text-align: center;\"> Login</h2><br>\n");
      out.write("            <form action = \"");
      out.print(request.getContextPath());
      out.write("/login\" method=\"post\">\n");
      out.write("                <input type=\"text\" name=\"user\" placeholder=\"Username\">\n");
      out.write("                <input type=\"password\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("            \n");
      out.write("                <input type=\"submit\" name=\"login\" class=\"button button-submit\" value=\"Login\">\n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("            <h3 style =\"color: red;\" href=\"#\">Forgot Password?</h3><br>\n");
      out.write("            <form action=\"CreateAccount.jsp\">\n");
      out.write("                <input style =\"background-color: #ff6f00;\" type=\"submit\" \n");
      out.write("                       name=\"createaccount\" class=\"button button-submit\" value=\"Create Account\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
