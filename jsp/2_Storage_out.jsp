<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="#FFCCFF">
		<h1>���a������</h1>
				<div align="center">
		<p>
		<font size="6">�����O�i�Łj
			<%= request.getAttribute( "name" ) %></font>
		</p>
		<p>
		<font size="6">��]���a����z
			<%= request.getAttribute( "deposit_amount" ) %></font>
		</p>
		<p>
		<font size="6">�c��
			<%= request.getAttribute( "balance" ) %></font>
		</p>

		</div>

</body>
</html>