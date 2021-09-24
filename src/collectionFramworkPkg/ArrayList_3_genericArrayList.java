package collectionFramworkPkg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3_genericArrayList {

	public static void main(String[] args) {
	ArrayList<String> ar1=new ArrayList();
		
		
		//should be same data type---objects
		ar1.add("Boby");
		ar1.add("Bony");
		ar1.add("Imran");
		ar1.add("Sohag");
		//ar1.add('A'); //you cant put other thant String
		
		
		
		
		System.out.println(ar1);
		
		
		//for each loop/advance loop
		
		for(String s:ar1) { //[Boby, Bony, Imran, Sohag]
			System.out.println(s); //for the first looping s=Boby, second looping s=Bony and so on
			System.out.println("Go next");  //just to see how it internally looping
			
		}
	
		
		//making generic for Integer
		
ArrayList<Integer> ar2=new ArrayList();     //in <> angular method you have mention the generic typ (Obj)
		
		
		//Only int is accepted
		ar2.add(5);
		ar2.add(15);
		ar2.add(25);
		//ar2.add("Sohag"); //not allowed
		
		for(int s2:ar2) { 
			System.out.println(s2); 
			System.out.println("Go next");  //just to see how it internally looping
			
		}

	}

}
