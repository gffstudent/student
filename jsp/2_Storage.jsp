<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="#FFCCFF">
	<html:form action="/loginAction">
		<h1>���a������</h1>
	<div align="center">
		<p>
			<font size="6">�����O�i�Łj
			<html:text property="name" /></font>
		</p>
		<p>
			<font size="6">�Ïؔԍ�
			<html:text property="pin_number" /></font>
		</p>
		<p>
			<font size="6">��]���a����z
			<html:text property="deposit_amount" /></font>
		</p>
		<button type="submit"
		style="WIDTH: 100px;HEIGHT:25px; font:60pt; background:#DDDDDD;color:#000000; cursor:pointer
			padding: 20px 50px; font-size: 1em;" >���s</button>
	</div>

		<input type="hidden" name="screen_id" value="2">

	</html:form>
	<html:errors />
</body>
</html>