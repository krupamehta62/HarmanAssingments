package assignment3.StudentPortal;

public class StudentPortalMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			UserRegistration registration=new UserRegistration();
			try
			{
				registration.userRegistration("Krupa Mehta", "India");
			}
			catch(InvalidCountryException e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
