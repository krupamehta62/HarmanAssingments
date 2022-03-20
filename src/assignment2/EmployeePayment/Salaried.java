package assignment2.EmployeePayment;

public class Salaried extends Employee{

	double fixedweeklySalary;
	public Salaried(int id, String name,double fixedweeklySalary) {
		super(id, name);
		this.fixedweeklySalary=fixedweeklySalary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return fixedweeklySalary;
	}


}
