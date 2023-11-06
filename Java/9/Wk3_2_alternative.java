import java.util.Scanner;
public class Wk3_2_alternative
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer a number: ");
		int value = in.nextInt();
		System.out.printf("The number with commas is: %,d\n",value);
	}
}

