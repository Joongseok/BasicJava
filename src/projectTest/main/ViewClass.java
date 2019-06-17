package projectTest.main;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import projectTest.service.IService;
import projectTest.service.IServiceImpl;
import projectTest.service.PatternService;
import projectTest.vo.CompanyVO;
import projectTest.vo.MemberVO;
import projectTest.vo.MenuVO;
import projectTest.vo.OrderVO;

/**
 * console에 출력을 하거나 입력받기 위한 클래스
 * @author 이중석
 * @since 2019.02.21
 * @see
 */
public class ViewClass {
	private IService service = new IServiceImpl();
	private MemberVO memberInfo = null;
	private PatternService pattern = new PatternService();
	/**
	 * 프로그램시작 메서드
	 * @author 이중석
	 * @since 2019.02.21
	 */
	public void startMethod(){
		System.out.println("고객님 환영합니다.");
		while(true){
			
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			
			switch (select) {
			case 1:
				//로그인
				login();
				break;
			case 2:
				//회원가입
				signin();
				break;
			default:
				System.out.println("1,2중에 골라주세요");
			}
		}
	}
	
	/**
	 * 로그인을 위한 메서드
	 * @author 이중석
	 * @since 2019.02.21
	 */
	private void login() {
		while(true){
			//아이디입력받는 메서드
			String mem_id = getMemberID();
			//비밀번호입력받는 메서드
			String mem_pw = getMemberPW();
			
			//SQL 디비에서 가져와야할거
	//		MemberVO getMemberInfo(String mem_id, String mem_pw);
	//		MemberVO result = service.getMemberInfo(mem_id, mem_pw);
			
			Map<String, String> params = new HashMap<String, String>();
			params.put("mem_id", mem_id);
			params.put("mem_pw", mem_pw);
			
			MemberVO result = service.getMemberInfo(params);
				if (result == null) {
					System.out.println("해당회원이 존재하지 않습니다.다시 입력해주세요");
					continue;
				}else{
					System.out.println(result.getMem_name()+"님 환영합니다.");
					memberInfo = result;
					switch (memberInfo.getMem_grant()) {
					case 0: // 관리자
						adminMenu();
						break;
					case 1: // 일반회원
						memberMenu();
						break;
					case 2: // 탈퇴 회원
						System.out.println("탈퇴한 회원입니다.");
						continue;
					}	
				}
		}
	}
	/**
	 * 회원가입메서드
	 */
	private void signin(){
		String mem_id = getMemberID();
		String mem_pw = getMemberPW();
		String mem_name = getMemberName();
		String mem_bir = getMemberBir();
		
		System.out.println("회원가입이 완료되었습니다.");
		Map<String, String> params = new HashMap<String, String>();
		params.put(mem_id, mem_id);
		params.put(mem_pw, mem_pw);
		params.put(mem_name, mem_name);
		params.put(mem_bir, mem_bir);
		
		MemberVO result = service.getMemberInfo(params);
		
		System.out.println(result.getMem_name()+"님 환영합니다.");
		memberInfo = result;
		
		MemberVO mv = new MemberVO();
		mv.setMem_id(mem_id);
		mv.setMem_pw(mem_pw);
		mv.setMem_name(mem_name);
		mv.setMem_bir(mem_bir);
		
		//다음 목록을 보여주는 메서드로 이동
		startMethod();
		
	}
	
