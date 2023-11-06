
public class FullTimeEmployee extends Employee {
	private double hourlyRate;
	
	public FullTimeEmployee(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	
	public double getHourlyRate()
	{
		System.out.println("this is a Full time employee....");
		return hourlyRate;
	}
}
