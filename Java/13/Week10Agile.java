import junit.framework.TestCase;
//JUnit Testing

public class Week10Agile extends TestCase {
	public void testValidateYear00() {
		
		YearCheck testObject = new YearCheck();
		
		try {
			boolean result = testObject.validateYear(15);
			fail("Exception expected");

		}
		catch(YearCheckExcetionHandler e){
			assertEquals("Year under expected range", e.getMessage());
		}
	}
	
		// Test No. 1
		// Objective: Verify if year that is divisible by 4 is a leap year
		// Input(s): 1999
		// Expected Output: Year 1999 is not a leap year.

public void testValidateYear01() {
	
	YearCheck testObject = new YearCheck();
	
	try {
		boolean result = testObject.validateYear(1984);
		fail("Exception expected");

	}
	catch(YearCheckExcetionHandler e){
		assertEquals("Year is divisible by 4", e.getMessage());
	}
}


		//Test No. 2
		// Objective: Verify if year that is divisible by 100 is not a leap year
		// Input(s): 1700
		// Expected Output: Year 1700 is not a leap year.

public void testValidateYear02() {

	YearCheck testObject = new YearCheck();
	
	try {
		boolean result = testObject.validateYear(1700);
		fail("Exception expected");

	}
	catch(YearCheckExcetionHandler e){
		assertEquals("Year is divisible by 100", e.getMessage());
	}
}


		//Test No. 3
		// Objective: Verify if year that is divisible by 100 but also divisible by 400 is a leap year
		// Input(s): 1600
		// Expected Output: Year 1600 is a leap year.

public void testValidateYear03() {
	
	YearCheck testObject = new YearCheck();
	
	try {
		boolean result = testObject.validateYear(1600);
		fail("Exception NOT expected");

	}
	catch(YearCheckExcetionHandler e){
		
		try {
			assertEquals(true, testObject.validateYear(1600));
		} catch (YearCheckExcetionHandler e1) {

		}
	}
}
}

//////////////////TEMPLATE//////////////////////////////////////////////////////////////
//				  	Fail				  
////////////////////////////////////////////////////////////////////////////////////////

//public void testValidateYear00() {
//	
//	YearCheck testObject = new YearCheck();
//	
//	try {
//		boolean result = testObject.validateYear(" ");
//		fail("Exception expected");
//
//	}
//	catch(YearCheckExcetionHandler e){
//		assertEquals(" ", e.getMessage());
//	}
//}

////////////////////////////////////////////////////////////////////////////////////////
//					  Pass
////////////////////////////////////////////////////////////////////////////////////////

//public void testValidateYear03() {
//	
//	YearCheck testObject = new YearCheck();
//	
//	try {
//		boolean result = testObject.validateYear(1600);
//		assertEquals(true, testObject.validateYear(1600));
//
//	}
//	catch(YearCheckExcetionHandler e){
//		fail("Exception NOT expected");
//	}
//}

////////////////////////////////////////////////////////////////////////////////////////
