package HW;

public class week5code4 {
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5, 7, 8, 10, 21, 51, 79};
		int index = bSearch(a, 21, 0, 11);
		System.out.println(index);
	}
	//recursive
	public static int bSearch(int[] arr, int target, int left, int right)
	{
		int mid = left + ((right-left)/2);
		if(arr[mid] == target)
		{
			return mid;
		}
		else if(arr[mid] > target && right != left)
		{
			return bSearch(arr, target, left, mid-1);
		}else if(arr[mid] < target && right != left)
		{
			return bSearch(arr, target, mid+1, right);
		}
		return -1;
	}
}
