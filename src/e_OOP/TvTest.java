package e_OOP;

public class TvTest {
	public static void main(String[] args) {
		System.out.println(Tv.color);
		Tv.color = "black";
		System.out.println(Tv.color);
		Tv.changeColor();


		
		Tv t; 
		t = new Tv();
		t.channel = 20;
		System.out.println(t.channel);
		t.channelUp();
		System.out.println(t.channel);
		
		System.out.println(t.power); 
		t.power();
		System.out.println(t.power);
		
		
		
		
		
	}
}

class Tv{
	
	//멤버변수
	static String color; //클래스 변수
	boolean power;//인스턴스 변수
	int channel;
	
	static void changeColor(){ //색상을 변경 
		color = "yellow";
	}
	
	void power(){//전원
		//꺼져있으면 켜지게, 켜져있으면 꺼지게
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
	
	
	
	
}









