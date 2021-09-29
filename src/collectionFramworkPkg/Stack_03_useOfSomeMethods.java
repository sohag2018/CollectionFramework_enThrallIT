package collectionFramworkPkg;

import java.util.Stack;

public class Stack_03_useOfSomeMethods {

	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		
		st.add("Sohag");//it will be last---tail   6
		st.add("Imran");
		st.add("Kamran");
		st.addElement("Fatima");
		st.push("Boby");
		st.push("Boni");
		st.push("Ryhan");//it will be first---head  1
		
		System.out.println(st);
		
		//position
		
		System.out.println(st.search("Sohag")); //6  this is not index position----this method form Stack
		System.out.println(st.search("Ryhan"));//1
		
		
		
		System.out.println(st.peek());//  it will return the top element ---Ryhan
		
		
		//pop() will remove based top position
		System.out.println(st.pop());// it will remove the top element

		System.out.println(st);
		
	//removing method works with index
		System.out.println(st.remove(0));
		System.out.println(st);
		
		System.out.println(st.empty());//bolean --it will retun true if the stack is empty if not it will return false
		
		
		
		

	}

}
