package collectionFramework_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSet {
//no duplicate
//no null
//will return sorted way (ascending order)
	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(15);
		ts.add(5);
		ts.add(50);
		ts.add(25);
		ts.add(59);
		ts.add(35);
		ts.add(35);
		
		Iterator<Integer> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		TreeSet<String>ts1=new TreeSet<>();
		ts1.add("Sohag");
		ts1.add("Nayon");
		ts1.add("Boby");
		ts1.add("Rayhan");
		//ts1.add(null);  //null is not allowed
		
		Iterator<String> itr1=ts1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

	}
	
	

}
