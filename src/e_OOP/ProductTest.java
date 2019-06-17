package e_OOP;

public class ProductTest {
	public static void main(String[] args) {
		System.out.println(Init.action);// 변수로드 => 초기화 블럭 20 => 100
		
		Init it = new Init(70);// 변수로드 => 초기화 블럭 => 생성자 처음에 10 > 200 > 70 
		System.out.println(it.action2);
	}
}




class Init{
	
	static int action = 20;
	int action2= 10 ;
	int a = 5; // 명시적 초기화
	
	Init(int action2){// 생성자를 이용한 초기화
		this.action2 = action2;
	}
	
	static {// 클래스 초기화 블럭
		action =100;
	}
	
	{// 인스턴스 초기화 블럭
		action2 = 200;
	}
	
}