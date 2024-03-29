package y_exam;


public class Exam_06 {
	public static void main(String[] args) {
//		SutdaCard card1 = new SutdaCard(3, false);//6-2
//		SutdaCard card2 = new SutdaCard();
//	
//		System.out.println(card1.info());
//		System.out.println(card2.info());//6-2
//		
//		Student s = new Student();//6-4
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//
//		System.out.println("이름:"+s.name);
//		System.out.println("총점:"+s.getTotal());
//		System.out.println("평균:"+s.getAverage());//6-4
//		
////		Student s = new Student("홍길동",1,1,100,60,76);//6-5
//		System.out.println(s.info());//6-5
//		
//		System.out.println(Exercise6_6.getDistance(1, 1, 2, 2));//이렇게 해야 호출됌(물어보기)//6-6
	}
}
//		[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
//		타 입 			변수명 		설 명
//		int 		num 		카드의 숫자.(1~10사이의 정수)
//		boolean 	isKwang 	광(光)이면 true, 아니면 false
		
//		[6-1]답 : class SutdaCard{
//			int num;
//			boolean isKwang;
//		}	
		
//[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
//결과와 같은 결과를 얻도록 하시오.
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard(int num, boolean isKwang){//객체 Card1을선언하고 생성할때 만들어질 매개변수 있는 생성자
		this.num = num;//this.num으로 인스턴스 변수 num에 인자값 num을 대입한다
		this.isKwang = isKwang;//this.isKwang으로 인스턴스 변수 isKwang에 인자값을 대입
	}
	SutdaCard(){//객체 Card2를 선언하고 생성할때 만들어질 기본생성자
		this(1, true);//1K가 출력되려면 false에서는 출력이 안되었으므로 true에서 출력되게 해야함
		this.num = 1;//이것도 가능
		this.isKwang = true;//이것도 가능
	}
	String info(){//객체 Card의 값을 출력할 메서드
		return num + (isKwang ? "K" : "");//삼항연산자로 트루일때만 K가 반환되게 한다.
	}
}
//		[실행결과]
//		3
//		1K
		
//[6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
//타 입 변수명 설 명
//String 		name 	학생이름
//int 		ban		 반
//int 		no 		번호
//int 		kor 	국어점수
//int 		eng 	영어점수
//int 		math 	수학점수
//타 입 			변수명	 설 명
//[6-3]답: 
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(){//6-4
		int total = kor + eng + math;//kor,eng,math을 담을 변수 total지역변수 선언
		return total;// 합쳐진 값을 반환
	}
	float getAverage(){//6-4
		return (int)(getTotal()/3f*10+0.5f)/10f;//반환된 값이있는 메서드 getTotal나누기 과목수 3 둘째자리에서 반올림 할거니까 *10하고 0.5f하면 플롯형 출력
	}
						//> 그리고 인트형으로 소수점떨궈내고 나누기10f로 첫번째 소수점 까지만 나오게 함
		//6-5
	String info(){//이름과 쉼표를 사용하려면 스트링 타입으로 반환해야함 위에서 만든 인스턴스 변수와 인스턴스 메서드를 붙여주면 된다.
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();//
		}
	}
//[6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
//getTotal()과 getAverage()를 추가하시오.
		
//int getTotal(){
//	int total = kor + eng + math;//kor,eng,math을 담을 변수 total지역변수 선언
//	return total;// 합쳐진 값을 반환
//}
//float getAverage(){
//	return (int)(getTotal()/3f*10+0.5f)/10f;//반환된 값이있는 메서드 getTotal나누기 과목수 3 둘째자리에서 반올림 할거니까 *10하고 0.5f하면 플롯형 출력
////	> 그리고 인트형으로 소수점떨궈내고 나누기10f로 첫번째 소수점 까지만 나오게 함
//String info(){//이름과 쉼표를 사용하려면 스트링 타입으로 반환해야함 위에서 만든 인스턴스 변수와 인스턴스 메서드를 붙여주면 된다.
//	return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();//
//	}
//}
	
//[실행결과]
//이름:홍길동
//총점:236
//평균:78.7	
//[6-4]답: int getTotal(){
//	int total = kor + eng + math;//kor,eng,math을 담을 변수 total지역변수 선언
//	return total;// 합쳐진 값을 반환
//}
//float getAverage(){
//	return (int)(getTotal()/3f*10+0.5f)/10f;//반환된 값이있는 메서드 getTotal나누기 과목수 3 둘째자리에서 반올림 할거니까 *10하고 0.5f하면 플롯형 출력
													//> 그리고 인트형으로 소수점떨궈내고 나누기10f로 첫번째 소수점 까지만 나오게 함
