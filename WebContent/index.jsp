<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="sbol.script.ScriptWeaver" %>
<%@ page import="java.util.List" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SBOL Script -- ScriptWeaver</title>
</head>
<body>


<%
String sException = (String)null;
String sScript = (String)null;
boolean bValid = false;
List<String> lstModuleNames = (List<String>)null;
if (null != (sScript=request.getParameter("script"))) {
	// todo... import the scriptweaver.jar file and execute the script
	String sPath = request.getSession().getServletContext().getRealPath(".");
	try {
		lstModuleNames = ScriptWeaver.executeScript(sScript, sPath);
		bValid = true;
	} catch(Exception e) {
		sException = e.getMessage();
	}
}
%>

<form name="scriptweaver" action="index.jsp" method="POST">
<div align="center">
Here we can put some documentation/examples...<br><br>

<textarea cols="60" rows="10" name="script">
</textarea>

<br/>

<input type="submit" value="Execute" />

</div>

</form>

<%
if(null == sException && bValid) {
	for(String s:lstModuleNames) {
%>
Download the <%=s %> module SBOL file <a href="./downloads/sbol/<%=s %>.sbol">here</a><br/>
<%
	}
} else if (null != sException){
	out.println(sException+"<br/>");
}
%>	

</body>
</html>