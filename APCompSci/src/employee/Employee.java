package employee;

/**
 * 
 * by @author humzahkha0143
 */

public class Employee {
	
	/**
	 * Initialize instance variables.
	 */
	private String fName;
	private String lName;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double nS2) {
		this.salary = nS2;
	}
	
	public String getName() {
		return fName + " " + lName;
	}
	
	public void setName(String nF2, String nL2) {
		this.fName = nF2;
		this.lName = nL2;
	}
	
	
	
}
