package assignment3;
import java.util.Scanner;


public class arithmeticException {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);
			try
			{
				System.out.println("Enter the firts number");
				int a=s.nextInt();
				System.out.println("Enter the second number");
				int b=s.nextInt();
				int quotient=a/b;
				System.out.println("the quotient of " + a + " and " + b + " is "+ quotient);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage()+"Exception caught");
			}
			finally
			{
				System.out.println("inside finally block");
			}





		}

	}
