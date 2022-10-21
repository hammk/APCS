package stringComparison;

public class StringSet {
	
	/**
	 * Compares three strings to see which is first.
	 * @param s1 - First String to compare.
	 * @param s2 - Second String to compare.
	 * @param s3 - Third String to compare.
	 * @return String that comes first lexicograpically.
	 */
	public static String getFirst(String s1, String s2, String s3) {
		String choice = null;
		if(!s1.equals(s2) || !s1.equals(s3)) {
		
			if(s1.compareTo(s2) > 0)      choice = s2;
			 else if(s1.compareTo(s2) < 0)choice = s1;
			if(s1.compareTo(s3) > 0)      choice = s3;
			 else if(s1.compareTo(s3) < 0)choice = s1;
			else                          choice = s1;
			
		}
		else choice = s1;
		return choice;
	}
	
	/**
	 * Compares three strings to see which is second.
	 * @param s1 - First String to compare.
	 * @param s2 - Second String to compare.
	 * @param s3 - Third String to compare.
	 * @return String that comes second lexicograpically.
	 */
	public static String getSecond(String s1, String s2, String s3) {
		String choice = null;
		if(!s1.equals(s2) || !s1.equals(s3)) {
		
			if(s1.compareTo(s2) < 0)      choice = s2;
			 else if(s1.compareTo(s2) < 0)choice = s1;
			if(s1.compareTo(s3) > 0)      choice = s3;
			 else if(s1.compareTo(s3) < 0)choice = s1;
			else                          choice = s1;
			
		}
		else choice = s1;
		return choice;
	}
	
	/**
	 * Compares three strings to see which is third.
	 * @param s1 - First String to compare.
	 * @param s2 - Second String to compare.
	 * @param s3 - Third String to compare.
	 * @return String that comes third lexicograpically.
	 */
	public static String getThird(String s1, String s2, String s3) {
		String choice = null;
		if(!s1.equals(s2) || !s1.equals(s3)) {
		
			if(s1.compareTo(s2) < 0)      choice = s2;
			 else if(s1.compareTo(s2) > 0)choice = s1;
			if(s1.compareTo(s3) < 0)      choice = s3;
			 else if(s1.compareTo(s3) > 0)choice = s1;
			else                          choice = s1;
			
		}
		else choice = s1;
		return choice;
	}
}
