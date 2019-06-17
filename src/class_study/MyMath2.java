//6-19
package class_study;
//1.클래스 MyMath2를 생성하세요
public class MyMath2 {
//2.롱타입 인스턴스 변수 a,b를 선언하세요
	long a,b;
//3.롱타입 인스턴스 메서드 add생성후 반환값 a+b
	long add(){
		return a+b;
	}
//4.롱타입 인스턴스 메서드 subtract생성후 반환값 a-b
	long subtrack(){
		return a-b;
	}
//5.롱타입 인스턴스 메서드 multiply생성후 반환값 a*b
	long multiply(){
		return a*b;
	}
//6.더블타입 인스턴스 메서드 divide생성후 반환값 a/b
	double divide(){
		return a/b;
	}
//7.롱타입 클래스 메서드 add 매개변수 롱타입 두개 반환값 a+b
	static long add(long a, long b){
		return a+b;
	}
//8.롱타입 클래스 메서드 subtract 매개변수 롱타입 두개 반환값 a-b 		
	static long subtract(long a, long b){
		return a-b;
	}
//9.롱타입 클래스 메서드 multiply 매개변수 롱타입 두개 반환값 a*b 		
	static long multiply(long a, long b){
		return a*b;
	}
//10.더블타입 클래스 메서드 divide 매개변수 더블타입 두개 반환값 a/b 		
	static double divide(double a, double b){
		return a/b;
	}
}
//11.클래스 MyMathTest2생성
class MyMathTest2{
//12.main메서드 호출
	public static void main(String[] args) {
//13.클래스메서드 add호출 인자값 200,100으로 출력
		System.out.println(MyMath2.add(200L, 100L));
//14.클래스메서드 subtrack호출 인자값 200,100으로 출력
		System.out.println(MyMath2.subtract(200L, 100L));
//15.클래스메서드 multiply호출 인자값 200,100으로 출력
		System.out.println(MyMath2.multiply(200L, 100L));
//16.클래스메서드 divide호출 인자값 200,100으로 출력
		System.out.println(MyMath2.divide(200, 100));
//17.MyMath2클래스의 객체 mm을 선언및 생성
		MyMath2 mm = new MyMath2();
//18.객체mm의 a값을 200L으로 변경
		mm.a = 200L;
//19.객체mm의 b값을 100L으로 변경
		mm.b = 100L;
//20.객체 mm의 인스턴스 메서드 add를 호출 출력하세요		
		System.out.println(mm.add());
//21.객체 mm의 인스턴스 메서드 subtract를 호출 출력하세요		
		System.out.println(mm.subtrack());
//22.객체 mm의 인스턴스 메서드 multiply를 호출 출력하세요		
		System.out.println(mm.multiply());
//23.객체 mm의 인스턴스 메서드 divide를 호출 출력하세요	
		System.out.println(mm.divide());
	}
}
