package HomeWork;

public class Mod3_Week1_HW1 {
//	We have a parrot that likes to squawk at night in its cage when it’s scared. Write a method named getUp that has 2 parameters
//	1st parameter  should be a boolean and be named squawking it represent the parrot.
//	2nd parameter represents the hour of the day and is an int named currentHour has a valid range of 0-23.
	
	
	public static boolean getUp(boolean squawking, int currentHour) {
 
		
		if (!squawking) {
			return false;
		}
		
		if(currentHour < 0 || currentHour > 23) {
			return false;
		} else if (currentHour < 6 || currentHour > 22) {
			return true;
		} else {
			return false;
		

	}

};

public static void main(String[] args) {
	System.out.println("first check is false");
	boolean wakeUp = getUp(false, 20);
	System.out.println(wakeUp);
	System.out.println("second check is false");
	System.out.println(getUp(false, 20));
	System.out.println("third check is false");
	System.out.println(getUp(true, 20));
	System.out.println("fourth check is true");
	System.out.println(getUp(true, 23));
	System.out.println("fifth check is false");
	System.out.println(getUp(true, 6));
	System.out.println("sixth check is true");
	System.out.println(getUp(true, 5));
	
	
	};
}