package e_OOP;

public class Myclass {
	public static void main(String[] args) {
		//2. Bicycle의 높이를 출력해주세요
		System.out.println(Bicycle.height);
		//3. Bicycle의 길이를 출력해주세요
		System.out.println(Bicycle.width);
		//4. Bicycle클래스의 객체를 만들어주세요 bi
		Bicycle bi = new Bicycle();
		//5. bi의 색상을 Red로 변경해주세요
		bi.changeColor();
		//6. bi의 브레이크가 잠겨있다면 풀어주세요 .
		bi.bicycleStop();
		//7. bi의 페달속도를 페달 메써드를 이용하여 5까지 하나씩올려주세요
		for (int i = 0; i < 5; i++) {
			bi.pedalUp();
		}
		//8. bi의 핸들을 왼쪽으로 핸들메써드를 이용하여 -3까지 돌려주세요
		for (int i = 0; i < 3; i++) {
			bi.leftHandle();
		}
		//9. bi의 기어를 기어메서드를 이용하여 3까지 하나씩올려주세요 
		for (int i = 0; i < 2; i++) {
			bi.gearUp();
		}
		//10. 아래와 같이 출력해주세요
		// bi의 색상은 : ..이고 페달속도는 ..이고 핸들은 왼쪽으로 ..이고 기어는 ..단이다.
		System.out.println("bi의 색상은: "+bi.color+"이고 페달속도는 "+bi.pedal+ "이고 핸들은 왼쪽으로 "+bi.handle+"이고 기어는"+bi.gear+"단이다." );
		//12. 아래와 같이 출력해주세요
		// bi의 길이는 : ..이고 높이는 ..이다
		System.out.println("bi의 길이는 : "+bi.width+"이고 높이는 "+bi.height+"이다." );
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//명사적인 의미 자전거
	//페달pedal,브레이크break,
	//핸들handle
	//기어gear
	//색상color(클래스변수)
	//너비(클래스변수)
	//높이(클래스변수)
		
	
	
	
	
	
	//동사적 의미(행위)
	//페달를 밟는다. 브레이크를 누른다.
	//핸들 좌,우로 돌린다.
	//기어를 변경한다
	//색상을 선택한다
	//
	
	
	}
}



class Bicycle{
	//1. 자전거 길이를 저장 할 수 있는 클래스변수 width 선언하고 120의 값으로 초기화 하세요
	static int width= 120;//자전거 길이 클래스변수
	//2. 카드의 높이를 저장 할 수 있는 클래스변수 height 선언하고 60의 값으로 초기화 하세요
	static int height= 60;//자전거 높이 클래스변수
	//3. 자전거의 색상를 저장 할 수 있는 클래스변수 color 선언해주세요 
	String color;//자전거 색상 클래스변수
	//4. 자전거의 페달 밟는 속도를 저장할 수  있는 인스턴스변수 pedal를 선언해주세요
	int pedal;//페달 밟는 속도 인스턴수변수 밟지 않을떄는 기본값0
	//5. 자전거의 정지를 저장할수 있는 인스턴스변수 stop을 선언해주세요
	boolean stop;// 브레이크 인스턴스변수
	//6. 자전거의 핸들의 각도를 저장할수 있는 인스턴스변수 handle을 선언해주세요
	int handle;//핸들 좌우로 돌리는 인스턴스변수
	//7. 자전거의 기어를 바꿀수 있는 인스턴스변수 gear를 선언하고 1의 값으로 초기화 해주세요
	int gear = 1;//기어 단을 지정할 인스턴수 변수
	//8. 자전거의 색상을 바꿀 수 있는 클래스메써드 changeColor를 선언하고 색상을 "red"로 초기화 해주세요
	void changeColor(){//색상 "red" 
		color = "red";
	}
	//9. 자전거의 페달 속도를 높일수 있는 인스턴스메써드 pedalUp을 선언하고 pedal의 속도가 증감할 수 있도록 초기화 해주세요
	void pedalUp(){//페달을 밟는 속도 올리는 것
		pedal++;
	}
	//10. 자전거의 페달 속도를 낮출수 있는 인스턴스메써드 pedalDown을 선언하고 pedal의 속도가 1씩 감소할 수 있도록 초기화 해주세요
	void pedalDown(){//페달 밟는 속도를 낮추는것
		if (pedal>0) {
			pedal--;
		}
	}
	//11. 자전거 브레이크가 걸려있으면 브레이크를 풀고 브레이크가 풀려있으면 브레이크를 걸수있는 인스턴스메써드 bicycleStop을 선언하고 초기화해주세요  
	void bicycleStop(){//브레이크를 잡고있으면 떼는거로
		stop = !stop;
	}
	//12. 자전거 핸들을 오른쪽으로 돌릴수 있는 인스턴스메써드 rightHandle을 선언하고 오른쪽으로 5까지 증감할수 있도록 초기화 해주세요
	void rightHandle(){//핸들을 오른쪽으로 돌린다.5까지만 돌아감
		if(handle<5){
			handle++;
		}
	}
	//13. 자전거 핸들을 왼쪽으로 돌릴수 있는 인스턴스메써드 leftHandle을 선언하고 왼쪽으로 -5까지 1씩감소 할수 있도록 초기화 해주세요
	void leftHandle(){//핸들을 왼쪽으로 돌린다
		if (handle<5 && handle>-5 ) {//핸들을 왼쪽으로 -5만큼 꺾을수 있다.
			handle--;
		}
	}
	//14. 자전거 기어를 높일수 있는 인스턴스메써드 gearUp을 선언하고 5까지 증감할수 있도록 초기화 해주세요
	void gearUp(){//5단기어 자전거의 기어를 올릴떄
		if (gear<5) {
			gear++;
		}
	}
	//14. 자전거 기어를 낮출수 있는 인스턴스메써드 gearDown을 선언하고 1까지 감소할수 있도록 초기화 해주세요
	void gearDown(){//5단기어 자전거의 기어를 내릴떄
		if (gear<=5 && gear>1) {
			gear--;
		}
	}
	
	
	
	
	
	
	
}