//6-6
package class_study;
//1.클래스 MyMathTest를 생성하세요
public class MyMathTest {
//2.main메서드를 호출하세요
	public static void main(String[] args) {
//8.MyMath클래스의 객체 mm을 선언후 생성하세요
		MyMath mm = new MyMath();
//9.지역변수 result1를 롱타입으로 선언하고 객체 mm의 add메서드인자값을 5,3으로 대입하세요
		long result1 = mm.add(5L, 3L);
//10.지역변수 result2를 롱타입으로 선언하고 객체 mm의 subtract메서드인자값을 5,3으로 대입하세요
		long result2 = mm.subtract(5L, 3L);
//11.지역변수 result3를 롱타입으로 선언하고 객체 mm의 multiply메서드인자값을 5,3으로 대입하세요
		long result3 = mm.multiply(5L, 3L);
//12.지역변수 result4를 더블타입으로 선언하고 객체 mm의 divide메서드인자값을 5,3으로 대입하세요
		double result4 = mm.divide(5, 3);
//13.result1의 값을 호출하고 출력하세요
		System.out.println(result1);
//14.result2의 값을 호출하고 출력하세요	
		System.out.println(result2);
//15.result3의 값을 호출하고 출력하세요		
		System.out.println(result3);
//16.result4의 값을 호출하고 출력하세요		
		System.out.println(result4);
	}
}
//3.MyMath클래스를 생성하세요
class MyMath{
//4.인스턴스 메서드 add를 생성후 매개변수는 long타입 두개, 반환값은 a+b로 생성하세요
	long add(long a, long b){
		return a+b;
	}
//5.인스턴스 메서드 subtract를 생성후 매개변수는 long타입 두개, 반환값은 a-b로 생성하세요
	long subtract(long a, long b){
		return a-b;
	}
//6.인스턴스 메서드 multiply를 생성후 매개변수는 long 타입 두개, 반환값은 a*b로 생성하세요
	long multiply(long a, long b){
		return a*b;
	}
//7.인스턴스 메서드 divide를 생성후 매개변수는 double 타입 두개, 반환값은 a/b로 생성하세요
	double divide(double a, double b){
		return a/b;
	}
}
