package nestedClass;
/*
 * Property read from outer class in inner class:
 * 1. non-static
 * 2. static
 * 3. private***
 * 4. all other access modifiers property 
 * */

public class Nested_04_OuterClassPropertyCallInInnerClass {//outer class starts
	
	//property in outer class:
	int ID=55;  // non-static 
	String name="Sohag";  // non-static 
	private int age=40;  // Private
	public long phn=3474005813L;  // Private
	private static long SSN=457982925L;  // Private 
	
	//inner class (can be public,protected, default, private)
	public class Inn1{ //inner class stars
		
		void print() {
			System.out.println("ID:"+ID+"\n"+"Name:"+name+"\n"+"Age:"+age+"\n"+"Phone:"+phn+"\n"+"SSN:"+SSN+"\n"); //from nested class we can access outer class's property (static/non-static)including private
		}		
		
	}//inner class ends
	
	
	
	//Approach-1
	void display() {
		Inn1 in=new Inn1();
		in.print();
		
	}
		

	public static void main(String[] args) {//outer class starts 
		
		Nested_04_OuterClassPropertyCallInInnerClass outer=new Nested_04_OuterClassPropertyCallInInnerClass();
		outer.display();
		
		
	}

}//outer class ends

