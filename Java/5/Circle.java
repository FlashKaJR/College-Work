
public class Circle {

	/**
	 * @param radius
	 * @param height
	 */
	public Circle(double radius, double height) {
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
	public double area()
	{
		return Math.pow(radius, 2) * Math.PI;
	}
	public double circumference()
	{
		return 2 * Math.PI * radius;
	}
	public String toString() {
		return "Circle [radius=" + radius + ", height=" + height + "]";
	}

	public void print()
	{
		System.out.println("Circle [radius = " + radius + "]");
	}
	

}


