package assignment2.Employee;


	public class Hourly extends Employee{

		public Hourly(int id, String name,double hourly_rate,int numOfhours) {
			super(id, name);
			this.hourly_rate=hourly_rate;
			this.numOfhours=numOfhours;
			
		}
		double hourly_rate;
		int numOfhours;
		@Override
		public double getPayment() {
			
			return hourly_rate*numOfhours;
		}
		@Override
		public String toString() {
			return "Hourly [hourly_rate=" + hourly_rate + ", numOfhours=" + numOfhours + "]";
		}
}
