package timeTester;

/**
  @author humzahkha0143
  An incomplete way to define time through the 'hours', 'minutes', and 'seconds' variables. 
  These can be changed using the setHours, setMinutes, and setSeconds methods. 
  Likewise, the getHours, getMinutes, and getSeconds methods can retrieve the three variables.
 */

public class Time{
	
	/**
	  Initialize instance variables.
	*/
	private int hours;
	private int minutes;
	private int seconds;
	
	
	/**
	  Default constructor to define instance vars. No params, so set hours, minutes, and seconds to default.
	 */
	public Time() {
		hours = 12;
		minutes = 34;
		seconds = 56;
	};
	
	/**
	 * Constructor with params to define instance vars hours, minutes, and seconds.
	 * @param cHours 
	 * @param cMinutes
	 * @param cSeconds
	 */
	public Time(int cHours, int cMinutes, int cSeconds) {
		hours = cHours;
		minutes = cMinutes;
		seconds = cSeconds;
	};
	
	/**
	 * so begins day two...
	 */
	
	/**
	 * The following three 'get var' methods will do the same thing, except for different instance vars.
	 * This one will get the 'hours' variable.
	 * @return hours
	 */
	public int getHours() {
		return hours;
	}
	
	/**
	 * The second of the three 'get var' methods.
	 * This one will get the 'minutes' variable.
	 * @return minutes
	 */
	public int getMinutes() {	
		return minutes;
	}
	
	/**
	 * The third of the three 'get var' methods.
	 * This one will get the 'seconds' variable.
	 * @return seconds
	 */
	public int getSeconds() {
		return seconds;
	}
	
	/**
	 * The following three intake a new int value to define hours.
	 * @param nHours
	 */
	public void setHours(int nHours) {
		hours = nHours;
	}
	
	/**
	 * The second of the three 'set var' methods for defining minutes.
	 * @param nMins
	 */
	public void setMinutes(int nMins) {
		minutes = nMins;
	}
	
	/**
	 * The third of the three 'set var' methods for defining seconds.
	 * @param nSeconds
	 */
	public void setSeconds(int nSeconds) {
		seconds = nSeconds;
	}
	
	/**
	 * Takes the hours, minutes, and seconds variable, and returns them.
	 */
	public String toString() {
		return(hours + ":" + minutes + ":" + seconds);
	}
	
};