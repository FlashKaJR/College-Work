import java.util.Scanner;
public class Wk2_08
{
	public static void main(String [] arg)
	{
		Scanner in = new Scanner(System.in);
		int num1 = 20;
		int num2 = 25;
		System.out.println("The sum: "+(num1+num2));
		System.out.println("The difference: "+(num1-num2));
		System.out.println("The product: "+(num1*num2));
		System.out.println("The average: "+((num1+num2)/2.0));
		System.out.println("The distance: "+Math.abs(num1-num2));
		System.out.println("The maximum: "+Math.max(num1, num2));
		System.out.println("The maximum: "+Math.min(num1, num2));
	}
}