package employee;

/**
 * 
 * by @author humzahkha0143
 */

public class Employee {
	
	/**
	 * Initialized String instance variables, corresponding to First and Last Name.
	 */
	private String fName, lName;
	/**
	 * Initialized double instance variable, corresponding to salary .
	 */
	private double salary;
	
	/**
	 * Default constructor. No parameters, so set to defaults.
	 */
	public Employee() {
		fName = "Mighty";
		lName = "Mouse";
		salary = 0.0;
	}
	
	/**
	 * Constructor with parameters. 
	 * @param nF - New First Name
	 * @param nL - New Last Name
	 * @param nS - New Salary
	 */
	public Employee(String nF, String nL, double nS) {
		fName = nF;
		lName = nL;
		salary = nS;
	}

	/**
	 * Getter for instance var 'salary'
	 * @return salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Setter for instance var 'salary'
	 * @param nS2 - Replacement salary.
	 */
	public void setSalary(double nS2) {
		this.salary = nS2;
	}
	
	/**
	 * Getter for a combined string containing instance vars 'fName' and 'lName'.
	 * @return "fName lName"
	 */
	public String getName() {
		String fullName = fName + " " + lName;
		return fullName;
	}
	
	/**
	 * Setter for instance vars 'fName' and 'lName'.
	 * @param nF2 - Replacement First Name
	 * @param nL2 - Replacement Last Name
	 */
	public void setName(String nF2, String nL2) {
		this.fName = nF2;
		this.lName = nL2;
	}
	
	public void raiseSalary(int pRaise) {
		double percent = (pRaise / salary) * 100 ;
		salary = ((percent * salary) - 0.000000000001) + salary;
	}
	
}
