package rationalNumber;

/**
 * 
 * @author humzahkha0143
 *
 */

public class RationalNumber {
	
	private int numer;
	private int denom;
	
	public RationalNumber() {
		numer = 0;
		denom = 0;
	}
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
	 * Given that instance vars numer and denom have a value, they will be output to resemble a fraction.
	 * @return 0/0
	 */
	public String toString() {
		return numer + "/" + denom;
	}
	
}
