package stringComparison;

/**
 * A type to compare three strings.
 * It compares s1 with s2, and depending on the chosen
 * method (getFirst, getSecond, getThird), it decides the
 * victor and pits it against s3 to decide which is first/second/third.
 * @author hamm-win10 / humzahkha0143
 */
public class StringSet {
	
	/**
	 * Compares three strings to see which is first.
	 * @param s1 - First String to compare.
	 * @param s2 - Second String to compare.
	 * @param s3 - Third String to compare.
	 * @return String that comes first lexicographically.
	 */
	public static String getFirst(String s1, String s2, String s3) {
		String choice = s1;
		if(!s1.equals(s2) && !s1.equals(s3)) {
		
			if(s1.compareTo(s2) > 0)       choice = s2;
			 else if(s1.compareTo(s2) < 0) choice = s1;
			if(choice.compareTo(s3) > 0)   choice = s3;
			
		}
		return choice;
	}
	
	/**
	 * Compares three strings to see which is second.
	 * @param s1 - First String to compare.
	 * @param s2 - Second String to compare.
	 * @param s3 - Third String to compare.
	 * @return String that comes second lexicographically.
	 */
	public static String getSecond(String s1, String s2, String s3) {
		String choice = s1;
		if(!s1.equals(s2) && !s1.equals(s3)) {
		
			if(s1.compareTo(s2) > 0)       choice = s1;
			 else if(s1.compareTo(s2) < 0) choice = s3;
			if(choice.compareTo(s3) > 0)   choice = s2;
			
		}
		return choice;
	}
	
	/**
	 * Compares three strings to see which is third.
	 * @param s1 - First String to compare.
	 * @param s2 - Second String to compare.
	 * @param s3 - Third String to compare.
	 * @return String that comes third lexicographically.
	 */
	public static String getThird(String s1, String s2, String s3) {
		String choice = s1;
		if(!s1.equals(s2) && !s1.equals(s3)) {
		
			if(s1.compareTo(s2) > 0)       choice = s1;
			 else if(s1.compareTo(s2) < 0) choice = s2;
			if(choice.compareTo(s3) > 0)   choice = s3;
			
		}
		return choice;
	}
	
}
