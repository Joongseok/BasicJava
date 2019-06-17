package y_exam;


public class EXam_07 {
	public static void main(String[] args) {
		
		SutdaDeck1 deck = new SutdaDeck1();//7-1~7-2
		System.out.println(deck.pick(1));
		System.out.println(deck.pick());
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		deck.suhffle1();
		for (int j = 0; j < deck.cards.length; j++) {
			System.out.print(deck.cards[j]+",");
		}
		System.out.println();//7-1~7-2
		
		Tv1 t = new Tv1();//7-5
		Child1 c = new Child1();//7-7
		System.out.println("x="+c.getX());
		
		MyTv2 t1 = new MyTv2();//7-10
		
		t1.setChannel(10);
		System.out.println("CH:"+t1.getChannel());
		t1.setVolume(20);
		System.out.println("VOL:"+t1.getVolume());
		
		t1.setChannel(10);//7-11
		System.out.println("CH:"+t1.getChannel());
		t1.setChannel(20);
		System.out.println("CH:"+t1.getChannel());
		t1.gotoPrevChannel();
		System.out.println("CH:"+t1.getChannel());
		t1.gotoPrevChannel();
		System.out.println("CH:"+t1.getChannel());
		
		
		Unit u = new GroundUnit();
		Tank t2 = new Tank();
		AirCraft ac = new AirCraft();
		
////		if(u instanceof GroundUnit){
////			System.out.println(true);
////		}
////		AirUnit au = ac;
////		if(au instanceof AirCraft){
////			System.out.println(true);
////		}
//		if(u instanceof Tank){
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		if(gu instanceof Tank){
//			System.out.println(true);
//		}
//		System.out.println(u.);
//		u = (Unit)ac;
//		System.out.println(ac.type);
//		u = ac;
//		System.out.println(u.type);
//		GroundUnit gu = (GroundUnit)u;
//		System.out.println(gu.type);
//		AirUnit au = ac;
//		System.out.println(au.type);
//		t2 = (Tank)u;
//		gu = t2;
		//
		//a. u조상 = (Unit)ac자손;//O
		//b. u 조상= ac자손;//X
		//c. GroundUnit gu자손 = (GroundUnit)u조상;//O
		//d. AirUnit au조상 = ac자손;//X
		//e. t자손 = (Tank)u조상;//O
		//f. GroundUnit gu조상 = t자손;//X
		
//		Unit1 [] group = new Unit1[3];// 	7-17
//		group [0] = new Marine();
//		group [1] = new Tank1();
//		group [2] = new Dropship();
//		group [0].move(1, 2);
//		group [1].move(2, 3);
//		group [2].move(4, 5);
		
		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());
		b.buy(new Tv1());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();//	 		7-19
		
		Parent2 p = new Child2();//		7-20
		Child2 c1 = new Child2();
		System.out.println("p.x = " + p.x);//p의 타입은 Parent이기 때문에 값이 100 출력된다.
		p.method();//p의 타입이 Parent이지만 child의 인스턴스를 생성했기때문에 "Child Method"가 출력된다.인스턴스는 타입의 영향을 받지 않는다.
		System.out.println("c.x = " + c1.x);//c의 타입이 Child이기 때문에200
		c1.method();//Child의 인스턴스 c의 method()를 호출하면 "Child Method"가 출력된다.
		
	}
}
//	[7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯
//	다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자
//	가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이
//	어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
//	[연습문제]/ch7/Exercise7_1.java
//	[7-2] 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하
//	시오.
//	[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//	1. 메서드명 : shuffle
//	기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//	반환타입 : 없음
//	매개변수 : 없음
//	2. 메서드명 : pick
//	기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//	반환타입 : SutdaCard
//	매개변수 : int index - 위치
//	3. 메서드명 : pick
//	기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//	반환타입 : SutdaCard
//	매개변수 : 없음
class SutdaDeck1 {//섯다카드 덱 클래스
	final int CARD_NUM = 20;//카드 수
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];//카드 20장을 담을 배열
	SutdaDeck1() {
		int a = 0;
		for (int j = 1; j < 11; j++) {
			if (j ==3||8 ==j ||j==1 ) {
				cards[a++] =  new SutdaCard1(j, true);
				}else{
					cards[a++] =  new SutdaCard1(j, false);
					}
			}
		for (int j = 1; j < 10+1; j++) {
			cards[a++] =  new SutdaCard1(j, false);
			}
	}
	void suhffle1(){//섞는거
		SutdaCard1 temp;
		for (int i = 0; i < cards.length; i++) {
			int a  = (int)(Math.random()*cards.length);
			temp = cards[i];
			cards[i] = cards[a];
			cards[a] = temp;
		}
	}
	SutdaCard1 pick(int index){//하나뽑는거
		return cards[index];
	}
	SutdaCard1 pick(){
		return pick((int)(Math.random()*cards.length));
	}
	
}
class SutdaCard1 {
	private final int NUM;//7-14
	private final boolean ISKWANG;//7-14 파이날로 변경
	SutdaCard1() {
		this(1, true);
	}
	SutdaCard1(int num, boolean isKwang) {
		this.NUM = num;
		this.ISKWANG = isKwang;
	}
	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return NUM + ( ISKWANG ? "K":"");
		}
	}
