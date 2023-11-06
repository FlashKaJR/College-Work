public class Lab6_1a
{
	public static void main(String[] args)
	{
		int total = 0;
		for (int value = 2; value <= 100; value += 2)
		{
			total += value;
		}
		System.out.println("Total = "+ total);
	}
}