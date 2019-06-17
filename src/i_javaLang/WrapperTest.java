package i_javaLang;

public class WrapperTest {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i1);
		
		Integer i3 = 100;
		
		int i4 = new Integer(200);
		
		
		Object[] a = new Object[3];
		a[0] = 20;
		
		int i5 = (int) a[0];
		
		
		
		System.out.println(100 == i1);
		
		//1. 최대, 최소값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);//bit수
		
		//BYTES => byte
		// Integer.BYTE => 4
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
