package study_test;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class Test extends Frame{
	public static void main(String[] args) {
		//DrawShape ds = new DrawShape();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("타이틀을 입력해주세요");
//		String str = sc.next();
		Test ds = new Test("다콱");
		Point p;
		
	}
	@Override
	public void paint(Graphics g) {
		//1. Circle객체를 만들어 주세요
		//   단 매개변수가 두개인 생성자를 이용해주세요
		Point p = new Point(50, 50);
		Circle c = new Circle(p, 51);
		//2. g.drawOval()를 이용하여 원을 그려주세요
		g.drawOval(p.x, p.y, c.r, c.r);
		//3. Triangle객체를 만들어주세요
		//   단, 매개변수가 하나인 생성자를 이용해주세요
		//   점의 좌표는 100,100,  200,200,   100,200
		Point p1 = new Point(100, 100);
		Point p2 = new Point(200, 200);
		Point p3 = new Point(100, 200);
		Point[] p4 = new Point[]{p1,p2,p3};
		Triangle t = new Triangle(p4);
		//4. g.drawLine()3개를 이용하여 삼각형을 그려주세요
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
		g.drawLine(p2.x, p2.y, p3.x, p3.y);
		g.drawLine(p3.x, p3.y, p1.x, p1.y);
		//5. JVM그려오세요 (A4로 안되니 2장이상 붙여서 하셔야 합니다.)
	}
	
//	public Test() {
//		super("알거없자나");//생성자내에서 부모의 생성자를 사용가능 this같은 클래스 내에서 다른 생성자호출할때
//		setSize(500, 500);
//		setVisible(true);
//		setBackground(Color.MAGENTA);
//	}
	
	Test(String title){
		super(title);//생성자내에서 부모의 생성자를 사용가능 this같은 클래스 내에서 다른 생성자호출할때
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.MAGENTA);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
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
	Circle(Point d,int d2){
		this.center = d;
		this.r = d2;
	}
	//4. 기본생성자를 만등러주세요
	//	 단, 매개변수가 두개인 생성자를 이용하여 
	//   점은 100,100 반지름 200으로 만들어주세요
	Circle(){
		this(new Point(100,100), 200);
	}
}



class Triangle{
	//1. 점 3개를 저장할수 있는 변수를 선언해주세요 p
	Point [] p;
	//2. 매개변수가 하나인 생성자를 만들어주세요
	//   넘어온 인자값으로 p를 초기화해주세요
	Triangle(Point[] p){
		this.p = p;
	}
	//3. 매개변수가 세개인 생성자를 만들어주세요
	//   넘어온 인자값으로 p를 초기화해주세요
	Triangle(Point a, Point b,Point c){
		this.p = new Point[]{a,b,c};
	}

}





