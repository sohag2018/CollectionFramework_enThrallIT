package collectionFramwork_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_2_HeterogeneousElementsInArrayList {

	public static void main(String[] args) {
		ArrayList ar1=new ArrayList();
		
		
		//diff data type
		ar1.add("Boby");
		ar1.add(50);
		ar1.add(33333);
		ar1.add(33333);
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		ar1.add("");
		
		
		//iterator() for looping
		 Iterator it=ar1.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
