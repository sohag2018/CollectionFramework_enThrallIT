package collectionFramwork_List;

import java.util.Stack;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Stack_04_UsingMethodinCondition {

	public static void main(String[] args) {
Stack<String> st=new Stack<String>();
		
		st.add("Sohag");//it will be last---tail   6
		st.add("Imran");
		st.add("Kamran");
		st.addElement("Fatima");
		st.push("Boby");
		st.push("Boni");
		st.push("Ryhan");//it will be first---head  1
		
		
		//System.out.println(st);
		
		
		//using pop() and peak()
		
		if(st.peek().equalsIgnoreCase("sohag")){
			System.out.println(st.pop());
			System.out.println(st);
		}
		else {
			System.out.println("didnt get Sohag at number 1 positon");
		}
		
		
		//using diff logic--empty()
		
		System.out.println("using empty logic");
		
		
		/*while(!st.empty()) {   //it will print infinity time so didnt use it we can see logic
		System.out.println(st);
		} */
			
			if(st.empty()) {             //not empty
				System.out.println(st.get(0));
			}else {System.out.println(st);}
			
			
			
			//using ! symbol which will make retuns oposit
			
			if(!st.empty()) {             //not empty
				System.out.println(st.get(0));
			}else {System.out.println(st);}
		

	}

}