class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck1 deck = new SutdaDeck1();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}
}
//	[실행결과]
//	1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,


//[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
//[7-3] 답 :상속 클래스의 메서드를 자손클래스가 선언부는 그대로 내버려 두고 구현부만 바꿔서 재사용 하는것

//[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
//a. 조상의 메서드와 이름이 같아야 한다.//O
//b. 매개변수의 수와 타입이 모두 같아야 한다.//O
//c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.//X 조상메서드보다 좁은 범위로 변경이 불가능하다.
//d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.//O

//[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
//위해서는 코드를 어떻게 바꾸어야 하는가?
//[연습문제]/ch7/Exercise7_5.java
class Product1
{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	Product1(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}

class Tv1 extends Product1 {
	Tv1() {
		super(0);//						[7-5]답 :슈퍼 생성자를 생성하면 된다.
	}
	
	public String toString() {
		return "Tv";
	}
}
//class Exercise7_5 {
//public static void main(String[] args) {
//
//	}
//}
//[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인
//가? 답 : 생성자가 생성될때 상속받은 생성자가 먼저 호출이 되기떄문이이다.


//[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
//[연습문제]/ch7/Exercise7_7.java
//[7-7] 답 : Child클래스의의 인스턴스를 생성하면 처음에 조상 클래스 생성자 먼저 생긴다. 200이 출력된다.
class Parent1 {
	int x=100;//>200
	
	Parent1() {// 순서 :1
		this(200);
	}
	
	Parent1(int x) {//순서 :2 기본생성자의 this()의 인자값 200을 받아서 인스턴스 변수 int x는 200으로 변경된다.
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child1 extends Parent1 {
	int x = 3000;//>1000
	
	Child1() {//순서 :3
		this(1000);
	}
	
	Child1(int x) {//순서 :4 인자값을 1000받아서 인스턴스 변수 int x의 값은 1000으로 변경된다.
		this.x = x;
	}
}
//class Exercise7_7 {
//	public static void main(String[] args) {
//		Child c = new Child();//상속 클래스 의 x값인 200이 되고 그리고 this의 인자값인 1000이 되서 c.x는 1000이된다.
//		
//		System.out.println("x="+c.getX());//Child클래스에 메소드 getX()가 없기 떄문에 상속클래스의 메소드를 호출하고 x값은 상속크랠스의 x값이 된다. 즉 200이 호출됌
//	}
//}

//[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
//것은? 답 : public - protected - default - private인 'a'가 정답이다.
//	a. public-protected-(default)-private
//	b. public-(default)-protected-private
//	c. (default)-public-protected-private
//	d. private-protected-(default)-public

//[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
//옳지 않은 것은? (모두 고르시오) a,b,d
//	a. 지역변수 - 값을 변경할 수 없다.//O
//	b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.//O 상속할수 없다.
//	c. 메서드 - 오버로딩을 할 수 없다.//X 오버 라이딩할수 없다.
//	d. 멤버변수 - 값을 변경할 수 없다.//O

//[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
//수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
//getter와 setter메서드를 추가하라.
//[연습문제]/ch7/Exercise7_10.java
class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int gotoPrevChannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	
	boolean getIsPowerOn(){//파워온오프
		return isPowerOn; 
	}
	int getChannel(){//채널
		return channel; 
	}
	int getVolume(){//볼륨
		return volume; 
	}
	
	void setIsPowerOn(boolean isPowerOn){//파워온오프
		this.isPowerOn = isPowerOn;
	}
	void setChannel(int channel){//채널
		
		this.channel = channel;
	}
	void setVolume(int volume){//볼륨
		this.volume = volume;
	}
//	t.gotoPrevChannel();//
//	System.out.println("CH:"+t.getChannel());
//	t.gotoPrevChannel();
//	System.out.println("CH:"+t.getChannel());
	void gotoPrevChannel(){
		if (channel == gotoPrevChannel) {
			
		}
//		
	}
	
	/*
	(1) 알맞은 코드를 넣어 완성하시오.
	*/
}
class Exercise7_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}
}
//[실행결과]
//CH:10
//VOL:20

