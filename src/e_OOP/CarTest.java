package e_OOP;

public class CarTest {
	
	public static void main(String[] args) {
	Car c = new Car();
	c.color = "black";
	c.gearType = "stick";
	c.door = 4;
	
	Car c1 = new Car("black","stick",4);
	System.out.println(c1.color);
	Car c2 = new Car("red","auto");
	
	
	}
}


class Car{
	String color;
	String gearType;
	int door;
	
	Car(){//기본생성자
		color = "white";
		gearType = "stick";
		door = 4;
	}
	
	Car(String color, String gearType, int door){//매개변수가 있는 생성자 this. 뜻 :  이 인스턴스에 
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(String color, String gearType){//매개변수가 있는 생성자 this. 뜻 :  이 인스턴스에 
		this();//Car()
		this.color = color;
		this.gearType = gearType;
	}
	
}