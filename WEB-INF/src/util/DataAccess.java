package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.cj.xdevapi.Statement;



public class DataAccess {
	//DBアクセスに必要な定数を定義
	// com.mysql.jdbc.Driver
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String CONNECT_URL = "jdbc:mysql://localhost:3306/gff?serverTimezone=JST";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";

	private Connection con;

	public Connection getConnect() throws Exception {
		if (con == null) {
			Class.forName(DRIVER_NAME);
			con = DriverManager.getConnection(CONNECT_URL, USER_NAME, PASSWORD);
		}
		return con;
	}
	public ArrayList<Map<String, Integer>> getSELECT(Connection con,String name , int pin_number) throws Exception {
		ArrayList<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
		if (con != null) {

			String requestSQL = "SELECT * "
					+ "FROM M_CUSTOMER "
					+ "INNER JOIN T_CASHCARD "
					+ "ON M_CUSTOMER.CUSTOMER_CODE = T_CASHCARD.CUSTOMER_CODE "
					+ "AND M_CUSTOMER.FIRST_NAME =  " + "'" + name + "'"
					+ "AND T_CASHCARD.PIN_NUMBER = " + pin_number;
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(requestSQL);

			while (rs.next()) {
				Map<String, Integer> balance = new HashMap<>();
				String company = rs.getString("AMOUNT");
				balance.put("balance",Integer.parseInt(company));

				list.add(balance);
				}
		}
		return list;

	}

	public void closeConnect() throws Exception {
		if (con != null) {
			con.close();
			con = null;
		}

	}

}
