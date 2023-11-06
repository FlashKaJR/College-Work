import java.util.Scanner;
public class Wk3_1_alternative
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print ("Please enter any integer value,using comma notation eg. 123,456,789: ");

		int number = in.nextInt();

		System.out.println("The number without commas is: "+number);
	}
}
