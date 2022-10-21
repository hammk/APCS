package birthDate;

/**
 * A class to manipulate one's full name (first name last name) and their birthdate as one long number.
 * When casted, the user can get the birth month, day, and year stored in the object using methods getDay(), getMonth() , and getYear(), as well as the full name's initials using getInitials().
 * There is an overwritten toString method to return the instance vars stored in the object, including the initials.
 * by @author humzahkha0143
 */
public class BirthDate {
	
	/**
	 * Instance var; birthD represents ones birthday as a single number (such as 12252021.)
	 */
	private int birthD;
	/**
	 * Instance var; fullN represents ones full name as both a first and last name (such as Hamm Khan.)
	 */
	private String fullN;
	
	/**
	 * Default constructor; three params.
	 * @param name - First and Last name to fill instance var fullN.
	 * @param bd - A single number representing one's birthday to fill instance var birthD.
	 */
	public BirthDate(String name, int bd) {
		birthD = bd;
		fullN = name;
	}
	
	/**
	 * Gets the month from the instance var birthD.
	 */
	public int getMonth() {
		return birthD / 1000000;
	}
	
	/**
	 * Gets the day from the instance var birthD.
	 */
	public int getDay() {
		return birthD % 1000000 / 10000;
	}
	
	/**
	 * Gets the year from the instance var birthD.
	 */
	public int getYear() {
		return birthD % 10000;
	}
	
	/**
	 * 
	 */
	public String getInitials() {
		String fI = fullN.substring(0, 1);
		int lIsep = fullN.indexOf(" ");
		String lI = fullN.substring(lIsep + 1, lIsep + 2);
		
		return fI + lI;
	}
	
	/**
	 * Returns instance vars.
	 * @return 'Name: Hamm Khan, Birthdate: 3/6/06'
	 */
	public String toString() {
		return "Name: " + fullN + ", " + getInitials() + ", Birthdate: " + getMonth() + "/" + getDay() + "/" + getYear();
	}
	
	public static void main(String args[]) {
		System.out.println("\n  ---------       /-- \n / \"HAPPY  \\     /-\\ \n/  BIRSDAY  \\   |. .|\n\\  AP COMP  / ~ | V |\n \\   SCI!\" /    |----\\ \n  ---------     |    ⁀⁀\\ \n                |       \\ \n                \\∖_____∕/\n                  || ||\n                 <=/ <=/\n");
	}
	
}
