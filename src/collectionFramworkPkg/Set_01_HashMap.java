package collectionFramworkPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Set_01_HashMap {
	
	

	public static void main(String[] args) throws InterruptedException {
		//Map-->interface
		//HashMap--->class
		Map<String,Integer> map=new HashMap();
		map.put("Sohag", 34745813);
		map.put("Tofayel", 34755555);
		map.put("Boby", 347555999);
		map.put("Nayon", 34755888);
		map.put("Kamran", 45824566);
		
		//System.out.println(map.get("Kamran"));
		
		Set<String> keys=map.keySet();
		for(String k:keys) {
			System.out.println(map.get(k));
			Thread.sleep(5000);
		}
		
		
		
				
		
		
		
		

	}

}
