package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		int[] nums = new int[100];
		int maxSumOfThreeNums = 0;
		int indexOfTheFirstNumInMax = 0;
		Random random = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(10000);
		}
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0) {
				maxSumOfThreeNums = nums[i] + nums[i + 1] + nums[i + 2];
			} else {
				if (nums[i] + nums[i + 1] + nums[i + 2] > maxSumOfThreeNums) {
					maxSumOfThreeNums = nums[i] + nums[i + 1] + nums[i + 2];
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(maxSumOfThreeNums + ", " + indexOfTheFirstNumInMax);
	}
}
