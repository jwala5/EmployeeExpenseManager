package Service;

public class ValidateUserFields {
	public boolean adminlogin(String username,String password) {
			if(username.equals("12") && password.equals("12"))
					return true;
			else 
					return false;
	}

}