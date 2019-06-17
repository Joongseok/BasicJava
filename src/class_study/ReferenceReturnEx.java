//6-14
package class_study;
//1.클래스 Data1를 생성하고 int 타입의 인스턴스 변수 x를 선언하세요
class Data1{
	int x;
}
//2.클래스 ReferenceReturnEx를 생성하세요
public class ReferenceReturnEx {
//3.main메서드를 호출하세요
	public static void main(String args[]){
//4.Data1클래스의 객체 d를 선언 생성하세요
		Data1 d = new Data1();
//5.객체 d의 x값을 10으로 변경하세요
		d.x = 10;
//10.Data1클래스의 객체 d2를 선언하고 클래스메서드 copy의 인자값 d를 대입하세요
		Data1 d2 = copy(d);
//11. d의 x값을 출력하세요
		System.out.println(d.x);
//12. d2의 x값을 출력하세요
		System.out.println(d2.x);
	}
//6.클래스메서드 copy를 생성하고 참조형 매개변수Data1 d를 넣고 반환타입은 Data1로 생성하세요
	static Data1 copy(Data1 d){
//7.Data1클래스의 객체 tmp를 선언후 생성
		Data1 tmp = new Data1();
//8.tmp의 x값을 d의 x값으로 대입하세요
		tmp.x = d.x;
//9.반환값을 tmp로 하세요
		return tmp;
	}
}
