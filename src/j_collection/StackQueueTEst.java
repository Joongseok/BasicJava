package j_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTEst {
	public static void main(String[] args) {
		
		Stack<String> list1 = new Stack<String>();
		list1.push("0");
		list1.push("1");
		list1.push("2");
		System.out.println("==================== stack =================");
		while(!list1.empty()){//비어있으면 
			System.out.println(list1.pop());
		}
		
		System.out.println("==================== Queue =================");
		Queue<String> que = new LinkedList<String>();
		que.offer("0");
		que.offer("1");
		que.offer("2");
		
		while(!que.isEmpty()){
			System.out.println(que.poll());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
