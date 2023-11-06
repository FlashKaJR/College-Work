import java.util.Scanner;
public class Lab4_06
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter three numbers (separating with a space between): ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		if(num1 < num2)
		{
		System.out.println((num1)+" is smaller than "+(num2));
		}
		else if(num1 < num3)
		{
		System.out.println((num1)+" is greater than "+(num2));
		System.out.println((num1)+" is smaller than "+(num3));
		}
		else
		{
			System.out.println((num1)+" is greater than "+(num2));
			System.out.println((num1)+" is greater than "+(num3));
		}
	}
}