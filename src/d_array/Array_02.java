package d_array;

public class Array_02 {
	public static void main(String[] args) {
		/*
		1. 정렬
		  - 어떤 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터들을 가지런하게
		   	나열하는 작업이다.
		  - 버블정렬, 선택정렬, 삽입정렬
		  
		2. 버블정렬(bubble sort)
		  - 인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어 진다.
		  - 한 회전이 끝날때 가장 큰값이 가장 뒤에 확정된다.
		  -  
		
		3. 선택정렬(select sort) 최소값이 있는 방번호를 찾고 그방과 자리를바꾼다.
		  - 정렬의 대상에서 최소값을 찾아서 맨앞의 내용과 교체하는 방식이다
		  - 한 회전에 끝날때 가장 작은값이 앞에 확정된다.
		 
		  
		 */
		
//		if(arr[0]>arr[1]){//1버블
//			int temp = arr[0];
//			arr[0] = arr[1];
//			arr[1] = temp;
//		}
//		for (int i = 0; i < arr.length; i++){
//			System.out.print(arr[i]+" ");
//		}
//			System.out.println();
//		
//		if(arr[1]>arr[2]){//2버블
//			int temp = arr[1];
//			arr[1] = arr[2];
//			arr[2] = temp;
//		}
//		for (int i = 0; i < arr.length; i++){
//			System.out.print(arr[i]+" ");
//		}
//			System.out.println();
//		if(arr[2]>arr[3]){//3버블
//			int temp = arr[2];
//			arr[2] = arr[3];
//			arr[3] = temp;
//		}
//		for (int i = 0; i < arr.length; i++){
//			System.out.print(arr[i]+" ");
//		}
//			System.out.println();
//			
//			if(arr[3]>arr[4]){//4버블
//				int temp = arr[3];
//				arr[3] = arr[4];
//				arr[4] = temp;
//			}
//			for (int i = 0; i < arr.length; i++){
//				System.out.print(arr[i]+" ");
//			}
//			System.out.println();
//			
		int[] arr = new int[]{5,2,3,1,4};
			
//			for(int i = 0; i < arr.length-1; i++){
//				if(arr[i]>arr[i+1]){
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//				}
//				for (int j = 0; j < arr.length; j++){
//					System.out.print(arr[j]+" ");
//				}
//				System.out.println();
//			}
//		
		for(int k = 0; k < arr.length-1; k++){//버블정렬 식
			System.out.println(k+1+"회전");
		
			for(int i = 0; i < arr.length-1-k; i++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				for (int j = 0; j < arr.length; j++){
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}	
		
//		
//		for(int k = 0; k < arr.length-1; k++){
//			System.out.println(k+1+"회전");
//			
//			for(int i = 0; i < arr.length-1-k; i++){
//				if(arr[i]>arr[i+1]){
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//				}
//				for (int j = 0; j < arr.length; j++){
//					System.out.print(arr[j]+" ");
//				}
//				System.out.println();
//			}
//		}	
//	최소값 구하는 공식		
//		int min = score[0];
//		for(int i = 1 ; i<score.length; i++){
//			System.out.println(score[i]);
//			if(min >score[i]){
//				min = score[i];
//			}
//		}
//		System.out.println("min = "+ min);
		
		//1. 최소값을 가지고 있는 방번호를 구하세요
//		if(min > arr[1]){
//			min = arr2[1];
//		}
		int[] arr2 ={5,2,3,1,4};
		
//		int min = arr[0];
//		int minBang = 0;
//		
//		
//		for (int i = 1; i < arr2.length; i++){
//			if(min > arr2[i]){
//				min = arr2[i];
//				minBang = i;
//			}
//		}
//		
//		int temp2 = arr2[0];//1회전
//		arr2[0] = arr2[minBang];
//		arr2[minBang] = temp2;
//		
//		for(int i = 0; i < arr2.length; i++){
//			System.out.print(arr2[i]+ " ");
//		}
//		System.out.println();
//		//
//		
//		int min = arr[1];
//		int minBang = 1;
//		for (int i = 2; i < arr2.length; i++){
//			if(min > arr2[i]){
//				min = arr2[i];
//				minBang = i;
//			}
//		}
//		int temp2 = arr2[1];//2회전
//		arr2[1] = arr2[minBang];
//		arr2[minBang] = temp2;
//		
//		for(int i = 1; i < arr2.length; i++){
//			System.out.print(arr2[i]+ " ");
//		}
//		System.out.println();
//		//
//		
//		for (int i = 1; i < arr2.length; i++){
//			if(min > arr2[i]){
//				min = arr2[i];
//				minBang = i;
//			}
//		}
//		
//		int temp2 = arr2[0];
//		arr2[0] = arr2[minBang];
//		arr2[minBang] = temp2;
//		
//		for(int i = 0; i < arr2.length; i++){
//			System.out.print(arr2[i]+ " ");
//		}
//		System.out.println();
//		//4회전
//		int min = arr[3];
//		int minBang = 3;
//		for (int i = 4; i < arr2.length; i++){
//			if(min > arr2[i]){
//				min = arr2[i];
//				minBang = i;
//			}
//		}
//		
//		int temp2 = arr2[3];
//		arr2[3] = arr2[minBang];
//		arr2[minBang] = temp2;
//		
//		for(int i = 0; i < arr2.length; i++){
//			System.out.print(arr2[i]+ " ");
//		}
//		System.out.println();
		//선택 정렬
		for(int j = 0 ; j < arr.length-1; j++){//3번째
			System.out.println("회전수"+(j+1) + " ");
			 
			int min = arr[j];
			int minBang = j;
			
			for (int i = j+1; i < arr2.length; i++){//2번쨰
				
				if(min > arr2[i]){//1번쨰
					min = arr2[i];
					minBang = i;
				}
			}
			
			int temp2 = arr2[j];
			arr2[j] = arr2[minBang];
			arr2[minBang] = temp2;
			
			for(int i = 0; i < arr2.length; i++){
				System.out.print(arr2[i]+ " ");
			}
			System.out.println();
		}
			
		
		
		//2. 기준방과 최소값을 가지고 있는 방의 값을 교환해주세요
			
			
			
			
			
			
			
			
			
			
	}
}


