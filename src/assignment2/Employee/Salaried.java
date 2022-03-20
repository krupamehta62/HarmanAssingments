package assignment2.Employee;

public class Salaried extends Employee {

	public Salaried(int id, String name,double fixedweeklySalary) {
		super(id, name);
		this.fixedweeklySalary=fixedweeklySalary;
		// TODO Auto-generated constructor stub
	}

	double fixedweeklySalary;

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return fixedweeklySalary;
	}

	@Override
	public String toString() {
		return "Salaried [fixedweeklySalary=" + fixedweeklySalary + "]";
	}

}