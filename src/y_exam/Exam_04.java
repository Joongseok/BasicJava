package y_exam;

public class Exam_04 {
	public static void main(String[] args){
//
//	[4-1] 다음의 문장들을 조건식으로 표현하라.
//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
//		않을 때 true인 조건식
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		/*
		 1-1. int x = (int)(Math.random()*30);
		 system.out.println(x);
		 if(x>10 && 20 > x){
		 		system.out.println("true);
		 	}else{
		 		system.out.println("false")
		 int x = (int)(Math.random()*30);
			System.out.println(x);
			boolean b = (x>10 && x<20);
			System.out.println(b);
		  	}//random으로 변수값 x를 설정해주고 x가 10보다 크고 20보다 작을때 true가 나오고 그외의 숫자는 false가 나오도록 설정.
		  1-2.	char ch= '1' ;
					if(' ' != ch && ch !='\t'){
						System.out.println("true");
					}else {
						System.out.println("false");
				}
		  1-3.	char ch= 'x' ;
					if('x' == ch || ch =='X'){
						System.out.println("true");
					}else {
						System.out.println("false");
				}
		  1-4.	char ch= '0' ;
					if('0' <= ch && ch <='X'){
						System.out.println("true");
					}else {
						System.out.println("false");
				}
		  1-5.	char ch= '0' ;
					if('a' <= ch && ch <='z'|| 'A'<=ch && ch<='Z' ){
						System.out.println("true");
					}else {
						System.out.println("false");
				}
		  1-6.	int year= 480 ;
		  			system.out.println(year);
					if((year%400==0 || year%4==0)&& year%100 !=0){
						System.out.println("true");
					}else {
						System.out.println("false");
				}
		  1-7.	boolean powerOn = false ;
					if(!powerOn){
						System.out.println("true");
					}else {
						System.out.println("false");
				}
				String str = "yes";
					if(str.equals("yes")){
						System.out.println("true");
				}
		  
		 */
		
//	[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int hop = 0;
			for(int num = 1; num<=20; num++){
				if(!(num%3==0 || num%2==0)){
					hop = hop+=num;
				}
			}
			System.out.println(hop);
//		총합변수를 선언 및 초기화> 조건문 변수 1부터니까 1; 20까지 니까 <=20; 그리고 증감++> 조건문 2또는 3의 배수가 아닌수(if!(num%3==0||num%2==0))
//		총합 변수를 if안에 재선언 합+= num;으로 합을 계산
//		하고 총합을 구한것을 for문 밖에 println으로 출력
		
//	[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
	int sum = 0;//결과값를 담을수 있는 변수 
 		 for(int num=1; num<11; num++){//괄호를 10번  회전시킬 반복문
			 	for(int num2= 1; num2<num+1; num2++){//괄호 안의 숫자를 반복 num+1번만큼  증가시킬 반복문 처음
			 		sum+=num2;
			 	}
			 		System.out.println(sum);
			 }
//	해설: 합계를 구하는 문제이다 .
//		괄호 안의 숫자를 반복증가시킬 반복문 처음 sum = sum(0)+num2(1) > sum(1)= sum(1)+num2(2) >sum(3)=sum(3)+num2(3)
//		for안에 for문이 돌아간다. 답은 220
		
//	[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이            		==못푼거==
//	100이상이 되는지 구하시오.100까지 구하는건가? 
		int sum2 = 0; // 총합을 저장할 변수
		int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
		int num3 = 0;
		for(int i=1; sum2 < 100; i++, s=-s) {
			num3 = i * s;
			sum2 += num3;
		}
		System.out.println(num3);
		
//	[4-5] 다음의 for문을 while문으로 변경하시오.										 ==다시풀기==
				for(int i=0; i<=10; i++) {
					for(int j=0; j<=i; j++)
						System.out.print("*");
					System.out.println();
				}
//		4-5해석
		int i1 = 0;
			while(i1<=10){
				int j = 0;
				while(j<=i1){//j가 i와 같아질때까지 ++
					j++;
					System.out.print("*");
			}
				i1++;//i++되고prinln으로 한줄 넘김
				System.out.println();
		}
////		j++* > 안에 반복문 나와서 i++ println > 다시 안에 반복문 j<=i비교 하고 i크기만큼 j++하면서 *찍어줌
		
		
//	[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
//	로그램을 작성하시오.
		for(int x=1; x<=6; x++){
			for(int y=1; y<=6; y++){
				if(x+y==6){
					System.out.println("x"+x+"+"+y+"y");
				}
			}
		}
//		해설 : 맨윗줄 for문에서 두개의 주사위중 하나인 int x를 선언해주고 합이 6이니까 x가 6과 같아질때 까지 증감하는 조건식을 입력한다.
//			  중괄호안에 두번째 주사위인 int y를 for문으로 선언해주고 합이 6이니까 y가 6과 같아질대 까지 증감하는 조건식을 만든다.
//			  중괄호를 다시 열어 if문의 조건식을 선언해주는데 이때 x+y==6과 같을때 print값을 출력하도록 x+y를 넣어준다.

//	[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
//	코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
				int value = (int)(Math.random()*6+1);
					System.out.println("value:"+value);
//			해설 : int 형 value를 선언해주고 그안에 Math.random식을 넣어준다. 그뒤에 1~6까지니까 *6+1을 해준다(0~7일때는 *7)그리고 int형으로 바꾸지않으면
//			랜덤식은 0<=x<1이어서 소수점이 출력되는 실수형 변수이기때문에 정수형인 int로 형변환 해준다.

//	[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
//	0<=x<=10, 0<=y<=10 이다.
	for(int x = 0; x < 11; x++){//10까지니까 11로
		for(int y = 0; y < 11; y++){
			if(x*2+y*4==10){//x2+y4가  10이라면 출력 하니까 다른 값들은 출력되지않음
				System.out.println(x + "," + y);
			}
		}
	}
//	[실행결과]
//	x=1, y=2
//	x=3, y=1
//	x=5, y=0

		
		
//			
//	[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
//	드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
//	어야 한다. (1)에 알맞은 코드를 넣으시오.
//	[Hint] String클래스의 charAt(int i)을 사용
			String str = "12345";
				int sum3 = 0;
				for(int i2=0; i2 < str.length(); i2++) {
					sum3 += str.charAt(i2) - '0';
				}
				System.out.println("sum="+sum3);
//	[실행결과]
//	15
//	[4-9]해설 : 문자코드 '0'번은 48이고 charAt(i)번은 '1'이다 '1'의 문자코드는 49 니까 1더해지고
//				'2'는 50이니까 50-48 은 2 '3'은 51이니까 51-48 하면 3 '4'는 51, 51-48 4
//				이렇게 모두 더하면 15가 된다.
//	[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
//	완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
//	에 알맞은 코드를 넣으시오.
//	[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
			int num5 = 12345;
			int sum4 = 0;
				while(num5 > 0) {
					sum4 += num5%10;
					num5 /= 10;
				}
				System.out.println("sum4="+sum4);
//	해석: int num = 12345;
//		 int sum = 0;
//			while(num>0){
//				sum += num%10;// 나머지 10 한 값을 sum에 저장 12345의 나머지는 5 > 1234중 나머지 는 4
//				num /= 10;//12345/10하면  1234가 나옴5는 나머지 num이 0보다 크니까 다시 반복 > 1234/10 하니까 123
//			}
//	System.out.println("sum="+sum);
//	[실행결과]
//	15
		
//	[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가 						 ===다시풀기==
//	는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
//	1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
//	시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
	 			//Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
				int num6 = 1;
				int num7 = 1;
				int num8 = 0; // 세번째 값
					System.out.print(num6+","+num7);
				for (int i3 = 0 ; i3 < 8 ; i3++ ) {
					num8 = num6 + num7; // . 세번째 값은 첫번째와 두번째 값을 더해서 얻는다
					System.out.print(","+num8); // 세 번째 수열 출력
					num6 = num7; // . 두 번째 수열을 첫 번째 값으로 한다
					num7 = num8; // . 세 번째 수열을 두 번째 값
				}

//	[실행결과]
//	1,1,2,3,5,8,13,21,34,55
//		[4-11] 해석
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0; // 세번째 값
//			System.out.print(num1+","+num2);//
//		for (int i = 0 ; i < 8 ; i++ ) {
//			num3 = num1+num2;//1+1=2 > 3+//num2가 num3값인 2로 초기화  됐기떄문에  2+1
//			System.out.print(","+num3);// 위에 1,1출력 된뒤 num1+num2값은 2출력 > 3
//			num1 = num2;//num 1을 num 2로 초기화 > num 2의 값인 2로 num1을 초기화
//			num2 = num3;//num 2 를 num 3으로 초기화 >  num2값은 2가됌 > num3은 3 이됐고 num2에 num3값을 초기화 해줌
//		}
//			
		
		
//	[4-12] 구구단의 일부분을 다음과 같이 출력하시오.
		for(int i9=1; i9<10; i9++)// 9단까지 반복할 반복문
			for(int j=1; j<4; j++){//뒤에 3까지 곱하면서 반복될 반복문
				System.out.println(i9+"*" + j + "="+j*i9);
		}
//		[실행결과]
//	2*1=2 3*1=3 4*1=4
//	2*2=4 3*2=6 4*2=8
//	2*3=6 3*3=9 4*3=12
//	5*1=5 6*1=6 7*1=7
//	5*2=10 6*2=12 7*2=14
//	5*3=15 6*3=18 7*3=21
//	8*1=8 9*1=9
//	8*2=16 9*2=18
//	8*3=24 9*3=27

//	[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞				==못푼거==
//	은 코드를 넣어서 프로그램을 완성하시오. 										
				String value1 = "12o34";
				char ch5 = ' ';
				boolean isNumber = true;
				// 반복문과 charAt(int i)를 이용해서 문자열의 문자를하나씩 읽어서 검사한다.
					for(int i=0; i < value1.length() ;i++) {
							ch5 = value1.charAt(i);
							if(!('0'<=ch5 && ch5<='9')) {//'0'~'9'보다 작지않으면 false되고 break
								isNumber = false;
								break;
							}
					}
					if (isNumber) {
						System.out.println(value1+"는 숫자입니다.");
					} else {
						System.out.println(value1+"는 숫자가 아닙니다.");
					}
//	[실행결과]
//	12o34는 숫자가 아닙니다.

//	[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력           		==못푼거==
//	해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
//	신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
//	게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
//	로그램을 완성하시오.
//	[연습문제]/ch4/Exercise4_14.java
//				// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
				int answer = (int)(Math.random()*100)+1;
				int input = 0; // 사용자입력을 저장할 공간
				int count = 0; // 시도횟수를 세기위한 변수

//				// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
				java.util.Scanner s2 = new java.util.Scanner(System.in);

				do {
					count++;
					System.out.print("1과 100사이의 값을 입력하세요 :");
					input = s2.nextInt(); // 입력받은 값을 변수 input에 저장한다.

					if(answer > input) {
						System.out.println(" ."); //더 큰 수를 입력하세요
					} else if(answer < input) {
						System.out.println(" ."); //더 작은 수를 입력하세요
					} else {
						System.out.println(" ."); //맞췄습니다
						System.out.println(" "+count+" ."); //시도횟수는 번입니다
						break; // do-while문을 벗어난다
				}
				}while(true); // 무한반복문

//	[실행결과]
//	1과 100사이의 값을 입력하세요 :50
//	더 큰 수를 입력하세요.
//	1과 100사이의 값을 입력하세요 :75
//	더 큰 수를 입력하세요.
//	1과 100사이의 값을 입력하세요 :87
//	더 작은 수를 입력하세요.
//	1과 100사이의 값을 입력하세요 :80
//	더 작은 수를 입력하세요.
//	1과 100사이의 값을 입력하세요 :77
//	더 작은 수를 입력하세요.
//	1과 100사이의 값을 입력하세요 :76
//	맞췄습니다.
//	시도횟수는 6번입니다.

//	[4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽		==못푼거==
//	어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
//	다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//	[Hint] 나머지 연산자를 이용하시오.

//	[연습문제]/ch4/Exercise4_15.java
				int number = 12321;
				int tmp = number;
				int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
				while(tmp !=0) {
					result = result*10 + tmp % 10; // 10 . 기존 결과에 을 곱해서 더한다
					tmp /= 10;
				}
				if(number == result)
					System.out.println( number + "는 회문수 입니다.");
				else
					System.out.println( number + "는 회문수가 아닙니다.");
//	
//	[실행결과]
//	12321는 회문수 입니다
				
	}
}

