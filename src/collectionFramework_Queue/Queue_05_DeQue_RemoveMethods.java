package collectionFramework_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_05_DeQue_RemoveMethods {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		//wehen use add()--->//adding element at the top
		//putting value 40-30-20-10-5-0    when get 40-30-20-10-5-0
		//wil work following FIFO
		dq.add(40);//will add element at bottom
		dq.add(30);
		dq.add(20);
		dq.add(10);
		dq.add(5);
		dq.add(0);
		
		System.out.println(dq);
		
		//printing the top one
		System.out.println(dq.peek());
	
		//removing the top one
		//System.out.println(dq.remove());
		
		//
		System.out.println(dq.removeFirst());
		

	}

}
