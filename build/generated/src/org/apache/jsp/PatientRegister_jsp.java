package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PatientRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel='stylesheet' href='PatientRegister.css'>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("      <form action=\"PatientRegistrationCheck.jsp\">\n");
      out.write("        <center>\n");
      out.write("            <h1>Patient Register Form</h1></br>\n");
      out.write("            <input type=\"text\" name=\"fname\" placeholder=\"Your First Name..\" class='dte'></br>\n");
      out.write("\n");
      out.write("            <input type=\"text\" name=\"lname\" placeholder=\"Your Last Name..\" class='dte'></br>\n");
      out.write("\n");
      out.write("            <input type=\"text\" name=\"nic\" placeholder=\"NIC..\" class='dte'></br>\n");
      out.write("\n");
      out.write("            <input type=\"text\" name=\"mobile\" placeholder=\"Phone(Mobile)..\" class='dte'></br>\n");
      out.write("\n");
      out.write("            <input type=\"password\" name=\"password1\" placeholder=\"Enter Your password..\" class='dte'></br>\n");
      out.write("\n");
      out.write("            <input type=\"password\" name=\"password2\" placeholder=\"Confirm Your password again..\" class='dte'></br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Submit\" class='btn'></br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </center>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
