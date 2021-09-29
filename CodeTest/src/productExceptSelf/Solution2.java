package productExceptSelf;

public class Solution2 {
	public static int[] productExceptSelf(int[] nums) {

		int[] answer = new int[nums.length];

		// 1. right product array
		int rightProduct = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			answer[i] = rightProduct;
			rightProduct *= nums[i];
			System.out.println("AA : "+answer[i]);
		}

		// 2. left * right
		int leftProduct = 1;
		for (int i = 0; i < nums.length; i++) {
			answer[i] = leftProduct * answer[i];
			leftProduct *= nums[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		productExceptSelf(nums);
	}
}
