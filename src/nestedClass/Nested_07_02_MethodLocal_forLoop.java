package nestedClass;

public class Nested_07_02_MethodLocal_forLoop {
	
	int age=55;
	void display(int number) {
		
		for(int i=0;i<number;i++) {
			class LocalInnner{  //creating localInnerclass
				
				void print() {
					int currentAge=age++;
					System.out.println("CurrenAge: "+currentAge);
				}
			}
			
			LocalInnner innObj=new LocalInnner();
			innObj.print();
				
			}      
		
	  
		
		
	}

	public static void main(String[] args) {
		
		Nested_07_02_MethodLocal_forLoop outerObj=new Nested_07_02_MethodLocal_forLoop();
		outerObj.display(5);
		
	}

}
