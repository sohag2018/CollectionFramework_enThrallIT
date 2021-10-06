package nestedClass;

public class Nested_InnerClassUse01 {//outer class starts
	
	
	//inner class
	class Inn1{ //inner class stars
		//inner class method --to print statement
		void print() {
			System.out.println("I am from Inner class1");
		}		
		
	}//inner class ends
	
	//outer class mehtod which will help to get access inner class method
	void display() {
		Inn1 in=new Inn1();
		in.print();
		
	}
		

	public static void main(String[] args) {//outer class starts 
		
		Nested_InnerClassUse01 outer=new Nested_InnerClassUse01();
		outer.display();
		
		
		
		
	}

}//outer class ends