//[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
//기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
//[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.

//	메서드명 : gotoPrevChannel
//	기 능 : 현재 채널을 이전 채널로 변경한다.
//	반환타입 : 없음
//	매개변수 : 없음
//[연습문제]/ch7/Exercise7_11.java
//class MyTv2 {
/*
(1) 문제7-10의 MyTv2클래스에 gotoPrevChannel메서드를 추가하여 완성하시오.
*/
//}
class Exercise7_11 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
//[실행결과]
//CH:10
//CH:20
//CH:10
//CH:20
//[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a. public은 접근제한이 전혀 없는 접근 제어자이다.//O같은 프로젝트 안에서 사용가능
//b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.// O
//c. 지역변수에도 접근 제어자를 사용할 수 있다.// X 전역변수에서만 가능 어차피 지역변수는 지역을 벗어나면 사용할수없다.
//d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.//O
//e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.//O
//[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?

//[7-14] 문제7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실 한번 값이 지정되면
//변경되어서는 안 되는 값이다. 카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이
//될 수 도 있기 때문이다. 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시
//오. 
//[답] : private final 로 설정하였다. 92번줄

//[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
//(모두 고르시오.)
class Unit {String type = "u";}
class AirUnit extends Unit {String type = "au";}
class GroundUnit extends Unit {String type = "gu";}
class Tank extends GroundUnit {String type = "T";}
class AirCraft extends AirUnit {String type = "AC";}
//
//Unit u = new GroundUnit();
//Tank t = new Tank();
//AirCraft ac = new AirCraft();
//Ground
//
//a. u조상 = (Unit)ac자손;//O
//b. u 조상= ac자손;//X
//c. GroundUnit gu자손 = (GroundUnit)u조상;//O
//d. AirUnit au조상 = ac자손;//X
//e. t자손 = (Tank)u조상;//O
//f. GroundUnit gu조상 = t자손;//X

//[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
//class Car {}
//class FireEngine extends Car implements Movable {}
//class Ambulance extends Car {}

//FireEngine fe = new FireEngine();

//a. fe instanceof FireEngine//O
//b. fe instanceof Movable//O
//c. fe instanceof Object//O
//d. fe instanceof Car//O
//e. fe instanceof Ambulance//X
//[7-16] 답 : a,b,c,d

//[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
//클래스를 상속받도록 코드를 변경하시오. 추상클래스를 만들고 메서드를 선언부만 있는 추상메서드를 만들고 상속받은 클래스들이 추상클래스를 구현하도록한다.
abstract class Unit1{
	int x, y; 
	abstract void move(int x, int y) ;
	abstract void stop();
}

class Marine extends Unit1 { // 보병
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }
	void stimPack() { /* 스팀팩을 사용한다.*/}
}
class Tank1  extends Unit1{ // 탱크
	
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }
	void changeMode() { /* 공격모드를 변환한다. */}
}
class Dropship extends Unit1 { // 수송선
	
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void stop() { /* 현재 위치에 정지 */ }
	void load() { /* 선택된 대상을 태운다.*/ }
	void unload() { /* 선택된 대상을 내린다.*/ }
}
//[7-18] 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
//[Hint] instanceof연산자를 사용해서 형변환한다.

//	메서드명 : action
//	기 능 : 주어진 객체의 메서드를 호출한다.
//			DanceRobot인 경우, dance()를 호출하고,
//			SingRobot인 경우, sing()을 호출하고,
//			DrawRobot인 경우, draw()를 호출한다.
//	반환타입 : 없음
//	매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스
//[연습문제]/ch7/Exercise7_18.java
//class Exercise7_18 {
//	public static void action(Robot r){
//		if (r instanceof DanceRobot ) {
//			((DanceRobot) r).dance();
//		}
//		if (r instanceof SingRobot) {
//			((SingRobot) r).sing();
//		}
//		if (r instanceof DrawRobot) {
//			((DrawRobot) r).draw();
//		}
//	}
//	/*
//	(1) action메서드를 작성하시오.
//	*/
//	public static void main(String[] args) {
//		
//		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
//		
//		for(int i=0; i< arr.length;i++)
//			action(arr[i]);
//		action(arr[0]);
//	} // main
//}
//class Robot {}
//
//
//class DanceRobot extends Robot {
//	public void dance() {
//		System.out.println("춤을 춥니다.");
//	}
//}
//class SingRobot extends Robot {
//	public void sing() {
//		System.out.println("노래를 합니다.");
//	}
//}
//
//class DrawRobot extends Robot {
//	public void draw() {
//		System.out.println("그림을 그립니다.");
//	}
//}
//[실행결과]
//춤을 춥니다.
//노래를 합니다.
//그림을 그립니다.

