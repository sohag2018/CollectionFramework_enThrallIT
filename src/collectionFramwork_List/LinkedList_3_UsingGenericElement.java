package collectionFramwork_List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_3_UsingGenericElement {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<Integer> link1=new LinkedList<>();
		
		link1.add(5);
		link1.add(15);
		link1.add(25);
		link1.add(35);
		link1.add(85);
		
		System.out.println(link1);
		
		//for looping
		for(int i=0;i<link1.size();i++) {
			int b=5;
			System.out.println(link1.get(i)+b);
			Thread.sleep(5000);
			
		}
		
		Iterator it=link1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//creating String generic type LinkedList
		LinkedList<String> link2=new LinkedList<String>();
		link2.add("Ryhan");
		link2.add("Boni");
		link2.add("Sohag");
		link2.add("anything");
		
		System.out.println(link2);
		
		//Advanced/for each
		for(String s:link2) {
			System.out.println(s);
		}
		
		

	}

}
