//6-4
package class_study;
//1.클래스 TvTest4를 생성하세요
public class TvTest4 {
//2.main메서드를 호출하세요
	public static void main(String[] args) {
//10.Tv1의 객체 배열 tvArr를 선언하고 길이를 3으로 초기화 하세요
		Tv1[] tvArr = new Tv1[3];
//11.반복문을 통해 클래스 Tv1의 객체 tvArr를 tvArr의 배열 길이만큼 인스턴스화 하세요
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv1();
//12.클래스 Tv1의 객체 tvArr의 channel값을 i+10으로 대입하세요
			tvArr[i].channel = i+10;
		}
//13.클래스 Tv1의 객체 tvArr의 길이만큼 channelUp인스턴스 메서드를 호출하세요
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
//14.tvArr의 길이만큼 채널을 호출하고 출력하세요
			System.out.println(tvArr[i].channel);
		}
	}
}
//3.클래스 Tv1을 생성하세요
class Tv1{
//4.String타입 인스턴스 변수 color를 선언하세요
	String color;
//5.boolean타입 인스턴스 변수 power를 선언하세요
	boolean power;
//6.int타입 인스턴스 변수 channel을 선언하세요
	int channel;
//7.반환값이 없는 인스턴스 메서드 power를 생성하고 power의 값을 부정연산으로 대입하세요
	void power(){
		power = !power;
	}
//8.반환값이 없는 인스턴스 메서드 channelUp을 생성하고 channel의 값을 전위형 증감하세요
	void channelUp(){
		++channel;
	}
//9.반환값이 없는 인스턴스 메서드 channelDown을 생성하고 channel의 값을 전위형 감소 하세요
	void channelDown(){
		--channel;
	}
}