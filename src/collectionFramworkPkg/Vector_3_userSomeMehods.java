package collectionFramworkPkg;

import java.util.Iterator;
import java.util.Vector;

public class Vector_3_userSomeMehods {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		System.out.println(v);
		
		 System.out.println( v.size());
		
		 System.out.println( v.capacity());
		v.add("Kamran");
		v.add(5);
		v.add(5.5);v.add("Kamran");
		v.add(5);
		v.add(5.5);v.add("Kamran");
		v.add(5);
		v.add(5.5);
		v.add(5.5);v.add("Kamran");
		v.add(5);
		v.add(5.5);
		v.addElement(7);//adding element same as add()
		 
		
		Iterator it=v.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 //adding in specific index
		 v.add(2, 15);
		 
		 System.out.println(v.indexOf(1));
		 
		
		 
		
		 
		 Iterator it1=v.iterator();
		 while(it1.hasNext()) {
			 System.out.println(it1.next());
		 }
		 
		 //size() will retun how many elements
		 System.out.println( v.size());
		 
		 //will give you inter internal capacity---how many elements you can sotore
		 System.out.println( v.capacity());
		 

	}

}
