package g_Exception;


public class ExceptionEx03 {
	public static void main(String[] args){
		method1();
	}
	
	static void method1(){
		
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void method2()throws Exception{
		throw new Exception("메서드 2번에서 발생");
	}
	
}
