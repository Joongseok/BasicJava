package f_OOP2;


public class InstanceofTest {
	public static void main(String[] args) {
			Car2 c = new FireCar2();
			System.out.println(c.a);//10
			System.out.println(c.b);
			c.method();
			
			if (c instanceof FireCar2) {
				System.out.println("c는 FireCar2의 인스턴스이다.");
				FireCar2 fc2 =  (FireCar2)c;//다운캐스팅
			}
	
			if(c instanceof Car2){
				System.out.println("c는 Car2의 인스턴스이다.");
				Car2 fc2 = c;
			}
			
			if(c instanceof Object){
				System.out.println("c는 Object의 인스턴스이다.");
				Object fc2 = c; //업캐스팅
			}
			
			Car2 c2 = new Car2();
			if(c2 instanceof FireCar2){
				System.out.println("c2는 FireCar2의 인스턴스이다");
			}
			
			if(c2 instanceof Car2){
				System.out.println("c2는 Car2의 인스턴스이다");
				Car2 ccc = c2;
			}
			
			if(c2 instanceof Object){
				System.out.println("c2는 Object의 인스턴스이다");
				Object ccc = c2;
			}
			
			
	}
}

class Car2{
	static int a = 10;
	int b =20;
	void method(){
		System.out.println("Car2의 메서드");
	}
}

class FireCar2 extends Car2{
	static int a = 30;
	int b = 40;
	
	@Override
	void method(){
		System.out.println("FireCar2의 메서드");
	}
	void method2(){
		
	}
}
