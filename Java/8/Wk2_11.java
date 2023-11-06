import java.util.Scanner;
public class Wk2_11
{
	public static void main(String [] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the disk letter: ");
		String disk = in.nextLine();
		System.out.print("Please enter the path: ");
		String path = in.nextLine();
		System.out.print("Please enter the file name: ");
		String file = in.nextLine();
		System.out.print("Please enter the extension: ");
		String extension = in.nextLine();
		System.out.println(disk + ":\\" + path + "\\" + file + "." +extension);
	}
}