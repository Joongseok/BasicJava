package j_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(new Integer(5));
		list1.add(new Integer(2));
		list1.add(3);
		list1.add(1);
		list1.add(4);
		
		System.out.println(list1);
		
		//그동안 정렬하느라 고생하셨습니다.
		// 정렬해주는 메서드가 있어요
		Collections.sort(list1);
		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		System.out.println(list2);
		//delete
		System.out.println(list2.remove(new Integer(1)));
		//select
		System.out.println(list2.get(1));
		//insert
		list2.add(1, 15);//2 15 3 4
		System.out.println(list2);
		//update
		list2.set(2, 22);//2 15 22 4
		System.out.println(list2);
		//인덱스가있느냐
		System.out.println(list1.contains(4));
		//인덱스다가지고 있는지 비교하기
		System.out.println(list1.containsAll(list2));
		
		
		
		
		
		
		
		
		
		
	}
}
