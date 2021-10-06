package collectionFramework_Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMap_SortedReturn {

	public static void main(String[] args) {
		Map<Integer,String> tMap=new TreeMap<>();
		tMap.put(105, "Imran");
		tMap.put(106, "Boni");
		tMap.put(101, "Sohag");
		tMap.put(102, "Nayon");
		tMap.put(106, "Kamran");
		tMap.put(104, "Fatema");
		
		//sorted key:expaction: 101: Sohag, 102:Nayon---
		
		Set<Integer>keys=tMap.keySet();
		 Iterator<Integer> itr=keys.iterator();
		 while(itr.hasNext()) {
			 System.out.println(tMap.get(itr.next()));
			
			 
		 }
		 
		
		

	}

}
