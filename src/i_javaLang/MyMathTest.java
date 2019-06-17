package i_javaLang;

import static java.lang.Math.*;

public class MyMathTest {
	public static void main(String[] args) {
		
		double d = 25.143636;
		
		//반올림
		System.out.println(round(d));
		
		//올림
		System.out.println(ceil(d));
		
		//버림
		System.out.println(floor(d));
		
		//제곱
		System.out.println(pow(3,4));
		
		//루트
		System.out.println(sqrt(3));
		
		
		//1. 포인트 객체 두개를 만드세요
		Point2 p = new Point2(1, 1);
		Point2 p1 = new Point2(2, 1);
		
		//2. Point2클래스에 getDistance메서드를 만든 후 
		//   인자값으로 넘겨준 Point2와의 거리를 반환해주세요
		//   소수점 셋재짜리에서 반올림해서 두번째 자리까지 반환하도록 만들기 루트이용
		
		System.out.println(p.getDistance(p1));
	}
}


class Point2{
	int x;
	int y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(Point2 p){
		
		double a = pow((p.x-this.x),2);
		double b = pow((p.y-this.y),2);
		double result =((int)(sqrt(a+b)*100+0.5))/100d;
		
		return result;
		
//		double result = sqrt(pow(p.x-x, 2) + pow(p.y-y, 2));
//		float result2 =((int)(result*100+0.5))/100f;
//		return result2;
//		
		
//		double result = sqrt((pow(p.x-p1.x,2))+(pow(p.y-p1.y,2))*1000);
//		int result1 = (int)(round(result));
		
	}
	
	
	
}