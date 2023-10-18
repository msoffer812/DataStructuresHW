package HW;

public class week5code1 {
	public static void main(String[] args)
	{
		System.out.println(sum(12345));
	}
	public static int sum(int num)
	{
		int total = 0;
		total += num % 10;
		if(num /10 >= 1)
		{
			total += sum(num/10);
		}
		 return total;
	}
}
