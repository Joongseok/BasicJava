package projectTest.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import projectTest.vo.BoardVO;
import projectTest.vo.CompanyVO;
import projectTest.vo.MemberVO;
import projectTest.vo.MenuVO;
import projectTest.vo.OrderVO;

public class DBClass {
	
	private List<MemberVO> memberList = new ArrayList<MemberVO>();//회원 목록//멤버(member)
	
	private List<CompanyVO> companyList = new ArrayList<CompanyVO>();//거래처 목록//컴퍼니(buyer)
	
	private List<MenuVO> menuList = new ArrayList<MenuVO>();//상품목록//메뉴(prod)
	
	private List<OrderVO> orderList = new ArrayList<OrderVO>();// 장바구니 목록//주문(cart)
	
	private List<BoardVO> boardList = new ArrayList<BoardVO>();//거래처별 게시판
	
	
	{//멤버 3명 먼저 등록
		MemberVO mv = new MemberVO();//admin
		mv.setMem_id("a000");//mem_id(pk)
		mv.setMem_pw("java");//mem_pass
		mv.setMem_name("자바맨");//mem_name
		mv.setMem_bir("19500505");//mem_bir
		mv.setMem_grant(0);//관리자 권한 넘버
		
		memberList.add(mv);
		
		MemberVO mv1 = new MemberVO();//고객
		mv1.setMem_id("a001");//mem_id(pk)
		mv1.setMem_pw("asdfasdf");//mem_pass
		mv1.setMem_name("김은대");//mem_name
		mv1.setMem_bir("19700505");//mem_bir
		mv1.setMem_mileage(0);//mem_mileage
		mv1.setMem_level("초심자");//멤버등급
		mv1.setMem_grant(1);//회원 권한 넘버
		
		
		memberList.add(mv1);
		
		MemberVO mv2 = new MemberVO();
		mv2.setMem_id("b001");
		mv2.setMem_pw("1004");
		mv2.setMem_name("이쁜이");
		mv2.setMem_bir("19930305");
		mv2.setMem_mileage(0);
		mv2.setMem_level("초심자");//멤버등급
		mv2.setMem_grant(1);//회원 권한 넘버
		
		memberList.add(mv2);
		
		MemberVO mv3 = new MemberVO();
		mv3.setMem_id("c001");
		mv3.setMem_pw("7777");
		mv3.setMem_name("신용환");
		mv3.setMem_bir("19800602");
		mv3.setMem_mileage(0);
		mv3.setMem_level("초심자");//멤버등급
		mv3.setMem_grant(1);//회원 권한 넘버
		
		memberList.add(mv3);
		
		MemberVO mv4 = new MemberVO();
		mv4.setMem_id("d001");
		mv4.setMem_pw("123joy");
		mv4.setMem_name("성윤미");
		mv4.setMem_bir("19460409");
		mv4.setMem_mileage(0);
		mv4.setMem_level("초심자");//멤버등급
		mv4.setMem_grant(1);//회원넘버
		
		memberList.add(mv4);
		
		MemberVO mv5 = new MemberVO();
		mv5.setMem_id("e001");//pk
		mv5.setMem_pw("00000000");
		mv5.setMem_name("이혜나");
		mv5.setMem_bir("19750501");
		mv5.setMem_mileage(0);
		mv5.setMem_level("초심자");//멤버등급
		mv5.setMem_grant(2);//회원 권한 넘버
		
		memberList.add(mv5);
	}
	