	/**
	 * 관리자로 로그인 했을 경우 관리자 전용 메뉴
	 * 
	 */
	public void adminMenu(){
		while(true){
			System.out.println("1. 고객관리");
			System.out.println("2. 매장관리");
			System.out.println("3. 매출내역관리");
			System.out.println("4. 주문내역관리");
			System.out.println("5. 게시판관리");
			System.out.println("6. 로그아웃");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//고객관리
				memberManagement();
				break;
			case 2:
				//매장관리
				CompanyControl();
				break;
			case 3:
				//매출내역관리
				SalesView();
				break;
			case 4:
				//주문내역관리
				adminOrderView();
				break;
			case 5:
				//게시판관리
				adminBoard();
				break;
			case 6:
				//뒤로가기
				startMethod();
			default:
				System.out.println("1,2,3,4,5중에 골라주세요");
			}
		}
	}
	
	/**
	 * 고객관리를 선택하는 메서드
	 */
	public void memberManagement(){
		while(true){
			System.out.println("고객관리");
			System.out.println("1. 회원 정보 조회");
			System.out.println("2. 회원 등급 변경");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 회원 목록 조회");
			System.out.println("5. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//회원정보조회
				adminMemberView();
				break;
			case 2:
				//회원등급변경
				memberLevelChange();
				break;
			case 3:
				//회원탈퇴
				admin_memberDelete();
				break;
			case 4:
				//회원목록조회
				selectMemberView();
				break;
			case 5:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3,4,5중에 골라주세요");
			}
		}
	}
	/**
	 * admin에서 회원정보 조회를 했을때 호출될 메서드
	 */
	public void adminMemberView(){
		while(true){
			System.out.println("조회하실 회원의 아이디를 입력하여 주세요.");
			System.out.println("1. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			String mem_id = null;
			mem_id = sc.next();
			System.out.println(mem_id +"님의 정보입니다.");
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//뒤로가기
				return;
			default:
				System.out.println("뒤로가시려면 1번을 눌러주세요");
			}
		}
	}
	/**
	 * admin에서 회원등급변경을 했을때 호출될 메서드
	 */
	public void memberLevelChange(){
		while(true){
			System.out.println("등급을 변경하실 회원의 아이디를 입력해 주세요.");
			System.out.println("1. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			String mem_id = null;
			mem_id = sc.next();
			System.out.println(mem_id+"님의 등급이" +"..으로 변경되었습니다.");
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//뒤로가기
				return;
			default:
				System.out.println("뒤로가시려면 1번을 눌러주세요");
			}
		}
	}
	
	/**
	 * admin에서 회원탈퇴를 했을때 호출될 메서드
	 */
	public void admin_memberDelete(){
		while(true){
			System.out.println("탈퇴시킬 회원의 아이디를 검색하여 주세요.");
			System.out.println("1. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			String mem_id = null;
			mem_id = sc.next();
			System.out.println("..님이 탈퇴되었습니다.");
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//뒤로가기
				return;
			default:
				System.out.println("뒤로가시려면 1번을 눌러주세요");
			}
		}
	}
	
	/**
	 * admin회원목록을 조회 할떄 호출될 메서드
	 */
	public void selectMemberView(){
		while(true){
			System.out.println("회원목록조회");
			System.out.println("1. 회원 전체 목록 조회");
			System.out.println("2. 우수 회원 목록 조회");
			System.out.println("3. 일반 회원 목록 조회");
			System.out.println("4. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//회원 전체 목록 조회
				allMemberView();
			case 2:
				//우수 회원 목록 조회
				highLevelMemberView();
			case 3:
				//일반 회원 목록 조회
				nomalLevelMemberView();
			case 4:
				//뒤로가기
				return;
			default:
				System.out.println("뒤로가시려면 4번을 눌러주세요");
			}
		}
	}
	/**
	 * admin전체 멤버목록을 보여주는 메서드
	 * @return
	 */
	public MemberVO allMemberView(){
		return memberInfo;
	}
	/**
	 * admin우수멤버 목록을 보여주는 메서드
	 * @return
	 */
	public MemberVO highLevelMemberView(){
		return memberInfo;//조건식 필요 우수멤버만 조회할수있게
	}
	/**
	 * admin일반멤버 목록을 보여주는 메서드
	 * @return
	 */
	public MemberVO nomalLevelMemberView(){
		return memberInfo;//조건식 필요 일반멤버만 조회할수있게
	}
	
	/**
	 * admin 매장관리 메서드
	 * 
	 */
	public void CompanyControl(){
		while(true){
			System.out.println("1. 매장 등록");
			System.out.println("2. 매장 삭제");
			System.out.println("3. 매장 목록 조회");
			System.out.println("4. 매출 내역 조회");
			System.out.println("5. 매장 메뉴 등록");
			System.out.println("6. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//매장등록
				addCompany();
				break;
			case 2:
				//매장삭제
				CompanyDrop();
				break;
			case 3:
				//매장목록조회
				CompanyListView();
				break;
			case 4:
				//매출내역조회
				SalesView();
				break;
			case 5:
				//매장메뉴등록
				addMenu();
				break;
			case 6:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3,4,5,6중에 골라주세요");
			}
		}
	}
	/**
	 * 매장 등록 메서드
	 * @return
	 */
	public CompanyVO addCompany(){
		System.out.println("등록하실 매장의 정보를 입력해주세요");
		addMenu();
		return null;
	}	
	/**
	 * 매장 등록 후 메뉴 추가하는 메서드
	 * @return
	 */
	public CompanyVO addMenu(){
		System.out.println("메뉴가 추가되었습니다.");
		//매장이름 입력하고 메뉴추가하는 로직짜기
		CompanyControl();
		return null;
	}	
	
	/**
	 * 매장 삭제하는 메서드
	 * @return
	 */
	public CompanyVO CompanyDrop(){
		System.out.println("메뉴가 추가되었습니다.");
		//매장삭제하는 로직짜기
		CompanyControl();
		return null;
	}	
	
	/**
	 * 매장 목록조회하는 메서드
	 * @return
	 */
	public CompanyVO CompanyListView(){
		//매장목록 출력되는 로직짜기
		CompanyControl();
		return null;
	}
	
	/**
	 * 매출내역 조회하는 메서드
	 * 
	 */
	public void SalesView(){
		while(true){
			System.out.println("1. 전체 매출 내역 조회");
			System.out.println("2. 매장별 매출 내역 조회");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//전체 매출 내역 조회
				allSalesView();
				break;
			case 2:
				//매장별 매출 내역 조회
				companySalesView();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3,4,5중에 골라주세요");
			}
		}
	}	
	
	/**
	 * 전체 매출내역을 조회하는 메서드
	 * @return
	 */
	public CompanyVO allSalesView(){
		//전체 매출 내역 조회하는 로직짜기
		CompanyControl();
		return null;
	}
	
	/**
	 * 매장별 매출 내역을 조회하는 메서드
	 * @return
	 */
	public CompanyVO companySalesView(){
		//매장 매출 내역 조회하는 로직짜기
		CompanyControl();
		return null;
	}
	
	/**
	 * 주문내역 관리 하는 메서드
	 * 
	 */
	public void adminOrderView(){
		while(true){
			System.out.println("1. 전체 주문 내역 조회");
			System.out.println("2. 회원 주문 내역 조회");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//전체 주문 내역 조회
				adminAllOrderView();
				break;
			case 2:
				//회원 주문 내역 조회
				companySalesView();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3,4,5중에 골라주세요");
			}
		}
	}	
	
	/**
	 * 전체 주문 내역을 조회하는 메서드
	 * @return
	 */
	public CompanyVO adminAllOrderView(){
		//전체주문내역 보기
		CompanyControl();
		return null;
	}
	
	/**
	 * 회원별 주문 내역을 조회하는 메서드
	 * @return
	 */
	public CompanyVO memberOrderView(){
		//회원별 주문 내역보기
		CompanyControl();
		return null;
	}
	
	/**
	 *admin 게시판관리하는 메서드
	 */
	public void adminBoard(){
		while(true){
			System.out.println("게시판에 오신걸 환영합니다.");
			System.out.println("1. 글쓰기");
			System.out.println("2. 글삭제");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//글쓰기
				memberTyping();
				break;
			case 2:
				//글삭제
				memberTypingDelete();
				break;
			case 3:
				return;
			default:
				System.out.println("1,2중에 골라주세요");
			}
		}
	}
	
	/**
	 * admin 게시판 글쓰기 메서드 들어가서 글쓰는 메서드
	 */
	public void adminTyping(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("제목을 입력하여 주세요.");
			
			String typing = sc.nextLine();
			System.out.println("본문을 입력해주세요");
			String typingTitle = sc.nextLine();
			System.out.println(typingTitle);
			
			System.out.println(typing);
			
			System.out.println("게시글이 작성되었습니다.");
			return;
		}
	}
	/**
	 * admin 게시판 글삭제하는 메서드
	 */
	public void adminTypingDelete(){
			System.out.println("게시글이 삭제되었습니다.");//삭제될수 있게 조건식
		
	}
	
		
	
	/**
	 * 회원으로 로그인 했을경우 회원전용메뉴
	 * 
	 */
	public void memberMenu(){
		while(true){
			System.out.println("..님 환영합니다.");
			System.out.println("1. 주문하기");
			System.out.println("2. 회원정보 조회");
			System.out.println("3. 게시글 쓰기");
			System.out.println("4. 로그아웃");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
				switch (select) {
				case 1:
					//주문하기
					memberOrderMenu();
					break;
				case 2:
					//회원정보 조회
					memberView();
					break;
				case 3:
					//게시글 쓰기
					memberBoard();
					break;
				case 4:
					//로그아웃
					startMethod();
				default:
					System.out.println("1,2,3,4중에 골라주세요");
				}
		}
	}

	/**
	 * 회원 전용 메뉴에서 case1번을 눌러서 주문을 하는 메서드
	 */
	public void memberOrderMenu(){
		while(true){
			System.out.println("주문하실 메뉴를 선택해주세요.");
			System.out.println("1. 메뉴선택");
			System.out.println("2. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//메뉴선택
				menu();
				break;
			case 2:
				//뒤로가기
				return;
			default:
				System.out.println("1,2중에 골라주세요");
			}
		}
	}
	
	/**
	 * 카테고리를 선택하는 메서드
	 */
	public void menu(){
		while(true){
			System.out.println("1. 치킨");
			System.out.println("2. 피자");
			System.out.println("3. 햄버거");
			System.out.println("4. 중국집");
			System.out.println("5. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//치킨
				chickenSelect();
				break;
			case 2:
				//피자
				pizzaSelect();
				break;
			case 3:
				//햄버거
				hamburgerSelect();
				break;
			case 4:
				//중국집
				cineseFoodSelect();
				break;
			case 5:
				//뒤로가기
				memberMenu();
				break;
			default:
				System.out.println("1,2,3,4,5중에 골라주세요");
			}
		}
	}
	
	/**
	 * 치킨 카테고리 선택 후 업체를 선택하는 메서드
	 */
	public void chickenSelect(){
		while(true){
			System.out.println("치킨집을 선택해주세요.");
			System.out.println("1. 교촌치킨");
			System.out.println("2. 네네치킨");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//네네치킨
				neneCompanySelect();
				break;
			case 2:
				//교촌치킨
				kyochonCompanySelect();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 네네치킨 업체를 선택 후 메뉴를 선택하는 메서드
	 */
	public void neneCompanySelect(){
		while(true){
			System.out.println("환영합니다 네네치킨 입니다.메뉴를 선택해주세요.");
			System.out.println("1. 후라이드");
			System.out.println("2. 양념");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//후라이드
				friedChicken();
				break;
			case 2:
				//양념치킨
				seasoningChicken();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 후라이드치킨 선택하면 메뉴VO에서 후라이드치킨을 반환하는 메서드
	 * @return
	 */
	public MenuVO friedChicken(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 양념치킨 선택하면 메뉴VO에서 양념치킨을 반환하는 메서드
	 * @return
	 */
	public MenuVO seasoningChicken(){
		order_qty();
		return null;
		
	}
	/**
	 * 교촌치킨 업체를 선택 후 메뉴를 선택하는 메서드
	 */
	public void kyochonCompanySelect(){
		while(true){
			System.out.println("환영합니다 교촌치킨 입니다.메뉴를 선택해주세요.");
			System.out.println("1. 간장");
			System.out.println("2. 어니언");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//간장치킨
				soyChicken();
				break;
			case 2:
				//어니언치킨
				OnionChicken();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 간장치킨 선택하면 메뉴VO에서 간장치킨 반환하는 메서드
	 * @return
	 */
	public MenuVO soyChicken(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 어니언 선택하면 메뉴VO에서 어니언치킨을 반환하는 메서드
	 * @return
	 */
	public MenuVO OnionChicken(){
		order_qty();
		return null;
		
	}
	/**
	 * 피자 카테고리 선택 후 업체를 선택하는 메서드
	 */
	public void pizzaSelect(){
		while(true){
			System.out.println("업체를 선택해주세요.");
			System.out.println("1. 도미노피자");
			System.out.println("2. 미스터피자");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//도미노피자
				dominoCompanySelect();
				break;
			case 2:
				//미스터피자
				misterCompanySelect();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 도미노피자 업체를 선택 후 메뉴를 선택하는 메서드
	 */
	public void dominoCompanySelect(){
		while(true){
			System.out.println("환영합니다 도미노피자 입니다.메뉴를 선택해주세요.");
			System.out.println("1. 치즈크러스트");
			System.out.println("2. 불고기피자");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//치즈크러스트
				cheesePizza();
				break;
			case 2:
				//불고기
				BulgogiPizza();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 치즈크러스트 선택하면 메뉴VO에서 치즈크러스트을 반환하는 메서드
	 * @return
	 */
	public MenuVO cheesePizza(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 불고기피자 선택하면 메뉴VO에서 불고기피자를 반환하는 메서드
	 * @return
	 */
	public MenuVO BulgogiPizza(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 미스터피자 업체를 선택 후 메뉴를 선택하는 메서드
	 */
	public void misterCompanySelect(){
		while(true){
			System.out.println("환영합니다 미스터피자 입니다.메뉴를 선택해주세요.");
			System.out.println("1. 고구마피자");
			System.out.println("2. 포테이토피자");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//고구마피자
				sweetPotatoPizza();
				break;
			case 2:
				//불고기
				potatoPizza();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 고구마피자 선택하면 메뉴VO에서 고구마피자을 반환하는 메서드
	 * @return
	 */
	public MenuVO sweetPotatoPizza(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 포테이토피자 선택하면 메뉴VO에서 포테이토피자를 반환하는 메서드
	 * @return
	 */
	public MenuVO potatoPizza(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 햄버거 카테고리 선택 후 업체를 선택하는 메서드
	 */
	public void hamburgerSelect(){
		while(true){
			System.out.println("업체를 선택해주세요.");
			System.out.println("1. 버거킹");
			System.out.println("2. 맘스터치");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//버거킹
				burgerKingCompanySelect();
				break;
			case 2:
				//맘스터치
				momstouchCompanySelect();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 버거킹 업체를 선택 후 메뉴를 선택하는 메서드
	 */
	public void burgerKingCompanySelect(){
		while(true){
			System.out.println("환영합니다 버거킹 입니다.메뉴를 선택해주세요.");
			System.out.println("1. 와퍼");
			System.out.println("2. 와퍼주니어");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//와퍼
				wapper();
				break;
			case 2:
				//와퍼주니어
				wapperJunior();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 와퍼 선택하면 메뉴VO에서 와퍼를 반환하는 메서드
	 * @return
	 */
	public MenuVO wapper(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 와퍼주니어 선택하면 메뉴VO에서 와퍼주니어를 반환하는 메서드
	 * @return
	 */
	public MenuVO wapperJunior(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 맘스터치 업체를 선택 후 메뉴를 선택하는 메서드
	 */
	public void momstouchCompanySelect(){
		while(true){
			System.out.println("환영합니다 맘스터치 입니다.메뉴를 선택해주세요.");
			System.out.println("1. 싸이버거");
			System.out.println("2. 인크레더블버거");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//싸이버거
				cyberBurger();
				break;
			case 2:
				//인크레더블버거
				incredibleBurger();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 싸이버거 선택하면 메뉴VO에서 싸이버거를 반환하는 메서드
	 * @return
	 */
	public MenuVO cyberBurger(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 인크레더블버거 선택하면 메뉴VO에서 인크레더블버거를 반환하는 메서드
	 * @return
	 */
	public MenuVO incredibleBurger(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 중국집 카테고리 선택 후 업체를 선택하는 메서드
	 */
	public void cineseFoodSelect(){
		while(true){
			System.out.println("업체를 선택해주세요.");
			System.out.println("1. 황룡각");
			System.out.println("2. 봉춘각");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//황룡각
				hwangryongCompanySelect();
				break;
			case 2:
				//봉춘각
				bongchunCompanySelect();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 황룡각 업체를 선택 후 메뉴를 선택하는 메서드
	 */
	public void hwangryongCompanySelect(){
		while(true){
			System.out.println("환영합니다 황룡각 입니다.메뉴를 선택해주세요.");
			System.out.println("1. 짜장면");
			System.out.println("2. 짬뽕");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//짜장
				jajangmyeon();
				break;
			case 2:
				//짬뽕
				jjambbong();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 짜장 선택하면 메뉴VO에서 짜장을 반환하는 메서드
	 * @return
	 */
	public MenuVO jajangmyeon(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 짬뽕을 선택하면 메뉴VO에서 짬뽕을 반환하는 메서드
	 * @return
	 */
	public MenuVO jjambbong(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 봉춘각 업체를 선택 후 메뉴를 선택하는 메서드
	 */
	public void bongchunCompanySelect(){
		while(true){
			System.out.println("환영합니다 봉춘각 입니다. 메뉴를 선택해주세요.");
			System.out.println("1. 팔보채");
			System.out.println("2. 유산슬");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//팔보채
				palbochae();
				break;
			case 2:
				//유산슬
				yusansle();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3중에 골라주세요");
			}
		}
	}
	
	/**
	 * 팔보채 선택하면 메뉴VO에서 팔보채를 반환하는 메서드
	 * @return
	 */
	public MenuVO palbochae(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 유산슬 선택하면 메뉴VO에서 유산슬을 반환하는 메서드
	 * @return
	 */
	public MenuVO yusansle(){
		order_qty();
		return null;
		
	}
	
	/**
	 * 메뉴를 선택한 후 수량을 선택하는메서드
	 * @return
	 */
	public OrderVO order_qty(){
		System.out.println("수량을 선택해주세요.");
		Scanner sc = new Scanner(System.in);
		int select = 0;
		try {
			select = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			
		}
		System.out.println(select+"개 주문하셨습니다. 주문해주셔서 감사합니다.");
		menu();
		return null;
		
	}
	
	
	
	/**
	 * 회원정보를 조회하는 메서드
	 * 
	 */
	public void memberView(){
		while(true){
			System.out.println("..님의 현재 정보.");
			System.out.println("1. 회원정보 수정하기");
			System.out.println("2. 마일리지 조회하기");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//회원정보수정하기
				memberUpdate();
				break;
			case 2:
				//마일리지 조회하기
				memberMileageView();
				break;
			case 3:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3,4중에 골라주세요");
			}
		}
	}
	/**
	 * 회원정보를 수정하는 메서드
	 * 
	 */
	public void memberUpdate(){
		while(true){
			System.out.println("회원정보를 수정하시겠습니까?");
			System.out.println("1. 비밀번호 변경");
			System.out.println("2. 돈 충전");
			System.out.println("3. 회원탈퇴");
			System.out.println("4. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//비밀번호변경
				passwardUpdate();
				break;
			case 2:
				//돈충전
				moneyCharge();
				break;
			case 3:
				//회원탈퇴
				memberDelete();
				break;
			case 4:
				//뒤로가기
				return;
			default:
				System.out.println("1,2,3,4중에 골라주세요");
			}
		}
	}
	
	/**
	 * 비밀번호 변경하는 메서드
	 * 
	 */
	public void passwardUpdate(){
		while(true){
		System.out.println("변경하실 비밀번호를 입력해 주세요");
			Scanner sc = new Scanner(System.in);
			String select = null;
			try {
				select = sc.next();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
			System.out.println(select+"로 변경되었습니다.");
			return;
		}
	}
	/**
	 * 돈충전하는 메서드
	 * 
	 */
	public void moneyCharge(){
		while(true){
		System.out.println("충전하실 금액을 입력해 주세요");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
			System.out.println(select+"원 충전되었습니다.");
			return;
		}
	}
	/**
	 * 회원탈퇴 메서드
	 * 
	 */
	public void memberDelete(){
		while(true){
			System.out.println("이용해주셔서 감사합니다.");
			startMethod();
		}
	}
	
	/**
	 *게시판에 글쓰는 메서드 
	 */
	public void memberBoard(){
		while(true){
			System.out.println("게시판에 오신걸 환영합니다.");
			System.out.println("1. 글쓰기");
			System.out.println("2. 글삭제");
			System.out.println("3. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				//글쓰기
				memberTyping();
				break;
			case 2:
				//글삭제
				memberTypingDelete();
				break;
			case 3:
				return;
			default:
				System.out.println("1,2중에 골라주세요");
			}
		}
	}
	
	/**
	 * 게시판 글쓰기 메서드 들어가서 글쓰는 메서드
	 */
	public void memberTyping(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("제목을 입력하여 주세요.");
			
			String typing = sc.nextLine();
			System.out.println("본문을 입력해주세요");
			String typingTitle = sc.nextLine();
			System.out.println(typingTitle);
			
			System.out.println(typing);
			
			System.out.println("게시글이 작성되었습니다.");
			return;
		}
	}
	/**
	 * 게시판 글삭제하는 메서드
	 */
	public void memberTypingDelete(){
			System.out.println("게시글이 삭제되었습니다.");//본인글만 삭제될수 있게 조건식
		
	}
	
	
	/**
	 * 마일리지 조회메서드
	 */
	public void memberMileageView(){
		while(true){
			System.out.println("..님의 마일리지는 ");
			System.out.println("===========목록===========");
			System.out.println("1. 뒤로가기");
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try {
				select = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			switch (select) {
			case 1:
				return;
			default:
				System.out.println("1,2중에 골라주세요");
			}
		}
	}
	
	
	
	
	
	/**
	 * 로그인 아이디를 입력받는 메서드
	 * @이중석
	 * @since 2019.02.21
	 */
	private String getMemberID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String mem_id = sc.next();
		return mem_id;
	}
	/**
	 * 비밀번호를 입력받는 메서드
	 * @이중석
	 * @since 2019.02.21
	 */
	private String getMemberPW() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를를 입력해주세요");
		String mem_pw = sc.next();
		return mem_pw;
	}
	
	/**
	 * 회원가입 메서드를 호출한뒤 생일을 입력하는 메서드
	 * @return
	 */
	private String getMemberBir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("생년원일을 입력해주세요");
		String mem_bir = sc.next();
		return mem_bir;
	}

	/**
	 * 회원가입 메서드를 호출한뒤 이름을 입력하는 메서드
	 * @return
	 */
	private String getMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String mem_name = sc.next();
		return mem_name;
	}

	
	
	
}
