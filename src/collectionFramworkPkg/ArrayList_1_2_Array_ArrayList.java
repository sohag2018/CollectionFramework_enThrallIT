package collectionFramworkPkg;

import java.util.ArrayList;

public class ArrayList_1_2_Array_ArrayList {

	public static void main(String[] args) {
	
	//How array works
	/*	
		int[]a= new int[3];
		a[0]=5;
		a[1]=5;
		a[2]=5;
		a[3]=5;
		
		
		
		for(int i=1;i<3;i++) {
			System.out.println(a[i]);
		}
		
		*/
		
		//ArrayList----this is a class in java.util package (member of collection framework) it came in java 1.2
		
		
		//create the ArrayList
		 ArrayList ar=new ArrayList();  //10 -----16 (in ca*(3/2)+1=16     16*(3/2)+1
		
		 
		 //how to put value in arraylist
		 ar.add(5);  //0 index
		 ar.add(15); // 1 index
		 ar.add(25);
		 ar.add(25);
		 ar.add(25);
		 ar.add(25);
		 ar.add(35);
		
		 
		 
	
		 
		// System.out.println(ar);
		 //checked size of the arraylist (not internal capacity)
		 System.out.println(ar.size()); //
		 
		 
		 //how print single value by index number (internally it will give you index number)
		System.out.println(ar.get(2));
		
		//using size() we will print one index value
		System.out.println(ar.get(ar.size()));  //last value
		
		//print all vlues by looping
		
		for(int j=0;j<3;j++) {
			System.out.println(ar.get(j));
		}
		
		
		//print all vlues by looping----but instead of using index limit we used size() to get the last index
		for(int j=0;j<ar.size();j++) {
			System.out.println(ar.get(j));
		}
		
		
		
	
		
		
		
		
		
		

	}

}
