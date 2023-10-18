package HW;

public class week5code2 {
	public static void main(String[] args)
	{
		countDown(5);
	}
	public static void countDown(int i)
	{
		System.out.println(i);
		if(i > 1)
		{
			countDown(i-1);
		}
	}
}
