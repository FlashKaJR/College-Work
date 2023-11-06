
public class House {
	
	private String surname;
	private long bathrooms;
	private long bedrooms;

	public void setSurname(String n) {
		this.surname = n;
	}
	
	public String getSurname() {
		return surname;
	}
	//********************surname********************************
	
	public void setBathrooms(long ba) {
		this.bathrooms = ba;
	}
	
	public Long getBathrooms() {
		return bathrooms;
	}
	//*********************Bathrooms*******************************
	
	public void setBedrooms(long be) {
		this.bedrooms = be;
	}
	
	public Long getBedrooms() {
		return bedrooms;
	}
	//*********************Bedrooms*******************************
	
	public House() {
		this.surname = null;
		this.bedrooms = 0;
		this.bathrooms = 0;
	}
	public House(String surname) {
		this.surname = surname;
	}
	public House(String surname, long bed) {
		this.surname = surname;
		this.bedrooms = bed;
	}
	public House(String surname, long bed, long bath) {	
		this.surname = surname;
		this.bedrooms = bed;
		this.bathrooms = bath;
	}
	
	public void printDetails() {
		System.out.print("Owners: " + surname);
		System.out.print(" Number of bedrooms: " + bedrooms);
		System.out.println(" Number of bathrooms: " + bathrooms);
		}

}
