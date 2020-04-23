package Model;

public class Employee {

	private String Em_id;
	private String Em_name;
	private String Em_mobile;
	private String Em_email;
	private String Em_dept;
	
	public Employee(String em_id, String em_name, String em_mobile, String em_email, String em_dept) {
		super();
		Em_id = em_id;
		Em_name = em_name;
		Em_mobile = em_mobile;
		Em_email = em_email;
		Em_dept = em_dept;
	}

	public String getEm_id() {
		return Em_id;
	}

	public void setEm_id(String em_id) {
		Em_id = em_id;
	}

	public String getEm_name() {
		return Em_name;
	}

	public void setEm_name(String em_name) {
		Em_name = em_name;
	}

	public String getEm_mobile() {
		return Em_mobile;
	}

	public void setEm_mobile(String em_mobile) {
		Em_mobile = em_mobile;
	}

	public String getEm_email() {
		return Em_email;
	}

	public void setEm_email(String em_email) {
		Em_email = em_email;
	}

	public String getEm_dept() {
		return Em_dept;
	}

	public void setEm_dept(String em_dept) {
		Em_dept = em_dept;
	}
	
	
	
	
}
	