package Model;

public class User {
	private String mobile;
	private String em_id;
	public User(String mobile, String em_id) {
		super();
		this.mobile = mobile;
		this.em_id = em_id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEm_id() {
		return em_id;
	}
	public void setEm_id(String em_id) {
		this.em_id = em_id;
	}
	
}
