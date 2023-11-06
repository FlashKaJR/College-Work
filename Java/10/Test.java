	import java.util.Scanner;
public class Test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word1 = in.next();
		char word = word1.charAt(0);
		int number1 = (int) word;

		System.out.println((number1)+" are NOT the same lenght.");

	}
}