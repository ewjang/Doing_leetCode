package valid_palindrome;

class Result {
	

	public static void main(String[] args) {
		System.out.println("2021-07-13 �ڵ� �׽�Ʈ ���� ");
		
		String param1= "race a car"; // ȸ�� x
		String param2= "A man, a plan, a canal: Panama"; // ȸ�� o
	
		Soulution sol = new Soulution();
		Boolean result = sol.isPalindrome(param2);
		
		System.out.println("Return result : " + result);
	}
}
