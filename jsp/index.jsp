<%@ page contentType="text/html;charset=windows-31J"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<body bgcolor="#FFCCFF">

	<h1>ご希望のお取引を選択してください</h1>
		<div align="center">
            <!-- jspからjspの画面遷移  -->
	<form action="1_Drawer.jsp">
	<input type="submit" style="WIDTH: 600px;HEIGHT:100px; font:100pt; background:#DDDDDD;color:#000000; cursor:pointer
			padding: 20px 50px; font-size: 3em;" value="お引き出し画面"/>
		<br>
		<br>
	</form>
	<form action="2_Storage.jsp">
	<input type="submit" style="WIDTH: 600px;HEIGHT:100px; font:100pt; background:#DDDDDD;color:#000000; cursor:pointer
			padding: 20px 50px; font-size: 3em;" value="お預入れ画面"/>
		<br>
		<br>
	</form>
	<form action="3_Inquire_Into_Balances.jsp">
	<input type="submit" style="WIDTH: 600px;HEIGHT:100px; font:100pt; background:#DDDDDD;color:#000000; cursor:pointer
			padding: 20px 50px; font-size: 3em;" value="残高照会画面"/>
		<br>
		<br>
	</form>
	</div>


	<html:errors />
</body>
</html>