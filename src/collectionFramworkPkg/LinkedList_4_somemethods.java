package collectionFramworkPkg;

import java.util.LinkedList;

public class LinkedList_4_somemethods {

	public static void main(String[] args) {
	LinkedList link=new LinkedList();
	link.add("Sohag");
	link.add("Boni");
	link.add("Imran");
	link.add("Kamran");
	link.add("Ryhan");
	link.add("Noyan");
	//using addFirst() to set at 1st position[0]
	link.addFirst("Mr. Boss");
	
	//to check the position of "Sohag" which one at index[0]before
	int position=link.indexOf("Sohag");
	System.out.println(position);
	
	//using addLast

	link.addLast("Mr.Slow");
	
	link.set(4, "5th Position");
	
	//by default remove()---> will remove the value in index[0]
	//link.remove();
	
	//removeFirst()---will remove the value form index 0
	link.removeFirst();
	
	//removeLast()---will remove last value
	//just checking which value is removed
	System.out.println(link.removeLast());
	
	
	
	
	
	
	//printing out all elements
	for(int i=0;i<link.size();i++) {
		System.out.println(link.get(i));
	}
	
	//removeAll will remove all elements from the LinkedList
		link.removeAll(link);
		
		//printing out all elements
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i));
		}	
	
	
	
	

	}

}
