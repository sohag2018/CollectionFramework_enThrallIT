package collectionFramework_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_03_ImpLinkedList {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
		q.add("Sohag");//head
		q.add("Boby");
		q.add("Kamran");
		q.add("Noyan");
		q.add("Boni");
		q.add("Shakir");//tail
		
		
		//using peak()
		if(q.peek().equalsIgnoreCase("sohag")) {
			System.out.println(q.peek());
		}else {System.out.println("Boby");}
		
		//using empty()
		
		if(q.isEmpty()) {
			System.out.println("Lets go home. no more work");
		}else {System.out.println("Do fast we have to finsish our work ASAP");}
		
		

	}

}
