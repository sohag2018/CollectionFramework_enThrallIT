package nestedClass;

/*
 * If the inner Class is Static it becomes Static member of the Outer Class
 * ---> So we dont need to think about obj creation of inner class as we can get access in static way
 * 
 * */

public class Nested_05_StaticInnerClass {//outer class starts
	//property in outer class:
		int ID=55;  // non-static 
		static String name="Sohag";  // non-static
		private static long SSN=457982925L;  // Private 
		private int age=40;  // Private
		public long phn=3474005813L;  // Private
		
	
	//Static inner class
	static class innerClass{ //inner class starts
		
		//making static method--as our inner class is static
		static void print() {
			System.out.println("Name:"+name+"\n"+"SSN:"+SSN+"\n"); //from nested class we can access outer class's property (static/non-static)including private
			System.out.println("Name:"+name+"\n"+"SSN:"+SSN+"\n"); //we cant get access for non-static field in static code
		}
		
	}//inner class ends
	
	
	public static void main(String[] args) {
		//Trying to get access of inner class method
		Nested_05_StaticInnerClass.innerClass.print(); //as we have static inner class so directly we can get acces there
		
		//innerClass.print(); //we can also get access of static inner class just by the nameo of the inner class (without outer class name)
	}

}//outer class ends
