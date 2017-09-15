/**
 * 
 */
package Assig3Planets;

/**
 * @author Win7
 *
 */
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {

	// PRIVATE INSTANCE VARIABLE ++++++++++++++++++++++++++++++++
	private String _type;
	
	// PUBLIC PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++
	public String getType() {
		return _type;
	}
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public GiantPlanet(String name, double diameter, double mass, String type) {
		super(name, diameter, mass, type);
		this._type = type;
	}
	
	// PUBLIC METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Boolean HasMoons(){
		return (this.getMoonCount() > 0) ? true : false;
	}
	
	public Boolean HasRings(){
		return (this.getRingCount() > 0) ? true : false;
	}

	

	

}
