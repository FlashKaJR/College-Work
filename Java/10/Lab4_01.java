import java.util.Scanner;
public class Lab4_01
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number ");
		int num1 = in.nextInt();
		if(num1 < 0)
		{
		System.out.println((num1)+" is a negative number.");
		}
		else
		{
		System.out.println((num1)+" is a positive number");
		}
	}
}