package assignment2.Employee;

public class Commision extends Employee{

		double salePercentage;
		double totalSale;

		public Commision(int id, String name,double salePercentage,double totalSale) {
			super(id, name);
			this.salePercentage=salePercentage;
			this.totalSale=totalSale;

			// TODO Auto-generated constructor stub
		}

		@Override
		public double getPayment() {
			// TODO Auto-generated method stub
			return (salePercentage*totalSale)/100;
		}

		@Override
		public String toString() {
			return "Commision [salePercentage=" + salePercentage + ", totalSale=" + totalSale + "]";
		}

	}
	
