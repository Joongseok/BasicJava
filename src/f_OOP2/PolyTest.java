package f_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1. FireCar 3대를 저장할수 있는 변수 fc를 선언하고 생성해주세요
		FireCar fc1 = new FireCar();
		FireCar fc2= new FireCar();
		FireCar fc3 = new FireCar();
		
		FireCar[] fc = new FireCar[]{fc1,fc2,fc3};
		
		//2. PoliceCar 2대를 저장할수 있는 변수 pc를 선언하고 생성해주세요
		PoliceCar pc1 = new PoliceCar();
		PoliceCar pc2 = new PoliceCar();
		
		PoliceCar[] pc = new PoliceCar[]{pc1,pc2};
		//3. Ambulance 4대를 저장할수 있는 변수 ab를 선언하고 생성해주세요
		Ambulance ab1 = new Ambulance();
		Ambulance ab2 = new Ambulance();
		Ambulance ab3 = new Ambulance();
		Ambulance ab4 = new Ambulance();
		
		Ambulance[] ab = new Ambulance[]{ab1,ab2,ab3,ab4};
		Car cc = fc1;//up-casting
		
		Car[] c = new Car[]{fc1,fc2,fc3,pc1,pc2,ab1,ab2,ab3,ab4}; // up-casting
		cc = fc1;
		FireCar fc5 = (FireCar)c[2]; // down-casting
		
		
		FireCar fc7 = (FireCar) new Car();
		
		
		
		
	}
}

class Car{
	int door;
	int wheel;
	
	void drive(){
		System.out.println("달려");
	}
	
	void stop(){
		System.out.println("멈춰");
	}
	
	void fix(Car c){
		System.out.println();
	}
	
}

class FireCar extends Car{
	void water(){
		System.out.println("물뿌려");
	}
}

class PoliceCar extends Car{
	void lock(){
		System.out.println("못나가");
	}
}

class Ambulance extends Car{
	void AED(){
		System.out.println("살아나라");
	}
}