package birthDate;

public class BDTest {

	public static void main(String[] args) {

		BirthDate bd = new BirthDate("Hamm Khan", 2282022);
		System.out.println(bd.getDay());
		System.out.println(bd.getMonth());
		System.out.println(bd.getYear());
		System.out.println(bd.getInitials());
		System.out.println(bd.toString());

	}

}
