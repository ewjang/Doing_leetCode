package valid_palindrome;

class Result {
	

	public static void main(String[] args) {
		System.out.println("2021-07-13 코딩 테스트 시작 ");
		
		String param1= "race a car"; // 회문 x
		String param2= "A man, a plan, a canal: Panama"; // 회문 o
	
		Soulution sol = new Soulution();
		Boolean result = sol.isPalindrome(param2);
		
		System.out.println("Return result : " + result);
	}
}
