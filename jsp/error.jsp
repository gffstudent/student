<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="#FFCCFF">

		<h1>�G���[</h1>
		<font size="6">���e
		<%= request.getAttribute( "err" ) %></font>
<html:errors />
		<div align="center">
		<form action="jsp/index.jsp">
		<input type="submit" style="WIDTH: 100px;HEIGHT:25px; font:60pt; background:#DDDDDD;color:#000000; cursor:pointer
			padding: 20px 50px; font-size: 1em;" value="�߂�"/>
		</form>
		</div>


</body>
</html>