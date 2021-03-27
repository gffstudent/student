package login.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm{

	/** 希望番号入力 */
	private int screen_id = 0;

	/** お名前 */
	private String name = null;

	/** 暗証番号 */
	private int pin_number = 0;

	/** 希望お預入れ額 */
	private int deposit_amount = 0;

	/** 希望引き出し額 */
	private int withdrawal_amount = 0;

	/** 残高 */
	private int balance = 0;




	public int getScreen_id() {
		return screen_id;
	}
	public String getName() {
		return name;
	}
	public int getPin_number() {
		return pin_number;
	}
	public int getDeposit_amount() {
		return deposit_amount;
	}
	public int getWithdrawal_amount() {
		return withdrawal_amount;
	}
	public int getBalance() {
		return balance;
	}


	public void setScreen_id(int number) {
		this.screen_id = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPin_number(int pin_number) {
		this.pin_number = pin_number;
	}
	public void setDeposit_amount(int deposit_amount) {
		this.deposit_amount = deposit_amount;
	}
	public void setWithdrawal_amount(int withdrawal_amount) {
		this.withdrawal_amount = withdrawal_amount;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
