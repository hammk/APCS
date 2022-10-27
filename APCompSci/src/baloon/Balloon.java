package balloon;

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
	 * @return vol - Instance variable 'vol'4
	 */
	public double getVolume() {
		return vol;
	}
	
	/**
	 * Returns the radius of the balloon, using the instance variable Volume.
	 * It works by multiplying the volume by 3, dividing it by (4 * Pi), then cube rooting the result. This is also used in solving the surface area.
	 * @return
	 */
	public double getRadius() {
		return ( Math.cbrt( (vol * 3) / (4 * Math.PI) ) );
	}
	/**
	 * Returns the radius of the balloon, using a given number.
	 * It works by multiplying a given number to substitute the volume by 3, dividing it by (4 * Pi), then cube rooting the result. This is also used in solving the surface area.
	 * @return
	 */
	public double getRadius(int num) {
		return ( Math.cbrt( (num * 3) / (4 * Math.PI) ) );
	}

	/**
	 * Returns the surface area of the balloon. 
	 * It works by going through 
	 * @return rad^2 * Pi * 4
	 */
	public double getSurfaceArea() {
		double rad = Math.cbrt( (vol * 3) / (4 * Math.PI) );
		return (Math.pow(rad, 2) * Math.PI * 4);
	}
	
}
