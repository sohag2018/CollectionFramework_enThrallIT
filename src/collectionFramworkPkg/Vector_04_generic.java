package collectionFramworkPkg;

import java.util.Vector;

public class Vector_04_generic {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("Sh");
		v.add("dfljfs");
		v.add("dfljfs");
		
		System.out.println(v);
		
		//for each looping
		for(String s:v) {
			System.out.println(s);
		}
			
		}
		
		

	}


