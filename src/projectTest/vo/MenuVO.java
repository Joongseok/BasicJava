package projectTest.vo;

public class MenuVO {//상품VO
	private String menu_id;//메뉴 코드(pk)//상품코드(pk)//prod_id(pk)
	private String menu_name;//메뉴 이름//상품명//prod_name
	private int menu_price;//판매가//prod_sale	
	private int menu_mileage;//개당마일리지점수//prod_mileage
	
	private String com_id;//컴퍼니 코드(fk)
	
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public int getMenu_price() {
		return menu_price;
	}
	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}
	public int getMenu_mileage() {
		return menu_mileage;
	}
	public void setMenu_mileage(int menu_mileage) {
		this.menu_mileage = menu_mileage;
	}
	public String getCom_id() {
		return com_id;
	}
	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}
	
	
	
	
	
	
	

}
