package Model;

public class Salary {
	private String Sid;
	private String DateDis ;
	private String Amount;
	private String Em_id;
	private String Expense;
	public Salary(String sid, String dateDis, String amount, String em_id, String expense) {
		super();
		Sid = sid;
		DateDis = dateDis;
		Amount = amount;
		Em_id = em_id;
		Expense = expense;
	}
	public String getSid() {
		return Sid;
	}
	public void setSid(String sid) {
		Sid = sid;
	}
	public String getDateDis() {
		return DateDis;
	}
	public void setDateDis(String dateDis) {
		DateDis = dateDis;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getEm_id() {
		return Em_id;
	}
	public void setEm_id(String em_id) {
		Em_id = em_id;
	}
	public String getExpense() {
		return Expense;
	}
	public void setExpense(String expense) {
		Expense = expense;
	}

}
