import java.util.Scanner;
public class Lab6_1e
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int value = in.nextInt();
		int total = 0;
		while (value > 0)
		{
			int digit = value % 10;
			if (value % 2 == 1)
			{
				total += digit;
			}
			value /= 10;
		}
		System.out.println("Total of the odd values = "+total);
	}
}