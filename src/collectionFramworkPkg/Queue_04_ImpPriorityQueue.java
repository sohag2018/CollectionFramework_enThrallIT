package collectionFramworkPkg;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_04_ImpPriorityQueue {

	public static void main(String[] args) {
		Queue<Character> q=new PriorityQueue<>();
		q.add('a'); //
		q.add('b');//15
		q.add('c');//13
		q.add('d');//11
		
		System.out.println(q.peek());
		
		
		
		//as per priority basis here it will print --bases AscII table
		 Iterator it=q.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
		
	}

}
