package collectionFramworkPkg;

import java.util.LinkedList;

public final class LinkedList1_2Creating {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Sohag");
		ll.add("Imran");
		ll.add("Ryhan");
		ll.add("Boni");
		
		//Print single element
		System.out.println(ll.get(1));
		
		//print the arralylist
		System.out.println(ll);
		
		//print the size
		
		System.out.println(ll.size());
		
		
		//printing all by using for loop
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		//printing by while looping
		int a=0;
		
		while(ll.size()>a) {
			System.out.println(ll.get(a));
			a++;
		}
		

	}

}
