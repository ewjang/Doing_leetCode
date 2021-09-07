package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);

		int vlength = nums.length;
		List<List<Integer>> result = new ArrayList<>();
		// example2
		if (nums.length == 0) {
			return result;
		}

		for (int i = 0; i < vlength - 2; i++) {
			for (int j = i + 1; j < vlength - 1; j++) {
				for (int z = j + 1; z < vlength; z++) {
					// 3개의 숫자를 더해 0이 나오는 것을 임시List에 저장
					if (nums[i] + nums[j] + nums[z] == 0) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[z]);
						Collections.sort(temp);

						boolean isAlready = false;
						// 먼저 결과 리스트에 들어간 값이 있다면 중복값을 체크
						if (!result.isEmpty()) {
							for (List<Integer> res : result) {
								// 중복 값을 체크
								if (res.get(0) == temp.get(0) && res.get(1) == temp.get(1)
										&& res.get(2) == temp.get(2)) {
									isAlready = true;
									break;
								}
							}
						}

						// 중복이 없다면 결과 리스트에 저장
						if (!isAlready) {
							result.add(temp);
						}

					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(sol.threeSum(nums));

	}

}
