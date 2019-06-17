//6-29
package class_study;
//1.클래스 Product를 생성하세요
public class Product {
//2.int타입 클래스변수 count를 선언하고 값을 0으로 초기화 하세요
	static int count = 0;
//3.int타입 인스턴스 변수 serialNo을 선언 하세요
	int serialNo;
//4.인스턴스 초기화 블럭을 생성후 count를 전위형 증감하세요
	{
		++count;
//5.serialNo에 count를 대입하세요
		serialNo = count;
	}
//6.기본생성자를 생성하세요
	Product(){//생략가능
		
	}
}
//7.클래스 ProductTest를 생성하세요
class ProductTest{
//8.main메서드를 호출하세요
	public static void main(String[] args) {
//9.Product클래스의 객체 p1을 선언하고 생성하세요	
		Product p1 = new Product();
//10.product클래스의 객체 p2을 선언하고 생성하세요		
		Product p2 = new Product();
//11.Product클래스의 객체 p3을 선언하고 생성하세요		
		Product p3 = new Product();
//12.객체 p1의 serialNo를 호출하고 출력하세요
		System.out.println(p1.serialNo);
//13.객체 p2의 serialNo를 호출하고 출력하세요
		System.out.println(p2.serialNo);
//14.객체 p3의 serialNo를 호출하고 출력하세요
		System.out.println(p3.serialNo);
//15.Product클래스의 클래스 변수 count를 호출 하고 출력하세요
		System.out.println(Product.count);
	}
}
