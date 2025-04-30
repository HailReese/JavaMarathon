package day18.task1;

public class Main {
	public static void main(String[] args) {
		int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
		System.out.println(recursionSum(numbers, 0));
	}

	public static int recursionSum(int[] nums, int i) {
		if (i >= nums.length)
			return 0;
		return nums[i] + recursionSum(nums, i + 1);
	}
}
