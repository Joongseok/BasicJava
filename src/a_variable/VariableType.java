package a_variable;

public class VariableType {
	public static void main(String[] args){
		
		/*
		변수의 타입
		
		 1.기본형 타입(primitive type)
		  -boolean, char, byte, short, int, long, float, double

		 2.참조형 타입(reference type)
		  - 주소를 저장하는데 사용된다.
		  - 4byte의 저장공간을 가진다.
		  
		VariableType a; 참조형 타입  
		 
		*/
		
		// 정수  50을 저장할 수 있는 변수를 선언 및 초기화 해주세요
//		int a;변수의 선언
//		[변수타입][변수명]
//		a = 50;  변수의 초기화 두번쨰부터는 변경
//		int a = 50; <=대입연산자
		
		/*
		 1. 종류
		 - 논리형 : true, false 중 하나의 값을 가진다. ex) boolean
		 - 문자형 : 단 하나의 문자를 저장한다. ex) char
		 - 정수형 : 정수만 저장 가능하다. ex) byte, short, int, long 
		 - 실수형 : 실수를 저장 가능하다. ex) float, double
		 
		 2. 기본형 변수의 크기(1byte = 8bit)
		 - 1byte : boolean, byte
		 - 2byte : char,short
		 - 4byte : float,int
		 - 8byte : double,long
		 
		
		*/
		//변수명 power 값은 true를 저장해주세요
		boolean power = true;
		//변수명 lang 값은 : 'A'
		char lang = 'A';
		
		
		
		/*
		 * 3. 논리형 - boolean (기본값 false)
		 *  - boolean형 변수에는 true와 false중 하나를 저장할 수 있다.
		 *  - boolean형 변수는 대답(yse, no), 스위치(ON/OFF)등의 논리구조에 주로 사용된다.
		 *  - 데이터를 다루는 최소단위가 1byte임으로 1byte의 크기를 가진다.
		 */
//		변수명 answer, 값은 true
		
		boolean answer = true;
		
		/*
		 * 4. 문자형 - char
		 *  - java는 Unicode문자 체게를 이용하기 떄문에 2byte의 크기를 가진다.
		 *  - 'A'
		 */
		char c = 'A';
		char d = '\u0041';
		char e =  65;
		System.out.println(d);
		
		/*
		 * 5. 정수형 - byte, short, int, long
		 * - 기본 자료형은 int이다.
		 * - 변수에 저장하려는 정수값의 범위에 따라 4개의 정수형중 하나를 선택하면 된다.
		 * - byte, short의 경우 크기가 작아서 범위를 넘어서는 경우가 많다.
		 * 그래서 대표형인 int형을 많이 사용한다. 자바는 기본적으로 4byte로 변형해서 사용한다.
		 */
		
//		정수값 50을 저장할수 있는 변수를 선언 및 초기화 하세요
//		정수값 30000을 저장할 수 있는 변수를 선언 및 초기화 하세요
//		정수값 1000000을 저장할수 있는 변수를 선언 및 초기화 하세요
//		정수값 5000000000을 저장할 수 있는 변수를 선언 및 초기화 하세요
		
		byte a = 50;
		short b = 30000;
		int c2 = 1000000;
		long d2 = 5000000000L;
		
		byte qq = 126;
		System.out.println(qq);//126
		qq++;
		System.out.println(qq);//127
		qq++;
		System.out.println(qq);//-128
		qq++;
		System.out.println(qq); //-127
		
		//overflow 
		//변수가 자신이 저장할 범위를 넘었을때 최소값부터 다시 표현하는 현상
		
		/*
		 * 6. 실수형 - float, double
		 * -실수를 저장하는데 사용된다.
		 * -float : 1+8+23
		 * double : 1+11+52
		 * -실수형중 사용할 자료형을 선택할때는 값의 범위만이 아닌
		 * 정밀도도 중요한 요소가 된다.
		 * 
		 */
		//3.141592254862 float타입의 변수에 저장하세요
		float a3 = 3.14159254862f;
		//3.141592254862 double타입의 변수에 저장하세요
		double b3 = 3.14159254862;
		
		System.out.println(b3);
		
		System.out.println(0.1 == 0.1f);
		System.out.println(0.5 == 0.5f);
		
		/*
		 * 7. String : 문자열
		 * - 기본값(default) : null
		 * 
		 */
		String name = "";
		System.out.println(name);
		
		String a4 = 7+"5";
		System.out.println(a4);
		
		String s4 = " " + 7;
		System.out.println(s4);
		
		String a5 = 7 + 7 + "6";
		System.out.println(a5);
		
		String a6 = 7 + "6" + 7;
		System.out.println(a6);
		
		String s7 = "hi"+true;
		System.out.println(s7);
		
		int i3 = 67;
		byte b7 = (byte)i3;
		
		short s3 = (short)i3;
		
		long l3 = i3;
		
		/*
		 * 기본형의 형변환
		 * 
		 * byte ---> short ---> int ---> long --- > float ---> double
		 * 						 ^
		 * 			 char -------|
		 * 
		 */
		
		// 45.67과 23.1432의 합에서 정수 부분만 저장해 주세요
		
		float u = 45.67f;
		float u2 = 23.1432f;
		int u4 = (int) (u + u2);
		System.out.println(u4);
		
		//1. 'F' 를 변수에 저장해주세요aa1
			char aa1 = 'F';	
		//2. 3.14592를 변수에 저장해주세요aa2
			float aa2 = 3.141592f;
		//3. aa1과 aa2를 더했을때 결과를 문자로 만들어주세요
			char aa3 =  (char)(aa1 + aa2);
			System.out.println(aa3);
		
		
		
	}

}
