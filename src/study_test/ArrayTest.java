package study_test;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		
//		int[] arr0 = new int[4];
//		int[] arr1 = new int[3];
//		int[][] arr2 = new int[arr0.length][arr1.length];
//		
//		arr2[3][2] = (int)(Math.random()*100);
//		arr2[3][1] = (int)(Math.random()*100);
//		arr2[3][0] = (int)(Math.random()*100);
//		
//		for (int i = 2;  i >= 0; i--) {
//			arr2[3][i] = (int)(Math.random()*100);
//		}
//		for (int i = 2; i >= 0; i--) {
//			System.out.print(arr2[3][i]+"\t");
//		}
//		System.out.println();
//		for (int i = 2;  i >= 0; i--) {
//			arr2[2][i] = (int)(Math.random()*100);
//		}
//		for (int i = 2; i >= 0; i--) {
//			System.out.print(arr2[2][i]+"\t");
//		}
//		System.out.println();
//		for (int i = 2;  i >= 0; i--) {
//			arr2[1][i] = (int)(Math.random()*100);
//		}
//		for (int i = 2; i >= 0; i--) {
//			System.out.print(arr2[1][i]+"\t");
//		}
//		System.out.println();
//		for (int i = 2;  i >= 0; i--) {
//			arr2[0][i] = (int)(Math.random()*100);
//		}
//		for (int i = 2; i >= 0; i--) {
//			System.out.print(arr2[0][i]+"\t");
//		}
//		
		//[4][3]으로 부터 [0][0]까지 집어넣는문제
//		for (int i = arr2.length-1; i >= 0; i--) {
//			for (int j = arr2[i].length-1; j >= 0; j--) {
//				arr2[i][j] = (int)(Math.random()*100);
//			}
//		}
//		for (int i = arr2.length-1; i > -1; i--) {
//			for (int j = arr2[i].length-1; j > -1; j--) {
//				System.out.print(arr2[i][j]+"\t");
//			}
//			System.out.println();
//			System.out.println();
//		}
	
		//세로로 배열넣기
//		
//		arr2[0][0] = (int)(Math.random()*100);
//		arr2[1][0] = (int)(Math.random()*100);
//		arr2[2][0] = (int)(Math.random()*100);
//		arr2[3][0] = (int)(Math.random()*100);
		
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i][0] = (int)(Math.random()*100);
////		}
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i][0]);
//		}
//		System.out.println();
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i][0] = (int)(Math.random()*100);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i][1]+"\t");
//		}
//		System.out.println();
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i][0] = (int)(Math.random()*100);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i][2]+"\t");
//		}
//		System.out.println();
		
//		for (int i = 0; i < arr2[i].length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				arr2[j][i] = (int)(Math.random()*101);
//			}
//		}
//		for (int i = 0; i < arr2[i].length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				System.out.println(arr2[j][i]);
//			}
//			System.out.print("\t");
//		}
//		
//		arr2[3][2] = (int)(Math.random()*101);
//		arr2[2][2] = (int)(Math.random()*101);
//		arr2[1][2] = (int)(Math.random()*101);
//		arr2[0][2] = (int)(Math.random()*101);
	
		int arr2[][] = new int[4][3];
		
//		for (int i = 3; i > -1; i--) {
//			arr2[i][2] = (int)(Math.random()*100);
//		}
//		for (int i = 3; i > -1; i--) {
//			System.out.println(arr2[i][2]);
//		}
//		for (int i = 3; i > -1; i--) {
//			arr2[i][1] = (int)(Math.random()*100);
//		}
//		for (int i = 3; i > -1; i--) {
//			System.out.println(arr2[i][1]);
//		}
//		for (int i = 3; i > -1; i--) {
//			arr2[i][0] = (int)(Math.random()*100);
//		}
//		for (int i = 3; i > -1; i--) {
//			System.out.println(arr2[i][0]);
//		}
//		for (int i = 2; i > -1; i--) {
//			for (int j = 3; j > -1; j--) {
//				arr2[j][i] = (int)(Math.random()*100);
//			}
//		}
//		for (int i = 3; i >  -1; i--) {
//			System.out.println(" ");
//			for (int j = 2; j > -1; j--) {
//				System.out.print("arr2["+i+"]["+j+"] : "+arr2[i][j]+"\t\t");
//			}
//		}
//		
		
//		arr2[0][0] = (int)(Math.random()*100);
//		arr2[0][1] = (int)(Math.random()*100);
//		arr2[0][2] = (int)(Math.random()*100);
//		
//		arr2[2][0] = (int)(Math.random()*100);
//		arr2[2][1] = (int)(Math.random()*100);
//		arr2[2][2] = (int)(Math.random()*100);
//		
//		for (int i = 0; i < arr2.length; i +=2) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				arr2[i][j] = (int)(Math.random()*100);
//			}
//		}
//		for (int i = 0; i<arr2.length; i+=2) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.print("arr2["+i+"]["+j+"] : "+arr2[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
	    
//	         for(int j= 0; j <= 10000; j++){
//	             System.out.print("수");
//	             System.out.print("박");
//	         }
	       
//	         Scanner sc = new Scanner(System.in);
//	 		int a = sc.nextInt();//5
//	 		int b = sc.nextInt();//3
//	         int[][] c = new int[b][a];//3,5
//	 		for(int i = 0; i < c.length; i++){//3
//	 		    for(int j = 0; j < c[a].length; j++){//5
//	 		                System.out.print(c[i][j]);//3,5
//	 		    }
//	 		    System.out.println();
//	 		}
	 		int[][] d = new int[3][5];
	 		for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d[i].length; j++) {
					System.out.print(d[i][j]);
				}
				System.out.println();
			}
		
	}
}
