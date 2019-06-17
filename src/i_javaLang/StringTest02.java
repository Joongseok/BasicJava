package i_javaLang;

import java.util.Arrays;
import java.util.Date;

public class StringTest02 {
	public static void main(String[] args) {
		//1. char charAt(int index) : 지정된 index번째 있는 문자를 리턴한다.
		String s1 = "Hello";
		char c1 = s1.charAt(0);//객체 s1에 charAt메서드를 사용하여 0번인덱스에 들어있는 H를 뽑아내고 객체 c1에 담는다.
		System.out.println(c1);
		
		//2. STring (Stirng s) : 주어진 문자열(s)을 갖는 Stirng 인스턴스를 생성한다.
		String s = new String("Hello");
		System.out.println(s);
		
		//3. String(char[] value) : 주어진 문자열(value)을 갖는 String인스턴스를 생성한다.
		char[] c2 = {'H','e','l','l','o'}; //char[] c2에 담긴 배열을 String객체s2에 담는다.
		String s2 = new String(c2);
		System.out.println(s2);
		
		//4. String(StringBuffer buf) : StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성한다.
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);// StringBuffer sb가 가지고 있는 값을 String타입 s3에 담는다.
		System.out.println(s3);
		
		//5. int compareTo(String str) : 문자열(str)과 사전순서로 비교한다. 같으면, 0을, 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i = "aaa".compareTo("aaa");//aaa와 aaa는 같으니까 0
		int i2 = "aaa".compareTo("bbb");//aaa가 bbb보다 사전순으로 이전이라 음수
		int i3 = "bbb".compareTo("aaa");//bbb가 aaa보다 사전순으로 이후라 양수
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		//6. String concat(Stringstr) : 문자열(str)을 뒤에 덧붙인다.
		String s4 = "Hello";
		String s5 = s4.concat(" World");//s4에 concat메서드를 사용해서 뒤에 World가 붙음
		System.out.println(s5);
		
		//7. boolean contains(CharSequnce s) : 지정된 문자열(s)이 포함되었는지 검사한다.
		String s6 = "abcedfg";
		boolean b = s6.contains("bc");//객체 s6에 contains메서드를 사용하여 "bc"가 있는지 검사하고 있으면 true를 반환한다.
		System.out.println(b);
		
		//8. boolean endsWith(String suffix) : 지정된 문자열(suffix)로 끝나는지 검사한다.
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");//객체 file에 endsWith메서드를 사용하여 끝에 txt로 끝나는지 검사하고 맞으면 true를 반환한다.
		System.out.println(b1);
		
		//9. boolean equals(Object obj) : 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다.
										//obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		String s7 = "Hello";
		boolean b2 =s7.equals("Hello"); //객체 s7이 가지고 있는 문자열 "Hello"를 equals메서드를 사용하여 매개변수로 받은 문자열 obj와 비교한다 같으면 true
		boolean b3 =s7.equals("hello"); 
		System.out.println(b2);
		System.out.println(b3);
		
		//10. boolean equalsIgnoreCase(String str) : 문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.
		String s8 = "Hello";
		boolean b4 = s8.equalsIgnoreCase("HELLO");//대소문자 구분없이 s8이 가지고 있는 문자열을 equalsIgnoreCase메서드를 
												  //사용하여 매개변수로 입력받은 문자열과 비교하여 같으면 true
		boolean b5 = s8.equalsIgnoreCase("hello");
		System.out.println(b4);
		System.out.println(b5);
		
		//11. int indexOf(int ch) : 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다. 못 찾으면 -1을 반환한다(index는 0부터시작)
		String s9 = "Hello";
		int idx1 = s9.indexOf('o');//4번째 인덱스에 있기떄문에 4를반환
		int idx2 = s9.indexOf('k');//객체 s9에 indexOf메서드를 사용하여 매개변수 k를 입력하고 s9에는 k가 없으므로 -1을 반환
		System.out.println(idx1);
		System.out.println(idx2);
		
		//12. int indexOf(int ch, int pos) : 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 (index)를 알려준다.
											//못찾으면 -1을 반환한다.(index는 0부터 시작)
		String s10 = "Hello";
		int idx3 = s.indexOf('e', 0);//문자e를 0번인덱스부터 찾아서 index를 알려준다.e는 1번 인덱스에 들어있음
		int idx4 = s.indexOf('e', 2);//문자e를 2번인덱스 즉 He'l'lo에서 부터 e를 찾는다  못찾았으니 -1을 반환한다.
		System.out.println(idx3);
		System.out.println(idx4);
		//13. int indexOf(String str) : 주어진 문자열이 존재하는지 확인하여 그 위치(index)를 알려준다. 없으면 -1을 반환한다.
		String ss = "ABCDEFG";
		
		int idx5 = ss.indexOf("CD");//객체 ss에 indexOf(String str)메서드를 사용하여 객체 ss에 CD가 들어있는지 확인한다.C는 2번인덱스에 있으므로 2반환
		System.out.println(idx5);
		
