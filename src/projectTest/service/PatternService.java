package projectTest.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 이중석
 * @since 2019.02.23
 */
public class PatternService {
	/*
	 * private String mem_id;//사람의 아이디(pk)
	private String mem_pw;//사람의 비번
	private String mem_name;//사람의 이름
	private String mem_bir;//사람의 생년월일 //연월일만 저장할꺼면 타입을 스트링, 시분초까지 필요하면 데이트타입//todate tochar메서드
	
	private int mem_money;//사람이 가지고 있는돈 추가
	private int mem_mileage;//사람의 마일리지
	private int mem_level;//사람의 등급
	private int mem_grant;//사람의 권환 : 0 : 관리자 1 : 회원
	
	1. 정규식
	  - 텍스트데이터 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용하는 것  
	  - 정규식의 구성
	    : Pattern이라는 클래스를 이용하여 정규식을 정의한다.
	    : Matcher라는 클래스를 이용하여 Pattern과 일치하는 데이터를 찾는다. 
	*/
	//패턴등록
//	Pattern p = Pattern.compile("[a-z]*");
//	
//	Matcher m = p.matcher("asdf");
	/*
	^ 문자열의 시작
	$ 문자열의 끝
	. 임의의 한문자(문자열의 종류를 가리지 않음),\는 넣을수 없다.
	* 문자가 없을수도 무한정 있을수도 있다.
	+ 앞문자가 하나이상
	? 앞문자가 없거나 하나
	[] 문자의 집합이나 범위를 나타낸다.
	{} 횟수 또는 범위를 나타낸다.
	() 소괄호 안의 문자를 하나의 문자로 인식
	| 패턴안에서 or연산을 수행할떄 사용
	\s 공백문자 (스페이스바)
	\S 공백을 제외한 모든 문자
	\w 알파벳이나 숫자 [A-Za-z0-9]
	\W 알파벳이나 숫자를 제외한 모든문자
	\d 숫자
	\D 숫자를 제외한 모든문자
	
	영문자로 시작 : ^[A-Za-z]
	반복 : {2} 2번반복
		  {2,4} 2번에서 4번(2,3,4회)
		  {2,} 2회이상 반복
	*/
	
	//멤버 아이디 영문자 시작 4~12글자 특수문자는 !@#$만 허용
	/**
	 * @author 이중석
	 * @since 2019.02.23
	 * @param mem_id
	 * @return
	 */
	public boolean  reg_mem_id(String mem_id){
		Pattern p = Pattern.compile("^[A-Z-a-z][(\\w||!@#$)]{4,12}$");
		Matcher m = p.matcher(mem_id);
		

		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}
	//멤버의 비번 3~12글자 특수문자는 !@#$만 허용
	public boolean reg_mem_pw(String mem_pw){
		Pattern p = Pattern.compile("^[(\\w||!@#$)]{3~12}$");
		Matcher m = p.matcher(mem_pw);
		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}
	//사람의 이름은 2글자에서 4글자 한글만 허용
	public boolean reg_mem_name(String mem_name){
		Pattern p = Pattern.compile("(^[가-힣]{2,4}$||^[A-Za-z]{2,12}$)");
		Matcher m = p.matcher(mem_name);
		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}
	//사람의 생년월일 6글자 950307
	public boolean reg_mem_bir(String mem_bir){
		Pattern p = Pattern.compile("^[\\d]{6}$");
		Matcher m = p.matcher(mem_bir);
		if (m.find()) {
			return true;
		} else {
			return false;
		}
	}
	//게시판 욕설 방지용
	public static String filterText(String text) {
		Pattern p = Pattern.compile("개나리|십장생|조카신발|병일신", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
				
		StringBuffer sb = new StringBuffer();
		while(m.find()){
			m.appendReplacement(sb, maskword(m.group()));
		}
		m.appendTail(sb);
		
		return sb.toString();
	}
//
	public static String maskword(String group) {
		StringBuffer sb = new StringBuffer();//"개"
		char[] ch = group.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i==0) {
				sb.append(ch[i]);
			}else{
				sb.append("★");
			}
		}
		return sb.toString();
	}
	

}
