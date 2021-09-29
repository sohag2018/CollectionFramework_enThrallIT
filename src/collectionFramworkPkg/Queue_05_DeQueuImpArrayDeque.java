package collectionFramworkPkg;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_05_DeQueuImpArrayDeque {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<>();
		dq.add("Sohag");//adding element
		dq.push("Boby");//alternate way of adding
		dq.push("Kamran");//alternate way of adding
		dq.push("YYYY");//alternate way of adding
		
		//Need to make sure Deque works as LIFO or FIFO
		//it will return top element
		System.out.println(dq.element());
		System.out.println(dq.peek());
		
		//removing top
		System.out.println(dq.remove());
		
		System.out.println(dq.removeFirst());
		
		System.out.println(dq);
		
		for(String s:dq) {
			System.out.println(s);
		}
		
	}

}