		//14.String intern() : 문자열을 상수풀(constant pool)에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을 경우 그문자열의 주소값을 반환한다.
		String ss1 = new String("abc");
		String ss2 = new String("abc");
		boolean b6 = (ss1==ss2);//생성된 객체는 주소가 다르고 참조변수는 주소값을 비교하므로 false가 나온다
		boolean b7 = ss1.equals(ss2);// String 클래스에서 오버라이드된 equals가 문자열의 값을 비교하는데 ss1과 ss2의 문자열은 같기때문에 true가 나온다
		boolean b8 = (ss1.intern()==ss2.intern());//
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(ss1.intern()==ss2.intern());//주소값??이 출력이 안된다.
		
		//15. int lastIndexOf(int ch) : 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다. 못찾으면 -1을 반환한다.
		String ss3 = "java.lang.Object";
		int idx6 = ss3.lastIndexOf('.');//객체 ss3에서 인스턴스 메서드 lastIndexOf를 호출하여 매개변수로 '.'을 넣어주는데 인덱스 끝번에서 부터 찾아서 위치를 반환한다.
		int idx7 = ss3.indexOf('.');//객체 ss3에서 인스턴스 메서드 indexOf를 호출하여 매개변수로 '.'을 넣어주는데 인덱스 첫번부터 찾아서 4를 반환한다.
		System.out.println(idx6);
		System.out.println(idx7);
		
		//16. int lastIndexOf(String str) : 지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 위치를 알려준다 못찾으면 -1을 반환한다.
		String ss4 = "java.lang.java";
		int idx8 = ss4.lastIndexOf("java");//객체 ss4의 인스턴스 메서드 lsatIndexOf(String str)을 이용하여 끝에서부터 java를 찾는다 java의 j가 10번째이기때문에 10
		int idx9 = ss4.indexOf("java");//첫번째 인덱스 부터 찾는다 첫인덱스에 java의 j가 있기때문에 0 을반환
		System.out.println(idx8);
		System.out.println(idx9);
		
		//17. int length() : 문자열의 길이를 알려준다.
		String ss5 = "Hello";
		int length = ss5.length();//인덱스는 0번부터지만 0번인덱스의 길이는 1이다 즉 4번인덱스까지 있는 "Hello"의 길이는 5
		System.out.println(length);
		
		//18. String replace(char old, char nw) : 문자열 중의 '문자'(old)를 새로운 '문자'(nw)로 바꾼 문자열을 반환한다.
		String ss6 = "Hello";
		String ss7 = ss6.replace('H', 'C');//ss6객체에 replace메서드를 이용하여 ss7에 담아준다. ss6의 H를 C로 바꾼다 "Cello"
		System.out.println(ss7);
		
		//19. String replace(CharSequence old, CharSequence nw) : 문자열 중의 문자'열'(old)를 새로운 문자'열'(nw)로 '모두'바꾼 문자열을 반환한다.
		String ss8 = "Hellollo";
		String ss9 = ss8.replace("ll", "LL");//객체 ss8에 들어있는 문자열중 모든 ll을 LL로 바꿔서 ss9에 담아준다.
		System.out.println(ss9);
		
		//20. String replaceAll(String regex, String replacement) : 문자열중에서 지정된 문자열(regex)과 일치하는 것을 새로운 문자열(replacement)로 모두변경한다.
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");//ab객체의 문자열중"BB"와 일치하는 것을 모두 "bb"로 바꿔준다. //19번과 차이점??
		System.out.println(r);
		
		//21. String repalceFirst(STring regex, String replacement) : 문자열 중에서 지정된 문자열(regex)과 일치하는 것중 첫번쨰 것만 새로운 문자열로 변경 
		String ab1 = "AABBAABB";
		String r1 = ab1.replaceFirst("BB", "bb");//인덱스 0번부터 찾아서 "BB"와 같은것을 "bb"로 바꿔준다 한번만 바꿔줘서 뒤에 "BB"는 바뀌지 않는다.
		System.out.println(r1);
		
