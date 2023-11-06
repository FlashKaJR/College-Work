import java.util.Scanner;
public class Wk2_12
{
	public static void main(String [] arg)
	{
		Scanner in = new Scanner(System.in);
		int num1 = 20;
		int num2 = 25;
		System.out.printf("The sum: %8d.n",+(num1+num2));
		System.out.printf("The difference: %8d.n"+(num1-num2));
		System.out.printf("The product: %8d.n"+(num1*num2));
		System.out.printf("The average: %8d.n"+((num1+num2)/2.0));
		System.out.printf("The distance: %8d.n"+Math.abs(num1-num2));
		System.out.printf("The maximum: %8d.n"+Math.max(num1, num2));
		System.out.printf("The maximum: %8d.n"+Math.min(num1, num2));
	}
}