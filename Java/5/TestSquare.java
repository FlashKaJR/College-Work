
public class TestSquare {
	
	public static void main(String[] args)
	{
		Square s1 = new Square(5);
		System.out.println(s1.toString());
		s1.print();
		s1.setLength(7);
		s1.print();

		

		System.out.println("Area: "+s1.area());

		System.out.println("Perimeter: "+s1.perimeter());

		System.out.println("Diagonal: "+s1.diagonal());
		
	}
	
	

}
