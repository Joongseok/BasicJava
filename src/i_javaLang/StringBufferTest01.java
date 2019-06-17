package i_javaLang;

public class StringBufferTest01 {
	public static void main(String[] args) {
		
		/*
		String text = "a";
		text += "a";
		text += "a";
		text += "a";
		text += "a";
			.
			.
			.
			.
			
			
		String text = "a";
		text = new StringBuffer(text).append("a").toString();	
		text = new StringBuffer(text).append("a").toString();	
		text = new StringBuffer(text).append("a").toString();	
			.
			.
			.
			.
			
		*/
//		long start = System.currentTimeMillis();
//		String text = "a";
//		for (int i = 0; i < 300000; i++) {
//			text +="a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
//		
		long start = System.currentTimeMillis();
		StringBuilder text = new StringBuilder("a");
		for (int i = 0; i < 30000000; i++) {
			text.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		
		
		
		
		
		
		
		
		
	}
}
