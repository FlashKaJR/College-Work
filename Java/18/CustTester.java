
public class CustTester {
	public static void main(String[] args) {

		Customer p1 = new Customer(1968491, "Bill", "John");
		Customer p2 = new Customer(1165684, "Pre Pay", "Piotr", "Dublin");
		Customer p3 = new Customer(1568435);
		p3.setPlan("Pre Pay");
		p3.setName("Tommy");
		p3.setAddress("Athlone");
		
		Customer p4 = new Customer(6284958);
		p4.setPlan("Bill");
		p4.setName("Sarah");
		p4.setAddress("Tipperary");
		

		p1.printDetails();
		p2.printDetails();
		System.out.println("Name: " + p3.getName() + "\nAddress: " + p3.getAddress() + "\nPhone Number: " + p3.getPhone() + "\nPlan: " + p3 .getPlan() + "\n*************************");
		System.out.println("Name: " + p4.getName() + "\nAddress: " + p4.getAddress() + "\nPhone Number: " + p4.getPhone() + "\nPlan: " + p4 .getPlan() + "\n*************************");
	}
}
