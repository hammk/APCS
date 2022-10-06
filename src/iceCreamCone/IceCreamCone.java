package iceCreamCone;

/**
 * Defines an 'ice cream cone' using a cone and sphere (halved to fit the cone).
 * The user defines the cone's height and the ice cream scoop's radius when casting an object. 
 * They can also return the surface area or volume of the whole cone.
 * by @author humzahkha0143
 */

public class IceCreamCone {

	/** Define Instance Variables. */
	private double high;
	private double rad;
	
	/**
	 * Default constructor, two params.
	 * @param h - Height of the Cone
	 * @param r - Radius of the Ice Cream
	 */
	public IceCreamCone (double h, double r) {
		
		high = h;
		rad = r;
		
	}
	
	/**
	 * This method calculates the surface area of the sphere (a scoop of ice cream) as determined with the radius instance var, halves it, and adds the surface area of the cone specified with both radius of the ice cream and the height of the cone.
	 * @return (Ice Cream / 2) + Cone
	 */
	// cnArea = pi * r(r + sqrt(h^2 + r^2) )
	public double getSurfaceArea() {
		
		double lth = Math.sqrt(Math.pow(rad, 2) + Math.pow(high, 2));
		double con = Math.PI * rad * lth;
		return con;
		
	}
	
	/**
	 * This method calculates the volume of the sphere (a scoop of ice cream) as determined with the radius instance var, halves it, and adds the calculated volume of the cone specified with both radius of the ice cream and the height of the cone. 
	 * @return (Ice Cream / 2) + Cone
	 */
	// cnVol = (1/3) * pi * r2 * h
	// spVol = (4/3) * pi * r3
	public double getVolume() {
		
		double con = (1.0/3) * Math.PI * rad * rad * high;
		return con;
		
	}
	
}
