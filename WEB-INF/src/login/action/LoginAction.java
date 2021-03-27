package login.action;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import login.form.LoginForm;
import util.Check;
import util.DataAccess;
import util.Logging;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// ActionForm(親)を、LoginForm(子)にキャストする
		LoginForm loginForm = (LoginForm) form;

		// inputを変数に格納する
		Map<String, Object> map = new HashMap<>();
		map.put("画面ＩＤ", loginForm.getScreen_id());
		map.put("名前", loginForm.getName());
		map.put("暗証番号", loginForm.getPin_number());
		map.put("引き出し金額", loginForm.getDeposit_amount());
		map.put("お預かり金額", loginForm.getWithdrawal_amount());

		// インスタンスメソッドを呼び出す
		Check check = new Check();
		// 入力チェックを行う
		Map<String, Object> errmap = check.InputCheck(map, mapping, request);

		// エラーが存在した場合
		if (errmap.size() > 0) {
			request.setAttribute("err", errmap);
			return mapping.findForward("error");
		}

		int screen_id = loginForm.getScreen_id();
		String name = loginForm.getName();
		int pin_number = loginForm.getPin_number();
		int deposit_amount = loginForm.getDeposit_amount();
		int withdrawal_amount = loginForm.getWithdrawal_amount();
		int balance = loginForm.getBalance();

		ArrayList<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();

		if ((!name.equals("")) && pin_number != 0) {
			DataAccess dao = new DataAccess();
			Connection con = dao.getConnect();

			if (con != null) {

				list = dao.getSELECT(con, name, pin_number);

				loginForm.setBalance(list.get(0).get("balance"));

			}
		}
		request.setAttribute("name", name);
		request.setAttribute("withdrawal_amount", withdrawal_amount);
		request.setAttribute("deposit_amount", deposit_amount);
		request.setAttribute("balance", list.get(0).get("balance"));

		// お引き出し画面
		if (screen_id == 1) {

			return mapping.findForward("Drawer_out");

			// お預かり画面
		} else if (screen_id == 2) {

			return mapping.findForward("Storage_out");

			// 残高照会画面
		} else if (screen_id == 3) {

			return mapping.findForward("Inquire_Into_Balancest_out");

		} else {
			return mapping.findForward("error");

		}
	}
}
