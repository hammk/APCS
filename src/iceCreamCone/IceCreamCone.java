package iceCreamCone;

/**
 * Defines an 'ice cream cone' using a sphere and cone.
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
	 * This method calculates the surface area of the sphere Ice Cream as determined with the radius instance var, halves it, an adds the surface area of the cone specified with both radius of the ice cream and the height of the cone.
	 * @return (Ice Cream / 2) + Cone
	 */
	// cnArea = pi * r2 + pi * r * sqrt(r2 + h2)
	public double getSurfaceArea() {
		
		double cn = Math.PI * rad * Math.sqrt( r2 + Math.pow(high, 2));
		double ic = 4 * Math.PI * r2;
		double sa = (ic / 2) + cn;
		return sa;
		
	}
	
	/**
	 * 
	 * @return (Ice Cream / 2) + Cone
	 */
	// cnVol = (1/3) * pi * r2 * h
	// spVol = (4/3) * pi * r3
	public double getVolume() {
		
		double sph = (4/3) * Math.PI * Math.pow(rad, 3);
		double con = (1.0/3) * Math.PI * r2 * high;
		double vo = (sph / 2) + con;
		return vo;
		
	}
	
}
