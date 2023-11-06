import java.util.Scanner;
public class Lab6_1d
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int a = in.nextInt();
		System.out.print("Please enter second number: ");
		int b = in.nextInt();
		if (a <= b)
		{
			int total = 0;
			while (a<=b)
			{
				if (a%2==1)
				{
					total += a;
				}
				a++;
			}
			System.out.println("Total = "+total);
		}
		else
		System.out.println("Something went wrong");
	}
}