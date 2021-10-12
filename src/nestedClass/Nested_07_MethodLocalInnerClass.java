package nestedClass;

public class Nested_07_MethodLocalInnerClass {
	
	private int age=55; //this is not local this is gloabal or class level variable
	
	void displayAge() {
		class MethodLocalInner{  //mehtod local inner class
			void prinAge() {
				System.out.println(age);
			}
			
			
		}
		MethodLocalInner inObj=new MethodLocalInner();
		inObj.prinAge();
		
	}

	public static void main(String[] args) {
		
		Nested_07_MethodLocalInnerClass outObj=new Nested_07_MethodLocalInnerClass();
		
		
		
		outObj.displayAge();
	}

}
