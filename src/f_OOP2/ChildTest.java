package f_OOP2;

public class ChildTest {
	public static void main(String[] args) {
		//1. Child의 객체를 만들어주세요 ci
		Child ci = new Child();
		//2. ci의 volume을 15로 변경해주세요
		ci.volume = 15;
		//3. ci의 volume을 하나 증가시켜주세요
		ci.volumeUp();
		//4. ci의 volume을 출력해주세요
		System.out.println(ci.volume);//16
		//5. ci의 channel을 5로 변경해주세요
		ci.channel = 5;
		//6. ci의 channel을 출력해주세요
		System.out.println(ci.channel);//5
		//7. ci의 channel을 하나 증가시켜주세요
		ci.channelUp();
		//8. ci의 channel을 출력해주세요
		System.out.println(ci.channel);//1
		
	}
}

class Parent{
	int channel;//0 > 1
	void channelUp(){
		channel++;
	}
}

class Child extends Parent{
	int volume;// 0 > 15 > 16
	int channel;// 0 > 5 
	void volumeUp(){
		volume++;
	}
}