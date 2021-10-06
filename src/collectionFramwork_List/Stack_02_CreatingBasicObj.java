package collectionFramwork_List;

import java.util.Iterator;
import java.util.Stack;

public class Stack_02_CreatingBasicObj {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.add("Boby");
		st.add('c');
		st.add(5);
		st.add(5.5);
		st.push("Boni");//this method comes from Stack---will add elements too
		
		
		
	
		
		System.out.println(st);
		
		//capacity() and Siz()
		System.out.println(st.capacity()); //will return will initially capaciy 10
		System.out.println(st.size());//will return so far we entered elements
		
		Iterator it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		

	}

}
