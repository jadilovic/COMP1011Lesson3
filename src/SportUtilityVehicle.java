/**
 * 
 */

/**
 * @author Win7
 *
 */
public class SportUtilityVehicle extends Vehicle {
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++
	public SportUtilityVehicle(String color, String make, String model, String year) {
		super(color, make, model, year);
		// TODO Auto-generated constructor stub
		this.numDoors = 5;
		
	}

	// OVERRIDEN PUBLIC METHODS ++++++++++++++++++++++++++++++++++++++
	@Override
	public void accelerate() {
		this.speed += 4;
		if(this.speed >= MAX_SPEED){
			this.speed = MAX_SPEED;
		}
	}

	@Override
	public void decelerate() {
		this.speed -= 6;
		if(this.speed < 0)
			this.speed = 0;
	}

}
