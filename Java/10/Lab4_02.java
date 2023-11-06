import java.util.Scanner;
public class Lab4_02
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number ");
		int num1 = in.nextInt();
		if(num1 % 5 == 0 )
		{
		System.out.println((num1)+" is a multiple of 5.");
		}
		else
		{
		System.out.println((num1)+" is not a multiple of 5.");
		}
	}
}