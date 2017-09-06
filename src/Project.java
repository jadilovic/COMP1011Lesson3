/**
 * 
 */

/**
 * @author Jasmin Adilovic
 * Program Description: Demo Files for COMP1011 Lesson 03
 * @version 0.2 - Added Vehicle Class
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	SportUtilityVehicle myHonda = new SportUtilityVehicle("black", "Honda", "Pilot", "2015");
	
	Truck myFord = new Truck(6, 3, "White", "Ford", "FX", "2008");
	for(int i = 0; i < 10; i++){
		myHonda.accelerate();
		myFord.accelerate();
	}
	
	System.out.println("Vehicle speed " + myHonda.getSpeed());
	System.out.println("Truck speed " + myFord.getSpeed());

	}

}
