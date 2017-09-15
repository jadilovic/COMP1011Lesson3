
package Assig3Planets;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String key = "";

		GiantPlanet myGPlanet1 = new GiantPlanet("Jupiter", 0.382, 0.06, "Gas");
		myGPlanet1.setMoonCount(69);
		myGPlanet1.setOrbitalPeriod(11.86);
		myGPlanet1.setRingCount(3);
		myGPlanet1.setRotationPeriod(0.41);
		
		System.out.println(myGPlanet1.toString());
		System.out.println(myGPlanet1.getName() + " is " + myGPlanet1.getType() + 
				" type planet and has " + myGPlanet1.HasMoons() + " moons and " +
				myGPlanet1.HasRings() + " rings by number " + myGPlanet1.getRingCount());
		
		TerrestrialPlanet myTPlanet1 = new TerrestrialPlanet("Mars", 0.532, 0.11, true);
		myTPlanet1.setMoonCount(2);
		myTPlanet1.setOrbitalPeriod(1.88);
		myTPlanet1.setRingCount(0);
		myTPlanet1.setRotationPeriod(1.03);
		
		System.out.println(myTPlanet1.toString());
		System.out.println(myTPlanet1.getName() + " is habitable" + myTPlanet1.Habitable() + 
				" and it has " + myGPlanet1.HasMoons() + " moons and oxigen " + myTPlanet1.hasOxygen() +
				" and it has " + myGPlanet1.HasRings() + " rings by number " + myGPlanet1.getRingCount());
		
	
		System.out.println("Key is " + key);
		do{
			System.out.println("Enter any key to exit the program " );
			key = input.nextLine();
		} while(waitForAnyKey(key) != true);
		System.exit(0);
		
		
	}

	public static boolean waitForAnyKey(String anyKey){
		return (anyKey != null);
	}
}
