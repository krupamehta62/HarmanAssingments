package assignment3.StudentPortal;

public class UserRegistration {

	public void userRegistration(String username,String usercountry) throws InvalidCountryException
	{
		if(usercountry.equals("India"))
		{
			System.out.println("user registered successfully");
		}
		else
		{
			throw new InvalidCountryException("country "+usercountry+" is invalid please give india");
		}
	}
}