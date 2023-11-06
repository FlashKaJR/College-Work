
public class TestCircle {
	
	public static void main(String[] args)
	{
		Circle c1 = new Circle(5.6, 5);
		System.out.println(c1.toString());
		c1.print();
		c1.setRadius(4.3);
		c1.setHeight(6);
		c1.print();

		

		System.out.println("Area: "+c1.area());

		System.out.println("Circumference: "+c1.circumference());

		System.out.println("The radius: "+c1.getRadius());
		
		System.out.println("The height: "+c1.getHeight());
		
	}
	
	

}
