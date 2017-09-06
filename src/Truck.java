/**
 * 
 */

/**
 * @author Win7
 *
 */
public class Truck extends Vehicle {

	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Truck(int wheels, int doors, String color, String make, String model, String year) {
		super(wheels, doors, color, make, model, year);
		// TODO Auto-generated constructor stub
		
		checkNumDoors();
	}

	// PRIVATE METHOD ++++++++++++++++++++++++++++++++++++++++++++++
	private void checkNumDoors() {
		if(this.numDoors < 3)
			this.numDoors = 3;
		
	}
	
	// OVERIDDEN PUBLIC METHOD
	//@override
	public void accelerate(){
		this.speed += 2;
		if(this.speed >= MAX_SPEED){
			this.speed = MAX_SPEED;
		}
	}
	
	//@override
		public void decelerate(){
			this.speed -= 3;
			if(this.speed < 0)
				this.speed = 0;
		}
	
	

}
