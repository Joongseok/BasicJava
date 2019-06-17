package y_exam;

public class Exam_02 {
	public static void main(String[] args){

		/*
		
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		
		크 기     1 byte  2 byte  4 byte  8 byte
		종 류	
		논리형 : boolean
		문자형 : 			char
		정수형 : byte		short	int		long
		실수형 : 					float	double
		
		*/
		
//		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
//		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
//		초기화 하는 한 줄의 코드를 적으시오.
		long regNo = 9503071000000L;
		int regNo1 =950307100;
		
							
//		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
//		int i = 100;
//		long l =100L;
//		final float PI = 3.14f;
//		- 리터럴 : i = 100, l = 100L, PI = 3.14f
//		- 변수 : i = int, l = long 
//		- 키워드 : int = i, long = l, float = PI final 
//		- 상수 :	float PI = final			
		
		
//		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
//		a. int(기본형중 정수형4byte)
//		b. Byte(Java는 대소문자를 구분하므로 byte가 맞다.)
//		c. double(기본형중 실수형8byte)
//		d. boolean(기본형중 논리형1byte)
//		답 : b
		
		
//		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
//		류’라고 적으시오.
//		System.out.println(“1” + “2”) → (String + String => "1"+"2" => 12)
//		System.out.println(true + “”) → (boolean + String => String+String => "true"+"" => true)
//		System.out.println(‘A' + 'B') → (char + char => int A = 'A' = 65, int B = 'B' = 66 => 65 + 66 => 131 )
//		System.out.println('1' + 2) → (char + int => int + int => int = '1' = 49 = > 49 + 2 => 51)
//		System.out.println('1' + '2') → (char + char => int+int => int = '1' = 49, int = '2' =50 => 49 + 50 => 99)
//		System.out.println('J' + “ava”) → (char + String => String+String => "J" + "ava" => Java)
//		System.out.println(true + null) → (오류)(출력이 되려면 문자열인 null안에 더블쿼터""가 들어가야 한다.)
//		(boolean + String => String+Stirng => "true" + "null" => truenull )
		
		int A = 'A';//65
		int B = 'B';//66
		int A1 = '1';//49
		System.out.println("1" + "2");//12
		System.out.println(true + "");//true
		System.out.println('A' + 'B');//131
		System.out.println('1' + 2);//51
		System.out.println('1' + '2');//99
		System.out.println('J' + "ava");//Java
		System.out.println(true + "null");//truenull
		
//		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
//		a. if
//		b. True(키워드가 되려면 소문자t가 되어야한다)
//		c. NULL(키워드가 되려면 소문자 null이 되어야한다)
//		d. Class(키워드가 되려면 소문자 c가 되어야한다)
//		e. System(키워드가 아니다)
//		if, True, NULL, Class, System
//		답 : b, c, d, e
		
//		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
//		a. $ystem(가능)
//		b. channel#5(특수기호는 '_'와 '$'만 사용할수 있다. #은 사용 할수 없으므로 불가능)
//		c. 7eleven(첫글자에 숫자들가서는 안되므로 불가능)
//		d. If(가능하지만 개발자의 암묵적인 약속에따라 권하지 않음)
//		e. 자바(가능하지만 개발자의 암묵적인 약속에따라 권하지 않음)
//		f. new(예약어는 변수로 사용할 수 없으므로 불가능)
//		g. $MAX_NUM(상수에서 사용하는 것이다.)
//		h. hello@com(특수기호는 '_'와 '$'만 사용할수있으므로 @은 불가능)
//		int channel#5 = 1; int 7eleven = 1; int If = 1; int 자바 = 1; int new = 1; int $MAX_NUM = 1; int hello@com = 1;
//		답 : a, d, e, g
		
//		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? 
//			  (모두 고르시오)
//		a. int(4byte = 32bit)
//		b. long(8byte = 64bit)
//		c. short(2byte = 16bit)
//		d. float(4byte = 32bit)
//		e. double(8byte = 64bit)
//		참조형 변수는 4byte이다.(32bit)
//		답 : a, d
		

		
		
//		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;

//		a. b = (byte)i; 		=>  byte의 크기는 1byte이고 int의 크기는 4byte이므로 int가 더 크기때문에 작은값으로 변환을 할때 필요한(변환타입)을 사용해주어야 한다.
//									b = (byte)i;를 해주면 i의 값인 100이 출력된다.
		
//		b. ch = (char)b; 		=>  1byte인 byte가 2byte인 char로 변환할때는 char의 크기가 더 크니까 (변환타입)을 생략하고 형변환이 가능할꺼같지만
//									출력해보니 오류가 나오는것으로 보아 문자형 char 2byte보다 큰 int나 long으로 정수형변환을 할때는 (변환타입)을 사용하지 않아도 되지만
//									정수형인 int형에서 문자형인 char형으로 형변환을 할때는 (변환타입)을 표시해주어야 하는게 규칙인거 같다.(나의생각)
//									정수형 10을 char형으로 변환하면 '\n'(구글 아스키코드 참조:NL line feed)이 출력이 된다. 
//									컴파일 했을때 아무것도 출력이 되지 않는것 같지만 사실 ch = '\n';이였던 것이다.
		
//		c. short s = (short)ch; =>  short와 char는 둘다 2byte는 맞지만 short는 최소값이 -부터 시작하고 char는 최소값이 0부터 시작한다. 
//									그래서 char의 범위 값이 short를 초과한다.
//									범위를 초과한 char를 보다작은 short로 변환하는것이기 때문에 작은타입으로 변환할때 필요한 (변환타입)을 만들고서 컴파일 해주어야 한다.
//									정수형인 short로 변환된 char 'A'의 정수값은 65이므로 short = s는 정수값 65로 출력이 된다.  
		
//		d. float f = (float)l;  =>  4byte인 float보다  8byte인 long이 더 크므로 작은 크기를 가진 float으로 형변환을 하려면 (변환타입)을 만들고 컴파일을 해주어야한다고 착각할 수도 있다.
//									그러나 기본형의 형변환 순서에 따라서 long보다 float이 우위에 있으므로 우위에 있는 변수로 형변환 할때는 (변환타입)이 필요하지 않다.
//									그러므로 long타입에서 float타입으로 형변환을 할때는 (변환타입)을 생략하여도 된다.
//									실수타입인 float으로 변환하여 주므로 정수 1000이 아닌 소수점이 추가된 실수 1000.0이 출력이 된다.
//									byte ---> short ---> int ---> long --- > float ---> double
//									  					  ^
//									  		  char -------|
									 		
//		e. i = (int)ch;			=>  2byte인 char값을 4byte인 int로 형변환 하는것이기 때문에 (변환타입)을 사용하지 않아도 변환할 수 있다.
//									문자형인 char 'A'의 정수값은 65이므로 int i는 정수값 65로 출력이 된다.
//		int p = 10;
//		char p1 = 'A';
//		p1 = p;
		
//		b = (byte)i;
//		System.out.println(b);
//		i b = '10';
////		char ch = 'A';// 정수로 변환하면 65
////		ch = b;//65 = 10;
//		ch = (char)b;
//		System.out.println(ch);
		short s = (short)ch;
		System.out.println(s);
		float f = l;
		System.out.println(f);
		i = ch;
		System.out.println(i);
		
//		답 : d,e
		
//		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
//		char = 2byte = 16bit = 캐릭터형은 0부터 시작하고 부호가 없기때문에 0~2^16-1이다 -1은 0이 숫자에 포함되어 있기때문에 -1을 해준다.
//		같은 크기인 short는 부호가 있기때문에 bit1을 부호에 할당하여 -2^15~2^15-1이다.
//		
//		답 : 0~2^16-1
		
//		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
//		a. byte b = 256; 	   => byte = 1byte = 16bit의 최대값은 127이다. 
//							   a문제와 같이 선언하고 초기화를 하면 오류가 나온다. 127에서 계속 ++연산자를 사용하여 코딩해도 overflow이기때문에 제대로된 값이 출력되지 않는다. 
//		b. char c = '';		   => char를 선언하고 초기화 할때는 반드시 1글자가 들어가야 하기때문에 아무것도 쓰지않고 초기화를 하면 오류가 나온다.하지만 String은 가능하다. 
//		c. char answer = 'no'; => char를 선언하고 초기화 할때는 반드시 1글자만 들어가야한다. 'no'는 두글자이기때문에 오류가 나온다.
//		d. float f = 3.14	   => 실수타입 변수 float을 초기화 할때는 반드시 숫자마지막에 f를 넣어주어야한다.그리고 ; 초기화 끝에 꼭 넣어주어야 한다.
//								   실수 변수의 기본값이기 때문에 double은 숫자뒤에 붙이지않아도 된다.
//		e. double d = 1.4e3f;  => e는 10의 제곱의 수다. e3이기 떄문에 1.410^3이된다 f는 float의 f이다 즉 float변수로 초기화된 1.410^3값을 double = d에 초기화 하는것이다.
//								  double에 float값을 초기화한것이므로 제대로 초기화 한것이다.하지만 숫자마지막에 f를 넣지않아도 출력이 되는걸 확인할 수 있다.
//		byte qq = 256;
		System.out.println(b);
		char c = '1';
//		char answer = 'no';
		String y = "";
//		float f = 3.14
		double d = 1.4e3;
		System.out.println(d);
//		답 : a,b,c,d
		
//		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
//		a. boolean - false  => 1이면 참,0이면 거짓 양수에서의 기본값은 최소값으로 설정 되는거 같다. 기본값은 false이다(O)55페이지
//		b. char - '\u0000' => Java의 정석 29페이지 참조 char형의 최소값은 '\0000'이므로 기본값이 '\0000'이다(O)
//		c. float - 0.0 => 0.0f float일때는 숫자 끝에 f가 붙어야 하므로(X)
//		d. int - 0 => 0 -가 붙지 않은 양수일때 최소값인 0을 기본값으로 정하기 때문에 기본값은 0이다.(O)
//		e. long - 0 =>0L 변 수 long을 사용할때는 숫자 끝에 L이 붙어야 하므로 (X)
//		f. String - "" => 참조형의 기본값은 null이다.
		
		
		
	
	}

}
