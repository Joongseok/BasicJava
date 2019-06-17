package j_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class HashSetTest {
	public static void main(String[] args) {
		//1. Set객체를 만들어주세요 set
		Set<Integer> set = new HashSet<Integer>();
		//2. set변수에 0~10사이의 랜덤한 정수값을 추가해주세요
		//  반복횟수는 20회
		for (int i = 0; i < 20; i++) {
			boolean result = set.add((int)(Math.random()*45));
			System.out.println(result);
		}
		
		ArrayList<Integer> set2 = new ArrayList<Integer>(set);
		java.util.Collections.sort((set2));
		System.out.println(set2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
