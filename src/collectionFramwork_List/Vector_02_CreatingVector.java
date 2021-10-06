package collectionFramwork_List;

import java.util.Iterator;
import java.util.Vector;

public class Vector_02_CreatingVector {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Kamran");
		v.add(5);
		v.add(5.5);
		
		
		System.out.println(v.get(0));
		System.out.println(v.size());
		
		 Iterator it=v.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

	}

}
