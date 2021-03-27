<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="#FFCCFF">
	<html:form action="/loginAction">
		<h1>お預入れ画面</h1>
	<div align="center">
		<p>
			<font size="6">お名前（ｶﾅ）
			<html:text property="name" /></font>
		</p>
		<p>
			<font size="6">暗証番号
			<html:text property="pin_number" /></font>
		</p>
		<p>
			<font size="6">希望お預入れ額
			<html:text property="deposit_amount" /></font>
		</p>
		<button type="submit"
		style="WIDTH: 100px;HEIGHT:25px; font:60pt; background:#DDDDDD;color:#000000; cursor:pointer
			padding: 20px 50px; font-size: 1em;" >実行</button>
	</div>

		<input type="hidden" name="screen_id" value="2">

	</html:form>
	<html:errors />
</body>
</html>