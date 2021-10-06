package collectionFramework_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {

	
	//it maintains insertion order
	//except null value
	//no duplicate
	public static void main(String[] args) {
		Set<String>ts1=new LinkedHashSet<>();
		ts1.add("Sohag");
		ts1.add("Nayon");
		ts1.add("Boby");
		ts1.add("Rayhan");
		ts1.add("Rayhan");
		ts1.add(null);  //except null value
		
		Iterator<String> itr1=ts1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
