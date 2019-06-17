package f_OOP2;


public class InnerEx02 {
	public static void main(String[] args) {
		Outer i = new Outer();
//		Outer.Inner inner = i.new Inner();
//		inner.method(30);
		
		
	}
}

class Outer{
	int value = 10;
	
	class Inner{
		int value = 20;
		
		void method(int value){
			System.out.println(value);//
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
		
	}
}