/**
 * 
 */

/**
 * @author Win7
 * Class description: Create a Vehicle class to use as a superclass for 
 * all other vehicle subclasses
 */
public abstract class Vehicle {

	// PRIVATE PROPERTIES +++++++++++++++++++++++++++++++++++++++++++
	protected int numWheels = 4;
	protected int numDoors = 2;
	protected String color = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;
	
	// GET ACCESS METHODS
	/**
	 * @return the numWheels
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the numDoors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}


	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}


	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}

	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return this.speed;
	}
	
	// CONSTRUCTOR *************************************************+++
	public Vehicle(int wheels, int doors, String color, String make, String model, String year){
		this.numWheels = wheels;
		this.numDoors = doors;
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Vehicle(String color, String make, String model, String year){
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// PUBLIC ABSTRACT METHODS ++++++++++++++++++++++++++++++++++++++++++++
	// MUST BE OVERWRITTEN
	public abstract void accelerate();
	
	public abstract void decelerate();
	
	// PUBLIC METHODS ++++++++++++++++++++++++++++++++++++++++++++++++
	public void turnLeft(){
		System.out.println("Turning Left");
	}
	
	public void turnRight(){
		System.out.println("Turning Right");
	}


	
}
