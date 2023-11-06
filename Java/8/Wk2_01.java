import java.util.Scanner;
public class Wk2_01
{
	public static void main(String [] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the first number ");
		int num1 = in.nextInt();
		System.out.print("Please enter the second number ");
		int num2 = in.nextInt();

		int sum = num1 + num2;
		System.out.println("The sum: "+sum);
	}
}