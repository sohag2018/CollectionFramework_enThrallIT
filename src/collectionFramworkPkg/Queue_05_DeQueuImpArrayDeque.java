package collectionFramworkPkg;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Queue_05_DeQueuImpArrayDeque {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<>();
		dq.add("Sohag");//adding element at bottom
		dq.add("Sharif");//adding element at bottom
		dq.push("Boby");//alternate way of adding but at top
		dq.push("Kamran");//alternate way of adding
		dq.addFirst("Nayon");//alternate way of adding--adding at top
		dq.addLast("Boni");//alternate way of adding--adding at top
		
		//Nayon-Kamran-Boby-Sohag-Sharif-Boni
		
		System.out.println(dq);
		
		Iterator<String> it=dq.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		
		
		
	}

}
