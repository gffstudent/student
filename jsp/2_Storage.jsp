<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="#FFCCFF">
	<html:form action="/loginAction">
		<h1>ĻaüęæĘ</h1>
	<div align="center">
		<p>
			<font size="6">ĻžOiķÅj
			<html:text property="name" /></font>
		</p>
		<p>
			<font size="6">ÃØÔ
			<html:text property="pin_number" /></font>
		</p>
		<p>
			<font size="6">ó]Ļaüęz
			<html:text property="deposit_amount" /></font>
		</p>
		<button type="submit"
		style="WIDTH: 100px;HEIGHT:25px; font:60pt; background:#DDDDDD;color:#000000; cursor:pointer
			padding: 20px 50px; font-size: 1em;" >Ās</button>
	</div>

		<input type="hidden" name="screen_id" value="2">

	</html:form>
	<html:errors />
</body>
</html>