package util;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DAOtest extends DataAccess{

	public static void main(String[] args) {
		ArrayList<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
		// TODO 自動生成されたメソッド・スタブ
        try {
		DataAccess connect = new DataAccess();
		Connection con = connect.getConnect();
		Map<String, String> map = new HashMap<>();
		if(con != null){
			list = connect.getSELECT(con,"tanaka",2525);
		}


System.out.println(list.get(0).get("balance"));
        } catch (Exception e) {
            System.out.println(e);
        }

	}

}
