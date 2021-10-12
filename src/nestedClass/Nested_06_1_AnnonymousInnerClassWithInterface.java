package nestedClass;

interface Eatable{ //this interface
	void eat();
	
}



public class Nested_06_1_AnnonymousInnerClassWithInterface { //outer class

	public static void main(String[] args) {
		
		//new Eatable();----we cant call constructor (we dont have in interface)---even we cant create obj
		
		
		//bellow commented code is actually Annonymous class --created on the fly for giving implementation of the interface without anyu concreate class
		/*new Eatable(){

			@Override
			public void eat() {
				System.out.println("An orphan can eat");
				
			}}; */
			
		//same code we are refering by the reference variable as interface type
			Eatable inObj=new Eatable(){

				@Override
				public void eat() {
					System.out.println("An orphan can eat");
					
				}};
		
				inObj.eat();
				
		
	}

}
