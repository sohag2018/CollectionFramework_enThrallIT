package collectionFramwork_List;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_6_OutsideDataAsElement {

	public static void main(String[] args) {
		
		
		
		ArrayList ar=new ArrayList();
		
		Scanner sc=new Scanner (System.in);

		for(int i=0;i<6;i++) {	
		System.out.println("Boby please enter a number");
		ar.add(sc.nextInt());
		
	}	
		sc.close(); //closing Scannar obj
		
		System.out.println("Here is your result: "+ar);
		
		
		// using Random class to get some random number to put in ArrayList
		
		ArrayList ar1=new ArrayList();
		System.out.println(ar1);
		
		//creating obj of Random Class
		Random random=new Random();
		
		//using for Loop we are getting 5 randomg number and put in ArrayList using ar1.add() method
		int upto=5;
		for(int i=0;i<upto;i++) {
			ar1.add(random.nextInt(10));
			System.out.println(ar1.get(i));
		}
		
		
		//pring ar1 obj---just to show in the class
		System.out.println("Here is your result: "+ar1);
		
		
		}
		
	}


