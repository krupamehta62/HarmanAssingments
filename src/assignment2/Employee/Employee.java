package assignment2.Employee;

import assignment2.EmployeePayment.Payable;

public abstract class Employee implements Payable {
	
	int id;
	String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	abstract public double getPayment();

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}




}
