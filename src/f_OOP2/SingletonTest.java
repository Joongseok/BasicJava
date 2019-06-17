package f_OOP2;

public class SingletonTest {
	public static void main(String[] args) {
	Singleton s1 = Singleton.getInstance();
	System.out.println(s1.a);
	Singleton s2 = Singleton.getInstance();
	System.out.println(s2.a);
	
	s1.a =20;
	System.out.println(s1.a);
	System.out.println(s2.a);
	
	}
}


class Singleton{
	int a;
	private static Singleton s;
	
	private Singleton(){
		
	}
	
	static Singleton getInstance(){
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
}