package HW;

public class week5code3 {
	public static void main(String[] args)
	{
		String word = "MeiraSoffer";
		System.out.println("Word: " + word);
		System.out.println("Reversed: " + reverseString(0, (word.length()-1), new StringBuilder(word)));
		System.exit(0);
	}
	public static String reverseString(int left, int right, StringBuilder str)
	{
		if(left < right)
		{
			char c = str.charAt(left);
			str.setCharAt(left, str.charAt(right));
			str.setCharAt(right, c);
			reverseString(left+1, right-1, str);
		}
		return str.toString();
	}
}
