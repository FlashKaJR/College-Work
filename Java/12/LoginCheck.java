public class LoginCheck {
	
	boolean validateUserName(String userName) throws LoginCheckExceptionHandler {
		
		// validateUserName returns true if the userName is between 
				// 6 and 15 characters. Otherwise it returns false.
				boolean result = false;
				
				
				if (userName.length() >= 1 && userName.length() <=5)
					throw new LoginCheckExceptionHandler("Length less than 5");
				else if (userName.length() >= 6  && userName.length() <=15)
					result = true;
				else if (userName.length() >= 16 && userName.length() <= 100)
					throw new LoginCheckExceptionHandler("Length greater than 16");
				
				return result;


		
	}
	
	boolean validatePassword(String password) {
		// validatePassword returns true if the password is between 
		// 4 and 9 characters. Otherwise it returns false.
		 throw new RuntimeException("No code written");
	}
}