	{//주문 초기화 블럭
		
		//a001회원인 김은대씨가//2019-02-22일에 P10102(P1:치킨,01:네네치킨,02:양념)을 2개 주문함
		OrderVO od = new OrderVO();//cart
		od.setMem_id("a001");//회원코드(fk)//cart_member(fk)
		od.setOrder_id("20190222");//주문코드(pk)//cart_no(pk)
		od.setMenu_id("P10102");//메뉴코드(fk)//cart_prod(fk)
		od.setOrder_qty(2);//주문수량//cart_qty
		orderList.add(od);
		
		
		OrderVO od1 = new OrderVO();
		od1.setMem_id("c001");//회원코드(fk)//cart_member(fk)
		od1.setOrder_id("20190222");//주문코드(pk)//cart_no(pk)
		od1.setMenu_id("P20102");//메뉴코드(fk)//cart_prod(fk)
		od1.setOrder_qty(1);//주문수량//cart_qty
		orderList.add(od1);
		
		OrderVO od2 = new OrderVO();
		od2.setMem_id("b001");//회원코드(fk)//cart_member(fk)
		od2.setOrder_id("20190222");//주문코드(pk)//cart_no(pk)
		od2.setMenu_id("P30101");//메뉴코드(fk)//cart_prod(fk)
		od2.setOrder_qty(3);//주문수량//cart_qty
		orderList.add(od2);
		
		OrderVO od3 = new OrderVO();
		od3.setMem_id("d001");//회원코드(fk)//cart_member(fk)
		od3.setOrder_id("20190222");//주문코드(pk)//cart_no(pk)
		od3.setMenu_id("P40202");//메뉴코드(fk)//cart_prod(fk)
		od3.setOrder_qty(2);//주문수량//cart_qty
		orderList.add(od3);
		
		OrderVO od4 = new OrderVO();
		od4.setMem_id("e001");//회원코드(fk)//cart_member(fk)
		od4.setOrder_id("20190222");//주문코드(pk)//cart_no(pk)
		od4.setMenu_id("P20201");//메뉴코드(fk)//cart_prod(fk)
		od4.setOrder_qty(2);//주문수량//cart_qty
		orderList.add(od4);
		
	}
	
	
	
