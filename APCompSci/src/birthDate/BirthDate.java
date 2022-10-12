package birthDate;

public class BirthDate {
	
	private int birthD;
	private String fullN;
	
	public BirthDate(String firstN, String lastN, int bd) {
		birthD = bd;
		fullN = firstN + " " + lastN;
	}
	
	public int getMonth() {
		return birthD / 1000000;
	}
	
	public int getDay() {
		
		return (birthD % 1000000) / 10000;
	}
	
	public int getYear() {
		return birthD % 10000;
	}
	
	public String toString() {
		return "Name: " + fullN + ", Birthdate: " + birthD;
	}
	
}
