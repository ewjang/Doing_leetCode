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
			// Point : Ȧ���� ¦���� �����Ͽ� ���ٴ� ��.
			int len1 = expand(s, i, i); // Ȧ�� - a,b,c,d,e
			int len2 = expand(s, i, i + 1); // ¦�� - a,b,c,d
			int len = Math.max(len1, len2);
			if (len > endIdx - startIdx) {
				startIdx = i - (len - 1) / 2; // ��� �ڱ� len�� ���� �ؾߵǼ� -1
				endIdx = i + (len / 2);
			}
		}
		return s.substring(startIdx, endIdx + 1); // endIdx�� +1���ִ� ������?
	}

	// Point : �̷��� �����ϰ� ��- ������ �����ϴ� ��.
	public static int expand(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

}
