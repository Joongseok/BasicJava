package d_array;

import java.util.Random;

public class Array_03 {
	public static void main(String[] args) {
		/*
		1. 다차원 배열
		  - 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 허용한다.
		  
		2. 2차원 배열
		  - 배열의 선언
		  int[][] a;
		  int a[][];
		  int[] a[];
		  
		  -배열의 생성
		   int[][] a = new int[3][4];
		
//		*/
////		int[][] a =new int[3][4];//[3]이 {}3개 [4]는 {0.0.0.0}[] length는 =3 {} length는 4 
//		int[][] a =new int[3][];//뒤에는 각 배열의 길이가 다를 수 있기때문에 []안에 숫자를 안넣어도됌
//		a[0] = new int[2];
//		a[1] = new int[4];
//		a[2] = new int[3];
//		
//		//a[0]에 10,20 a[1]에 30,40,50,60 a[2][]에  70,80,890
//		int count =0;
////		
////		count += 10;
////		a[0][0] =count;
////		count += 10;
////		a[0][1] =count;
////		
////		for (int i = 0; i < a[0].length; i++) {
////			count += 10;
////			a[0][i]=count;
////		}
////		
////		count += 10;
////		a[1][0] =count;
////		count += 10;
////		a[1][1] =count;
////		count += 10;
////		a[1][2] =count;
////		count += 10;
////		a[1][3] =count;
////		
////		for (int i = 0; i < a[1].length; i++) {
////			count += 10;
////			a[1][i] =count;
////		}
////		count += 10;
////		a[2][0] =count;
////		count += 10;
////		a[2][1] =count;
////		count += 10;
////		a[2][2] =count;
////		
////		for (int i = 0; i < a[2].length; i++) {			
////			count += 10;
////			a[2][i] =count;
////		}
////		
////				
////		
////		for (int i = 0; i < a[0].length; i++) {
////			count += 10;
////			a[0][i]=count;
////		}
////		
////
////		for (int i = 0; i < a[1].length; i++) {
////			count += 10;
////			a[1][i] =count;
////		}
////		
////
////		for (int i = 0; i < a[2].length; i++) {			
////			count += 10;
////			a[2][i] =count;
////		}
//		
//		for (int j = 0; j < a.length; j++) {//j 작은배열의 번호
//			for (int i = 0; i < a[j].length; i++) {// i 작은 배열 방의 번호 			
//				count += 10;
//				a[j][i] =count;
//			}
//		}
////		
////		System.out.println(a[0][0]);
////		System.out.println(a[0][1]);
////		for (int i = 0; i < a[0].length; i++) {
////			System.out.println(a[0][i]);
////		}
////		
////		System.out.println(a[1][0]);
////		System.out.println(a[1][1]);
////		System.out.println(a[1][2]);
////		System.out.println(a[1][3]);
////		for (int i = 0; i < a[1].length; i++) {
////			System.out.println(a[1][i]);
////		}
////		
////		System.out.println(a[2][0]);
////		System.out.println(a[2][1]);
////		System.out.println(a[2][2]);
////		for (int i = 0; i < a[2].length; i++) {
////			System.out.println(a[2][i]);
////		}
////		
//
//		for (int j = 0; j < a.length; j++) {
//			for (int i = 0; i < a[j].length; i++) {
//				System.out.println(a[j][i]);
//			}
//		}
//		
		
		//1. 6명의 7과목의 점수를 저장할 수 있는 변수 score를 선언및 생성해주세요
		
		// 6명의 이름을 저장할수 있는 변수 name을 선언하고 주변 친구 6명의 
		// 이름으로 초기화 하세요
		// 각사람의 과목점수를 표시할 변수를 하나 만드시오
		String[] name ={"성민창","이은영", "이재규", "이광호","손영하","양현민"};
		String[] sub = {"국","영","수","사","과","오라클","자바"};//과목
		int[] sum = new int[sub.length];
		int[][] score = new int[name.length][sub.length];// 과목의 수가 정해져있기때문에 한줄만 생성해도 된다.
		float[] avg = new float[name.length];
		int[] subSum = new int[sub.length];
		float[] subAvg = new float[sub.length];
		int[] rank = new int[name.length];
		//2. score각방의 점수를 0~100점사이의 랜덤한 점수로 변경해주세요
		
		for (int i = 0; i < name.length; i++) {//랜덤점수
			for (int j = 0; j < sub.length; j++) {
				score[i][j] =(int)(Math.random()*101);
			}
		}
		
		for (int i = 0; i < name.length; i++) {//합계
			for (int j = 0; j < sub.length; j++) {
				sum[i]+= score[i][j];
			}
		}
		
		for (int i = 0; i < name.length; i++) {//평균
			avg[i] = (int)((float)sum[i]/sub.length*100+0.5)/100f;
		}
		
		for (int i = 0; i < name.length; i++) {//과목합계
			for (int j = 0; j < sub.length; j++) {
				subSum[j] += score[i][j];
			}
		}
		
		for (int i = 0; i < sub.length; i++) {
			subAvg[i] = (int)((float)subSum[i]/name.length*100+0.5)/100f;
		}
		
		
		for (int i = 0; i < name.length; i++) {//
			rank[i] = name.length;//랭크1은 name의 길이인 6 반복문 안에 선언하는 이유는 6에서 --로 비교해야 하니까
			for (int j = 0; j < name.length; j++) {//sum[i]는 0 sum[j]도 0
				if(sum[i]>sum[j]){//sum[0]번과 sum[0]번을 비교 했을때 둘이 같으므로 다시 반복문으로 돌아가[j]를 ++해준다.
					rank[i]--;//그러면 이번엔 [0]과 [1]을 비교 [0]번배열의 수가 더크면 --함 --하고 다시 반복문으로 돌아가 [j]++
				}			// [0]번배열과 [2]번배열 비교 쭉 name의 길이만큼 비교한후 바깥쪽 for문으로 다시 돌아가서[i]++
							// i++후 rank1을 6으로 초기화
			}				// 다시 반복문 안으로 들어가 [1]과 [0]번 배열 비교 name의 길이만큼 반복
		}
		
		//3. 아래와 같이 출력해주세요
		System.out.print("\t");
		for (int i = 0; i < name.length + 1; i++) { //과목
			System.out.print(sub[i] + "\t");
		}
		System.out.print("합계"+"\t"+"평균"+"\t"+"석차"+"\n");//과목 옆에 합계 출력\t 평균 출력 \n
		for (int i = 0; i < name.length; i++) {// i = 사람
			System.out.print(name[i] + "\t");//이름
			for (int j = 0; j < sub.length; j++) {//j=과목
				System.out.print(score[i][j] + "\t");//과목

			}
			System.out.println(sum[i]+"\t"+avg[i]+"\t"+rank[i]);//name의 길이만큼 합계 점수 출력,평균점수, 
		}
		System.out.print("과목합계"+"\t");
		for (int i = 0; i < subSum.length; i++) {//과목 합계
			System.out.print(subSum[i]+"\t");
		}
		System.out.print("\n"+"과목평균"+"\t");
		for (int i = 0; i < sub.length; i++) {//과목 평균
			System.out.print(subAvg[i]+"\t");
		}
		
		
		
		
		
		
		
		
		System.out.println("\n"+"===========================sort===================================================");
		
		
		
		
		
		for (int i = 0; i < name.length; i++) {//랜덤점수
			for (int j = 0; j < sub.length; j++) {
				score[i][j] =(int)(Math.random()*101);
			}
		}
		
		for (int i = 0; i < name.length; i++) {//합계
			for (int j = 0; j < sub.length; j++) {
				sum[i]+= score[i][j];
			}
		}
		
		for (int i = 0; i < name.length; i++) {//평균
			avg[i] = (int)((float)sum[i]/sub.length*100+0.5)/100f;
		}
		
		for (int i = 0; i < name.length; i++) {//과목합계
			for (int j = 0; j < sub.length; j++) {
				subSum[j] += score[i][j];
			}
		}
		
		for (int i = 0; i < sub.length; i++) {//과목평균
			subAvg[i] = (int)((float)subSum[i]/name.length*100+0.5)/100f;
		}
		
		
		for (int i = 0; i < name.length; i++) {//석차
			rank[i] = name.length;//랭크1은 name의 길이인 6 반복문 안에 선언하는 이유는 6에서 --로 비교해야 하니까
			for (int j = 0; j < name.length; j++) {//sum[i]는 0 sum[j]도 0
				if(sum[i]>sum[j]){//sum[0]번과 sum[0]번을 비교 했을때 둘이 같으므로 다시 반복문으로 돌아가[j]를 ++해준다.
					rank[i]--;//그러면 이번엔 [0]과 [1]을 비교 [0]번배열의 수가 더크면 --함 --하고 다시 반복문으로 돌아가 [j]++
				}			// [0]번배열과 [2]번배열 비교 쭉 name의 길이만큼 비교한후 바깥쪽 for문으로 다시 돌아가서[i]++
							// i++후 rank1을 6으로 초기화
			}				// 다시 반복문 안으로 들어가 [1]과 [0]번 배열 비교 name의 길이만큼 반복
		}
		
		
		
//		for
//		
//		for(int i = 0; i < name.length-1-k; i++){
//			if(arr[i]>arr[i+1]){
//				int temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		
		
		
		
		
		
		//3. 아래와 같이 출력해주세요
		System.out.print("\t");
		for (int i = 0; i < name.length + 1; i++) { //과목
			System.out.print(sub[i] + "\t");
		}
		System.out.print("합계"+"\t"+"평균"+"\t"+"석차"+"\n");//과목 옆에 합계 출력\t 평균 출력 \n
		for (int i = 0; i < name.length; i++) {// i = 사람
			System.out.print(name[i] + "\t");//이름
			for (int j = 0; j < sub.length; j++) {//j=과목
				System.out.print(score[i][j] + "\t");//과목

			}
			System.out.println(sum[i]+"\t"+avg[i]+"\t"+rank[i]);//name의 길이만큼 합계 점수 출력,평균점수, 
		}
		System.out.print("과목합계"+"\t");
		for (int i = 0; i < subSum.length; i++) {//과목 합계
			System.out.print(subSum[i]+"\t");
		}
		System.out.print("\n"+"과목평균"+"\t");
		for (int i = 0; i < sub.length; i++) {//과목 평균
			System.out.print(subAvg[i]+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
