package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class quiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style type = \"text/css\">\n");
      out.write(".hidden\n");
      out.write("{\n");
      out.write("display:none;\n");
      out.write("}\n");
      out.write(".unhidden\n");
      out.write("{\n");
      out.write("display:block;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<title>\n");
      out.write("Quiz\n");
      out.write("</title>\n");
      out.write("<h1><font color = \"green\">Here is your question!</font></h1>\n");
      out.write("<p><font color = \"blue\">Answer all questions!</font> </p>\n");
      out.write("\n");
      out.write("<script type = \"text/javascript\">\n");
      out.write("function firstAnswer()\n");
      out.write("\n");
      out.write("  {\n");
      out.write("      \n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.first.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.first.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.first.quiz[i].value\n");
      out.write("           }\n");
      out.write(" }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write(" document.getElementById(\"txt1\").value = \"1\";  \n");
      out.write(" document.getElementById(\"txt11\").value = \"0\";\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt11\").value = \"1\";\n");
      out.write("   document.getElementById(\"txt1\").value = \"0\";\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"two\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"one\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function secondAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.second.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.second.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.second.quiz[i].value\n");
      out.write("           }\n");
      out.write(" }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt2\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt22\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt22\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt2\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"three\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"two\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function thirdAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.third.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.third.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.third.quiz[i].value\n");
      out.write("           }\n");
      out.write(" }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt3\").value = \"1\"\n");
      out.write("  document.getElementById(\"txt33\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt33\").value = \"1\"\n");
      out.write("     document.getElementById(\"txt3\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"four\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"three\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function fourAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.four.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.four.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.four.quiz[i].value\n");
      out.write("           }\n");
      out.write(" }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt4\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt44\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt44\").value = \"1\"\n");
      out.write("   \n");
      out.write("  document.getElementById(\"txt4\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"five\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"four\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function fiveAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.five.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.five.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.five.quiz[i].value\n");
      out.write("           }\n");
      out.write(" }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt5\").value = \"1\"\n");
      out.write("  document.getElementById(\"txt55\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt55\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt5\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"six\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"five\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function sixAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.six.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.six.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.six.quiz[i].value\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt6\").value = \"1\"\n");
      out.write("  document.getElementById(\"txt66\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt66\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt6\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"seven\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"six\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function sevenAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.seven.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.seven.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.seven.quiz[i].value\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt7\").value = \"1\"\n");
      out.write("  document.getElementById(\"txt77\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt77\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt7\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"eight\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"seven\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function eightAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.eight.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.eight.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.eight.quiz[i].value\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt8\").value = \"1\"\n");
      out.write("  document.getElementById(\"txt88\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt88\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt8\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"nine\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"eight\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function nineAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.nine.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.nine.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.nine.quiz[i].value\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt9\").value = \"1\"\n");
      out.write("  document.getElementById(\"txt99\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt99\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt9\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"ten\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"nine\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function tenAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.ten.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.ten.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.ten.quiz[i].value\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt10\").value = \"1\"\n");
      out.write("  document.getElementById(\"txt100\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt100\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt10\").value = \"0\"\n");
      out.write("}\n");
      out.write(" var item = document.getElementById(\"eleven\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write(" }\n");
      out.write("\n");
      out.write(" var item = document.getElementById(\"ten\");\n");
      out.write(" if (item) {\n");
      out.write(" item.className=(item.className=='unhidden')?'hidden':'unhidden';\n");
      out.write(" }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function elevenAnswer()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("    for (i=0 ; i<document.eleven.quiz.length ; i++)\n");
      out.write("         {\n");
      out.write("              if (document.eleven.quiz[i].checked==true) \n");
      out.write("           {\n");
      out.write("              var t = document.eleven.quiz[i].value\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("\n");
      out.write("if (t == \"1\" )\n");
      out.write(" { \n");
      out.write("  document.getElementById(\"txt11\").value = \"1\"\n");
      out.write("  document.getElementById(\"txt111\").value = \"0\"\n");
      out.write("  }\n");
      out.write("else  { \n");
      out.write("   document.getElementById(\"txt111\").value = \"1\"\n");
      out.write("   document.getElementById(\"txt11\").value = \"0\"\n");
      out.write("}\n");
      out.write("var item = document.getElementById(\"helo\");\n");
      out.write("item.className=(item.className=='hidden')?'unhidden':'hidden';\n");
      out.write("}\n");
      out.write("\n");
      out.write("function total()\n");
      out.write("{\n");
      out.write("var a = parseInt(document.getElementById(\"txt1\").value)\n");
      out.write("var b = parseInt(document.getElementById(\"txt2\").value)\n");
      out.write("var c = parseInt(document.getElementById(\"txt3\").value)\n");
      out.write("var d = parseInt(document.getElementById(\"txt4\").value)\n");
      out.write("var e = parseInt(document.getElementById(\"txt5\").value)\n");
      out.write("var f = parseInt(document.getElementById(\"txt6\").value)\n");
      out.write("var g = parseInt(document.getElementById(\"txt7\").value)\n");
      out.write("var h = parseInt(document.getElementById(\"txt8\").value)\n");
      out.write("var i = parseInt(document.getElementById(\"txt9\").value)\n");
      out.write("var j = parseInt(document.getElementById(\"txt10\").value)\n");
      out.write("var k = parseInt(document.getElementById(\"txt11\").value)\n");
      out.write("\n");
      out.write(" var l = a + b + c + d + e + f + g + h + i + j+k \n");
      out.write("document.getElementById(\"txt\").value = l\n");
      out.write("alert(\"your score is \"+l);\n");
      out.write("var a1 = parseInt(document.getElementById(\"txt11\").value)\n");
      out.write("var b1 = parseInt(document.getElementById(\"txt22\").value)\n");
      out.write("var c1 = parseInt(document.getElementById(\"txt33\").value)\n");
      out.write("var d1 = parseInt(document.getElementById(\"txt44\").value)\n");
      out.write("var e1 = parseInt(document.getElementById(\"txt55\").value)\n");
      out.write("var f1 = parseInt(document.getElementById(\"txt66\").value)\n");
      out.write("var g1 = parseInt(document.getElementById(\"txt77\").value)\n");
      out.write("var h1 = parseInt(document.getElementById(\"txt88\").value)\n");
      out.write("var i1 = parseInt(document.getElementById(\"txt99\").value)\n");
      out.write("var j1 = parseInt(document.getElementById(\"txt100\").value)\n");
      out.write("var k1 = parseInt(document.getElementById(\"txt111\").value)\n");
      out.write("var val\n");
      out.write(" var l1 = a1 + b1 + c1 + d1 + e1 + f1 + g1 + h1 + i1 + j1+k1\n");
      out.write(" document.getElementById(\"txts\").value = l1\n");
      out.write("\n");
      out.write("alert(\"your score is \"+l1);\n");
      out.write("var max;\n");
      out.write("var min;\n");
      out.write("if(l1<l)\n");
      out.write("{\n");
      out.write("    max=l;\n");
      out.write("    min=l1;\n");
      out.write("    alert(\"you are more active learner\");\n");
      out.write("   send(l1);\n");
      out.write("    //ResultSet rs;\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("    \n");
      out.write("            max=l1;\n");
      out.write("            min=l;\n");
      out.write("              alert(\"you are more reflective  learner\");\n");
      out.write("   \n");
      out.write("}\n");
      out.write("var dif=max-min;\n");
      out.write("\n");
      out.write("}\n");
      out.write("function send(var k)\n");
      out.write("{\n");
      out.write("       Class.forName(\"com.mysql.jdbc.Driver\");\n");
      out.write("    Connection con = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/fyp\",\n");
      out.write("            \"root\", \"root\");\n");
      out.write("    Statement st = con.createStatement();\n");
      out.write("              int i = st.executeUpdate(\"insert into learningstylesdb values('ratzdev','active',NULL,NULL,NULL)\");\n");
      out.write("              \n");
      out.write("             \n");
      out.write("    \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id = \"one\" class = \"unhidden\">\n");
      out.write("<form name = \"first\"  >\n");
      out.write("    \n");
      out.write("   \n");
      out.write("I understand something better after I</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >try it out.<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">try it out.<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"firstAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt1\">\n");
      out.write("<input type = \"hidden\" id = \"txt11\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div  class = \"hidden\" id = \"two\">\n");
      out.write("<form name = \"second\" >\n");
      out.write("      \n");
      out.write("2. When I am learning something new, it helps me to\n");
      out.write("\n");
      out.write("</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" > talk about it.<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">think about it<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"secondAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt2\">\n");
      out.write("<input type = \"hidden\" id = \"txt22\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"hidden\" id = \"three\">\n");
      out.write("<form name = \"third\" >\n");
      out.write("      <img src=\"Batman Beyond.jpg\" align=\"right\" width=\"400\" height=\"400\">\n");
      out.write("3. In a study group working on difficult material, I am more likely to</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >jump in and contribute ideas<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">think about it<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"thirdAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt3\">\n");
      out.write("<input type = \"hidden\" id = \"txt33\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"hidden\" id = \"four\">\n");
      out.write("<form name = \"four\" >  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("4. In classes I have taken</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >   I have usually gotten to know many of the students.<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">I have rarely gotten to know many of the students.<br></br>\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"fourAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt4\">\n");
      out.write("<input type = \"hidden\" id = \"txt44\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"hidden\" id = \"five\">\n");
      out.write("<form name = \"five\" >\n");
      out.write("      \n");
      out.write("5. When I start a homework problem, I am more likely to?</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >start working on the solution immediately.<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\"> try to fully understand the problem first.<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"fiveAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt5\">\n");
      out.write("<input type = \"hidden\" id = \"txt55\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"hidden\" id = \"six\">\n");
      out.write("<form name = \"six\" >\n");
      out.write("      <img src=\"q3.jpg\" align=\"right\" width=\"400\" height=\"400\">\n");
      out.write("6. I prefer to study?</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >in a group<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">study alone<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"sixAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt6\">\n");
      out.write("<input type = \"hidden\" id = \"txt66\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"hidden\" id = \"seven\">\n");
      out.write("<form name = \"seven\" >\n");
      out.write("      \n");
      out.write("7. I would rather first</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" > try things out.<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">think about how I'm going to do it.<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"sevenAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt7\">\n");
      out.write("<input type = \"hidden\" id = \"txt77\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"hidden\" id = \"eight\">\n");
      out.write("<form name = \"eight\" >\n");
      out.write("      \n");
      out.write("8. I more easily remember</br></br>\n");
      out.write("\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >something I have done.<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">something I have thought a lot about.<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"eightAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt8\">\n");
      out.write("<input type = \"hidden\" id = \"txt88\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"hidden\" id = \"nine\">\n");
      out.write("<form name = \"nine\" >\n");
      out.write("      \n");
      out.write("9. When I have to work on a group project, I first want to</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >have \"group brainstorming\" where everyone contributes ideas.<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">brainstorm individually and then come together as a group to compare ideas.\n");
      out.write("<br></br>\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"nineAnswer()\"> \n");
      out.write("<input type = \"hidden\" id = \"txt9\">\n");
      out.write("<input type = \"hidden\" id = \"txt99\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class = \"hidden\" id = \"ten\">\n");
      out.write("<form name = \"ten\" >\n");
      out.write("     \n");
      out.write("10. I am more likely to be considered?</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >outgoing<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">reserved<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"tenAnswer()\" > \n");
      out.write("<input type = \"hidden\" id = \"txt10\">\n");
      out.write("<input type = \"hidden\" id = \"txt100\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div class = \"hidden\" id = \"eleven\">\n");
      out.write("\n");
      out.write("    <form name = \"eleven\" >\n");
      out.write("     \n");
      out.write("11. The idea of doing homework in groups, with one grade for the entire group,?</br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"1\" name = \"quiz\" >appeals to me<br></br>\n");
      out.write("<input type = \"radio\" id = \"a\" value = \"2\" name = \"quiz\">does not appeal to me<br></br>\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"next\" onclick = \"elevenAnswer()\" id = \"helo\" class = \"heloo\"> \n");
      out.write("<input type = \"hidden\" id = \"txt11\">\n");
      out.write("<input type = \"hidden\" id = \"txt111\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("   \n");
      out.write("<input type = \"hidden\" id = \"txt\">\n");
      out.write("<input type = \"hidden\" id = \"txts\">\n");
      out.write("<input type = \"text\" id=\"ans\">\n");
      out.write("\n");
      out.write("<input type = \"button\" value = \"score\"  onclick = \"total()\">\n");
      out.write("<input type = \"button\" value = \"go to next\"  onclick = \"send(2)\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
