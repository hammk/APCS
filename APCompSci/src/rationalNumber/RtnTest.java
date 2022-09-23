package rationalNumber;

public class RtnTest {

	public static void main(String[] args) {
		
		RationalNumber rtn = new RationalNumber(6,6);
		System.out.println(rtn.toString());
		System.out.println(rtn.getProduct());
		System.out.println(rtn.divideBy());
		System.out.println(rtn.getNumerator());
		rtn.setNumerator(9);
		System.out.println(rtn.getNumerator());
		System.out.println(rtn.getDenominator());
		System.out.println(rtn.divideBy() + "\n");

	}

}
