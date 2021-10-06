package nestedClass;

public class Nested_InnerClassUse2_privatePropertycall {//outer class starts
	//get access in inner class---private property of outer class
	
	private int age=55;  // in outer class
	
	//inner class
	class Inn1{ //inner class stars
		
		void print() {
			System.out.println("Age:"+age);
		}		
		
	}//inner class ends
	
	//outer class mehtod which will help to get access inner class method
	void display() {
		Inn1 in=new Inn1();
		in.print();
		
	}
		

	public static void main(String[] args) {//outer class starts 
		
		Nested_InnerClassUse2_privatePropertycall outer=new Nested_InnerClassUse2_privatePropertycall();
		outer.display();
		
		
	}

}//outer class ends

