
public class Cylinder {

	/**
	 * @param radius
	 * @param height
	 */
	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	private double radius;
	private double height;
	
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	public double volume()
	{
		return Math.pow(radius, 2) * Math.PI * height;
	}
	public double surfaceArea()
	{
		return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
	}
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + "]";
	}

	public void print()
	{
		System.out.println("Cylinder [radius = " + radius + "]");
	}
	

}

