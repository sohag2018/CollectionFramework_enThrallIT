package collectionFramework_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_LinkedHashMap_studentInfo {

	public static void main(String[] args) {
		
		//if we use LinkedHashMap--->we will get value as we insert (insertion order)
		
		Student1stBatch st1=new Student1stBatch(646464446,"Boby");
		Student1stBatch st2=new Student1stBatch(545454545,"Nayon");
		Student1stBatch st3=new Student1stBatch(9118877,"Kamran");
		Student1stBatch st4=new Student1stBatch(91555655,"Boni");
		Student1stBatch st5=new Student1stBatch(911,"Fatema");
		
		Map<Integer,Student1stBatch> stMap=new LinkedHashMap<>();
		stMap.put(101, st1);
		stMap.put(102, st2);
		stMap.put(103, st3);
		stMap.put(104, st4);
		stMap.put(105, st5);
		//single  value
		System.out.println(stMap.get(101).name);
		//lets check print in insertion order or not
		Set<Integer>keys=stMap.keySet();
		for(int key:keys) {
			System.out.println(stMap.get(key).name);
		}
		
		
		

	}

}
