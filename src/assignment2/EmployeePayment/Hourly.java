package assignment2.EmployeePayment;

public class Hourly extends Employee{

	public Hourly(int id, String name,double hourly_rate,int numOfhours) {
		super(id, name);
		this.hourly_rate=hourly_rate;
		this.numOfhours=numOfhours;

		// TODO Auto-generated constructor stub
	}
	double hourly_rate;
	int numOfhours;
	@Override
	public double getPayment() {

		// TODO Auto-generated method stub
		return hourly_rate*numOfhours;
	}
	@Override
	public String toString() {
		return "Hourly [hourly_rate=" + hourly_rate + ", numOfhours=" + numOfhours + "]";
	}

}
