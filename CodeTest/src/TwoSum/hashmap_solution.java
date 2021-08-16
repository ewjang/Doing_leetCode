package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hashmap_solution {
	
	  // 3ms
    public static int[] twoSumByHashMap(int[] nums, int target) {
        int[] answer = new int[2];

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (numsMap.get(nums[i]) != null) {
                return answer;
            } else {
                numsMap.put(key, i);
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 3, 4, 5 };
		int target = 5;
		twoSumByHashMap(nums, target);
		System.out.println(Arrays.toString(twoSumByHashMap(nums, target)));
	}
	
}
