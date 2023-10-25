package HW;

public class week6code2 {
public static void main(String[] args)
{
	BTree<Integer> t = new BTree<>();
	int[] nums = {1, 52,175, 51, 4, 2348, 456, 834, 54446, 6,8, 67 , 43,24, 9};
	for(int i=0;i<nums.length;i++)
	{
		t.add(nums[i]);
	}
	System.out.println(t.toString());
}
}
