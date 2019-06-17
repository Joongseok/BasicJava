//6-24
package class_study;
//1.클래스 Car를 생성하세요
public class Car {
//2.클래스 Car의 String 타입 인스턴스 변수 color, gearType을 선언하세요
	String color, gearType;
//3.클래스 Car의 int 타입 인스턴스 변수 door를 선언하세요
	int door;
//4.Car의 기본 생성자를 만드세요
	Car(){
		
	}
//5. 매개변수가 있는 생성자를 만들고 매개변수는 String c, g int d를 만들고 블럭 안에 인스턴스 변수 color에 c, gearType에 g door에 d를 대입하세요
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}
//6.클래스 CarTest를 생성하세요
class CarTest{
//7. main 메서드를 호출하세요
	public static void main(String[] args) {
//8.클래스 Car의 객체 c1을 선언하고 생성하세요
		Car c1 = new Car();
//9.객체 c1의 color값을 "white"로 gearType값을  "auto" door값을 4로 변경하세요
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
//10.클래스 Car의 객체 c2를 선언하고 매개변수가 있는 생성자를 만들고 인자값은 "white","auto",4)로 생성하세요
		Car c2 = new Car("white", "auto", 4);
//11.객체 c1의 color,gearType,door를 호출하고 출력하세요
		System.out.println("c"+c1.color+"g"+c1.gearType+"d"+c1.door);//그냥 호출하면 println이 안됌		
//12.객체 c2의 color,gearType,door를 호출하고 출력하세요
		System.out.println("c"+c2.color+"g"+c2.gearType+"d"+c2.door);//그냥 호출하면 println이 안됌		
	}
}
