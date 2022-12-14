package rationalNumber;

/**
 * A class to represent a type; RationalNumber has two instance variables, numer (for the numerator) and denom (for the denominator).
 * They can both be redefined using setNumerator and setDenominator, or returned with getNumerator and getDenominator.
 * They can also be multiplied using getProduct or divided using divideBy.
 * These two methods can also be substituted to any given replacement numerator or denominator.
 * 
 * @author humzahkha0143
 */

public class RationalNumber {
	
	/**
	 * Initialized instance variable to correspond with the Numerator.
	 */
	private int numer;
	/**
	 * Initialized instance variable to correspond with the Denominator.
	 */
	private int denom;
	
	/**
	 * Default constructor without arguments.
	 */
	public RationalNumber() {
		numer = 0;
		denom = 0;
	}
	/**
	 * Parameratized constructor with arguments.
	 * @param nN - new Numerator
	 * @param nD - new Denominator
	 */
	public RationalNumber(int nN, int nD) {
		numer = nN;
		denom = nD;
	}

	/**
	 * Whatever calls this method will be returned the numerator stored in the instance fields.
	 * @return numer - The numerator.
	 */
	public int getNumerator() {
		return numer;
	}
	/**
	 * Whatever calls this method will be returned the denominator stored in the instance fields.
	 * @return denom - The denominator
	 */
	public int getDenominator() {
		return denom;
	}
	
	/**
	 * Sets instance var 'numer' to parameter 'numer'.
	 * @param numer - The replacement numerator
	 */
	public void setNumerator(int numer) {
		this.numer = numer;
	}
	/**
	 * Sets instance var 'denom' to parameter 'denom'.
	 * @param denom - The replacement denominator
	 */
	public void setDenominator(int denom) {
		this.denom = denom;
	}
	
	/**
	 * This will multiply the numerator and denominator stored in the instance vars and return it.
	 * @return numer * denom
	 */
	public int getProduct() {
		int prd = numer * denom;
		return prd;
	}
	/**
	 * This will multiply a given numerator and denominator and return it, as opposed to using the instance vars.
	 * @param nN - Numerator
	 * @param nD - Denominator
	 * @return nN * nD
	 */
	public int getProduct(int nN, int nD) {
		int prd = nN * nD;
		return prd;
	}
	
	/**
	 * This will divide the numerator and denominator stored in the instance vars and return it;
	 * @return numer / denom
	 */
	public double divideBy() {
		double nN = numer;
		double nD = denom;
		double prd = nN / nD;
		return prd;
	}
	/**
	 * This will divide a given numerator and denominator and return it, as opposed to using the instance vars.
	 * @param nN
	 * @param nD
	 * @return
	 */
	public double divideBy(int nN, int nD) {
		double prd = nN / nD;
		return prd;
	}
	
	/**
	 * Given that instance vars numer and denom have a value, they will be output to resemble a fraction.
	 * @return 0/0
	 */
	public String toString() {
		return numer + "/" + denom;
	}
	
}
