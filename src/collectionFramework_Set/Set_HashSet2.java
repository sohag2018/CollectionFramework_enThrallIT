package collectionFramework_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_HashSet2 {

	public static void main(String[] args) {
		// no iserttion order
		//excepting null
		//no duplicate
		
		Set<String>ts1=new HashSet<>();
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
