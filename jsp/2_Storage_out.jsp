<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="#FFCCFF">
		<h1>お預入れ画面</h1>
				<div align="center">
		<p>
		<font size="6">お名前（ｶﾅ）
			<%= request.getAttribute( "name" ) %></font>
		</p>
		<p>
		<font size="6">希望お預入れ額
			<%= request.getAttribute( "deposit_amount" ) %></font>
		</p>
		<p>
		<font size="6">残高
			<%= request.getAttribute( "balance" ) %></font>
		</p>

		</div>

</body>
</html>