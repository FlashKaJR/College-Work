import java.util.Scanner;
public class Wk2_10
{
	public static void main(String [] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the first number ");
		int num1 = in.nextInt();
		System.out.print("Please enter the second number ");
		int num2 = in.nextInt();
		System.out.println("The area: "+(num1*num2));
		System.out.println("The perimeter: "+2*(num1+num2));
		System.out.println("The diagonal: "+Math.sqrt(num1*num1+num2*num2));
	}
}