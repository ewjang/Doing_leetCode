package valid_palindrome;

public class Soulution {
	// 1. 문제를 파악
	// -파라미터로 들어오는 s의 길이
	// -회문인지 아닌지 판단한다.
	// 1) 띄어쓰기랑 특수문자를 제외한다
	// 2) 전부다 소문자로 변경
	// 3) 뒤집는다
	// 4) 기존 문자열과 뒤짚은 문자열을 비교
	// 5) 결과값을 리턴한다 (같으면 true 틀리면 false)
	// 2. 문제를 해결할 논리를 만든다.
	// 3. 코드 
	// 4. 테스트
	public boolean isPalindrome(String s) {
		
		// 전처리
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
		s=s.replaceAll(" ", ""); //중간공백 제거
		s=s.replaceAll(match, ""); //특수문자 제거
		//s.trim(); //앞뒤공백 제거
		s=s.toLowerCase(); //소문자로 변경
		System.out.println("sssss : " + s);
		
		StringBuffer sb= new StringBuffer(s);
			
		// 뒤집는다
		String rvsString = sb.reverse().toString();
		
		Boolean returnStatement = false;
		
		// 문자열 비교 
		if(s.equals(rvsString)) {
			//회문 ok
			returnStatement = true;
		} else if (!s.equals(rvsString)) {
			//회문 No
			returnStatement = false;
		}
		// 최종 리턴
		return returnStatement;
	}
}
