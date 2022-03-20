package assignment3;

import java.util.Scanner;

public class CmdExceptionHandling extends Exception {



		 public CmdExceptionHandling(String str) {
			  System.out.println(str);
			 }
		public static void main(String[] args)  {
			// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			System.out.println("Enter the name: ");
			String name=s.next();
			System.out.println("Enter the age: ");
			int age=s.nextInt();

			try
			{
				if(age<18 || age>60)
				{
					throw new CmdExceptionHandling("invalid age.");
				}
				else
				{
					System.out.println("valid age");

				}
			}
			catch(CmdExceptionHandling e)
			{
				System.out.println(e);
			}

		}

	}