		//22. String[] split(String regex) : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");//,가 분리자로 지정되었으므로 dog이 0번 배열에 담기고 cat이 1번배열, bear가 2번배열에 담긴 길이 3인 배열이 된다.
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		//23. String[] split(STring regex, int limit) : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아반환한다.
														//단, 문자열 전체를 지정된 수 (limit)로 자른다.
		String animals1 = "dog,cat,bear";
		String[] arr1 = animals1.split(",", 2);//지정된 분리자 ","만큼 나누는데 2번만 자른다. 즉 세번째 잘리는 bear는 잘리지않고 cat과 bear가 함께담기는 길이 2인배열
		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j]);
		}
		
		//24. boolean startsWith(String prefix) : 주어진 문자열(prefix)로 시작하는지 검사한다.
		String ss10 = "java.lang.Object";
		boolean b9 = ss10.startsWith("java");//객체 ss10에 startsWith메서드를 호출하여 "java"로 시작하는지 검사하는데 맞으니까 true
		boolean b10 = ss10.startsWith("lang");// lang으로 시작하지 않으므로 false
		System.out.println(b9);
		System.out.println(b10);
		
		//25.String substring(int begin)
		//	 String substring(int begin, int end) : 주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 얻는다. 이 때, 시작위치의 문자는 범위에 포함되지만
													// 끝위치의 문자는 포함되지 않는다.(begin <= x <end)
		String sss = "java.lang.Object";
		String c = sss.substring(10);//10번 인덱스인 Object부터 끝위치에 포함된 인덱스 까지 해서 Object가 출력
		String p = sss.substring(5, 9);// 5번인덱스부터 9번인덱스 미만 으로 출력되니까 9번인덱스인 '.'전까지 lang출력
		System.out.println(c);
		System.out.println(p);
		
		//26. String toLowerCase() : String 인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
		String sss1 = "Hello";
		String sss2 = sss1.toLowerCase();//sss1의 문자열 "Hello"를 toLowerCase메서드를 이용하여 모두 소문자로 변환하고 sss2에 담아준다.
		System.out.println(sss2);
		
		//27. String toString() : String인스턴스에 저장되어 있는 문자열을 반환한다.
		String sss3 = "Hello";
		String sss4 = sss3.toString();// 객체 sss3에 담긴 문자열을 toString메서드를 이용하여 반환하고 sss4에 담는다.
		System.out.println(sss4);
		
		//28. String toUpperCase() : String 인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환한다 (toLowerCase)반대
		String sss5 = "Hello";
		String sss6 = sss5.toUpperCase();
		System.out.println(sss6);
		
		//29. String trim() 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이때 문자열 중간에 있는 공백은 제거되지 않는다.(좌우 끝만)
		String sss7 = "\t Hello     World 	 ";
		String sss8 = sss7.trim();
		System.out.println(sss8);
		
		//30.static String valueOf(boolean b) : 지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우, toString()을 호출한 결과를 반환한다.
		String bb = String.valueOf(true);
		System.out.println(bb);//문자열 true가 찍힌다.
		
		//30.static String valueOf(char c) 
		String c3 = String.valueOf('a');//문자 a가 문자열 a로 반환
		System.out.println(c3);
		
		//30.static String valueOf(int i) 
		String i1 = String.valueOf(100);// 정수값 100을 인자값으로 줬지만 문자열로 변환하여 100이 반환됌
		System.out.println(i1);//
		
		//30.static String valueOf(long l)
		String l = String.valueOf(100L);//롱타입 100L을 인자값으로 줬지만 문자열로 100을 반환한다.
		System.out.println(l);
		
		//30.static String valueOf(float f)
		String f = String.valueOf(10f);//float타입 10f를 인자값으로 줬지만 문자열 10.0으로 반환한다.
		System.out.println(f);
		
		//30.static String valueOf(double d) 
		String d = String.valueOf(10);//double 타입 10을 인자값으로 줬지만 문자열 10.0으로 반환한다.
		System.out.println(d);
		
		//30.static String valueOf(Object o) : 지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우, toString()을 호출한 결과를 반환한다.
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);//시간타입 객체 dd를 valueOf(Object o)에 인자값으로 dd를 주고 String 타입 date에 담는다.
		System.out.println(date);
		
		
		
		
		
		//Oracle에도 있는 것들
		//1. String concat() : 문자열을 뒤에 덧붙인다.
		String ssss = s1.concat(" Oracle");
		System.out.println(ssss);
		
		//2. boolean contains() : 지정된 문자열을 포함하고 있는지 확인
		System.out.println(ssss.contains("Or"));
		
		//확장자 처리에 유용한 것
		//1. endsWith : 지정된 문자열로 끝나닌지 확인
		System.out.println(ssss.endsWith("cle"));
		
		//그외
		//1. lastIndexOf : 지정된 문자 또는 문자코드 문자열의 오른쪽 끝에서 부터 찾아서
		//					해당 문자열이 있는 위치를 반환한다. 못찾으면 -1을 반환
		System.out.println(ssss.lastIndexOf("O"));//Hello Oracle
		
		//2. replace() : 문자열 중의 문자를 새로운 문자로 변환
		String ssss1 = ssss.replace("Oracle", "Java");
		System.out.println(ssss1);
		
		//3. split() : 문자열을 지정된 분리자로 나누어 문자열형 배열에 담는다.
		String ssss2 = "aaa,444,dded,232";
		String[] ssss3 =ssss2.split(",");
		System.out.println(Arrays.toString(ssss3));
		
		//4. String subString() : 주어진 문자열을 시작부터 끝 위치 범위에 포함된 문자열을 얻는다.
		// 앞에는 포함 뒤에는 미포함
		String ssss5 = "박서경연대기.hwp";
		String ssss4 = ssss5.substring(ssss5.lastIndexOf(".")+1, ssss5.length());
		System.out.println(ssss4);
		
		//5. String trim() : 문자열의 양 끝의 공백을 제거한다.
		String ssss6 = "      i d 입 력 					";
		String ssss7 = ssss6.trim();
		System.out.println(ssss7);
		
		
		
		
		
		
		
	}

}
