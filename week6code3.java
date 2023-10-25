package HW;

public class week6code3 {
	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 900, 9423, 4523459};
		System.out.println(bSearch(0, nums.length-1, 9423, nums));
	}
	public static int bSearch(int left, int right, int target, int[] nums)
	{
		if(right>=left)
		{
			int mid = left + (right-left)/2;
			if(nums[mid] == target)
			{
				return mid;
			}
			if(nums[mid] > target && left != right)
			{
				return bSearch(left, mid-1, target, nums);
			}else if(nums[mid] < target && left != right)
			{
				return bSearch(mid+1, right, target, nums);
			}
		}
		return -1;
	}
}
