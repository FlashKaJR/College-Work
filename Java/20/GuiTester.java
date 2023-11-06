
public class GuiTester {
	public static void main(String[] args) {

		House h1 = new House("Smith", 5, 1);
		House h2 = new House("Jones", 3, 1);
		House h3 = new House();
		
		h3.setSurname("Burke");
		h3.setBedrooms(4);
		h3.setBathrooms(2);

		h1.printDetails();
		h2.printDetails();
		System.out.println("Owners: " + h3.getSurname() + " Number of bedrooms: " + h3.getBedrooms() + " Number of bathrooms: " + h3.getBathrooms());
	}
}
