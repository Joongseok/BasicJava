//예제 6-3
package class_study;
//1. Tv클래스를 생성하세요
public class Tv {
//2.String 타입의 인스턴스 변수 color를 선언해주세요
	String color;
//3.boolean 타입의 인스턴스 변수 power를 선언해주세요
	boolean power;
//4.int 타입의 인스턴스변수 channel을 선언해주세요
	int channel;
//5.반환값이 없는 인스턴스 메서드 power를 생성후 현재 power 값의 반대가 되도록 하세요
	void power(){
		power = !power;
	}
//6.반환값이 없는 인스턴스 메서드 channelUp를 생성후 현재 channel이 전위형 증감될수 있게 하세요
	void channelUp(){
		++channel;
	}
//7.반환값이 없는 인스턴스 메서드 channelDown을 생성후 현재 channel이 전위형 감소될수 있게 하세요
	void channelDown(){
		--channel;
	}
}
//8.TvTest3클래스를 생성하세요
class TvTest3{
//9.TvTest3클래스에 클래스 메서드 main을 호출하세요
	public static void main(String args[]){
//10.Tv클래스의 객체 t1을 선언하고 생성하세요
		Tv t1 = new Tv();
//11.Tv클래스의 객체 t2을 선언하고 생성하세요
		Tv t2 = new Tv();
//12.t1객체의 channel값을 호출하고 출력하세요
		System.out.println(t1.channel);
//13.t2의 channel값을 호출하고 출력하세요
		System.out.println(t2.channel);
//14.t1객체에 t2을 대입하세요
		t1 = t2;
//15.t1의 channel값을 7으로 변경하세요
		t1.channel = 7;
//16.t1의 channel값을 호출하고 출력하세요		
		System.out.println(t1.channel);
//17.t2의 channel값을 호출하고 출력하세요
		System.out.println(t2.channel);
		
		
	}
}
