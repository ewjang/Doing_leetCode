package reverse_string;

public class Soulution {
	public void reverseString(char[] s) {
		//1.문제 파악 - 요구사항 분석
		// - 문자열을 뒤집는 기능을 가진 함수 작성
		// - input char[] s
		// [제약]
		// -다른 array를 만들지 않는다.
		// -O(1) extra memory만 사용해서 > char tmp;
		
		//2. 문제 해결 논리
		// 1) 장은우
		//  (1)문자열의 길이를 파악한다. >> 반복문 활용
		//  (2)마지막 배열공간에 첫번째 배열공간에 있는 문자열을 담아야 한다.
		//  (3)문자 하나하나를 담을 임의의 공간(변수)을 활용
		int endPoint = s.length-1;
		int j=0;
		
		for(int i = 0 ; i < endPoint-j ; i++) {
			System.out.println(i + " : " + (endPoint-j));
			
			char tmp = s[endPoint-j];
			s[endPoint-j] = s[i];
		   s[i]= tmp;
		   System.out.println(s[i]);
			j++;
			/*if(i == endPoint-j) {
				break;
			}*/
		}
	
		System.out.println(s);
	}
}
