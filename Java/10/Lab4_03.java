import java.util.Scanner;
public class Lab4_03
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number ");
		int num1 = in.nextInt();
		if(num1 % 2 == 0 )
		{
		System.out.println((num1)+" is even.");
		}
		else
		{
		System.out.println((num1)+" is odd.");
		}
	}
}