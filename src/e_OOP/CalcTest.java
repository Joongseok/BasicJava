package e_OOP;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		//1.숫자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		do{
			
			System.out.print("첫번째 숫자를 입력하세요 :");
			int num = sc.nextInt();	
//		//2.문자열을 입력받는다.
			System.out.print("부호를 입력해 주세요 : ");
			String sign = sc.next();
//		//3. 숫자를 입력받는다.
			System.out.print("두번쨰 숫자를 입력하세요 :");
			int num2 = sc.nextInt();
//		//4. 입력받은 부호가 +이면 add메서드
		// 입력받은 부호가 -이면 sub메서드
		// 입력받은 부호가 *이면 multiply메서드
		// 입력받은 부호가 /이면 divide메서드
		// 를 호출하여 연산 결과를 출력해 주세요
			if (sign.equals("+")) {
				int result = calc.add(num, num2);
				System.out.println(num +"+"+ num2 +"= "+result);
			}else if (sign.equals("-")) {
				int result = calc.sub(num, num2);
				System.out.println(num +"-"+ num2 +"= "+result);
			}else if (sign.equals("*")) {
				long result = calc.multiply(num,num2);
				System.out.println(num +"*"+ num2 +"= "+result);
			}else if (sign.equals("/")) {
				double result = calc.divide(num, num2);
				System.out.println(num +"/"+ num2 +"= "+result);
			}else{
				System.out.println("+,-,*,/중에 입력해주세요");
				break;
				}
			}
		while(true);
		}
	}


class Calc{//계산기
	
	int add(int a, int b){
		int result = a+b;
		return result;
	}
	int sub(int a, int b){
		int result = a-b;
		return result;
	}
	long multiply (long a, long b){
		long result = a*b;
		return result;
	}
	double divide(double a, double b){
		double result = a/b;
		return result;
	}
	
	

}