package projectTest.vo;

/**
 * 사람한명의 정보를 다룰 수 있는 클래스
 * @author 이중석
 * @since 2019.02.21
 *
 */
public class MemberVO {//회원VO
	private String mem_id;//사람의 아이디(pk)
	private String mem_pw;//사람의 비번
	private String mem_name;//사람의 이름
	private String mem_bir;//사람의 생년월일 //연월일만 저장할꺼면 타입을 스트링, 시분초까지 필요하면 데이트타입//todate tochar메서드
	private String mem_level;//사람의 등급
	
	private int mem_money;//사람이 가지고 있는돈 추가
	private int mem_mileage;//사람의 마일리지
	private int mem_grant;//사람의 권환 : 0 : 관리자 1 : 회원
	
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_bir() {
		return mem_bir;
	}
	public void setMem_bir(String mem_bir) {
		this.mem_bir = mem_bir;
	}
	public int getMem_money() {
		return mem_money;
	}
	public void setMem_money(int mem_money) {
		this.mem_money = mem_money;
	}
	public int getMem_mileage() {
		return mem_mileage;
	}
	public void setMem_mileage(int mem_mileage) {
		this.mem_mileage = mem_mileage;
	}
	public String getMem_level() {
		return mem_level;
	}
	public void setMem_level(String mem_level) {
		this.mem_level = mem_level;
	}
	public int getMem_grant() {
		return mem_grant;
	}
	public void setMem_grant(int mem_grant) {
		this.mem_grant = mem_grant;
	}
	
	
	
}
