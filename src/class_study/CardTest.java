//예제 6-5
package class_study;
//1.CardTest클래스를 생성하세요
public class CardTest {
//2.CardTest클래스에 main메서드를 호출하세요
	public static void main(String[] args) {
//8.main메서드 안에 Card클래스의 클래스변수 width를 출력하세요
		System.out.println(Card.width);
//9.Card 클래스의 클래스 변수 height를  출력하세요
		System.out.println(Card.height);
//10.Card클래스의 객체 c1을 선언후 생성하세요
		Card c1 = new Card();
//11.객체 c1의 인스턴스 변수 kind의 값을 "Heart"로 변경하세요
		c1.kind = "Heart";
//12.객체 c1의 인스턴스 변수 number의 값을 7으로 변경하세요
		c1.number = 7;
//13.Card클래스의 객체 c2를 선언후 생성하세요
		Card c2 = new Card();
//14.객체 c2의 인스턴스변수 kind의 값을"Spade"로 변경하세요
		c2.kind = "Spade";
//15.객체 c2의 인스턴스변수 number의 값을 4로 변경하세요
		c2.number = 4;
//16.객체 c1의 인스턴스 변수  kind,number,width,height의 값을 호출 출력하세요//그냥 호출하면 에러남
		System.out.println("c1은 " + c1.kind+","+ c1.number+"이며, 크기는("+c1.width+","+c1.height+")");
//17.객체 c2의 인스턴스 변수  kind,number,width,height의 값을 호출 출력하세요
		System.out.println("c2은 " + c2.kind+","+ c2.number+"이며, 크기는("+c2.width+","+c2.height+")");
//18.객체 c1의 클래스변수 width의 값을 50으로 변경하세요
		c1.width = 50;
//19.객체 c1의 클래스변수 height의 값을 80으로 변경하세요
		c1.height = 80;
//20.객체 c1의 인스턴스 변수  kind,number,width,height의 값을 호출 출력하세요//그냥 호출하면 에러남
		System.out.println("c1은 " + c1.kind+","+ c1.number+"이며, 크기는("+c1.width+","+c1.height+")");
//21.객체 c2의 인스턴스 변수  kind,number,width,height의 값을 호출 출력하세요
		System.out.println("c2은 " + c2.kind+","+ c2.number+"이며, 크기는("+c2.width+","+c2.height+")");
	}
}

//3.Card클래스를 생성하세요
class Card{
//4.Card클래스에 String타입 인스턴스변수 kind를 선언하세요
	String kind;
//5.Card클래스에 int타입 인스턴스변수 number를 선언하세요
	int number;
//6.Card클래스에 int타입 클래스변수 width를 선언후 값을 100으로 초기화하세요
	static int width = 100;
//7.Card클래스에 int타입 클래스변수 height를 선언후 값을 250으로 초기화하세요
	static int height = 250;
}
