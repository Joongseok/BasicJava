//6-10
package class_study;
//1.클래스 Data를 Data클래스안에 생성하고 int타입 인스턴스 변수 x를 선언해주세요
public class Data {
	int x;
}
//2.클래스 ReferenceParmEx를 생성하세요
class ReferenceParmEx{
//3.main메서드를 호출하세요
	public static void main(String[] args) {
//4.Data클래스의 객체 d를 선언하고 생성해주세요
		Data d = new Data();
//5.객체 d의 x값을 10으로 변경하세요
		d.x = 10;
//6.d의 x값을 출력하세요
		System.out.println(d.x);
//10.클래스메서드 change를 호출하고 매개변수는 d의 주소를 주세요
		ReferenceParmEx.change(d);
//11.d의 x값을 출력하세요
		System.out.println(d.x);
		}
//7.반환값이 없는 클래스메서드 change를 생성하고 참조형 매개변수는 Data d로 생성하세요
	static void change(Data d){
//8.d의 x값을 1000으로 초기화하세요
		d.x = 1000;
//9.d의 x값을 출력하세요
		System.out.println(d.x);
	}
}
