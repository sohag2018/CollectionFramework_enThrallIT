package collectionFramworkPkg;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_02_DeQueImp_DiffMehodToAddEle {

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		//wehen use add()--->//adding element at the top
		//putting value 40-30-20-10-5-0    when get 40-30-20-10-5-0
	/*	//wil work following FIFO
		dq.add(40);//will add element at bottom
		dq.add(30);
		dq.add(20);
		dq.add(10);
		dq.add(5);
		dq.add(0);
		
		dq.addLast(10);
		dq.addLast(5);
		dq.addLast(0);
		
		*/
		
		/*dq.offer(10);
		dq.offer(5);
		dq.offer(0);*/
		
		/*dq.offerLast(10);
		dq.offerLast(5);
		dq.offerLast(0);
		*/
		
		
		
		//putting value 40-30-20-10-5-0    when get 0- 5-10-20-30-40
		//LIFO applying
		//wehen use push()--->//adding element at the top
		
	/*	dq.push(40);  //Head 
		dq.push(30);
		dq.push(20);
		dq.push(10);
		dq.push(5);
		dq.push(0);  //tail  
		
		dq.addFirst(10);
		dq.addFirst(5);
		dq.addFirst(0);
		*/
		dq.offerFirst(10);
		dq.offerFirst(5);
		dq.offerFirst(0);
		
	
		System.out.println(dq);

	}

}