//}
//[6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
//[연습문제]/ch6/Exercise6_5.java
//class Exercise6_5 {
	//public static void main(String args[]) {
//		Student s = new Student("홍길동",1,1,100,60,76);
//		System.out.println(s.info());
	//}
//}
//class Student {
//String info(){//이름과 쉼표를 사용하려면 스트링 타입으로 반환해야함 위에서 만든 인스턴스 변수와 인스턴스 메서드를 붙여주면 된다.
//	return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();//
//}
//}
//[실행결과]
//홍길동,1,1,100,60,76,236,78.7
//[6-5]답: String info(){//이름과 쉼표를 사용하려면 스트링 타입으로 반환해야함 위에서 만든 인스턴스 변수와 인스턴스 메서드를 붙여주면 된다.
//	return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();//
//}
		
//[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
//[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
//[연습문제]/ch6/Exercise6_6.java
class Exercise6_6 {
//	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		double a = Math.sqrt(x*x1+y*y1);
		return Math.sqrt(a);  
	}
//	public static void main(String args[]) {
//		System.out.println(getDistance(1,1,2,2));//이렇게 하면 호출이안된다..
		//System.out.println(Exercise6_6.getDistance(1, 1, 2, 2));이렇게 해야 호출됌(물어보기)
//	}
}
//[실행결과]
//1.4142135623730951
//[6-6]답: double a = Math.sqrt(x*x1+y*y1);//이렇게 해서 되긴 했는데 때려맞춘문제..
//		return Math.sqrt(a); 
		
//[6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
//드로 정의하시오.
//[연습문제]/ch6/Exercise6_7.java
//class MyPoint {
//	int x;
//	int y;

//	MyPoint(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	/*
//	(1) 인스턴스메서드 getDistance를 작성하시오.
//	*/
//}

//class Exercise6_7 {
//	public static void main(String args[]) {
//		MyPoint p = new MyPoint(1,1);

//		// p와 (2,2)의 거리를 구한다.
//		System.out.println(p.getDistance(2,2));
//	}
//}
//[실행결과]
//1.4142135623730951
//[6-7]답 : double getDistance(int x1, int y1) {//클래스메서드는 인스턴스변수와 인스턴스 메서드를 사용할수 없으므로 static을 빼준다.//
//			double a = Math.sqrt(x*x1+y*y1);
//			return Math.sqrt(a);  
//}
		
//		[6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
//class PlayingCard {
//	int kind;//static이없으니까 인스턴스변수
//	int num;//static이없으니까 인스턴스변수
		
//	static int width;//static이니까 클래스변수
//	static int height;//static이니까 클래스변수
		
//	PlayingCard(int k, int n) {
//		kind = k;//메서드 안에 선언된 지역변수
//		num = n;//메서드 안에 선언된 지역변수
//	}
		
//	public static void main(String args[]) {
//		PlayingCard card = new PlayingCard(1,1);//메서드 안에 선언된 지역변수
//	}
//}
//- 클래스변수(static변수) : width, height
//- 인스턴스변수 : kind, num
//- 지역변수 :k,n,card
		
//[6-9] 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
//중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
//	class Marine {
//		int x=0, y=0; // Marine의 위치좌표(x,y)
//		int hp = 60; // 현재 체력
//		static int weapon = 6; // 공격력// 모든 병사의 공격력이 같아야하므로 클래스변수
//		static int armor = 0; // 방어력// 모든 병사의 방어력이 같아야 하므로 클래스변수
//		
//		void weaponUp() {//인스턴스 변수는 클래스 변수를 사용할수 있으므로 붙이지 않아도된다?(물어보기)
//		weapon++;
//		}
//		
//		void armorUp() {//인스턴스 변수는 클래스 변수를 사용할수 있으므로 붙이지 않아도된다?(물어보기)
//		armor++;
//		}
//		
//		void move(int x, int y) {
//		this.x = x;
//		this.y = y;
//		}
//	}
//[6-9]답 :static int weapon = 6;
//		  static int armor = 0;
		
