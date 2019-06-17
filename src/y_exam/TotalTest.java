package y_exam;

public class TotalTest {//1.메서드 에어리어에 TotalTest가 추가되고, 생성자가 없기 때문에 컴파일할때 java스스로 기본생성자인 TotalTest()를 만들어준다. 보이진 않지만 
						//메서드 에어리어에 totalTest클래스 안에 생성자도 포함되어있음.
	public static void main(String[] args) {//2.Totaltest클래스에 메인메서드가 생성되고 메인메서드가 콜스택에 적재된다. 
		
		
		TvMaker.color = "Blue"; //3.대입연산자 왼쪽부터 시작한다 TvMaker클래스를 호출하러 가서 클래스가 없으니까 TvMaker클래스를 메서드에어리어에 만들고
								//메서드 에어리어에 TvMaker클래스안에 친구인 클래스변수 static String타입의 color와 static int타입의 inch가 초기화된다.
								//그리고 메인메서드의 안에서 TvMarker클래스의 클래스변수 color를 "blue"로 초기화 해준다. 클래스변수는 전역변수이기때문에 
								// 인스턴스화 없이 메인메서드에서 초기화가 가능하다
		TvMaker tm = new TvMaker();//4.대입연산자 왼쪽부터 시작해서 Tv메이커클래스가리킬  객체를 메인메서드의 지역변수인 tm에 선언하고 new연산자를 통해
								  // Tv메이커 클래스의 인스턴스가 생성될때 Tv메이커의 인스턴스 변수 스트링타입 name은 "";로 초기화 되고
								  //인트형 변수 age는 기본값인 0으로 초기화 된다.그리고 Tv메이커 생성자를 만나this를 name의 값은 "man" age의 값은25로 초기화 된다.
							      //현재 heap영역 tm의 주소에 Tv메이커의 인스턴스 친구들은 name,age TvMaker()기본생성자,TvMaker(String, int)가 있는 매개변수 생성자가 있다. 
								  // main메서드의 tm을 heap영역의 tm의 주소가 가리키고 있다.
								  // 
				tm.age = 30; //기본값 0에서 기본생성자를 통해 25가 되었고 25가 된 age의 값을 tm의주소에 age값을 30으로 변경 한다. tm은 TvMaker의 객체로써 TvMaker클래스안의
							// 인스턴스 변수 age는 30으로 값이 변함.
				// 3. 메서드 호출
				// 3.1
				System.out.println(TvControll.channel);//클래스 변수는 전역변수이기때문에 따로 new를 만들지 않고 토탈테스트클래스에서 호출하여 사용가능하다.
														//현재 channel변수는 int형 변수 값은15이다.
				TvControll.volumeDown();//TvContoll클래스의 볼륨다운 메서드를호출하였다.if문의 true조건식에 부합하지않기 때문에else로 가서 변수채널을++ 하고 채널값을 리턴한다.
										//그러므로 현재 채널의 값은 초기값인 15에서 16이됌 
				System.out.println(TvControll.channel);//채널의 값은 16이므로 16이 출력됌

				// 3.2
				TvControll tc; // TvControll의 인스턴스를 사용할 수 있도록 할 객체 tc를 메인메서드 안에  선언한다.
				tc = new TvControll(); // TvControll를  tc의 주소에 가리키고 매개변수가 없는 티비콘트롤 기본생성자를 생성한다.현재 티비콘트롤클래스에 기본생성자가 생김
				System.out.println(tc.volume);//티비콘트롤 인스턴스 변수인 볼륨값 99가 출력됌
				tc.volumeUp();//티비콘트롤 클래스의  볼륨업 메소드를 호출한다 볼륨업메소드의 식if조건문에 부합하지 않아서 else로 가서 볼륨 ++을한후 리턴문을 만나서 볼륨값을 100으로 초기화하고 빠져나옴 
				System.out.println(tc.volume);//32줄에서 볼륨의 값이 100으로 초기화 되었기떄문에 100이출력됌
				tc.volumeUp();//티비콘트롤 클래스의 볼륨업 메소드로 간다>if 조건식 상수 MAX_VOLUME와 볼륨값을 비교했을때 상수 맥스볼륨도 100이고 볼륨도 100이다 그래서 if조건식 안으로 들어감>
							  // 들어가서 볼륨이 100 이고 대입연산자를 통해 상수 MIN_VOLUME의 값인 0을 준다.그래서 볼륨은 0이되고 리턴을만나서 볼륨0값을 인스턴스변수 볼륨에 초기화해줌 
						      // 현재 볼륨값은 0
				System.out.println(tc.volume);//볼륨값이 0으로 초기화 되어서 0이 출력된다.

				//
				Calc cc = new Calc();//Calc 클래스에 인스턴스를 사용할수 있도록 할 객체 cc를 메인메서드 안에선언하고 대입연산자 오른쪽으로 가서 new연산자를 통해 cc의 주소에 
									//Calc인스턴스 변수와 인스턴스 메서드가 참조되고 메인메서드의 cc를 cc의 주소가 가리킨다.그리고 매개변수가 없는 기본 생성자Calc가 Calc클래스 안에 생성된다.
									//
				System.out.println(cc.add(Integer.MAX_VALUE, 4));//Calc클래스로 가서  add(int,int)에 100과 4가 들어가고 안의 a+b리턴이기때문에 100+4.즉 104가 출력된다.
				System.out.println(cc.add(3L, Integer.MAX_VALUE));//add(long int)인 메서드에 들어가서 식인 a+b가 되어 롱타입3+100이되고 형변환되어 long타입 값103이 리턴하고 출력됌

			}
		}

		class TvMaker {
			// 1.
			// 1.1
			static String color;//3.7번줄에 의해서 color의 값이 스트링 기본값인 널에서 블루로 초기화 되었다.
			static int inch;
			// 1.2
			String name = "";//53번줄으로 내려갔을때 man으로 초기화 됌
			int age;//53번줄에서 값이25로초기화된다. 

			// 2.
			// 2.1
			TvMaker() {
				this("man", 25);
			}

			// 2.2
			TvMaker(String name, int age) {
				this.name = name;
				this.age = age;
			}
		}

		class TvControll {
			final int MAX_VOLUME = 100;
			final int MIN_VOLUME = 0;
			static final int MAX_CHANNEL = 50;
			static final int MIN_CHANNEL = 1;

			static int channel = 15;
			int volume = 99;

			// 4. return문
			int volumeUp() {
				if (volume == MAX_VOLUME) {
					volume = MIN_VOLUME;
				} else {
					volume++;
				}

				return volume;
			}

			static int volumeDown() {
				if (channel == MAX_CHANNEL) {
					channel = MIN_CHANNEL;
				} else {
					channel++;
				}
				return channel;
			}
		}

		class Calc {
			// 5.
			int add(int a, int b) {
				return a + b;
			}

			long add(long a, int b) {
				return a + b;
			}

			int minus(int a, int b) {
				return a + b;
	}
}



