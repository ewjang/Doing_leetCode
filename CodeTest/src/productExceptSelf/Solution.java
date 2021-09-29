package productExceptSelf;

import java.util.Arrays;

public class Solution {
	public static int[] productExceptSelf(int[] nums) {

		// 1. ����� ���� int[] ����
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {

			// 2. �ش� �ε����� ������ 0��°(��ó��) �ε����� ��ġ��Ų��.
			ShiftToRight(nums, i);

			// 3. nums[0]�� ������ ������ ���ؾ� �ϴϱ�..
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
