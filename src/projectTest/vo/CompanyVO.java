package projectTest.vo;

public class CompanyVO {//거래처VO
	private String com_id;//업체 코드(pk)//거래처코드//buyer_id(pk)
	private String com_name;//업체 이름//거래처명//buyer_name
	
	
	
	public String getCom_id() {
		return com_id;
	}
	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}
	public String getCom_name() {
		return com_name;
	}
	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	
	
}
