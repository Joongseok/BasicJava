package e_OOP;

class Data{
	int x;//10
}



public class InterVari {
	public static void main(String[] args) {
		//1. Data클래스의 객체를 만들어주세요 d1
		Data d1 = new Data();
		//2. d1의 x값을 10으로 변경해 주세요
		d1.x = 10;
		//3. main()기본형 : 10(d1의 x값)
		System.out.println("main()기본형 : "+ d1.x);
		//4. change메서드를 호출해주세요
		//   단 인자값으로 d1의 x값을 보내주세요
		InterVari.change(d1.x);//단순히 변수의 값을 읽고 변경되지는 않음.               
		
		//5. main()기본형 :d1의 x값
		System.out.println("main()기본형 : "+d1.x);
		//6. Data클래스의 객체를 만들어주세요 d2
		Data d2 = new Data();
		//7. d2의 x값을 10으로 변경해 주세요
		d2.x = 10;		
		//8. main()참조형 : d2의 x값
		System.out.println("main()참조형 : "+d2.x);		
		//9. change메서드를 호출해주세요
		//   단 인자값으로 d2를 보내주세요
		InterVari.change(d2);	
				
		//10. main()참조형 :d2의 x값
		System.out.println("main()참조형 : "+d2.x);
		
	}
	
	static void change(int x){
		x = 1000;//10
		System.out.println("change() 기본형 : "+x);
	}
	
	
	static void change(Data d1){
		d1.x = 1000;
		System.out.println("change() 참조형: "+d1.x);
	}
	
	
}
