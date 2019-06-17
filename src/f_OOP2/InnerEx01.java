package f_OOP2;

public class InnerEx01 {
	
	class InstanceInner{// 인스턴스클래스
		int iv = 100;
//		static int cv = 200;//클래스변수 선언불가
		static final int CON = 200; //상수는 사용가능
	}
	
	static class StaticInner{//스태틱 클래스
		static int cv =10;//클래스변수 인스턴스변수 상수 가능
		int iv = 400;
	}
	
	void method(){
		class LocalInner{//지역 클래스
			int iv = 40;//인스턴스, 상수 가능
//			static int cv =50;
		}
	}

	
	
	
}
