package y_exam;

public class Exam_03 {
	public static void main(String[]args){
		
		
//		[3-1] 다음 연산의 결과를 적으시오.
//			class Exercise3_1 {
//		 [연습문제]/ch3/Exercise3_1.java
//				public static void main(String[] args) {
					int x = 2;
					int y = 5;
					char c = 'A'; // 'A'의 문자코드는 65
					System.out.println(1 + x << 33); //0000 0000 0000 0000 0110 1+x = 3 << 33 = 6
//					=> 1 + 2^33(4)이유는 4byte의 bit수는 32bit이기 떄문에 33번 왼쪽으로 시프트하면 한바퀴를 돌고 제자리로 돌아온다 
//					  6 = 6가 정답이다. 답은 6
					System.out.println(y >= 5 || x < 0 && x > 2);
//					=> 왼쪽부터 계산한다. 즉 y의값은 5 y가 5보다 크거나 같으면 트루 이다. 그리고 ||OR결합이므로 둘중에 하나만 맞아도 트루이다.
//					 x보다 0이 큰것은 거짓이다 그리고 2보다 x가 큰것도 거짓이다 2와 x는 같다. 오른쪽 식이 잘못되었지만 왼쪽부터 먼저 계산하는 방식으로
//					 OR결합을 했기때문에 왼쪽과 오른쪽 둘중 하나만 맞으면 트루이다. 왼쪽이 맞았기 때문에 오른쪽 값이 거짓이어도 답은 true가 나온다. 답은 true
					System.out.println(y += 10 - x++);
//					=> y += 10은  y = y + 10과 같다. 즉y += 10의 값은 15이다. 15 - x는 3일거같지만 계산할때는 -2가 된다.y = 13 x = 3
//					 ++가 숫자 뒤에 붙어있으므로 계산을 끝낸후 x의 값은 3이된다.즉 계산을 하면 15 -2 = 13 답은 13이다.
					System.out.println(x+=2);
//					=> x = x+2의 식인데 위에 문제에서 x++증감을 했기때문에 현재 x의 값은 3이다 3+2 = 5 답은 5이다.x  = 5
					System.out.println( !('A' <= c && c <='Z') );
//					=> 'A'는 변수 이름 c와 같은'A'이다 즉 'A' <= 'A'이므로 참이다. 'A'는 'Z'보다 작거나 같다.'A'는'Z'보다 작기때문에
//					 참이다.즉 결과는 true이다. 하지만 괄호앞에 논리 부정연산자인!가 붙어있기 때문에 true는 false가 된다. 즉 답은 false이다.
					System.out.println('C'-c);
//					=> 'A'의 문자코드는 65이고 'C'의 문자코드는 67이다 67-65 = 2 답은 2이다. char + char = int - int = 2
					System.out.println('5'-'0');
//					=>숫자형'5'의 문자코드는 53이다. '0'의 문자코드는 48이다. 즉 53-48 = 5 답은 5이다.
					System.out.println(c+1);
//					=> c의 값은 'A' 'A'의 문자코드는 65이다 65+1 = 66 답은 66이다. char형과 int형의 합이기 떄문에 int + int가 된다.
					System.out.println(++c);
//					=> 증감연산자는 캐릭터형에서 사용하면 문자코드 1만큼 올라간 문자형이 출력된다 즉 c의값인 'A'가 증감되어 'B'가 출력된다. 답은 'B'이다. 타입을 유지함
					System.out.println(c++);
//					=> 증감연산자가 변수이름 뒤에 붙어있기 떄문에 출력을 한뒤 변수값의 1을 증가시켜준다. 
//					 즉 앞에서 1을 증가시켰고 이번에 출력뒤에 1을 증가시키므로 c의 문자코드는 67이다. 하지만 출력되는 값은 문자코드 66인 'B'이다.		
					System.out.println(c);
//					=> 위에서 변수 c에 증감연산자가 두번 증가했기때문에 문자코드 67 문자형 'C'가 출력된다. 답은 'C'이다
//			}
//		}
		
//		[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
//		사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
//		가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
//		
//		[연습문제]/ch3/Exercise3_2.java
//		
//			class Exercise3_2 {
//				public static void main(String[] args) {
						int numOfApples = 123; // 사과의 개수
						int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
						int numOfBucket = numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket==0 ? 0: 1); // 모든 사과를 담는데 필요한 바구니의 수
						System.out.println("필요한 바구니의 수 :"+numOfBucket);
//				}
//		}
//		// (float)numOfApples/sizeOfBucket = 12.3 +0.9f = >13.2=>(int) 13
//		[실행결과]
//		13
//		numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket==0 ? 0: 1)
//					(int)((float) numOfApples/sizeOfBucket + 0.9f)
						
						
						
//						13%2==0
						
						
//		[3-3] 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
//		자를 이용해서 (1)에 알맞은 코드를 넣으시오.
//		[Hint] 삼항 연산자를 두 번 사용하라.
//		[연습문제]/ch3/Exercise3_3.java
//			class Exercise3_3 {
//				public static void main(String[] args) {
					int num = 10;
						System.out.println(num > 0 ? "양수" : num == 0 ? "0" : "음수" );
//			}//계산은 왼쪽에서 오른쪽으로 하게 되기때문에 우선 0보다  num이 크다면 양수라는 값을 구한다. 그리고 num 이 0과 같으면 '0'을 출력하고 다르면 음수를 출력하게 한다.
//			true면 0이 나오고 false면 음수가 출력되게 설정했다. num의값은 1이상일때는 양수 0이면 0 -면 음수로 출력된다.
//		}
					
//		[실행결과]
//		  양수
		
						
//		[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
//		의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
//		시오.
//		[연습문제]/ch3/Exercise3_4.java
//			class Exercise3_4 {
//				public static void main(String[] args) {
					int num1 = 456;
						System.out.println( (num1/100)*100);
//			}// 456/100 =4.56f =>int형의로 변환 하면 소숫점은 다 날아간다. 
//		}	num-num%100 = 400
//		[실행결과]
//		  400
//		
//		
//		[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
//		값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
//		[연습문제]/ch3/Exercise3_5.java
//			class Exercise3_5 {
//				public static void main(String[] args) {
					int num2 = 333;
						System.out.println( (int)(num2/10f)*10+1 );
//			}num/10f = 33.3 => (int)33 => 33*10 =330 + 1
//		} num/10*10+1
//		[실행결과]
//		  331		
						
						
//		[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
//		뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
//		다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
//		수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
//		[Hint] 나머지 연산자를 사용하라.
//		[연습문제]/ch3/Exercise3_6.java
//			class Exercise3_6 {
//				public static void main(String[] args) {
					int num3 = 24;
						System.out.println( (int)(num3/10f +0.9f)*10 %num3 );
//			}(num/10+1)*10 -num // 10-num%10
//		}				
//		[실행결과]
//		   6
//		num/10f = 2.4 +0.9 = > 3.3 =>(int) => 3 *10 = 30 %num(24) = 6
		
//		[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
//		5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
//		셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
//		[연습문제]/ch3/Exercise3_7.java
//			class Exercise3_7 {
//				public static void main(String[] args) {
					int fahrenheit = 100;
					float celcius =(int)(5/9f *(fahrenheit -32)*100 + 0.5)/100f  ;
						System.out.println("Fahrenheit:"+fahrenheit);
						System.out.println("Celcius:"+celcius);
//			}
//		}
//						
//		[실행결과]
//	Fahrenheit:100
//	Celcius:37.7
//		fahrenheit - 32 = 68 * 0.5555 =37.774 *100  =3777.4 +0.5  = 3777.9=>(int)=3777/100f =>37.77
		
						
//		[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
//		[연습문제]/ch3/Exercise3_8.java
//			class Exercise3_8 {
//				public static void main(String[] args) {
//					byte a = 10;
//					byte b = 20;
//					byte c =(byte) (a + b);//byte + byte이기떄문에  int로 바꿈
//					char ch = 'A';
//					ch = (char) (ch + 2);// ch= 'A'는 문자코드 65 'A' + 2를 하면 캐릭터형 + 정수형(기본int형 int가 더크기떄문)= 정수형 67 로 변환된다.
//						그리고 char로 캐스팅 하면 문자코드 67은 'C'이기때문에 ch값은 'C'로 초기화된다.
//					float f = 3 / 2f;// 수 뒤에 f붙여주어야 소수점까지 출력된다.
//					long l = 3000L * 3000 * 3000;//뒤에 L붙여주기 long은 숫자 뒤에L을 붙여줭야함
//					float f2 = 0.5f;//0.1f를 0.5f로 바꾼다
//					double d = 0.5;// double과 float이 같으려면 0.5,0.25이런식으로 나누어 떨어져야한다.
//					boolean result = d==f2;
//						System.out.println("c="+c);
//						System.out.println("ch="+ch);
//						System.out.println("f="+f);
//						System.out.println("l="+l);
//						System.out.println("result="+result);
//			}
//		}
//		[실행결과]
//		c=30
//		ch=C
//		f=1.5
//		l=27000000000
//		result=true

//		[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
//		의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
//		[연습문제]/ch3/Exercise3_9.java
//			class Exercise3_9 {
//				public static void main(String[] args) {
					char ch = 'z';
					boolean b = (ch>= 'a' && ch <='z' || ch>='A' && ch <='Z' || ch >= '0' && ch<='9' );
//			}
//		} ch가 'a'보다 크거나 같을때 트루 and ch가 'z'보다 작거나 같을때 트루(만일 z보다 크거나 같게 하면 'ㅎ'같은 한글도 트루가뜸) or또는 
						
		
						
//		[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
//		인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
//		들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
//		[연습문제]/ch3/Exercise3_10.java
//			class Exercise3_10 {
//				public static void main(String[] args) {
					char ch1 = 'A';
					char lowerCase = ( ch1 >='A' && ch1<='Z' ) ? ( (char)(ch1+32) ) : ch1;
						System.out.println("ch1:"+ch1);
						System.out.println("ch1 to lowerCase:"+lowerCase);
//			}//문제의 내용은 대문자가 true면 소문자 를 출력하라는 것이다. 우선lowerCase 왼쪽 식에 ch가 'A'보다 크거나 같다를 하면 참이다 ch가'Z'보다 작거나 같다 도 참이다.왜냐면 현재
//						ch는 'A'이기 떄문이다. 그러므로 true를 성립하여서 true일때 출력되는 'a'가 출력되는것이다.
//		}
//		[실행결과]
//		ch:A
//		h to lowerCase:a
//		
//		
		
		
		
		
		
		
		
	}

}
