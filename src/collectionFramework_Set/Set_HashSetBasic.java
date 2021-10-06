package collectionFramework_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSetBasic {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet();
		
		
			
		//regular way to add element
		/*hs.add(5);
		hs.add(15);
		hs.add(58);
		hs.add(55);
		*/
		//alternatively i am inserting element from array
		int[] arr= {5,15,9,10,9,2};
		
		for(int i=0;i<=5;i++) {
			hs.add(arr[i]);   //hs.add(5)
		}		
		
	Iterator<Integer> itr=hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		
	}

}