//[6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.//맞다.
//b. 생성자는 객체를 생성하기 위한 것이다.//객체를 생성하는것은 new연산, 객체를 초기화 하는건 생성자
//c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.//맞다.
//d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.//맞다.
//e. 생성자는 오버로딩 할 수 없다.//매개변수의 타입과 매개변수의 개수가 다르면 할수있다.
//[6-10]답 : b,e
		
//[6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
//a. 객체 자신을 가리키는 참조변수이다.//this는 참조변수로 인스턴스 자신을 가리킨다.  
//b. 클래스 내에서라면 어디서든 사용할 수 있다.//X클래스 멤버에서는 사용불가능
//c. 지역변수와 인스턴스변수를 구별할 때 사용한다.//this가 없으면 지역변수인지 참조변수인지 알수가 없음
//d. 클래스 메서드 내에서는 사용할 수 없다.//생성자는 객체를 인스턴스화 할때 생성된다.클래스를 호출할때 인스턴스가 존재하지 않을수도 있기 때문.
//[6-11]답: b 반드시 첫줄에서 this를 사용해야 되고 클래스 이름과 동일해야함
		
//[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
//a. 메서드의 이름이 같아야 한다.//O
//b. 매개변수의 개수나 타입이 달라야 한다.//O
//c. 리턴타입이 달라야 한다.//리턴타입은 상관없다.
//d. 매개변수의 이름이 달라야 한다.//매개변수의 타입과 이름이 같으면 매개변수 이름이 다르더라도 구분할수 없다.
//[6-12]답: c,d
		
//[6-13] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
//long add(int a, int b) { return a+b;}
		
//a. long add(int x, int y) { return x+y;}//매개변수 타입과 갯수가 같아서 오버로딩 안됌
//b. long add(long a, long b) { return a+b;}//매개변수 타입이 달라서 가능
//c. int add(byte a, byte b) { return a+b;}//매개 변수 타입이 달라서 가능 리턴타입은 상관없다.
//d. int add(long a, int b) { return (int)(a+b);}//매개 변수 타입이 다르므로 가능
//[6-13]답 : b,c,d 리턴타입은 오버로딩을 하는데 상관없다.
		
//[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.(물어보기)
//b.지역변수는 사용하기 전에 반드시 초기화해야 한다//??(물어보기)
//c.초기화 블럭보다 생성자가 먼저 수행된다.//X순서  : 초기화 블럭 > 생성자
//d.명시적 초기화를 제일 우선적으로 고려해야 한다.//O명시적 초기화 => 변수의 선언과 동시에 초기화 => int a =5;
//e.클래스변수보다 인스턴스변수가 먼저 초기화된다.//X클래스가 처음 만들어질때 클래스변수들이 메모리에 만들어지고 클래스 초기화 블럭이 클래스변수들을 초기화
//[6-14]답 : 
			
//[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
//a. 기본값-명시적초기화-초기화블럭-생성자
//b. 기본값-명시적초기화-생성자-초기화블럭
//c. 기본값-초기화블럭-명시적초기화-생성자
//d. 기본값-초기화블럭-생성자-명시적초기화
//[6-15]답: a
		
//[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a. 자동 초기화되므로 별도의 초기화가 필요없다.//초기화 해야함(물어보기)
//b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.//O
//c. 매서드의 매개변수로 선언된 변수도 지역변수이다.//O
//d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.//소멸되니까 적다??
//e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.//콜스택에 적재됌
//[6-16]답: a,e
		
//[6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
//println
//method1
//method2
//main
//a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.//맞다 가장 밑에 있는게 가장 먼저 저장된것
//b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.//아니다 대기중인것
//c. method2메서드를 호출한 것은 main메서드이다.//맞다
//d. println메서드가 종료되면 method1메서드가 수행을 재개한다.//맞다
//e. main-method2-method1-println의 순서로 호출되었다.//맞다
//f. 현재 실행중인 메서드는 println 뿐이다.//맞다.
//[6-17]답 : b
		
//[6-18] 다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그
//이유를 설명하시오.
//		
//class MemberCall {
//	int iv = 10;//인스턴스 변수
//	static int cv = 20;//클래스 변수
//				
//	int iv2 = cv;//인스턴스 변수에 클래스 변수를 대입
//	static int cv2 = iv; // 라인 A //X 클래스변수에는 인스턴스 변수를 대입할수 없다.
		
//	static void staticMethod1() {//클래스 메서드
//		System.out.println(cv);//클래스메서드에 클래스 변수를 호출하는것이므로 가능
//		System.out.println(iv); // 라인 B //X 클래스메서드에 인스턴스 변수를 호출하는것이므로 불가능
//	}
		
