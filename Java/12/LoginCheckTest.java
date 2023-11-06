import junit.framework.TestCase;


public class LoginCheckTest extends TestCase {
	
	// Test No. 1
	// Objective: To test UN in range 1 to 5 chars
	// Input(s): UserName = "abc"
	// Expected Output: Exception Msg: "Length less than 5"
	
	public void testvalidateUserName001() {
		
		LoginCheck testObject = new LoginCheck();
		
		try {
		
			boolean result = testObject.validateUserName("abc");
			fail("Exception expected");
			
		}
		catch (LoginCheckExceptionHandler e){
			
			assertEquals("Length less than 5", e.getMessage());
		}
		
		
		
	}
	
	
	// Test No. 2
	// Objective: To test UN in range 6 to 15 chars
	// Input(s): UserName = "abcdefgh"
	// Expected Output: True

	public void testvalidateUserName002() {
		
		LoginCheck testObject = new LoginCheck();
		
		try {
			
			assertEquals(true, testObject.validateUserName("abcdefgh"));
			
		}
		catch (LoginCheckExceptionHandler e) {
			
			fail("Exception NOT expected");
			
		}
		
		
	}
	
	
	// Test No. 3
	// Objective: To test UN in range 16 to MAxINT chars
	// Input(s): UserName = "abcdefghiljklmnopqrst"
	// Expected Output: False

	
	public void testvalidateUserName003() {
		
		LoginCheck testObject = new LoginCheck();
		
		try {
		
			boolean result = testObject.validateUserName("abcdefghiljklmnopqrst");
			fail("Exception expected");
			
		}
		catch (LoginCheckExceptionHandler e){
			
			assertEquals("Length greater than 16", e.getMessage());
		}
		
		
	}
	

}
