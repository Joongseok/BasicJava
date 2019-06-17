package e_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
	
		 
		RecursiveCall rc = new RecursiveCall();
		
		long result = rc.factorial(20);
		System.out.println(result);
	}

	
	
	
	
	long factorial(int num){
		long result = 0;
		if(num ==1){
			result = 1;
		}else { 
			result = num * factorial(num-1);
		}
		
		
		
		return result;
	}
}
