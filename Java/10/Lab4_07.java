import java.util.Scanner;
public class Lab4_07
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter two words (separating with a space between): ");
		String word1 = in.next();
		String word2 = in.next();
		if(word1.length() == word2.length())
		{
		System.out.println("\"" + (word1)+"\""+" and "+"\""+(word2)+"\""+" are the SAME lenght.");
		}
		else
		{
		System.out.println("\""+(word1)+"\""+" and "+"\""+(word2)+"\""+" are NOT the same lenght.");
		}
	}
}