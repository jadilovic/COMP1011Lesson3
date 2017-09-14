package Assig3Planets;
/**
 * @author Jasmin Adiloviæ
 * Assignment 3 Abstract Planets
 * 
 *
 */
public abstract class Planet {

	// PRIVATE INSTANCE VARIABLES ++++++++++++++++++++++++++++++++++++
	private double _diameter;
	private double _mass;
	private int _moonCount;
	private String _name;
	private double _orbitalPeriod;
	private int _ringCount;
	private double _rotationPeriod;
	
	// PUBLIC PROPERTIES +++++++++++++++++++++++++++++++++++++++++++++
	public double getDiameter() {
		return _diameter;
	}

	public double getMass() {
		return _mass;
	}

	public int getMoonCount() {
		return _moonCount;
	}

	public void setMoonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}

	public String getName() {
		return _name;
	}

	public double getOrbitalPeriod() {
		return _orbitalPeriod;
	}

	public void setOrbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}

	public double getRotationPeriod() {
		return _rotationPeriod;
	}

	public void setRotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}

	public int getRingCount() {
		return _ringCount;
	}

	public void setRingCount(int _ringCount) {
		this._ringCount = _ringCount;
	}
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++
	public Planet(String name, double diameter, double mass) {
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;
	}

		public Planet(String name, double diameter, double mass, String type) {
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;
		
	}

		public Planet(String name, double diameter, double mass, boolean oxygen) {
			this._name = name;
			this._diameter = diameter;
			this._mass = mass;
		}

		// OVERRIDE PUBLIC METHOD toString derived from Object superclass
		@Override
		public String toString(){
			return "This planet " + this._name + " has diameter " + this._diameter + 
					" and mass " + this._mass;
		}

	

}
