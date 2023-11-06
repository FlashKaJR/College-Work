import java.util.Scanner;
public class Wk2_09
{
	public static void main(String [] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the radius ");
		int radius = in.nextInt();
		System.out.println("The area : "+(Math.PI * radius * radius));
		System.out.println("The circumference : "+(2 * Math.PI * radius));
		System.out.println("The volume : "+((4.0 / 3.0) * Math.PI * radius * radius * radius));
		System.out.println("The surface area : "+(4.0 * Math.PI * radius * radius));
	}
}