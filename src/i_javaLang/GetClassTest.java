package i_javaLang;

import java.util.Arrays;

public class GetClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Card c1 = new Card();
		Class cc = c1.getClass();
		
		System.out.println(Arrays.toString(cc.getInterfaces()));
		
		Class cc2 = Card.class;
		System.out.println(Arrays.toString(cc2.getInterfaces()));
		
		System.out.println(cc.getName());
		Class cc3 = Class.forName("i_javaLang.Card");
		System.out.println(Arrays.toString(cc3.getInterfaces()));
		
	}
}

