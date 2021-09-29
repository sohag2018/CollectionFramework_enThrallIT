package collectionFramworkPkg;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_04_ImpPriorityQueue {

	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<>();
		q.add("Sohag");
		q.add("Boby");
		q.add("Kamran");
		q.add("Noyan");
		q.add("Boni");
		q.add("Shakir");
		
		
		//as per priority basis here it will print --bases AscII table
		 Iterator it=q.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
		
	}

}
