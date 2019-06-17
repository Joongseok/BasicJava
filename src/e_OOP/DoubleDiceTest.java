package e_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		//throwDice호출 총 이동거리를 반환
		DoubleDice dd = new DoubleDice();
		
		int dice = dd.throwDice();
		System.out.println("두수를 합한 값: " +dice);
	}
}



class DoubleDice{
	
	
	//전역 변수 없음.
	// 메서드명 : throwDice
	//인스터늣 메서드 
	int throwDice(){
		int thd = (int)(Math.random()*6+1);
		int thd1 =  (int)(Math.random()*6+1);
		int result = 0;
		System.out.println("thd의 값 : " + thd);
		System.out.println("thd1의 값:  " + thd1);
		if(thd!=thd1){
			result = thd+thd1; 
		}else{
			result = thd+thd1+throwDice();
		}
		return result;
	}
	
}