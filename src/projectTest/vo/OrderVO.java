package projectTest.vo;

public class OrderVO {//장바구니 VO
	
	private String order_id;//주문 코드(pk)//주문번호(pk)//cat_no(pk)
	private int order_qty;//주문 수량//수량//cart_qty
	
	private String mem_id;//사람의 아이디(fk)//회원ID(fk)//cart_member(fk)
	private String menu_id;//상품의 메뉴 코드(fk)//상품코드(fk)//cart_prod(fk)
	private String sale_history;//매출내역
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}
	public String getSale_history() {
		return sale_history;
	}
	public void setSale_history(String sale_history) {
		this.sale_history = sale_history;
	}
	
	
	
}
