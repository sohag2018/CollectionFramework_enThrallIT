package nestedClass;


/* To call inner class non-static method or property we need to create obj of inner class
 * 
 * Approach-1: We can crate a method in outer class and create onj of inner class and call those method or property
 * later that method can be called as normal outer class property
 * 
 * Approach-2: We can create obj of inner class with outer class obj then we can call those method or property
 * 
 *  Note: for static inner class (as it is considered as outer class static member)--we dont need to create obj to access inner class property* */

public class Nested_03_AccessInnerClassApproaches {//outer class starts
	
	private static int age=55;  // in outer class
	
	
	
	public class Inn1{ //inner class starts-inner class (can be public,protected, default, private)
		
		void print() {
			System.out.println("Age:"+age); //from nested class we can access outer class's property (static/non-static)including private
		}		
		
	}//inner class ends
	
	
	
	
	//inner class access--Approach-1 creating method in outer class to create obj of inner class
	void display() {
		Inn1 in=new Inn1();//inner class obj
		in.print();//call inner class method
	}
		

	public static void main(String[] args) {//outer class starts 
		Nested_03_AccessInnerClassApproaches outer=new Nested_03_AccessInnerClassApproaches(); //outer class obj creation
		outer.display();//call outer class method which will call inner class method
		
		//accessing inner class approach (2)- creating inner class obj  with outerclass obj
		Nested_03_AccessInnerClassApproaches.Inn1 inObj	=outer.new Inn1();  //as innerclass obj belongs to outer class obj
		inObj.print();//call inner class method
		
	}

}//outer class ends

