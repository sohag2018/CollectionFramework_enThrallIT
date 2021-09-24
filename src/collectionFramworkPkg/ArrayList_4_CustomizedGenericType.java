package collectionFramworkPkg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_4_CustomizedGenericType {
	


	public static void main(String[] args) {
		
		//creating obj of Student Class---to put in ArrayList
		
		StudentClass st1= new StudentClass("Nayon");
		StudentClass st2= new StudentClass("Kamran");
		StudentClass st3= new StudentClass("Boby");
		
		
		ArrayList<StudentClass> ar=new ArrayList<StudentClass>();
		//putting obj of Student Class in ArrayList 
		ar.add(st1);
		ar.add(st2);
		ar.add(st3);
		
		//checking the size of the ArrayList
		System.out.println(ar.size());
		
		//pringing the obj of ArrayList (No need just checking to show)
		System.out.println(ar);
		System.out.println(ar.get(0));
		
		
		//print all name value by calling name variable by using for each loop
		 for(StudentClass v:ar) {
			 System.out.println(v.name);
		 }
	}
	
	
}
