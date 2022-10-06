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
	private double r2;
	
	/**
	 * Default constructor, two params.
	 * @param h - Height of the Cone
	 * @param r - Radius of the Ice Cream
	 */
	public IceCreamCone (double h, double r) {
		
		high = h;
		rad = r;
		r2 = Math.pow(rad, 2);
		
	}
	
	/**
	 * This method calculates the surface area of the sphere (a scoop of ice cream) as determined with the radius instance var, halves it, and adds the surface area of the cone specified with both radius of the ice cream and the height of the cone.
	 * @return (Ice Cream / 2) + Cone
	 */
	// cnArea = pi * r(r + sqrt(h^2 + r^2) )
	public double getSurfaceArea() {
		
		double cn = (Math.PI * rad * (rad+Math.sqrt(Math.pow(high,2) + r2))) - (Math.PI * r2);
		double ic = 4 * Math.PI * r2;
		double sa = (ic / 2) + cn;
		return sa;
		
	}
	
	/**
	 * This method calculates the volume of the sphere (a scoop of ice cream) as determined with the radius instance var, halves it, and adds the calculated volume of the cone specified with both radius of the ice cream and the height of the cone. 
	 * @return (Ice Cream / 2) + Cone
	 */
	// cnVol = (1/3) * pi * r2 * h
	// spVol = (4/3) * pi * r3
	public double getVolume() {
		
		double con = (1.0/3) * Math.PI * r2 * high;
		double sph = (4/3) * Math.PI * Math.pow(rad, 3);
		return ((sph / 2) + con);
		
	}
	
}
