package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Scanner;

public class DrawShape extends Frame{
	public static void main(String[] args) {
		//DrawShape ds = new DrawShape();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("타이틀을 입력해주세요");
//		String str = sc.next();
//		DrawShape ds = new DrawShape(str);
//		Point p;
	}
	@Override
	public void paint(Graphics g) {
		//1. Circle객체를 만들어 주세요
		//   단 매개변수가 두개인 생성자를 이용해주세요
		
		//2. g.drawOval()를 이용하여 원을 그려주세요
		
		//3. Triangle객체를 만들어주세요
		//   단, 매개변수가 하나인 생성자를 이용해주세요
		//   점의 좌표는 100,100,  200,200,   100,200
		
		//4. g.drawLine()3개를 이용하여 삼각형을 그려주세요
		
		//5. JVM그려오세요 (A4로 안되니 2장이상 붙여서 하셔야 합니다.)
	}
	
//	public DrawShape() {
//		super("알거없자나");//생성자내에서 부모의 생성자를 사용가능 this같은 클래스 내에서 다른 생성자호출할때
//		setSize(500, 500);
//		setVisible(true);
//		setBackground(Color.MAGENTA);
//	}
	
	DrawShape(String title){
		super(title);//생성자내에서 부모의 생성자를 사용가능 this같은 클래스 내에서 다른 생성자호출할때
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.MAGENTA);
		setResizable(false);
	}
}




/**
 * 점을 관리하기 위한 클래스
 * @author PC25
 */
class Point{
	int x; // 점의 x좌표
	int y; // 점의 y좌표
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle{
	//1. 점 하나를 저장할수 있는 변수를 선언해주세요 center
	Point center;
	//2. 정수값 반지름을 저장할수 있는 변수를 선언해 주세요 r
	int r;
	//3. 매개변수가 두개인 생성자를 만들어주세요
	//	 넘어온 인자값으로 center와 r을 초기화해주세요
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	//4. 기본생성자를 만등러주세요
	//	 단, 매개변수가 두개인 생성자를 이용하여 
	//   점은 100,100 반지름 200으로 만들어주세요
	Circle(){
		this(new Point(100,100),200);
	}
}



class Triangle{
	//1. 점 3개를 저장할수 있는 변수를 선언해주세요 p
	Point[] p ;
	
	//2. 매개변수가 하나인 생성자를 만들어주세요
	//   넘어온 인자값으로 p를 초기화해주세요
	Triangle(Point[] p){
		this.p = p;
	}
	//3. 매개변수가 세개인 생성자를 만들어주세요
	//   넘어온 인자값으로 p를 초기화해주세요
	Triangle(Point a, Point b, Point c){
		this.p = new Point[]{a,b,c};
		
	}

}