//[7-19] 다음은 물건을 구입하는 사람을 정의한 Buyer클래스이다. 이 클래스는 멤버변수
//로 돈(money)과 장바구니(cart)를 가지고 있다. 제품을 구입하는 기능의 buy메서드와 장
//바구니에 구입한 물건을 추가하는 add메서드, 구입한 물건의 목록과 사용금액, 그리고 남
//은 금액을 출력하는 summary메서드를 완성하시오.

//1. 메서드명 : buy
//	기 능 : 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 빼고,
//		   장바구니(cart)에 담는다.
//			 만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
//	반환타입 : 없음
//	매개변수 : Product p - 구입할 물건

//2. 메서드명 : add
//	기 능 : 지정된 물건을 장바구니에 담는다.
//	만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다.
//	반환타입 : 없음
//	매개변수 : Product p - 구입할 물건

//3. 메서드명 : summary
//	기 능 : 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
//	반환타입 : 없음
//	매개변수 : 없음
//[연습문제]/ch7/Exercise7_19.java
//class Exercise7_19 {
//	public static void main(String args[]) {
//		Buyer b = new Buyer();
//		b.buy(new Tv());
//		b.buy(new Computer());
//		b.buy(new Tv());
//		b.buy(new Audio());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		
//		b.summary();
//	}
//}
class Buyer {
	int money = 1000;
	Product1[] cart = new Product1[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index
	
	void buy(Product1 p) {
	
//		(1) 아래의 로직에 맞게 코드를 작성하시오.
//		1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
		if (money < p.price) {
			System.out.println("잔액이 부족하여 Computer를 살수없습니다.");
			return;
		}else{
//		1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
			money -= p.price;
		}
//		1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
		add(p);
	
	}
	
	void add(Product1 p) {
		
//		(2) 아래의 로직에 맞게 코드를 작성하시오.
//		1.1 i의 값이 장바구니의 크기보다 같거나 크면
		if (i >=cart.length) {
//		1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
			Product1[] cartCopy = new Product1[cart.length*2];
//		1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
			for (int i = 0; i < cart.length; i++) {
				cartCopy[i] = cart[i];
			}
//		1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
			cart = cartCopy;
		}
//		1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
		cart[i++] = p;
	} // add(Product p)
	
	void summary() {
		
//		(3) 아래의 로직에 맞게 코드를 작성하시오.
//		1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
		System.out.print("구입한 물건 :");
		for (int i = 0; i < cart.length; i++) {
			if (cart[i]!=null) {
				System.out.print(cart[i]+",");
			}
		}
		System.out.println();
//		1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i]!=null) {
				sum += cart[i].price;
			}
		}
		System.out.println("사용한금액 : "+sum);
//		1.3 물건을 사고 남은 금액(money)를 출력한다.
		System.out.println("남은금액 : "+money);
		
	} // summary()
}

class Product2 {
	int price; // 제품의 가격
	
	Product2(int price) {
		this.price = price;
	}
}

class Tv3 extends Product1 {
	Tv3() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer extends Product1 {
	Computer() { super(200); }
	
	public String toString() { return "Computer";}
}
class Audio extends Product1 {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}
//[실행결과]
//잔액이 부족하여 Computer을/를 살수 없습니다.
//구입한 물건:Tv1,Computer,Tv1,Audio,Computer,Computer,
//사용한 금액:850
//남은 금액:150

//[7-20] 다음의 코드를 실행한 결과를 적으시오.
//[연습문제]/ch7/Exercise7_20.java
//class Exercise7_20 {
//	public static void main(String[] args) {
//		Parent p = new Child();
//		Child c = new Child();
//		
//		System.out.println("p.x = " + p.x);//p의 타입은 Parent이기 때문에 값이 100 출력된다.
//		p.method();//p의 타입이 Parent이지만 child의 인스턴스를 생성했기때문에 "Child Method"가 출력된다.인스턴스는 타입의 영향을 받지 않는다.
//		
//		System.out.println("c.x = " + c.x);//c의 타입이 Child이기 때문에200
//		c.method();//Child의 인스턴스 c의 method()를 호출하면 "Child Method"가 출력된다.
//	}
//}
class Parent2 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}
class Child2 extends Parent2 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
	
}

