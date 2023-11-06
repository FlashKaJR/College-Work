
public class Customer {
	
	private String name;
	private long phoneNumber;
	private String address;
	private String plan;
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	//********************Name********************************
	
	public void setPhone(long n) {
		this.phoneNumber = n;
	}
	
	public Long getPhone() {
		return phoneNumber;
	}
	//*********************Phone*******************************
	
	public void setAddress(String a) {
		this.address = a;
	}
	
	public String getAddress() {
		return address;
	}
	//*********************Address*******************************
	
	public void setPlan(String p) {
		this.plan = p;
	}
	
	public String getPlan() {
		return plan;
	}
	//*********************Plan*******************************
	
	public Customer() {
		this.name = null;
		this.phoneNumber = 0;
		this.address = null;
		this.plan = null;
	}
	public Customer(long phone) {
		this.phoneNumber = phone;
	}
	public Customer(long phone, String plan) {
		this.phoneNumber = phone;
		this.plan = plan;
	}
	public Customer(long phone, String plan, String name) {
		this.phoneNumber = phone;
		this.plan = plan;
		this.name = name;
	}	
	public Customer(long phone, String plan, String name, String address) {
		this.name = name;
		this.phoneNumber = phone;
		this.address = address;
		this.plan = plan;
	}
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Plan: " + plan);
		System.out.println("*************************");
		}

}
