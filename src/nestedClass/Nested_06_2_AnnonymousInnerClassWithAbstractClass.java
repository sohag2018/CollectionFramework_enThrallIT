package nestedClass;

 abstract class Eateble{      //abstract class
	 abstract void eat();
}




public class Nested_06_2_AnnonymousInnerClassWithAbstractClass {//regular class-outer class
	
public static void main(String[] args) {
		
	
			//new Eatable(); not possible-we cant create the obj as we have atleast one abstract method (withou body)
		
			Eatable inObj=new Eatable(){ //we are not creating obj-we are creating class (anonymous inner class)--see we use { } but creating obj we dont use it

				@Override
				public void eat() {
					System.out.println("An orphan can eat in the family who adopted him/her");
					
				}};
		
				inObj.eat();
				
		
	}}