import java.util.Scanner;
public class Lab2_1
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		String remover = "\\s*,\\s*";
		System.out.print("Please enter a number between 1,000 and 999,999 ");
      	String str = in.nextLine();
		String[] first = str.split(remover);
		//String second = str.substring(5);
		//System.out.println(test);
		for(String second : first)
		{
		System.out.print(second);
		}
		System.out.println("");
	}
}s