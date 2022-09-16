/**
  @author humzahkha0143
  An incomplete time checker and setter for:
  hours (getHours, setHours)
  minutes (getMinutes, setMinutes)
  seconds (getSeconds, setSeconds.)
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
	 * The following three do the same thing, except for different instance vars.
	 * @return hours
	 * @return minutes
	 * @return seconds
	 */
	public int getHours() {
		return hours;
	}
	public int getMinutes() {	
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	
	/**
	 * The following three intake a new int value for hours, minutes, and seconds.
	 * @param nHours
	 * @param nMins
	 * @param nSeconds
	 */
	public void setHours(int nHours) {
		hours = nHours;
	}
	public void setMinutes(int nMins) {
		minutes = nMins;
	}
	public void setSeconds(int nSeconds) {
		seconds = nSeconds;
	}
	
};