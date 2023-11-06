import java.util.Scanner;

public class Lab3Test 
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter a radius: ");
		double r = in.nextDouble();

		System.out.println("Please enter a height: ");
		double h = in.nextDouble();
		
		System.out.println("Please enter a length: ");
		double l = in.nextDouble();
		
		double volSphere = TestMethods.sphereVolume(r);
		System.out.println("The volume of the sphere is: " + volSphere);

		double volCylinder = TestMethods.cylinderVolume(r, h);
		System.out.println("The volume of the cylinder is: " + volCylinder);
		
		double volCone = TestMethods.coneVolume(r, h);
		System.out.println("The volume of the cone is: " + volCone);
		
		double surSphere = TestMethods.sphereSurface(r);
		System.out.println("The surface of the sphere is: " + surSphere);
		
		double surCylinder = TestMethods.cylinderSurface(r, h);
		System.out.println("The surface of the cylinder is: " + surCylinder);
		
		double surCone = TestMethods.coneSurface(r, h, l);
		System.out.println("The surface of the cone is: " + surCone);
		
		in.close();
	}
}
