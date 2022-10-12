package birthDate;

/**
 * A class to manipulate
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
	 * Returns instance vars.
	 * @return 'Name: Hamm Khan, Birthdate: 3/6/06'
	 */
	public String toString() {
		return "Name: " + fullN + ", Birthdate: " + getMonth() + "/" + getDay() + "/" + getYear();
	}
	
}
