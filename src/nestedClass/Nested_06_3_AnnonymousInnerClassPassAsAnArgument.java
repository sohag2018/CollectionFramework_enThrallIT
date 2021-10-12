package nestedClass;


interface Eateable{
	void eat();
}

public class Nested_06_3_AnnonymousInnerClassPassAsAnArgument {
	
	
	public static void eatFood(Eateable e) {
		e.eat();
		
	}

	public static void main(String[] args) {
		
		//Nested_06_3_AnnonymousInnerClassPassAsAnArgument obj=new Nested_06_3_AnnonymousInnerClassPassAsAnArgument();
		
		eatFood(new  Eateable() {

			@Override
			public void eat() {
				System.out.println("Orphan can eat");
				
			}});
	}

}
