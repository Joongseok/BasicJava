package i_javaLang;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String text = "100,200,300,400,500";
		
		
		StringTokenizer st = new StringTokenizer(text, ",");
		
		while(st.hasMoreElements()){
			System.out.println(st.nextToken());
		}
		
		System.out.println("===========split=========");
		String data = "100,,,200,,300";
		String[] result = data.split("0,");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("==================Stringtokenizer==========================");
		StringTokenizer st2 = new StringTokenizer(data, "0,");
		while(st2.hasMoreElements()){
			System.out.println(st2.nextToken());
		}
		
		
		
	}
}
