package reorder_Data_In_LogFiles;

import java.util.Arrays;

public class Result {

//	 1.문제 파악-요구사항 분석
//    1) 현황 파악
//    - string[] logs
//    - each log에 space delimited 존재
//    - 첫번째 단어는 식별자 : 식별자는 로그별로 다름.
//    - 두종류의 로그 - 문자 로그 / 숫자 로그
//        ㄴ letter-logs : 식별자를 제외하고 모두 영문 소문자.
//        ㄴ digit-logs : 식별자를 제외하고 모두 숫자.
//    
//    2) 요구사항 - Reorder 재정렬(logs)
//    - 1차 정렬 모든 문자 로그는 숫자 로그 앞으로 온다. 
//    - 2차 정렬 - 각 로그 별 정렬 조건
//        ㄴ 문자 로그
//            - (1) 내용의 알파벳 순 정렬
//            - (2) log의 내용이 같으면 식별자를 비교하여 정렬
//        ㄴ 숫자 로그
//            - 재정렬없이 들어온 순서를 유지한다.
//            
//    3) 제약사항
//     - log 내부토큰은 공백으로 구분된다.
//     - logs[i]는 식별자가 1개 있고 최소 하나의 단어를 보장.
//    
//    2.문제 해결 논리 - 말로안하고 글로 적어서 채팅창에 공유
	
//    #요구사항 - Reorder 재정렬(logs)
//    1. 문자로그 숫자로그 구분.
//     1) 원소 log가 문자로그인지 숫자로그인지 구분이 필요.
//      ㄴ 문자로그와 숫자로그의 차이 : 2번째 원소의 값이 다르다.
//      ㄴ 첫번째 생략하고 2번째꺼 비교 : 어떤식으로? 데이터 타입. cast int false
//          
//     2) 문자 로그와 숫자 로그를 분리하여 2개의 배열을 만든다.
//      ㄴ logs를 반복문을 돌면서 '1)' 단계를 거치고
//      ㄴ '1)' 단계에 판단에 따라 문자로그 append, 숫자로그 append
//      ㄴ append의 순차성 보장.
//    
//    2. 문자로그 정렬
//      1) 각 log간의 내용을 보고 알파벳 순 정렬
//       ㄴ 분리된 문자로그 내부에서 알파벳 정렬
//            - 문자/숫자 로그 구분과 같이 두번째 원소부터 알파벳 순 비교
//            - 두번째 원소가 동일하면, 다음 원소 비교 : 계속 비교.
//            - 모든 원소가 동일하면 '2)' 단계로간다.
//      2) log의 내용이 같으면 식별자를 비교하여 정렬
//        ㄴ 처음 식별자 순으로 비교.        
//        
//    3. 숫자로그 정렬 (순서유지)
//      - 딱히 뭐할 일이 없을 것같다.
//                
//    4. 문자로그 + 숫자로그 배열만들기
//      - 배열을 합친다? new 배열.
//      - 기존 배열에서 조작한다. logs 모든걸 작업한다.
//    
//    5. string[] 최종값 리턴.

	
	
	
	public static void main(String[] args) {
		
		String[] tmp1 = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		String[] tmp2 = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
		
		Soulution sol =new Soulution();
		sol.reorderLogFiles(tmp1);
		sol.reorderLogFiles(tmp2);
		System.out.println(Arrays.toString(sol.reorderLogFiles(tmp1)));
		System.out.println(Arrays.toString(sol.reorderLogFiles(tmp2)));
	}

}
