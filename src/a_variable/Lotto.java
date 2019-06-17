package a_variable;

import java.awt.print.Printable;
import java.util.Scanner;

//5. 1~45 사이의 랜덤한 정수값으로 lotto의 모든방에 입력해주세요
//	단, 정수값은 중복되면 안된다.
public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lotto.length; i++) {
			int random =(int)(Math.random()*45+1);
			lotto[i] = sc.nextInt();
			lotto[i] = random;
			System.out.println(lotto[i]);
		}
		
		
	}

}
