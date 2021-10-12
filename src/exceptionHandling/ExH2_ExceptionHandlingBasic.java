package exceptionHandling;

public class ExH2_ExceptionHandlingBasic {
	
	static int a=100;
	
	//Method which may create problem
	public void printResult(int b) {
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) {
	
		/*
		//In try-catch block exception is handled
		
		try {System.out.println(a/0);}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("No matter what I want to be executed");
		}
		*/
		
		
		//calling method which may create exception--if we pass 0
		ExH2_ExceptionHandlingBasic obj=new ExH2_ExceptionHandlingBasic();
		try{
			obj.printResult(10);  //will try to execute first--if anythong wrong then will go to catch block
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}finally {
			System.out.println("I am from finally keyword....alway you will see me");
		}
		//code which is not the part of problematic method-if exception handled then will be executed
		System.out.println("Just to check program executed correctly or not");
	}

}
