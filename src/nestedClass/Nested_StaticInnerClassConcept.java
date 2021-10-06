package nestedClass;

public class Nested_StaticInnerClassConcept {//outer class starts
	private static int age=65;
	
	//inner class creating
	static class innerClass{ //inner class starts
		
		static void pint() {
			System.out.println(age);
		}
		
	}//inner class ends
	
	
	public static void main(String[] args) {
		//Trying to get access of inner class method
		Nested_StaticInnerClassConcept.innerClass.pint(); //as we have static inner class so directly we can get acces there
	}

}//outer class starts
