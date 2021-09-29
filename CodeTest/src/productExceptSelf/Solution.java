package productExceptSelf;

import java.util.Arrays;

public class Solution {
	public static int[] productExceptSelf(int[] nums) {

		// 1. 결과를 담을 int[] 생성
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			// 2. 해당 인덱스를 무조건 0번째(맨처음) 인덱스에 배치시킨다.
			ShiftToRight(nums, i);

			// 3. nums[0]을 제외한 나머진 곱해야 하니까..
			int temp = 1;
			for (int j = 1; j < nums.length; j++) {
				temp = temp * nums[j];
			}
			result[i] = temp;
		}
		System.out.println("result : " + Arrays.toString(result));
		return result;
	}

	public static void ShiftToRight(int a[], int n) {
		int temp = a[n];

		for (int i = n; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 1, 0, -3, 3 };
		productExceptSelf(nums);

	}

}
