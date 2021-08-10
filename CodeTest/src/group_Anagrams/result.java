package group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

	public List<List<String>> groupAnagrams(String[] strs) {
		char[] tArr = null;
		String mapKey = null;
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();

		List<List<String>> reslist = new ArrayList<List<String>>();

		for (String str : strs) {

			for (int i = 0; i < str.length(); i++) {

				tArr = str.toCharArray();

				Arrays.sort(tArr);

				mapKey = new String(tArr);

			}
			List<String> collectVal = map.getOrDefault(mapKey, new ArrayList<String>());

			collectVal.add(str);
			map.put(mapKey, collectVal);
		}
		// merge sort, tim sort�� ���� �����ϱ�
		// 1)���� ���� 2)����

		reslist.addAll(map.values());
		System.out.println(reslist);
		return reslist;

	}

}

public class result {

	// 1. �����ľ�
	// - ���� �迭�� �־�����. �ܿ� �Ǵ� ����.
	// - ANAGRAMS���� �׷�ȭ�Ѵ�.
	// - ������ �� ������ �������.
	// - �ϴ� �ܾ �������� ����.
	// 2. �䱸 ���� ����
	// - �־��� ���� �迭 str4����
	// - ���� �Ƴ��׷����� �׷�ȭ �Ѵ�.
	// - �׸��� List<List<String>> �ڷᱸ�� �������� ����

	// �ð� ���⵵�� �ٿ��ߵǴ°� �ƴұ�?
	// 3. ������
	// 1) input �����͸� for������ split�Ѵ�.
	// 2)

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		sol.groupAnagrams(strs);
	}

}
