package Model;

public class Leave {
	private String Lid;
	private String Ltype;
	private String FromDate;
	private String Lstatus;
	private String Em_id;
	public Leave(String lid, String ltype, String fromDate, String lstatus, String em_id) {
		super();
		Lid = lid;
		Ltype = ltype;
		FromDate = fromDate;
		Lstatus = lstatus;
		Em_id = em_id;
	}
	public String getLid() {
		return Lid;
	}
	public void setLid(String lid) {
		Lid = lid;
	}
	public String getLtype() {
		return Ltype;
	}
	public void setLtype(String ltype) {
		Ltype = ltype;
	}
	public String getFromDate() {
		return FromDate;
	}
	public void setFromDate(String fromDate) {
		FromDate = fromDate;
	}
	public String getLstatus() {
		return Lstatus;
	}
	public void setLstatus(String lstatus) {
		Lstatus = lstatus;
	}
	public String getEm_id() {
		return Em_id;
	}
	public void setEm_id(String em_id) {
		Em_id = em_id;
	}
	

}
