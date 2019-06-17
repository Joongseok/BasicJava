package e_OOP;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	
//	static int cv2 = iv;
	
	static void staticMethod(){
		System.out.println(cv);
//		System.out.println(iv);
	}
	
	void instanceMethod(){
		System.out.println(cv);
		System.out.println(iv);
	}
	static void staticMethod2(){
		cv = 200;
		staticMethod();
		staticMethod2();
	}
	
	void instanceMethod2(){
		
	}
	
	
	
}
