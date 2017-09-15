package Assig3Planets;

public class TerrestrialPlanet extends Planet implements IHabitable, IHasMoons {

	// PRIVATE INSTANCE VARIABLES ++++++++++++++++++++++++++++++++++++++++++++++
	private Boolean _oxygen;
	
	// PUBLIC PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++
		public Boolean hasOxygen() {
			return this._oxygen;
		}
	

	public TerrestrialPlanet(String name, double diameter, double mass, boolean oxygen) {
		super(name, diameter, mass, oxygen);
		this._oxygen = oxygen;
	}
	
	// PUBLIC METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++
		public Boolean HasMoons(){
			return (this.getMoonCount() > 0) ? true : false;
		}
		
		public Boolean Habitable(){
			return (this._oxygen == true) ? true : false;
		}

}
