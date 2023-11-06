
public class Rectangle
{
	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	private int length;
	private int width;
	
	
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	public double area()
	{
		return length * width;
	}
	public double perimeter()
	{
		return 2*(length + width);
	}
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	public void print()
	{
		System.out.println("Rectangle [length = " + length + "]");
	}
	

}
