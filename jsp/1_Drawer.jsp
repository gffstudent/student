<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="#FFCCFF">
	<html:form action="/loginAction">
		<h1>�������o�����</h1>
		<center>

		<p>
			<font size="6">�����O�i�Łj</font>
			<html:text property="name" size="10"/>
		</p>
		<p>
			<font size="6">�Ïؔԍ�</font>
			<html:text property="pin_number" size="10"/>
		</p>
		<p>
			<font size="6">��]�����o���z</font>
			<html:text property="withdrawal_amount" size="10"/>
		</p>

		<button type="submit"
		style="WIDTH: 100px;HEIGHT:25px; font:60pt; background:#DDDDDD;color:#000000; cursor:pointer
			padding: 20px 50px; font-size: 1em;" >���s</button>

		<input type="hidden" name="screen_id" value="1">

		</center>
	</html:form>
	<html:errors />
</body>
</html>