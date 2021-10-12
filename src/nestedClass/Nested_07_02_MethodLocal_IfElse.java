package nestedClass;

public class Nested_07_02_MethodLocal_IfElse {
	
	int age=55;
	void display(int number) {
		
		if(number>65) {
			class LocalInner{
				void justify() {
					System.out.println("Ther person is Senioer citizen");
				}
								
				
			}
			LocalInner inObj=new LocalInner();
			inObj.justify();

			
		}else {
			System.out.println("The person is not senior citizen");
		}
		
	  
	
	}

	public static void main(String[] args) {
		
		Nested_07_02_MethodLocal_IfElse outerObj=new Nested_07_02_MethodLocal_IfElse();
		outerObj.display(66);
		
	}

}
