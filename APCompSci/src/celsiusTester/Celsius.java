package celsiusTester;

/**
 * Simple class to convert Celsius to Farenheit, because imperial measurements are epic!
 * By @author humzahkha0143
 */
public class Celsius {
	
	private double temp;
	
	/** Only constructor; single parameter to change instance var 'temp' to.
	 * @param nT */
	public Celsius(double nT) {
		temp = nT;
	}
	
	/** Single mutator method; converts the temp from Celsius to Farenheit and returns it.
	 * @return (temp multiplied by 9/5) + 32 */
	public double convertCToF() {
		double convert = (temp * (9.0/5.0)) + 32;
		return convert;
	}
	
}
