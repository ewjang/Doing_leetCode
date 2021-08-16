package TwoSum;

import java.util.Arrays;

public class solution {
	// 50ms
	public static int[] twoSum(int[] nums, int target) {
		int[] resultArr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					resultArr[0] = i;
					resultArr[1] = j;
				}
			}
		}
		return resultArr;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		int target = 5;
		twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