//[7-21] 다음과 같이 attack메서드가 정의되어 있을 때, 이 메서드의 매개변수로 가능한
//것 두 가지를 적으시오. 
//interface Movable { void move(int x, int y); }
//	void attack(Movable f) {/* 내용 생략 */}
//[7-21]답 : Movable과 Movable을 구현한 구현체의 타입을 매개변수로 가능

//[7-22] 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래
//스와 Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야
//한다.
//(1) 클래스명 : Circle
//	조상클래스 : Shape
//	멤버변수 : double r - 반지름
//	
//(2) 클래스명 : Rectangle
//	조상클래스 : Shape
//	멤버변수 : double width - 폭
//			double height - 높이
//	메서드 :
//		1. 메서드명 : isSquare
//		기 능 : 정사각형인지 아닌지를 알려준다.
//		반환타입 : boolean
//		매개변수 : 없음
//[연습문제]/ch7/Exercise7_22.java
abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}
class Circle extends Shape{
	Point center;
	double r;
	Circle c = new Circle();
	Circle(){//기본생성자만들면 밑에 값으로 초기화
			this(new Point(100,100),200);
	}
	Circle(Point center, double r){//center는 new연산으로 생성하여 값 쓰기
		this.center = center;
		this.r = r;
	}

	@Override
	double calcArea() {// 도형의 면적을 계산해서 반환하는 메서드
		
		return center.x + center.y + r*2;
	}
}
class Rectangle extends Shape{
	double width;
	double height;
	boolean isSquare(){
		if (width == height) {
			System.out.println("정사각형");
		}
		System.out.println("직사각형");
		return true;
	}
	@Override
	double calcArea() {// 도형의 면적을 계산해서 반환하는 메서드
		return 0;
	}
}
class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

//[7-23] 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시
//오.
//1. 메서드명 : sumArea
//	기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
//	반환타입 : double
//	매개변수 : Shape[] arr
//	
//[연습문제]/ch7/Exercise7_23.java
//class Exercise7_23
//{
//	/*
//	(1) sumArea메서드를 작성하시오.
//	*/
//	public static void main(String[] args)
//	{
//		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
//		System.out.println("면적의 합:"+sumArea(arr));
//	}
//}
//[실행결과]
//면적의 합:93.68140899333463

//[7-24] 다음 중 인터페이스의 장점이 아닌 것은?
//a. 표준화를 가능하게 해준다.
//b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
//c. 독립적인 프로그래밍이 가능하다.
//d. 다중상속을 가능하게 해준다.
//e. 패키지간의 연결을 도와준다.

//[7-25] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
//
//[연습문제]/ch7/Exercise7_25.java
//class Outer {
//	class Inner {
//		int iv=100;
//	}
//}
//
//class Exercise7_25 {
//	public static void main(String[] args) {
//		/*
//			(1) 알맞은 코드를 넣어 완성하시오.
//		*/
//	}
//}
//[실행결과]
//100

//[7-26] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
//
//[연습문제]/ch10/Exercise7_26.java
//class Outer {
//	static class Inner {
//	int iv=200;
//	}
//}
//
//class Exercise7_26 {
//	public static void main(String[] args) {
//		/*
//			(1) 알맞은 코드를 넣어 완성하시오.
//		*/
//	}
//}
//[실행결과]
//200

//[7-27] 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.
//
//[연습문제]/ch7/Exercise7_27.java
//class Outer {
//	int value=10;
//	
//	class Inner {
//		int value=20;
//		void method1() {
//			int value=30;
//			
//			System.out.println(/* (1) */);
//			System.out.println(/* (2) */);
//			System.out.println(/* (3) */);
//		}
//	} // Inner클래스의 끝
//} // Outer클래스의 끝
//class Exercise7_27 {
//	public static void main(String args[]) {
//		/*
//			(4) 알맞은 코드를 넣어 완성하시오.
//		*/
//		
//	inner.method1();
//	}
//}
//[실행결과]
//30
//20
//10

//[7-28] 아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.
//
//[연습문제]/ch7/Exercise7_28.java
//import java.awt.*;
//import java.awt.event.*;
//
//class Exercise7_28
//{
//	public static void main(String[] args)
//	{
//		Frame f = new Frame();
//		f.addWindowListener(new EventHandler());
//	}
//}
//class EventHandler extends WindowAdapter
//{
//	public void windowClosing(WindowEvent e) {
//		e.getWindow().setVisible(false);
//		e.getWindow().dispose();
//		System.exit(0);
//	}
//}

//[7-29] 지역 클래스에서 외부 클래스의 인스턴스 멤버와 static멤버에 모두 접근할 수
//있지만, 지역변수는 final이 붙은 상수만 접근할 수 있는 이유 무엇인가?