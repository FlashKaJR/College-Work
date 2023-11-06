
public class TestCylinder {
	
	public static void main(String[] args)
	{
		Cylinder cl1 = new Cylinder(3.4, 6.7);
		System.out.println(cl1.toString());
		cl1.print();
		cl1.setRadius(2.3);
		cl1.setHeight(4.5);
		cl1.print();

		

		System.out.println("Volume: "+cl1.volume());

		System.out.println("Surface area: "+cl1.surfaceArea());

		System.out.println("The radius: "+cl1.getRadius());
		
		System.out.println("The height: "+cl1.getHeight());
		
	}
	
	

}
