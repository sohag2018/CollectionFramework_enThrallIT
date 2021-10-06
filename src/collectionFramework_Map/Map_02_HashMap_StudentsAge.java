package collectionFramework_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map_02_HashMap_StudentsAge {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<>();
		m.put("S", 42);   //internall hashCode() is called which will produce unique hascode int number
		m.put("B", 52);
		m.put("N", 22);
		m.put("K", 102);
		
		 Set<String>names=m.keySet();		 
		 Scanner sc=new Scanner(System.in);	 
		 System.out.println("Plese enter student's name to get age");
		 String name=sc.next();
		
		 
		 
		 System.out.println("His Age is: "+m.get(name)); //again hascode created and internall called equal() to match the prev hascode

	}

}
