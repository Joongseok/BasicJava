package d_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		
//		1. 배열(Array)이란?
//		  - !같은 타입!(int면 int만)의 여러 변수를 하나의 묶음으로 다루는 것
//		  - 3과목 점수
//		   : int mathScore = 20;
//		   : int korScore = 70;
//		   : int engScore = 60;
//		   
//		2. 배열의 선언
//		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 알리는 대괄호[]를
//		  	붙이면 된다.
//		  	
//		  	ex) 변수타입[] 변수명;
//		  		변수타입 변수명 [];
//		  		
//		3. 배열의 생성
//		  - 배열을 선언한 다음에는 배열을 생성해야 된다.
//		  - 배열 생성을 위해서는 연산자 !'new'!와 함께 배열의 !크기!를 지정해 주어야 한다.
//		  	 int[] a = new int[5];
//		  	 	int[] a1 = new int[5]{0,10,20,30,40};
		 int[] arr[] = new int[3][];
//		int[] a = new int[5];//a는 주소를 가지고있음  a= a의 주소 기본값은0 5개의 방(0부터시작)0~4
							 // 5개의 방 => a.length : 5
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		
//		for(int i= 0; i<a.length; i++){
//			System.out.println(a[i]);
//		}
		
//		// 0 : 10
//		a[0] = 0;
////		// 1 : 20
//		a[1] = 10;
////		// 2 : 30
//		a[2] = 20;
////		// 3 : 40
//		a[3] = 30;
////		// 4 : 50
//		a[4] = 40;
//		for(int i = 0; i<a.length; i++){
//			a[i] = i*10; 
//			System.out.println(a[i]);
//		}
		
		
//		int[] b = new int[]{0,10,20,30,40};
//		for(int i = 0 ; i< b.length; i++){
//			System.out.println(b[i]);
////		}
//		int[]b;
//		b = new int[]{0,10,20,30,40};
//		for(int i = 0 ; i< b.length; i++){
//			System.out.println(b[i]);
//		}
		
//		int[] c = {0,10,20,30,40};//생략되면 두개로 분열을 못한다. 생성하고 선언이불가능
		
		//1. 7개의 정수값을 저장할수 있는 변수 score를 선언 및 생성해주세요
		int[] score = new int[7];// 7개의 방 => a.length : 7
		//2. score변수 각방의 값을 출력해주세요
//		System.out.println(d[0]);
//		System.out.println(d[1]);
//		System.out.println(d[2]);
//		System.out.println(d[3]);
//		System.out.println(d[4]);
//		System.out.println(d[5]);
//		System.out.println(d[6]);
		for(int i = 0; i< score.length; i++){ 
			System.out.println(score[i]);
		}
		//3. score의 각방의 값을 0~100사이의 랜덤한 값을 저장해주세요
//		score[0]=(int)(Math.random()*101);
//		score[1]=(int)(Math.random()*101);
//		score[2]=(int)(Math.random()*101);
//		score[3]=(int)(Math.random()*101);
//		score[4]=(int)(Math.random()*101);
//		score[5]=(int)(Math.random()*101);
//		score[6]=(int)(Math.random()*101);
		for(int i = 0; i< score.length; i++){
			score[i]=(int)(Math.random()*101);
			System.out.println(score[i]);
		}
			
		//4. score 각방들의 합을 구하세요
		int sum = 0;
//		sum += score[0];
//		sum += score[1];
//		sum += score[2];
//		sum += score[3];
//		sum += score[4];
//		sum += score[5];
//		sum += score[6];
//		System.out.println(sum);
		
		for(int i = 0; i< score.length; i++){
			 sum += score[i];
		}
		System.out.println(sum);
		
		
//		5. score 모든방의 평균을 구해주세요
//			단, 소숫점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
		float avg = 0;
		avg = (int)((float) sum/score.length*100+0.5f)/100f;
		System.out.println(avg);
		//((float)sum/score.length)=>평균값*100=>+0.5f=>(int)로 소수점떨궈주고 /100f하면 소수점 2번째자리까지 출력
