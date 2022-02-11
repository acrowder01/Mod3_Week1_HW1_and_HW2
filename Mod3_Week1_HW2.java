package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Mod3_Week1_HW2 {

	public static void main(String[] args) {
		
		//1. Write a Java program to copy one array list into another
		
		//Create the array list
		ArrayList<String> mygroup = new ArrayList <>();
		//add items to the list
//		mygroup.add("Me");
//		mygroup.add("Greg");
//		mygroup.add("Paulette");
//		System.out.println("Original ArrayList = " + mygroup);
//		
//		//create the second list
//		ArrayList<String>  others =new ArrayList<>();
//		others.add("Ryan");
//		others.add("Jason");
//		others.add("Bill");
//		System.out.println( "Second ArrayList = " + others);
//		
//		mygroup.addAll(others);
//		System.out.println();	
//		
//		//combined lists 
//		others.addAll(mygroup);
//		System.out.println("This is the combined group" + others );
		
		
		// 2. Write a Java program to extract a portion of an array list
		    //create a list and add items to it
//		 List < String > teams = new ArrayList < String > ();
//		    teams.add("cowboys");
//		    teams.add("eagles");
//		    teams.add("saints");
//		    teams.add("bills");
//		    System.out.println("this is the teams list" + teams);
//		    
//		    //extract some teams because of violations
//		    List<String> sub_List = teams.subList(1, 3);
//		    
//		    //print out extracted list
//		    System.out.println("This is he extracted list" + sub_List);
		    
		
		    //3. Write a Java program of swap two elements in an array list
//		    ArrayList<String> switchnumbers = new ArrayList<String>();
		    //add items to list
//		    switchnumbers.add("one");
//		    switchnumbers.add("two");
//		    switchnumbers.add("three");
//		    switchnumbers.add("four");
//		    System.out.println(switchnumbers);
		    
//		    switch the last 2 numbers
//		   Collections.swap(switchnumbers, 2, 3);
//		   System.out.println(switchnumbers);
//		   
		   
//		    4. Write a Java program to test an array list is empty or not
//           ArrayList<String> ThisList = new ArrayList<String>(7);
//		    add items to list
//		    ThisList.add("one");
//		    ThisList.add("two");
//		    
//	        if(ThisList.isEmpty()) {
//	            System.out.println("ThisList is empty.");
//	        } else {
//	            System.out.println("ThisList is not empty.");
//	        }
//	    }
//		    
//	     5. Write a Java program to replace the second element of an ArrayList with the specified element.
		    
//	HashMap<String, String> BallType = new HashMap<>();
	
	// Adding key value pairs to our map
//	BallType.put("base", "baseball");
//	BallType.put("foot", "football");
//	BallType.put("Kick", "Kickball");
//	BallType.put("basket", "basketball");
//	
//	System.out.println(BallType);
//	Replacing second element with Myball
//	BallType.put("foot", "MyBall");
//	System.out.println("replacing ball type of football to Myball" + BallType);
	     
//	     6. Write a Java program to trim the capacity of an array list the current list size
		 ArrayList<String> cars= new ArrayList<String>();
         cars.add("Vett");
         cars.add("Ford");
         cars.add("Chevy");
         cars.add("Lexus");
         cars.add("Audi");
          
          cars.trimToSize();
           System.out.println("list is trimmed = " + cars);
		
		 
		
		
	} 
		
	}


