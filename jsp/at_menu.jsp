<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body>
	<h1>ƒƒjƒ…[‰æ–Ê</h1>
	<logic:iterate id="data" name="list">
		<li>
			<bean:write name="data" />
		</li>
	</logic:iterate>
</body>
</html>