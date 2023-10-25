package HW;

import java.util.Scanner;

public class week6code1 {
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		int[] nums = {1, 52,175, 51, 4, 2348, 456, 834, 54446, 6,8, 67 , 43,24, 9};
		for(int i=0;i<nums.length;i++)
		{
			l.addLast(nums[i]);
		}
		System.out.println(l.toString());
		System.out.println("Does the list contain 51? " + l.contains(51));
		System.out.println("Does the list contain 22? " + l.contains(22));
		System.out.println("Does the list contain 834? " + l.contains(834));
		System.exit(0);
	}
}
