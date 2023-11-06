
public class TestRectangle {
	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(4, 5);
		System.out.println(r1.toString());
		r1.print();
		r1.setLength(8);
		r1.setWidth(6);
		r1.print();

		

		System.out.println("Area: "+r1.area());

		System.out.println("Perimeter: "+r1.perimeter());

		System.out.println("The length: "+r1.getLength());
		
		System.out.println("The width: "+r1.getWidth());
		
	}
	
	

}
