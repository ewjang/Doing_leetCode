package productExceptSelf;

public class Solution1 {
	public static int[] productExceptSelf(int[] nums) {

        //1 left product array
        int leftProduct = 1;
        int[] leftProductArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftProduct *= nums[i];
            leftProductArr[i] = leftProduct;
            //System.out.println("index : " + i + ", value : " + nums[i] + ", leftProduct : " + leftProduct);
        }

        //2 right product array
        int rightProduct = 1;
        int[] rightProductArr = new int[nums.length];
        for (int i = nums.length - 1; 0 <= i; i--) {
            rightProduct *= nums[i];
            rightProductArr[i] = rightProduct;
            //System.out.println("index : " + i + ", value : " + nums[i] + ", rightProduct : " + rightProduct);
        }

        //3. left * right
        int[] answer = new int[nums.length];
        // 1) 처음 - right 인덱스의 1 // 끝  - left 인덱스의 마지막 - 1
        answer[0] = rightProductArr[1];
        answer[nums.length - 1] = leftProductArr[nums.length - 1 - 1];
        for (int i = 1; i < nums.length - 1; i++) {
            // 2) 중간 - 인덱스 i를 기준으로 left[i-1] * right[i+1]
            answer[i] = leftProductArr[i - 1] * rightProductArr[i + 1];
        }
        return answer;
    }

	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4 };
		productExceptSelf(nums);
	}
}
