package Assig3Planets;

public class TerrestrialPlanet extends Planet implements IHabitable, IHasMoons {

	public TerrestrialPlanet(String name, double diameter, double mass) {
		super(name, diameter, mass);
		// TODO Auto-generated constructor stub
	}

	public TerrestrialPlanet(String name, double diameter, double mass, int moonCount, double orbitPeriod,
			int ringCount, double rotationPeriod, String type) {
		super(name, diameter, mass, moonCount, orbitPeriod, ringCount, rotationPeriod, type);
		// TODO Auto-generated constructor stub
	}

}
