package e_OOP;

public class PrintCall {
	public static void main(String[] args) {
		//1
		CallTest result = new CallTest();
		int x = result.add();
		System.out.println(x);
		//2
		int x1 = result.add(4);
		System.out.println(x1);
		//3
		long x2 = result.add(5L);
		System.out.println(x2);
//		//4
		int x3 = result.add(6, 7);
		System.out.println(x3);
//		//5
//		
//		//6
		long x4 = result.add(8L, 9L);
		System.out.println(x4);
//		
//		//7
		System.out.println(result.add(11, 16L));
	}
}

class CallTest{
	
	int a1 = 3;
	int b1 = 5;
	
	long a2 = 6L;
	long b2 = 8L;
	
	//1. a1과 b1의 합을 반환하는 메서드를 만들어주세요 add
	
	int add(){
		int result = a1+b1;
		return result;
	}
	
	//2. int 형 매개변수 하나를 받아서 b1과의 합계를 반환하는 메서드를 만들어주세요 add
	int add(int a){
		int result = a+b1;
		return result;
	}
	//3. long 형 매개변수 하나와 a2의 합계를 반환하는 메서드를 만들어주세요 add
	long add(long a){
		long result = a + a2;
		return result;
	}
	//4. int형 매개변수 두개를 받아서 a1,b1 그리고 매개변수 두개의 합계를 반환하는 메서드를
	//	 만들어 주세요 add
	int add(int a, int b){
		int result = a+b+a1+b1;
		return result;
	}
//	//5. int형 매개변수 두개를 받아서 a2,b2 그리고 매개변수 두개의 합계를 반환하는 메서드를
//	//	 만들어 주세요 add
//	long add(int a, int b){
//		long result = a+b+a2+b2;
//		return result;
//	}
//	//6. long형 매개변수 두개를 받아서 매개변수의 합을 반환하는 메서드를 만들어주세요 add
	long add(long a, long b){
		long result = a+b;
		return result;
	}
//	//7. int형 매개변수 하나와 long 형 매개변수 하나를 받아서 그 합을 반환하는 메서드를 만들어 주세요 add
	long add(int a, long b){
		long result = a+b;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}