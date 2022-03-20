package assignment2.EmployeeUml;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public String getFirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public String getName() {
		return firstName + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualsalary() {
		return salary * 12;
	}

	public int RaiseSalary(int percent) {
		salary += (percent * salary) / 100;
		return salary;
	}
//public String toString() {

//}
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public static void main(String arg[]) {
		Employee e = new Employee(2, "Krupa", "Mehta", 40000);
		System.out.println(e.getAnnualsalary());
		System.out.println(e.getFirstName());
		System.out.println(e.RaiseSalary(12));
	}
}
