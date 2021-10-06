package collectionFramework_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class Queue_4_1_PriorityQueueInt {

	public static void main(String[] args) {
	PriorityQueue<Integer> q=new PriorityQueue<Integer>();

	/*q.add(32);//51+50=101
	q.add(31);//51+49=100
	q.add(35);//51+53=104
	q.add(34);//51+52=103
	q.add(30); //51+48=99
	
	//order highest value:  
	

	
	System.out.println(q);
	System.out.println(q.peek());

	*/
	
	//priority will be lower vallue >Higher value
/*	
	PriorityQueue<Character> q1=new PriorityQueue<Character>();
	q1.add('A'); //65
	q1.add('D');//68
	q1.add('C');//67
	q1.add('B');//66
	
	System.out.println(q1); // lowest will come first so on....
	while(!q1.isEmpty()) {
		System.out.println(q1.poll());//poll()---->taking the peak element and remove
		System.out.println(q1);
	}
	
	  
	System.out.println(q1.peek());
	*/
	
	//when  element will be inserted internally it will be inserted based on Arbitrary way
	//but for peak() or poll() as we are using priorityQue---should be sorted and select the lowest value of ASCHII table value
	PriorityQueue<String> q2=new PriorityQueue<String>();
	q2.add("Alex"); 
	q2.add("Adam"); //second one will be added first
	q2.add("Donald");
	q2.add("David"); //second one will be added first
	q2.add("Bob");   
	q2.add("Charle");     
	System.out.println(q2);  //base on first letter value will take decision which is our priority
	
	while(!q2.isEmpty()) {
		System.out.println(q2.poll());
		System.out.println(q2);
	}
	

	/*
	System.out.println(q2.poll());
	System.out.println(q2);
	System.out.println(q2.poll());
	System.out.println(q2);
	System.out.println(q2.poll());
	System.out.println(q2);
	System.out.println(q2.poll());
	System.out.println(q2);
	System.out.println(q2.poll());
	System.out.println(q2);
	System.out.println(q2.poll());
	System.out.println(q2); */
	
	/*PriorityQueue<Integer> q3=new PriorityQueue<Integer>();
	q3.add(15);   
	q3.add(50);   
	q3.add(5);   
	q3.add(1);  

	
	
	
	while(!q3.isEmpty()) {
		System.out.println(q3.poll());
		System.out.println(q3);
	}
	

	
*/
	
	
	}

}
