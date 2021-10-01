package collectionFramworkPkg;

import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class Queue_4_1_PriorityQueueInt {

	public static void main(String[] args) {
	PriorityQueue<Integer> q=new PriorityQueue<Integer>();
	q.add(30); //48
	q.add(32);//50
	q.add(31);//49
	q.add(35);//53
	q.add(34);//52
	//priority will be higher vallue --lower value
	
	System.out.println(q);
	System.out.println(q.peek());


	
	
	

	}

}