//	void instanceMethod1() {//인스턴스 메서드
//		System.out.println(cv);//인스턴스메서드는 클래스 메서드 호출가능
//		System.out.println(iv); // 라인 C //O 인스턴스메서드는 인스턴스 메서드 호출 가능
//	}
		
//	static void staticMethod2() {//클래스 메서드
//		staticMethod1();//X 클래스메서드 호출 가능 하지만 클래스 메서드 안에 인스턴스 변수를 호출하려고 하기떄문에 불가능
//		instanceMethod1(); // 라인 D //X 클래스메서드에서 인스턴스 메서드 호출 불가능
//	}
		
//	void instanceMethod2() {//인스턴스 메서드
//		staticMethod1(); // 라인 E //X 인스턴스 메서드에서 클래스 메서드 호출 가능하지만 클래스 메서드 안에 인스턴스 변수를 호출하기 떄문에 불가능(물어보기)
//		instanceMethod1();// 인스턴스 메서드 호출가능
//	}
//}
		
//[6-19] 다음 코드의 실행 결과를 예측하여 적으시오.
//[연습문제]/ch6/Exercise6_19.java
//class Exercise6_19
//{
//	public static void change(String str) {
//		str += "456";
//	}
//	public static void main(String[] args)
//	{
//		String str = "ABC123";//지역변수 str을 선언하고 "ABC123"으로 초기화했음
//		System.out.println(str);//출력하면 그렇게 나온다
//		change(str);//매개변수로 str을 참조한다. 참조하면 ABC123뒤에 456이 붙어서 값이 변함
//		System.out.println("After change:"+str);//ABC123456이 출력됌
//	}
//}
		
//[6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
		
//	메서드명 : shuffle
//	기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//		   처리한 배열을 반환한다.
		
//	반환타입 : int[]
//	매개변수 : int[] arr - 정수값이 담긴 배열
		
//[연습문제]/ch6/Exercise6_20.java
//class Exercise6_20
//{
//	/*
//	(1) shuffle메서드를 작성하시오.
//	*/
		
//	public static void main(String[] args)
//	{
//		int[] original = {1,2,3,4,5,6,7,8,9};
//		System.out.println(java.util.Arrays.toString(original));
		
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
//	}
//}
//[실행결과]
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//[4, 6, 8, 3, 2, 9, 7, 1, 5]
		
//[6-21] Tv클래스를 주어진 로직대로 완성하시오. 완성한 후에 실행해서 주어진 실행결과
//와 일치하는지 확인하라.
//[참고] 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.
//[연습문제]/ch6/Exercise6_21.java
class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
		
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
		
	void turnOnOff() {
		// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
		if (MAX_VOLUME > volume) {
			++volume;
		}
	}
	void volumeDown() {
		// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
		if (volume>MIN_VOLUME) {
			--volume;
		}
	}
	void channelUp() {
		// (4) channel의 값을 1증가시킨다.
		++channel;
		if (channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
					// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
	}
	void channelDown() {
//			(5) channel의 값을 1감소시킨다.
		--channel;
//		 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		if (channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
	}
} // class MyTv
//class Exercise6_21 {
//	public static void main(String args[]) {
//		MyTv t = new MyTv();
//		
//		t.channel = 100;
//		t.volume = 0;
//		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//		
//		t.channelDown();
//		t.volumeDown();
//		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//		
//		t.volume = 100;
//		t.channelUp();
//		t.volumeUp();
//		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//	}
//}
//[실행결과]
//CH:100, VOL:0
//CH:99, VOL:0
//CH:100, VOL:100
		
//[6-22] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//		메서드명 : isNumber
//		기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//			모두 숫자로만 이루어져 있으면 true를 반환하고,
//			그렇지 않으면 false를 반환한다.
//			만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
//		반환타입 : boolean
//		매개변수 : String str - 검사할 문자열

//[Hint] String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
//[연습문제]/ch6/Exercise6_22.java
//class Exercise6_22 {
//	/*
//	(1) isNumber메서드를 작성하시오.
//	*/
//		
//	public static void main(String[] args) {
//		String str = "123";
//		System.out.println(str+"는 숫자입니까? "+isNumber(str));
//				
//		str = "1234o";
//		System.out.println(str+"는 숫자입니까? "+isNumber(str));
//	}
//}
//[실행결과]
//123는 숫자입니까? true
//1234o는 숫자입니까? false

