package g_Exception;

public class ExceptionEx02 {
	public static void main(String[] args) {
		
		Exception e = new Exception("서경이때문에");
		try {
			throw e;
		} catch (Exception e1) {
//			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		System.out.println("아니야");
		
		throw new RuntimeException();
		
		// 컴파일러가 예외처리를 강제하지 않는 경우
		// 1. RuntimeException클래스들 
		// 2. Error와 그 자손들 
		// 이런 것들을 'unchecked예외'라고 한다.
		
	}
}
