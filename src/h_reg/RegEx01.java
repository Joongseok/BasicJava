package h_reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx01 {
	public static void main(String[] args) {
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
		
		//1. 영어소문자가 2회에서 3회반복
		Pattern p = Pattern.compile("[a-z]{2,3}");
		Matcher m = p.matcher("asd");
//		System.out.println(m.matches());
		
		String regEx1 = "[a-z]{2,3}";
//		System.out.println(Pattern.matches(regEx1, "aad"));
		
		//2. 문자열 업그레이드
		//  영문자가 3회반복후 숫자가 하나이상
		String regEx2 = "[A-za-z]{3}[0-9]+";
//		System.out.println(Pattern.matches(regEx2, "aaa3"));
		
		//3. 핸드폰 번호
		//   숫자3개-숫자4-숫자4개
//		String regEx3 = "\\d{3}.\\d{4}.\\d{4}";
		String regEx3 = "\\d{3}-\\d{4}-\\d{4}";
//		System.out.println(Pattern.matches(regEx3, "000-0000-0000"));
		
		//4. 핸드폰 번호 업그레이드
		// 	 01 016789- 1~9숫자3개-숫자4개
		String regEx4 = "01[016789]-[1-9][0-9]{3}-\\d{4}";
//		System.out.println(Pattern.matches(regEx4, "010-1111-1123"));
		//5. 주민등록 번호
		// 년도 
		String regEx5 = "\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[0-1])-[1-4]\\d{6}";
//		System.out.println(Pattern.matches(regEx5, "950307-1024315"));
		
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
		String regEx6 = "^[A-Za-z]([-_.A-Za-z0-9])*@(\\w{1,7}[.]\\w{2}[.kr]$|\\w{1,7}[.](com)$)";
		System.out.println(Pattern.matches(regEx6, "ssdwa--dd-wff@1dssffg.co.kr"));
		//이메일 정규식
		//1. 시작은 영문자로 시작해야하고 특수기호-_\. 없을수도 여러개있을수도 있다.(d---___---b)
		//   영문자 숫자
		//2. @이후에는 영대소문자나 숫자가 1개~7개까지 가능하다.
		//3. .이후에는 영문자가 2~3자가 올수 있다.
		//4. .kr이 하나 있을수도 있고 없을수도 있다.
		
		
		
		String text ="야이 개나리 십장생아... 이런 조카신발 같은 경우를 봤다.";
//		
		String result = filterText(text);
		System.out.println(result);
		
		
		
		
	}

	private static String filterText(String text) {
		Pattern p = Pattern.compile("개나리|십장생|조카신발|병일신", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
				
		StringBuffer sb = new StringBuffer();
		while(m.find()){
			m.appendReplacement(sb, maskword(m.group()));
		}
		m.appendTail(sb);
		
		return sb.toString();
	}

	private static String maskword(String group) {
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
