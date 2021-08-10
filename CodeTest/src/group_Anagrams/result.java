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
		// merge sort, tim sort에 대해 공부하기
		// 1)논리적 정리 2)구현

		reslist.addAll(map.values());
		System.out.println(reslist);
		return reslist;

	}

}

public class result {

	// 1. 문제파악
	// - 문자 배열이 주어진다. 단오 또는 구다.
	// - ANAGRAMS으로 그룹화한다.
	// - 리턴할 떄 순서는 상관없다.
	// - 일단 단어를 한정지어 진행.
	// 2. 요구 사항 정리
	// - 주어진 문자 배열 str4에서
	// - 같은 아나그램끼리 그룹화 한다.
	// - 그리고 List<List<String>> 자료구조 형상으로 리턴

	// 시간 복잡도를 줄여야되는게 아닐까?
	// 3. 논리전개
	// 1) input 데이터를 for문으로 split한다.
	// 2)

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		sol.groupAnagrams(strs);
	}

}