	{//업체 초기화 지역코드초기화 블럭 //P101 : 치킨의 업체ex)네네
		
		CompanyVO cp = new CompanyVO();//buyer
		cp.setCom_id("P101");//컴퍼니아이디(pk)//buyer_id(pk)
		cp.setCom_name("네네치킨");//컴퍼니이름//buyer_name
		companyList.add(cp);
		
		CompanyVO cp1 = new CompanyVO();
		cp1.setCom_id("P102");
		cp1.setCom_name("교촌치킨");
		companyList.add(cp1);
		
		CompanyVO cp2 = new CompanyVO();
		cp2.setCom_id("P201");
		cp2.setCom_name("도미노피자");
		companyList.add(cp2);
		
		CompanyVO cp3 = new CompanyVO();
		cp3.setCom_id("P202");
		cp3.setCom_name("미스터피자");
		companyList.add(cp3);
		
		CompanyVO cp4 = new CompanyVO();
		cp4.setCom_id("P301");
		cp4.setCom_name("버거킹");
		companyList.add(cp4);
		
		CompanyVO cp5 = new CompanyVO();
		cp5.setCom_id("P302");
		cp5.setCom_name("맘스터치");
		companyList.add(cp5);
		
		CompanyVO cp6 = new CompanyVO();
		cp6.setCom_id("P401");
		cp6.setCom_name("황룡각");
		companyList.add(cp6);
		
		CompanyVO cp7 = new CompanyVO();
		cp7.setCom_id("P402");
		cp7.setCom_name("봉춘각");
		companyList.add(cp7);
	}
	
	
	{//메뉴 초기화 블럭 
		MenuVO me = new MenuVO();//prod
		me.setCom_id("P101");//공급업체코드(fk)//prod_buyer(fk)
		me.setMenu_id("P10101");//상품코드(pk)//prod_id(pk)
		me.setMenu_name("후라이드");//상품이름//prod_name
		me.setMenu_price(17000);//판매가//prod_sale
		me.setMenu_mileage(17);//개당마일리지점수//prod_mileage
		
		menuList.add(me);
		
		MenuVO me1 = new MenuVO();
		me1.setCom_id("P101");
		me1.setMenu_id("P10102");
		me1.setMenu_name("양념");
		me1.setMenu_price(18000);
		me1.setMenu_mileage(18);
		
		menuList.add(me1);
		
		MenuVO me2 = new MenuVO();
		me2.setCom_id("P102");
		me2.setMenu_id("P10201");
		me2.setMenu_name("간장");
		me2.setMenu_price(18000);
		me2.setMenu_mileage(18);
		menuList.add(me2);
		
		MenuVO me3 = new MenuVO();
		me3.setCom_id("P102");
		me3.setMenu_id("P10202");
		me3.setMenu_name("어니언");
		me3.setMenu_price(19000);
		me3.setMenu_mileage(19);
		menuList.add(me3);
		
		MenuVO me4 = new MenuVO();
		me4.setCom_id("P201");
		me4.setMenu_id("P20101");
		me4.setMenu_name("치즈크러스트");
		me4.setMenu_price(17000);
		me4.setMenu_mileage(17);
		menuList.add(me4);
		
		MenuVO me5 = new MenuVO();
		me5.setCom_id("P201");
		me5.setMenu_id("P20102");
		me5.setMenu_name("불고기");
		me5.setMenu_price(18000);
		me5.setMenu_mileage(18);
		menuList.add(me5);
		
		MenuVO me6 = new MenuVO();
		me6.setCom_id("P202");
		me6.setMenu_id("P20201");
		me6.setMenu_name("고구마피자");
		me6.setMenu_price(16000);
		me6.setMenu_mileage(16);
		menuList.add(me6);
		
		MenuVO me7 = new MenuVO();
		me7.setCom_id("P202");
		me7.setMenu_id("P20202");
		me7.setMenu_name("포테이토피자");
		me7.setMenu_price(17000);
		me7.setMenu_mileage(17);
		menuList.add(me7);
		
		MenuVO me8 = new MenuVO();
		me8.setCom_id("P301");
		me8.setMenu_id("P30101");
		me8.setMenu_name("와퍼");
		me8.setMenu_price(6000);
		me8.setMenu_mileage(6);
		menuList.add(me8);
		
		MenuVO me9 = new MenuVO();
		me9.setCom_id("P301");
		me9.setMenu_id("P30102");
		me9.setMenu_name("와퍼주니어");
		me9.setMenu_price(4500);
		me9.setMenu_mileage(4);
		menuList.add(me9);
		
		MenuVO me10 = new MenuVO();
		me10.setCom_id("P302");
		me10.setMenu_id("P30201");
		me10.setMenu_name("싸이버거");
		me10.setMenu_price(6000);
		me10.setMenu_mileage(6);
		menuList.add(me10);
		
		MenuVO me11 = new MenuVO();
		me11.setCom_id("P302");
		me11.setMenu_id("P30202");
		me11.setMenu_name("인크레더블버거");
		me11.setMenu_price(5000);
		me11.setMenu_mileage(5);
		menuList.add(me11);
		
		MenuVO me12 = new MenuVO();
		me12.setCom_id("P401");
		me12.setMenu_id("P40101");
		me12.setMenu_name("짜장면");
		me12.setMenu_price(5000);
		me12.setMenu_mileage(5);
		menuList.add(me12);
		
		MenuVO me13 = new MenuVO();
		me13.setCom_id("P401");
		me13.setMenu_id("P40102");
		me13.setMenu_name("짬뽕");
		me13.setMenu_price(6000);
		me13.setMenu_mileage(6);
		menuList.add(me13);
		
		MenuVO me14 = new MenuVO();
		me14.setCom_id("P402");
		me14.setMenu_id("P40201");
		me14.setMenu_name("팔보채");
		me14.setMenu_price(15000);
		me14.setMenu_mileage(15);
		menuList.add(me14);
		
		MenuVO me15 = new MenuVO();
		me15.setCom_id("P402");
		me15.setMenu_id("P40202");
		me15.setMenu_name("유산슬");
		me15.setMenu_price(20000);
		me15.setMenu_mileage(20);
		menuList.add(me15);
		
	}
	
	
	{//게시판 초기화블럭
		BoardVO bd = new BoardVO();
		bd.setBoard_id("B001");//게시판 번호(pk)//1번게시판에
		bd.setBoard_title("맛있습니다.");//제목
		bd.setBoard_comment("치킨이 맛있어요.");//코멘트
		bd.setBoard_date("190222");//날짜
		bd.setMem_id("a001");// 회원 번호(fk)//김은대씨가
		bd.setCom_id("P101");// 거래처(fk)//네네치킨
		boardList.add(bd);
	}
	
	
	
	

	
	/**
	 * 회원가입 메서드
	 * @param mem_id
	 * @param mem_pw
	 * @return MemberVO 
	 * 데이터에 있는 값과 콘솔에 있는 값이 일치를 하는지 물어보는 같으면 입력한 값을 반환
	 */
	public MemberVO getMemberInfo(String mem_id, String mem_pw) {
		MemberVO mv = null;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getMem_id().equals(mem_id) && memberList.get(i).getMem_pw().equals(mem_pw)) {
				mv = memberList.get(i);
				break;
			}
		}
		
		
		return mv;
	}

	public MemberVO getMemberInfo(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_pw = params.get("mem_pw");
		
		MemberVO mv = null;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getMem_id().equals(mem_id) && memberList.get(i).getMem_pw().equals(mem_pw)) {
				mv = memberList.get(i);
				break;
			}
		}
		return mv;
	}
}
