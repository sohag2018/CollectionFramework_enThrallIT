package collectionFramework_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInface__02_ImpByLinkedList {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
		q.add("Sohag");//head
		q.add("Boby");
		q.add("Kamran");
		q.add("Noyan");
		q.add("Boni");
		q.add("Shakir");//tail
		
		System.out.println(q);
		
		for(String s:q) {
			System.out.println(s);
		}
		
		System.out.println(q.peek());

		

		//contains() returns empty elements or not
		System.out.println(q.contains(0));
		
		
		//will remove the top
		System.out.println(q.poll());
		
		//will remove specific element
		System.out.println(q.remove("Boni"));
		
		System.out.println(q);
		
	
		
		//will clear all elements
		q.clear();
		
		System.out.println(q);
		
	}

}
