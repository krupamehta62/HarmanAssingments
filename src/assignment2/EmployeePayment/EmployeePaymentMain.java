package assignment2.EmployeePayment;



public class EmployeePaymentMain {
	

		public static void main(String[] args) {
			assignment2.EmployeePayment.Employee e=new Commission(554, "Sham",4.1, 560000);
			Invoice invoice=new Invoice("A123", "hardware", 12, 5000);
			PaymentProcess.PaymentProcessSystem(e); 

		}

	}

