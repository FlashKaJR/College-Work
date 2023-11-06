import java.io.FileOutputStream;
import java.io.*;



public class Tester {
	
public static void main(String[] args) {
	
	
	
	try {
		FileInputStream fileIn = new FileInputStream("staff.ser");
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);
		
		Staff newStaff = (Staff)objectIn.readObject();
		System.out.println(newStaff.getStaffName());
		
	}catch(Exception e) {
		Staff s1 = new Staff("13558", "Mary","Dublin",50000);
		
//		try {
			
			FileOutputStream fileOutput = new FileOutputStream("staff.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOutput);
			objectOut .writeObject(s1);
			
			objectOut.close();
			fileOutput.close();
//			}
			
//			catch(Exception e) {
//				e.printStackTrace();
//			}
	}
	}
}
	

