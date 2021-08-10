package LongestPalindromicSubstring;

public class Solution {

	public static void main(String[] args) {
		String s = "babad";
		String longestPalindrome = longestPalindrome(s);
		System.out.println(longestPalindrome);

	}

	public static String longestPalindrome(String s) {
		int startIdx = 0; // longestPalindromeStartIdx
		int endIdx = 0; // longestPalindromeEndIdx
		for (int i = 0; i < s.length(); i++) {
			// Point : 홀수와 짝수를 구분하여 본다는 점.
			int len1 = expand(s, i, i); // 홀수 - a,b,c,d,e
			int len2 = expand(s, i, i + 1); // 짝수 - a,b,c,d
			int len = Math.max(len1, len2);
			if (len > endIdx - startIdx) {
				startIdx = i - (len - 1) / 2; // 가운데 자기 len을 제거 해야되서 -1
				endIdx = i + (len / 2);
			}
		}
		return s.substring(startIdx, endIdx + 1); // endIdx를 +1해주는 이유는?
	}

	// Point : 이렇게 심플하게 비교- 생각을 구현하는 것.
	public static int expand(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

}
