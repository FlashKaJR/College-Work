import java.io.Serializable;

public class Staff implements Serializable{
	private String staffID;
	private String staffName;
	private String staffAddress;
	private Double staffSalary;
	
	public Staff(String id, String name, String address, double salary) {
		this.staffID = id;
		this.staffName = name;
		this.staffAddress = address;
		this.staffSalary = salary;
	}
	
	public void getStaffName(String n) {
		this.staffName = n;
	}
}
