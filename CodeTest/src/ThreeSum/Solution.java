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
					// 3���� ���ڸ� ���� 0�� ������ ���� �ӽ�List�� ����
					if (nums[i] + nums[j] + nums[z] == 0) {
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[z]);
						Collections.sort(temp);

						boolean isAlready = false;
						// ���� ��� ����Ʈ�� �� ���� �ִٸ� �ߺ����� üũ
						if (!result.isEmpty()) {
							for (List<Integer> res : result) {
								// �ߺ� ���� üũ
								if (res.get(0) == temp.get(0) && res.get(1) == temp.get(1)
										&& res.get(2) == temp.get(2)) {
									isAlready = true;
									break;
								}
							}
						}

						// �ߺ��� ���ٸ� ��� ����Ʈ�� ����
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
