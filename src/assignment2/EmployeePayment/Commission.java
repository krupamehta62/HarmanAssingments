package assignment2.EmployeePayment;

public class Commission extends Employee{

	double commisionPercent;
	double totalSale;

	public Commission(int id, String name,double commisionPercent,double totalSale) {
		super(id, name);
		this.commisionPercent=commisionPercent;
		this.totalSale=totalSale;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return (commisionPercent*totalSale)/100 ;
	}

}