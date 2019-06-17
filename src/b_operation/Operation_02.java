package b_operation;

public class Operation_02 {
	public static void main(String[] args) {
		
		/*
		 * 1. 증감연산자(++,--)
		 * - 증가연산자(++) : 피연산자의 값을 1 증가시킨다.
		 * - 감소연산자(--) : 피연산자의 값을 1 감소시킨다.
		 */
		
		int i1 = 3;
		i1++; // 4
		System.out.println(i1);
		++i1; // 5
		System.out.println(i1);
		
		int i2 = 5;
		int i3 = ++i2; // i2 = 6, i3=6
		
		int i4 = 4;
		int i5 = i4++;//i5 = 4, i4 = 5
		System.out.println(i4);
		System.out.println(i5);
		
		int i6 = 36;
		int i7 = 12;
		int i8 = ++i6 + ++i7 + i6++;
		System.out.println(i6);
		
		/*
		 * 2.부호연산자(+, -)
		 * -boolean형과 char형에는 사용할 수 없다.
		 * 
		 * 3.비트전환 연산자 (~)
		 * - 정수형과 char형에만 사용할 수 있다.
		 * - 피연산자를 2진수로 표현하였을때 0은 1로 1은 0으로 바꾼다. 
		 * 
		 *  10 : 00001010
		 * ~10: 11110101 => -11 1의보수
		 * ~10+1 : 11110110 => -10 10의보수
		 */
		byte b2 = 10;
		int b3 = ~b2;//-11
		System.out.println(b3);
		/*
		 4. 논리부정 연산자(!)
		 -boolean형에만 사용 가능하다.
		 -true -> false, false -> true
		 
		 */
		boolean power =false;
		System.out.println(!power);
		
		power = !power;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
		
		/*
		 5. 산술연산자
		 - 사칙연산자(+,-,*,/), 나머지 연산자(%), 쉬프트연산자(<<,>>,>>>)
		 - 이항연산자이므로 피연산자의 크기가 4byte보다 작으면 4byte형으로 변환후
		   연산을 수행한다.
		  
		  6. 사칙연산자(+,-,*,/)
		   - 두개의 피연사자중 자료형의 표현범위가 큰 쪽에 맞춰서 형변환후 연산을 수행
		   : int + float => float+ float = > float
		   
		   -int형(4byte)형보다 작은 크기의 자료형간의 연산시에는 둘다 int형으로 변환후 연산
		    : byte + char => int + int => int
		 	
		 	-나눗셈의 경우 0으로 나누는것은 금지되어 있다.
		 
		 * */
		
		int a = 10;
		long b = 30L;
		byte c = 50;
		short d = 600;
		
		//b와 c의 합을 저장할수 있는 변수 e를 만들어주세요
		long e = b + c;
		
		//c와 d의 합계를 변수 f에 저장해주세요
		int f = c + d; 
		
		//'D', '가', 3.14f의 합을 변수 g에 저장해 주세요	
		float g ='D'+'가'+3.14f;// char + char = > int + int = > int + float = > float + float = > float
		
		/*	
		 7. 나머지 연산자(%)
		   - 왼쪽의 피연산자를 오른쪽 피연산자로 나누고 난 나머지 값을 돌려준다.
		   - boolean형에는 사용할 수 없다.
		 
		 */
		int aa = 20;
		int bb = 8;
		int cc = aa/bb;// 몫은 2
		int dd = aa%bb;// 나머지는 4
		
		//20을 8로 나눈 몫은 2이고 나머지는 4이다.
		System.out.println(aa + "을 " + bb + "로 나눈 몫은 " + cc + "이고 나머지는 " + dd + "이다.");
		
		/*
		 8. 쉬프트 연산자(<<, >>, >>>)
		  - 정수형 변수에만 사용 가능하다.
		  - 10<<2 10*2^2 10>> 10/2^2
		  - 피연산자의 각자리 (2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		  - 곱셈과 나눗셈을 할때 연산 속도가 좋음으로 사용한다.
		  - << : x<<n은 x*2^n
		  - >> : x>>n은 x/2^n
		  
		 */
		
		byte bbb = 10;
		System.out.println(bbb<<3);
		/*
		 9. 비교연산자
		  - 두개의 변수 또는 리터럴을 비교하는데 사용되는 연산자
		  - 주로 조건문과 반복문의 조건식에 사용되며 연산결과는 boolean형의 결과를 얻는다.
		  - 이항연산자 이다.
		  
		  10. 대소비교 연산자(<, >, <=, >=)
		   - 기본형의 boolean형을 제외한 나머지 자료형에 사용 가능
		   
		  11. 등가비교 연산자(==, !=)
		   - 모든 자료형에 사용 가능하다.
		   
		   	   수식	 |	    연산결과
		   	  x < y  |  x가 y보다 클때만 true 그 외에는 false
		   	  x > y  |  x가 y보다 클때만 true 그 외에는 false
		   	  x <=y  |  x가 y보다 작거나 같을때만 true 그 외에는 false
		   	  x >=y  |  x가 y보다 크거나 같을때만 ture 그 외에는 false
		   	  x ==y  |  x와 y가 같을때만 true 그 외에는 false
		   	  x !=y  |  x와 y가 다를때만 true 그 외에는 false		   
		   
		  
		  
		 */
		
		System.out.println('0' == 0);
		System.out.println(0.1 == 0.1f);
		System.out.println(0.5 == 0.5f);
		
		System.out.println(5 < 3);
		
		/*
		 12. 논리연산자 (&&, || )
		  - 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만을 허용한다.
		  - &&(AND결합) : 피연산자 양쪽 모두 true일때 true의 결과를 얻는다.
		  - ||(OR결합) : 피연산자중 어느 한쪽만 true이면 true이다.
		  
		  - &&의 연산우선순위가 ||의 연산우선수위보다 높다.
		  
		  */
		int x = -10;
		//x의 값이 0이상 15이하이면 true의 결과를 얻도록 만들어 주세요
		// 0<= x <= 15
		// 0 <= x && x<=15
		boolean result = 0 <= x && x<=15;
		System.out.println("결과 : "+result);
		
		//1. 'J'를 저장할수 있는 변수 ddd를 선언 및 초기화해주세요
		char ddd = 'J';
		//ddd의 값이 영어 대문자일대 true인 조건식을 만들어주세요
		boolean result1 = 'A' <= ddd && ddd <= 'Z';
		System.out.println("결과 : "+result1);
		
		//ddd의 값이 영어 소문자일때 true인 조건식을 만들어주세요
		char ddd1 = 'j';
		boolean result2 = 'a' <= ddd1 && ddd1 <= 'z';
		System.out.println("결과 : "+result2);
		//ddd의 값이 영문자일때 true인 조건식을 만들어주세요
		//대문자이거나 소문자 ->or결합자 대문자||소문자
		//boolean result = 'A' <= ddd && ddd <= 'Z'||'a'<= ddd && ddd<='z';
		char ddd2 = 'j';
		char ddd3 = 'J';
		boolean result3 = 'a' <= ddd2 && ddd2 <='z';
		boolean result4 = 'A' <= ddd3 && ddd3 <='Z';
		boolean result5 = result3 && result4;
		System.out.println("결과 : "+result5);
		
		//ddd의 값이 숫자형일때 true인 조건식을 만들어주세요
		//숫자형은 '0'~'9' 숫자형은 캐릭터타입 =>  '0'<=ddd && ddd<='9';
//		boolean result = '0' <=ddd && ddd<='9';
		char ddd4 = 4;
		boolean result6 = '0' <= ddd4 && ddd4 <= '9';
		System.out.println("결과 : "+result6);
		
		//ddd의 값이 영문자 또는 숫자형일때 true인 조건식을 만들어주세요
		//영문자 || 숫자형 -> 'A' <= ddd && ddd <= 'Z' ||'a'<=ddd && ddd<='z' || '0' <=ddd &&ddd<='9';
		boolean result7 = result5 && result6;
		System.out.println("결과 : "+result7);
		
		
		/*
		 13.비트연산자(&,|,^)
		   -이진 비트연산을 수행한다.
		   - 실수형에는 사용할 수 없다.
		   
		   |(OR) : 피연산자중 한쪽의 값이 1이면 1의 결과를 얻는다.
		   &(AND) : 피연산자 양쪽 모두 1이면 1의 결과를 얻는다.
		   ^(XOR) : 피연산자의 값이 서로 다를때 1의 결과를 얻는다.
		   
		   3 : 00000011
		   5 : 00000101
		   3^5 : 00000110 = > 6
		   3&5 : 00000001 = > 1
		   3|5 : 00000111 = > 7
		   
		    
		  */
		System.out.println(true^false);
		
		
		/*
		 14. 삼항연산자
		 - 세개의 피연산자를 필요로 하기 떄문에 삼항 연산자로 이름 지어 졌다.
		 - 기본구조
		 	조건식 ? 식1 : 식2
		 
		 */
		//절대값 구할때 사용
		int x2 = 70;
		int result8 = x2 > 0  ? x2 : -x2;
		System.out.println(result8);
		
		// 정수값을 저장할 수있는 변수 x3에 45의 값을 저장해 주세요
		int x3 = 45;
		// x3의 값이 짝수이면 "짝수", 홀수이면 "홀수"를 저장할수 있는 변수 result8을 만들어 주세요
		//x3/2하고 나머지가 0이면 짝수이다. 식에 출력되는게 문자열이기때문에 변수타입은 문자열로 선언해준다.
		String result9 = x3%2 == 0 ? "짝수" : "홀수" ;
		System.out.println(result9);
		
		//1. 1,2,3중의 한 값을 저장할수 있는 변수 score를 선언 및 초기화 해주세요
		int score = 3;
		//2. score의 값이 1이면 '가', 2이면'나', 3이면 '다'의 값을 저장할수 있는 변수
		//	 result9을 만들어 주세요
		// scroe가 1이냐? '가' : //2또는 3 score가 2냐? '나' : '다'
		char result10 = score == 1 ? '가' : score == 2?'나' : '다';
		System.out.println(result10);
		
		/*
		15. 대입연산자( =, op=)
		   - 변수에 값 또는 수식의 연산결과를 저장하는데 사용된다.
		   - 연산자중 가장 낮은 연산우선순위를 가진다.
		  
		  
		  
		*/
		
		//1. 변수 i9에 20의 값을 저장해주세요
		int i9 = 20;
		//2. i9에 5를 더한 값을 i9에 저장해주세요
		i9 = i9 + 5 ; // => i9 += 5;
		System.out.println(i9);
		
		//3. i9을 4로 나눗셈한 결과를 i9에 저장해주세요
		i9 = i9 / 4 ;// => i9 /= 4;
		System.out.println(i9);
		/*
		 16. Math.random()= 0<= Math.rmadom()<1 1~6정수값 구하려면 1~7
		  
		  */
		int random = (int)(Math.random()*6+1);
		System.out.println(random);
		
		//1. 1~45까지의 번호중 하나를 랜덤하게 뽑아서 lotto변수에 저장해주세요
		// 1~46 => 45 시작 : 1
		int lotto = (int)(Math.random()*45+1);
		System.out.println(lotto);
		//2. 0점~100 사이의 점수중 하나를 랜덤하게 뽑아서 score2에 저장해주세요
		// 0~101  : 0
		int score2 = (int)(Math.random()*101);
		System.out.println(score2);
		
		/*
		17. 반올림
		  - 0.5이상이면 반올림 (int)+0.5
		  
		  
		 */
		float ff= 3.141592f;
		
		// 소수점 네번쨰 자리에서 반올림 하여 세번째 자리까지 표현해주세요 내가 반올림하고 싶은 소수점까지 정수로 만들어라.
		// 3.141592
		// 3.141592 * 1000 	=> 3141.592
		// 3141.592 + 0.5 	=> 3142.092
		// (int)3142.092 	=> 3142
		// 3142 / 1000f	 	=> 3.142
		
		float result11 = (int)(ff*1000+0.5)/1000f;
		
		System.out.println(result11);
		
		// 465.2653의 값을 소숫점 둘째자리에서 반올림하여 첫째자리까지 표현해주세요
		// 465.2653 * 10 => 4652.653
		// 4652.653 + 0.5 => 4653.153
		// (int)4653.153 => 4653
		// 4653 / 10f = > 465.3
		float ff1 = 465.2653f;
		
		float result12 = (int)(ff1*10+0.5)/10f;
		
		System.out.println(result12);
		
		
	}

}
