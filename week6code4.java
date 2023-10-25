package HW;

public class week6code4 {
	public static void main(String[] args)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Recursive Fibonacci(" + i + ") = " + recFib((long)i));
			System.out.println("Recursive Fibonacci(" + i + ") = " + itFib((long)i));
			System.out.println("Tail Recursive Fibonacci(" + i + ") = " + tailRecFib((long)i, 0, 1));
			System.out.println("");
		}
		System.exit(0);
	}
	public static long recFib(long n)
	{
		if(n <= 1)
		{
			return n;
		}
		long oneBef = recFib(n-1);
		long twoBef = recFib(n-2);
		return  oneBef+twoBef;
	}
	public static long itFib(long n)
	{
		if(n <= 1)
		{
			return n;
		}
		long fibA = 0;
		long fibB =1;
		long fib=0;
		//Two is the first number which doesn't just return the number, so starting there
		for(int i=2;i<=n;i++)
		{
			fib = fibA + fibB;
			fibA = fibB;
			fibB = fib;
		}
		return fib;
	}
	public static long tailRecFib(long n, long a, long b)
	{
		if(n <= 0)
		{
			return n;
		}else if(n == 1)
		{
			return b;
		}
		return tailRecFib(n-1, b, a+b);
	}
}
