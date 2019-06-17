
package projectTest.vo;

public class BoardVO {//게시판 VO
	
	private String board_id;//보드코드(pk)//보드//board_id
	private String board_title;//게시판 제목
	private String board_comment;//게시판 글
	private String board_date;//게시판 날짜
	
	
	private String mem_id;//멤버아이디(fk)
	private String com_id;//거래처아이디(fk)
	
	public String getBoard_id() {
		return board_id;
	}
	public void setBoard_id(String board_id) {
		this.board_id = board_id;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_comment() {
		return board_comment;
	}
	public void setBoard_comment(String board_comment) {
		this.board_comment = board_comment;
	}
	public String getBoard_date() {
		return board_date;
	}
	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getCom_id() {
		return com_id;
	}
	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}
	
	
	
	
	
	

}


