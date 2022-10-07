package baloon;

/**
 * Defines a balloon object. Its only instance variable, vol, starts off deflated but can be blown into using the addAir method.
 * By @author humzahkha0143.
 */

public class Balloon {

	private int vol;
	
	/**
	 * Default constructor; no params. The Balloon will start at a vol of 0 because it is deflated.
	 */
	public Balloon() {
		vol = 0;
	}
	
	/**
	 * Blows air into the balloon, inflating it. It pops at a volume of 2,147,483,647.
	 * @param add - Amount of air to blow into the balloon.
	 */
	public void addAir(int add) {
		vol += add;
	}
	
	/**
	 * Returns the instance var representing volume.
	 * @return vol
	 */
	public double getVolume() {
		return vol;
	}
	
	/**
	 * 
	 * @return 
	 */
	public double getSurfaceArea() {
		double rad = Math.cbrt(vol / ( (4/3) / Math.PI) );
		return (Math.pow(rad, 2) * Math.PI * 4);
	}
	
	/**
	 * 
	 * @return
	 */
	public double getRadius() {
		double r3 = vol / (4/3) / Math.PI;
		return Math.cbrt(r3);
	}
	
}
