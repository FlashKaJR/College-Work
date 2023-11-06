
public class YearCheckExcetionHandler extends Exception {	
	//Exception Handling
	
	private static final long serialVersionUID = 1L;
	String message;
	
	public YearCheckExcetionHandler(String errMessage){
		message = errMessage;
	}
	
	public String getMessage() {
		return message;
	}


}
