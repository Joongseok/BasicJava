package y_exam;

public class Exam_05 {
	public static void main(String[] args) {
		
//	[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명
//	하시오.
//	a. int[] arr[]; // 2차원 배열임 대입연산자와 값을 지정을 안해줘서 틀림 =new int [3][4]이런식으로 뒤에 들어가야함
//	b. int[] arr = {1,2,3,};// 3뒤의 ,쉼표는 값이 지정이 되지않아서 arr.length는 3이된다.
//	c. int[] arr = new int[5]; 다섯개의 방을 가진 arr배열이다.
//	d. int[] arr = new int[5]{1,2,3,4,5};// 이미 new int[5]로 배열이 5개 생성되었기때문에 {1,2,3,4,5};는 붙이지 않아야 한다.
//	e. int arr[5];// 대입을 안해줬다. 생성하려면 int arr[] = new int[5]; 로 생성 해줘야한다.
//	f. int[] arr[] = new int[3][];// 이차원 배열을 생성하는 것인데 가능은 하나 되도록이면 int앞에 배열을 만들어 주어야한다.
								  // 이렇게 생성하면 2차원 배열인지 알기 쉽지 않기때문에 가독성이 떨어짐.   
//	,int[]arr = new int[]{1,2,3};//b번 선언 방법 3가지
//	int[]arr = new int[3];
		
//	[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
			int[][] arr = {
			{ 5, 5, 5, 5, 5},
			{ 10, 10, 10},
			{ 20, 20, 20, 20},
			{ 30, 30}
			};		
//	해석: arr[]의 인덱스는 0부터 시작하므로 arr[3]은 {30,30}이 들어있는 곳이다. 즉 arr[3]의 length는 30값이 두개들어있으므로 2이다.
		
//	[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
				int[] arr1 = {10, 20, 30, 40, 50};
				int sum = 0;
				for (int i = 0; i < arr1.length; i++) {
					sum += arr1[i];//arr의 배열길이만큼 반복문을 반복하면서 배열안에 있는 값을 sum에 +해준다.
				}
				System.out.println("sum="+sum);
//	[실행결과]
//	sum=150
//[해석] int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;//합
//		for(int i = 0; i <arr.length; i++){
//			sum += arr[i]  ;//[i]가 arr어의 길이만큼 수행됌 i++으로 배열이 한칸씩 옮겨지는데 sum+=을 해서 배열이 옮겨질때마다의 값을 저장한다.
//		}
//			System.out.println("sum="+sum);
		
//	[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
			int[][] arr2 = {
				{ 5, 5, 5, 5, 5},//arr[0][1,2,3,4,5]번의 값
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
			};
			int total = 0;//합계를 담을 정수형 변수
			float average = 0;// 평균을 담을 실수형 변수
			for (int i = 0; i < arr2.length; i++) {// arr첫번쨰 배열의 길이
				for (int j = 0; j < arr2[i].length; j++){//{arr[][]의 길이
					total += arr2[i][j];// arr배열[][]의 값을 arr의 length만큼 반복하면서 담아준다
					average = (float)total/(arr2.length*arr2[0].length);// arr큰배열의 길이와 arr작은배열 즉 5의 길이를 곱하면
//																	//20이다 20은 방배열의 전체 길이고 그것과 total을 나누고
//																	//소수점을 출력해야 되기때문에 float형으로 캐스팅 해준다.
				}
			}
			System.out.println("total="+total);
			System.out.println("average="+average);
//	[실행결과]
//	total=325
//	average=16.25
		
//	[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
//	로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//	[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
				int[] ballArr = {1,2,3,4,5,6,7,8,9};
				int[] ball3 = new int[3];
////			// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
				for(int i=0; i< ballArr.length;i++) {//기준방
					int j = (int)(Math.random() * ballArr.length);//랜덤방 0~8인덱스까지 나중에또나옴
					int tmp = 0;//섞기 위해 그릇을 하나 더만든 변수
					tmp = ballArr[i];//자리 바꾸는 식
					ballArr[i] = ballArr[j];//자리 바꾸는 식
					ballArr[j] = tmp;//자리 바꾸는 식
				}
//			// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
			ball3[0] = ballArr[0];
			ball3[1] = ballArr[1];
			ball3[2] = ballArr[2];
			for(int i=0;i<ball3.length;i++) {
				ball3[i] = ballArr[i];
				System.out.println(ball3[i]);
				}
//	[실행결과]
//	486	
		
		
		
//	[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
//	수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
//	라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
//	프로그램을 완성하시오.
//	[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
//				// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
				int[] coinUnit = {500, 100, 50, 10};
				int money = 2680;//거슬러 줄 금액
				System.out.println("money="+money);
				for(int i=0;i<coinUnit.length;i++) {
					System.out.println(coinUnit[i]+"원 :"+ money/coinUnit[i]);//동전이 얼마나 쓰이는지 출력하고
					money %= coinUnit[i];// 출력후 나머지를 반복
				}
//	해석 : money = 2680를 500으로 나눔  'money/500' > (money %=500) > money/100 >(money %=100)> money/50 >(money %=50) money/10 > (money %=10)
				//배열의 안의 값을 이용하여 나머지
//				money/coinUnit[0] = 나머지180원 
				
//				int[] coinUnit = {500, 100, 50, 10};
//				
//				int money = 2680;//거슬러 줄 금액
//				System.out.println("money="+money);
//				
//				int sh = 0;
				
//				sh = money/coinUnit[0]; // 5
//				money -= coinUnit[0]*sh; //180
//				
//				sh = money/coinUnit[1]; // 1
//				money -= coinUnit[1]*sh; //80
//				
//				sh = money/coinUnit[2]; // 1
//				money -= coinUnit[2]*sh; //30
//				
//				sh = money/coinUnit[3]; // 3
//				money -= coinUnit[3]*sh; //0
				
//				for (int i = 0; i < coinUnit.length; i++) {
//					sh = money/coinUnit[i]; 
//					money -= coinUnit[i]*sh; 
//					
//					System.out.println(coinUnit[i]+ "원 : "+sh);
//				}
//					
//				for(int i=0;i<coinUnit.length;i++) {
//					System.out.println(coinUnit[i]+"원 :"+ money/coinUnit[i]);//동전이 얼마나 쓰이는지 출력하고
//					money %= coinUnit[i];// 출력후 나머지를 반복
//					}
//	[실행결과]
//	money=2680
//	500원: 5
//	100원: 1
//	50원: 1
//	10원: 3
				
//	[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
//	금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
//	돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불
//	한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣
//	어서 프로그램을 완성하시오.
					if(args.length!=1) {
					System.out.println("USAGE: java Exercise5_7 3120");
					System.exit(0);
					}
//				// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
				int money1 = Integer.parseInt(args[0]);
				System.out.println("money1="+money1);
				int[] coinUnit1 = {500, 100, 50, 10 }; // 동전의 단위
				int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
				for(int i=0;i<coinUnit1.length;i++) {
					int coinNum = 0;
//					1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
					coinNum = money1/coinUnit1[i];
//					2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//					(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
					if(coin[i] >= coinNum) {
						coin[i] -= coinNum;
					} else {
						coinNum = coin[i];
						coin[i] = 0;
					}
//					3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
					money1 -= coinNum*coinUnit1[i];
//					System.out.println(coinUnit[i]+"원: "+coinNum);
				}
				if(money1 > 0) {
					System.out.println("거스름돈이 부족합니다.");
					System.exit(0); // 프로그램을 종료한다.
				}
				System.out.println("=남은 동전의 개수 =");
				for(int i=0;i<coinUnit1.length;i++) {
					System.out.println(coinUnit1[i]+"원:"+coin[i]);
				}
				
//	[실행결과]
//	C:\jdk1.8\work\ch5>java Exercise5_7
//	USAGE: java Exercise5_7 3120
//	C:\jdk1.8\work\ch5>java Exercise5_7 3170
//	money=3170
//	500원: 5
//	100원: 5
//	50원: 3
//	10원: 2
//	=남은 동전의 개수 =
//	500원:0
//	100원:0
//	50원:2
//	10원:3
//	C:\jdk1.8\work\ch5>java Exercise5_7 3510
//	money=3510
//	500원: 5
//	100원: 5
//	50원: 5
//	10원: 5
//	거스름돈이 부족합니다.			
				
//		money = Integer.parseInt(args[0]);//스트링 숫자형으로 바꿔주는거
		
//	[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’				==못푼거==
//	을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
			int[] answer1 = { 1,4,4,3,1,4,4,2,1,3,2 };
			int[] counter1 = new int[4];
		
			for(int i=0; i < answer1.length;i++) {
			/* (1) 알맞은 코드를 넣어 완성하시오. */
				counter1[answer1[i]-1]++;
			}
		
			for(int i=0; i < counter1.length;i++) {
//				/*
//				(2) 알맞은 코드를 넣어 완성하시오.
//				*/
				System.out.print(counter1[i]);
		
				for(int j=0; j < counter1[i];j++) {
					System.out.print("*"); // counter[i] ‘*’ . 의 값 만큼 을 찍는다
				}
//		
				System.out.println();
			}
		
//	[실행결과]
//	3***
//	2**
//	2**
//	4****		
			
//	[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.  			==못푼거==
				char[][] star = {
					{'*','*',' ',' ',' '},
					{'*','*',' ',' ',' '},
					{'*','*','*','*','*'},
					{'*','*','*','*','*'}
				};
				char[][] result = new char[star[0].length][star.length];
				for(int i=0; i < star.length;i++) {
					for(int j=0; j < star[i].length;j++) {
						System.out.print(star[i][j]);
					}
					System.out.println();
				}
				System.out.println();
				for(int i=0; i < star.length;i++) {
					for(int j=0; j < star[i].length;j++) {
						int x = j;
						int y = star.length-1-i;
						result[x][y]=star[i][j];
					}
				}
				for(int i=0; i < result.length;i++) {
					for(int j=0; j < result[i].length;j++) {
						System.out.print(result[i][j]);
					}
					System.out.println();
				}
		
//	[실행결과]
//	**
//	**
//	*****
//	*****
//	
//	****
//	****
//	**
//	**
//	**		
//	[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열				==못푼거==
//	의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
//	에 알맞은 코드를 넣어서 완성하시오.
				int[][] score = {
						{100, 100, 100}
						, {20, 20, 20}
						, {30, 30, 30}
						, {40, 40, 40}
						, {50, 50, 50}
					};
				int[][] result1 = new int[score.length+1][score[0].length+1];
				for(int i=0; i < score.length;i++) {
					for(int j=0; j < score[i].length;j++) {
						result1[i][j] = score[i][j];
						result1[i][score[0].length] += result1[i][j];
						result1[score.length][j] += result1[i][j];
						result1[score.length][score[0].length] += result1[i][j];
					}
				}	
				for(int i=0; i < result1.length;i++) {
					for(int j=0; j < result1[i].length;j++) {
						System.out.printf("%4d",result1[i][j]);
					}
					System.out.println();
				}
//	[실행결과]
//	100 100 100 300
//	20 20 20 60
//	30 30 30 90
//	40 40 40 120
//	50 50 50 150
//	240 240 240 720
	}

}