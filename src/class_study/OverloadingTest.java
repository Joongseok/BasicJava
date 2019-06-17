//6-21
package class_study;
//1.클래스 OverloadingTest를 생성하세요
public class OverloadingTest {
//2.main메서드를 호출하세요
	public static void main(String[] args) {
//13.MyMath3클래스의 객체 mm을 선언하고 생성하세요
		MyMath3 mm = new MyMath3();
//14.객체 mm의 인스턴스 메서드 add를 호출하고 출력해주세요 매개변수는 int,int 인자값은 3,2	
		System.out.println(mm.add(3, 2));
//15.객체 mm의 인스턴스 메서드 add를 호출하고 출력해주세요 매개변수는 int,long 인자값은 3,2
		System.out.println(mm.add(3, 2L));
//16.객체 mm의 인스턴스 메서드 add를 호출하고 출력해주세요 매개변수는 long,int 인자값은 3,2	
		System.out.println(mm.add(3L, 2));
//17.객체 mm의 인스턴스 메서드 add를 호출하고 출력해주세요 매개변수는 long,long 인자값은 3,2	
		System.out.println(mm.add(3L, 2L));
//18.int 타입의 배열 a를 선언하고 값을 100,200,300으로 초기화
		int[] a = { 100, 200, 300};
//19.객체 mm의 배열 인스턴스 매서드 add를 호출하고 출력하세요
		System.out.println(mm.add(a));
	}
}
//3.클래스 MyMath3를 생성하세요
class MyMath3{
//4.인스턴스 메서드 add를 생성 매개변수는 int타입 2개 반환값은 a+b를 생성
	int add(int a, int b){
		return a+b;
	}
//5.인스턴스 메서드 add를 생성 매개변수는 int,long  반환값은 a+b를 생성
	long add(int a, long b){
		return a+b;
	}
//6.인스턴스 메서드 add를 생성 매개변수는 long,int  반환값은 a+b를 생성
	long add(long a, int b){
		return a+b;
	}
//7.인스턴스 메서드 add를 생성 매개변수는 long두개  반환값은 a+b를 생성
	long add(long a, long b){
		return a+b;
	}
//8.인스턴스 메서드 add를 생성 매개변수는 int형 배열 a
	int add(int[]a){
//9.int타입 지역변수 result를 선언하고 값은 0으로 초기화
		int result = 0;
//10.메서드 for를 생성하고 int형 i를 선언하고 값은 0으로 초기화, 조건식은 i의 길이가 배열a의 길이 미만일때true, i의 값을 증감시킨다
		for (int i = 0; i < a.length; i++) {
//11.result에 a배열의 길이만큼과 result를 더하고 대입하세요
			result += a[i];
		}
//12.반환값은 result로 하세요
		return result;
	}
}
