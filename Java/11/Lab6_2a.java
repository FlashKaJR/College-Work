import java.util.Scanner;
public class Lab6_2a
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int value = in.nextInt();
		int maximum = value;
		int minimum = value;
		while (in.hasNextInt())
		{
			value = in.nextInt();
			if (value > maximum)
			{
				maximum = value;
			}
			if (value < minimum)
			{
				minimum = value;
			}
		}
		System.out.println("Maximum = "+maximum);
		System.out.println("Minimum = "+minimum);
	}
}