
public class Square 
{
	/**
	 * @param length
	 */
	public Square(int length) {
		super();
		this.length = length;
	}

	private int length;

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
	public double area()
	{
		return length * length;
	}
	public double perimeter()
	{
		return length * 4;
	}
	public double diagonal()
	{
		return Math.sqrt((length * length)+(length * length));
	}

	public String toString() {
		return "Square [length=" + length + "]";
	}
	public void print()
	{
		System.out.println("Square [length = " + length + "]");
	}
}