//		6. score방의 값중 최대값을 구하세요. socre[i]값중의 최대값?
		
		int max = score[0];
		for(int i = 1; i<score.length; i++){
			System.out.println(score[i]);
			if(max<score[i]){
				max = score[i];
				
				
			}
		}
		System.out.println("max = "+ max);
//		System.out.println(score[]);
		//max 를 0으로 초기화 한후 배열길이만큼 score가 랜덤하게 나오게 본다 if조건식 max가 ,score보다 작을때 if안으로 들어가게 해준다. 
//		if안으로 들어가게 해준후 max = score[i]로 초기화 해준다 그후 for문으로 다시 올라와서 max보다 더 큰 수만 if로 
		
//		7. score방의 값중 최소값을 구하세요
		int min = score[0];//배열score의 방중 최소값을 구하는 것이므로 int형 변수 min을 선언하고  기본값인 score[0]으로 초기화 해준다.
		for(int i = 0 ; i<score.length; i++){//반복문을 통해 배열의 값들을 뽑아낸다. 임의로 int i를 선언,초기화 해주고 score의 길이가 i보다 클때까지
											// 수행했을때 i보다 score의 길이가 더 기니까 i를 증감시켜준다. 
											// score의 길이가 i보다 클떄까지만 증감이 수행되므로 i는 score의 길이가 된다.
			System.out.println(score[i]);//눈으로 보는게 편하니까 println으로 모든 score의 배열값을 출력해준다.
			if(min >score[i]){//score의 최소값을 구할수 있는 조건식if를 만든다. score[0]인 min보다socre[i]중 작은 수만 들어갈수 있도록 조건식을 만들어주고  
				min = score[i];//true이므로 들어올 수 있었던 중괄호 안에score[i]값을  min으로 초기화 해준다. 그렇게되면  min값은 더 작은 값으로 초기화가 된후 빠져나온 상태에서 
							   //반복문 for안으로 들어가 다음 배열이 출력되고 나온값과 또 min을 비교한다. score가 더 크다면 if문 안으로 못들어가고 다시 반복문for를 수행한다.
							   // 다시 반복문 for에서 다음번 배열을 만들어 주고 그렇게 min과 배열의 길이가 끝날때까지 반복수행해준다.
							   //만일 기본값인 score[0]이 가장 작아서 배열이 끝날때까지
							   //if문으로 들어가서 초기화 할수 없었다면 그것이 가장 작은 값으로 min은 끝이난다. for문이 종료되고  min값을 확인하기 위해 
							   //for문밖의 print에서 min값을 출력하면 그값이 배열중에 최소값인 값이다.
			}
		}
		System.out.println("min = "+ min);

//		Scanner sc = new Scanner(System.in);// 콘솔창에서 입력받을수 있는 환경 구성
//		int result= sc.nextInt();//콘솔창에서 숫자열을 받을준비
//		System.out.println(result)
//		System.out.println("문자를 입력해주세요");
//		String str = sc.next();
//		System.out.println(str);
		
		
		//1. 3과목의 정수값을 저장할수 있는 변수를 선언 및 생성해주세요 threeSub
		int[] threeSub = new int[3];
		//2. 3과목의 값을 사용자로 부터 입력받으세요 
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("숫자를 입력하세요");
//		threeSub[0] = sc.nextInt();
//		System.out.println("숫자를 입력하세요");
//		threeSub[1] = sc.nextInt();
//		System.out.println("숫자를 입력하세요");
//		threeSub[2] = sc.nextInt();
		for( int i = 0; i < threeSub.length; i++){
			System.out.println("숫자를 입력해주세요");
			threeSub[i] = sc.nextInt();
		}
		//3. 3과목의 합계를 구해주세요
		int sum2 = 0;
		sum2 += threeSub[0];
		sum2 += threeSub[1];
		sum2 += threeSub[2];
		for(int i = 0; i < threeSub.length; i++){
			sum2 += threeSub[i];
		}
		System.out.println(avg);
		//4. 3과목의 평균을 구해주세요
		float avg1 = (int)((float)sum2/threeSub.length*100+0.5)/100f;
		//5. 1~45 사이의 랜덤한 정수값으로 lotto의 모든방에 입력해주세요
		//	단, 정수값은 중복되면 안된다.
		
	}

}
