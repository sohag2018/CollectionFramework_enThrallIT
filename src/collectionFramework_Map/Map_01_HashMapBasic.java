package collectionFramework_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_01_HashMapBasic {
	
	

	public static void main(String[] args) throws InterruptedException {
		//Map-->interface
		//HashMap--->class
		
		Map<String,Integer> map=new HashMap();
		map.put("Sohag", 34745813);
		map.put("Tofayel", 34755555);
		map.put("Boby", 347555999);
		map.put("Nayon", 34755888);
		map.put("Kamran", 45824566);
		
		//single key ---> get value
		System.out.println(map.get("Kamran"));
		
		//getting keySet 
		Set<String> keys=map.keySet();
		//printing values by looping using key from keySet
		for(String k:keys) {
			System.out.println(map.get(k));
			Thread.sleep(5000);
		}
	}

}
