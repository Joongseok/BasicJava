package g_Exception;

public class ExceptionBasic {
	public static void main(String[] args) {
		/*
		1. 프로그램 오류 
		  - 프로그램이 실행 중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 종료되는 경우
		  - 컴파일 에러 : 컴파일중에 발생하는 에러
		  - 런타임 에러 : 실행중에 발생하는 에러
		  - 에러는 프로그램 코드를 수정을 해서 수습될수 없는 심각한 오류
		     예외는 프로그램 코드를 수정하여 수습될수 있는 경미한 오류 
		     
		2. RuntimeException클래스와 그 외 클래스
		  - 모든 예외의 최고조상은 Exception이다 
		  - RuntimeException클래스들은 주로 프로그래머의 실수에 의해서 발생할수 있는 예외
		    ex) IndexOutOfBoundsException, NullPointException...
		  - Exception클래스들은 주로 외부의 영향으로 발생할수 있는 예외
		    ex) FileNotFoundException, ClassNotFoundException....
		    
		3. 예외처리(try-catch)
		  - 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
		  - 작성방법
		    try{
		    	예외가 발생할 가능성이 있는 문장
		    } catch(Exception e){
		    	예외가 발생하였을때 처리할 문장
		    }
		    
		  - 발생한 예외의 종류와 일치하는 단 한개의 catch블럭만 수행한다.  
		     		 
		4. 예외발생시키기
		  - 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다.
		    Exception e = new Exception();
		  - 키워드 throw를 이용해서 발생시키면 된다.
		  	throw e;
		  	
		  	throw new Exception();
		 
		5. 예외 던지기 (throws Exception)
		  - 메서드 예외 선언하기
		    : 메서드의 선언부에 키워드 'throws'를 사용해서 메서드 내에서 발생할수 있는
		        예외를 모두 적어주면 된다.
		    : 처리는 해당 메서드를 호출한 쪽에서 처리해 주어야 한다.
		 
		6. finally//최종적으로
		  - try-catch 블럭의 예외발생에 상관없이 실행되어야할 코드를 포함한다.
		  
		  try{
		  	예외가 발생할 가능성이 있는 코드를 작성
		  	int a;
		  }catch(Exception1 e){
		  	예외가 발생하였을때 처리할 문장
		  }finally{
		  	예외발생에 상관없이 실행될 코드
		  }
		  
		  - try -> catch -> finally
		  	try -> fianlly
		 
		 
		 */
	}
}
