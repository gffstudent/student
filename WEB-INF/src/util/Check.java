package util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import util.Logging;

public class Check extends Action {

	public Map<String, Object> InputCheck(Map<String, Object> map, ActionMapping mapping, HttpServletRequest request)
			throws SecurityException, IOException {

		Map<String, Object> errmap = new HashMap<>();
		int screen_id = (int) map.get("画面ＩＤ");
		// 画面ＩＤがお引き出し画面だった場合
		if (screen_id == 1) {
			errmap = nameCheck(map, request);
			errmap = pin_numberCheck(map, request);
			errmap = deposit_amountCheck(map, request);
		}
		// 画面ＩＤがお預かり画面だった場合
		else if (screen_id == 2) {
			errmap = nameCheck(map, request);
			errmap = pin_numberCheck(map, request);
			errmap = withdrawal_amountCheck(map, request);
		}
		// 画面ＩＤが残高照会画面だった場合
		else if (screen_id == 3) {
			errmap = nameCheck(map, request);
			errmap = pin_numberCheck(map, request);
		}
		return errmap;
	}

	private Map<String, Object> nameCheck(Map<String, Object> map, HttpServletRequest request)
			throws SecurityException, IOException {

		Map<String, Object> errmap = new HashMap<>();
		String name = (String) map.get("名前");

		// 入力チェックを行う
		if (name.equals("")) {

			ActionMessages errors = new ActionMessages();
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.invalid", "name"));
			saveErrors(request, errors);

			Logging.severelog("名前が入力されていません");
			errmap.put("名前", "名前が入力されていません");

		} else {
			Logging.infolog("名前の入力チェック正常終了");
		}
		return errmap;
	}

	private Map<String, Object> pin_numberCheck(Map<String, Object> map, HttpServletRequest request)
			throws SecurityException, IOException {
		Map<String, Object> errmap = new HashMap<>();
		int pin_number = (int) map.get("暗証番号");

		// 入力チェックを行う

		if (pin_number == 0) {

			ActionMessages errors = new ActionMessages();
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.invalid", "login"));
			saveErrors(request, errors);

			Logging.severelog("暗証番号が入力されていません");
			errmap.put("暗証番号", "暗証番号が入力されていません");
		} else {
			Logging.infolog("暗証番号の入力チェック正常終了");
		}
		return errmap;

	}

	private Map<String, Object> deposit_amountCheck(Map<String, Object> map, HttpServletRequest request)
			throws SecurityException, IOException {
		Map<String, Object> errmap = new HashMap<>();
		int deposit_amount = (int) map.get("引き出し金額");

		// 入力チェックを行う

		if (deposit_amount == 0) {

			ActionMessages errors = new ActionMessages();
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.invalid", "login"));
			saveErrors(request, errors);

			Logging.severelog("引き出し金額が入力されていません");
			errmap.put("引き出し金額", "引き出し金額が入力されていません");
		} else {
			Logging.infolog("引き出し金額の入力チェック正常終了");
		}
		return errmap;
	}

	private Map<String, Object> withdrawal_amountCheck(Map<String, Object> map, HttpServletRequest request)
			throws SecurityException, IOException {
		Map<String, Object> errmap = new HashMap<>();
		int withdrawal_amount = (int) map.get("お預かり金額");

		// 入力チェックを行う

		if (withdrawal_amount == 0) {

			ActionMessages errors = new ActionMessages();
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.invalid", "login"));
			saveErrors(request, errors);

			Logging.severelog("お預かり金額が入力されていません");
			errmap.put("お預かり金額", "お預かり金額が入力されていません");
		} else {
			Logging.infolog("お預かり金額の入力チェック正常終了");
		}
		return errmap;
	}

}
