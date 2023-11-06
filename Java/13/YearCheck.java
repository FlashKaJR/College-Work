
public class YearCheck {
//Product Code
	
	boolean validateYear(int year) throws YearCheckExcetionHandler {
		//validateYear returns true if year is divisible by 4 and 400 and not divisible by 100
		
		boolean result = false;
		
		
		if (year < 1582)
			throw new YearCheckExcetionHandler("Year under expected range");
		else if (year % 100 == 0 )
			throw new YearCheckExcetionHandler("Year is divisible by 100");
		else if (year % 4 == 0)
			throw new YearCheckExcetionHandler("Year is divisible by 4");	
		else if (year >= 1582 || year <= 2040)
			result = true;
		else if (year > 2040)
			throw new YearCheckExcetionHandler("Year over expected range");
		else {
			throw new YearCheckExcetionHandler("Wrong input");
		}
		return result;

	}


	}
	

