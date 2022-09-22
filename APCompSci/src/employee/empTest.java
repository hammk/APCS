package employee;

public class empTest {

	public static void main(String[] args) {

		Employee myEmployee = new Employee();
		System.out.println(myEmployee.getName());
		System.out.println(myEmployee.getSalary() + "\n");
		
		Employee myEmployee2 = new Employee("Blues", "Clues", 10000);
		System.out.println(myEmployee2.getName());
		System.out.println(myEmployee2.getSalary() + " original salary");
		myEmployee2.raiseSalary(57);
		System.out.println(myEmployee2.getSalary() + " new salary\n");
		myEmployee2.setName("Super Smash Bros.", "For Nintendo 3DS");
		System.out.println(myEmployee2.getName() + " is Blue's new name");
		myEmployee2.setSalary(50);
		System.out.println(myEmployee2.getSalary() + "                    his salary became so bad that");
		myEmployee2.raiseSalary(26);
		System.out.println(myEmployee2.getSalary() + "                         he got a bigger salary\n");

	}

}
