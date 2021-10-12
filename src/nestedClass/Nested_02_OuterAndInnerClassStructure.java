package nestedClass;

public  class Nested_02_OuterAndInnerClassStructure {//-----------------> outer class starts here
	
	
	// inner class:
	 class Inn1{ //-----------------> inner class stars here
		
		//inner class method --to print statement
		void print() {
			System.out.println("I am from Inner class1");
		}		
		
	}//-----------------> inner class ends here
	
	
	
	
	//outer class mehtod which will help to get access inner class method
	void display() {
		Inn1 in=new Inn1();
		in.print();
		
	}
		

	public static void main(String[] args) {//in outer class
		
		Nested_02_OuterAndInnerClassStructure outer=new Nested_02_OuterAndInnerClassStructure();
		outer.display();
		
		
		
		
	}

}//-----------------> outer class ends

