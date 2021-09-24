package collectionFramworkPkg;

import java.util.ArrayList;

public class ArrayList_5_Manipulation {

	public static void main(String[] args) {
		
		//creating ArrayList
		ArrayList ar=new ArrayList();
		
		//adding elements in arrayList
		ar.add("Sohag");
		ar.add("Nayon");
		ar.add("Boby");
		ar.add("Bony");
	
		
		//System.out.println(ar.get(1));
		
		
		//adding specific element at specific index
		ar.add(1,"Tofayel");
		
		//System.out.println(ar.get(2));
		
		//looking for index number of element
		System.out.println(ar.indexOf("Boby"));//3
		
		
		
		//Removing specifict index value
		ar.remove(3); //it will remove -->ar.add("Bony"
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		//creatomg another arryList to add with prev one
		ArrayList ar1=new ArrayList();
		ar1.add("Imran");
		ar1.add("Kamran");
		ar1.add("Simran");
		
		//adding elements with prev arrayList
		ar.addAll(ar1);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));  //now we will have all elements together
		}
		
		
		//removing elements from second arraylist which we added
		ar.removeAll(ar1);
		
		for(int i=0;i<ar.size();i++) {   //again we will get only first arrayList elements
			System.out.println(ar.get(i));
		}
	
		//will return which we removed
		ar.retainAll(ar1);
		
		for(int i=0;i<ar.size();i++) {   //will show you only which we removed and now retaining
			System.out.println(ar.get(i));
		}
		
		
			

	}
	
	
	

}
