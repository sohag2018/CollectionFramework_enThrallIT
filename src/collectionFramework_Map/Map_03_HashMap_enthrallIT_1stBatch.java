package collectionFramework_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_03_HashMap_enthrallIT_1stBatch {

	public static void main(String[] args) {
		Map<Integer,String> st=new HashMap<>();
		st.put(100, "Boby");
		st.put(101, "Boni");
		st.put(102, "Nayan");
		st.put(103, "Kamran");
		
		//get the value
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student's id");
		int id=sc.nextInt();
		switch(id) {
		case 100:
			System.out.println("Student's name:"+st.get(100));
			break;
		case 101:
			System.out.println("Student's name:"+st.get(101));
			break;
		case 102:
			System.out.println("Student's name:"+st.get(102));
			break;
		case 103:
			System.out.println("Student's name:"+st.get(103));
			break;
		default:
			System.out.println("Please correct ID");
			

	}

}}
