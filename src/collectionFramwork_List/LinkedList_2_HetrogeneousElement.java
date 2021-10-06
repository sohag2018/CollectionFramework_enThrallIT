package collectionFramwork_List;

import java.util.LinkedList;

public class LinkedList_2_HetrogeneousElement {

	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.add(5);
		link.add("Sohag");
		link.add(54664646);
		link.add('c');
		
		
		for(int i=link.size()-1;i>=0;i--) {
			System.out.println(link.get(i));
		}
		
		
		
		
		
		
		

	}

}
