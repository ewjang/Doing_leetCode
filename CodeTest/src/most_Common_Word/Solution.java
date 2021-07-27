package most_Common_Word;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

	public String mostCommonWord(String paragraph, String[] banned) {
		System.out.println(Arrays.toString(banned));

		// 1. 전처리
		paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");

		// 2. 문장을 공백을 기준으로 단어 분리
		String[] words = paragraph.split("\\s+");

		//List<String> bannedWords = new ArrayList<String>();
		Set<String> bannedWords =new HashSet<String>();		
		/*
		 * ※ List는 본질적으로 순서도 같이 관리해야 하기 때문에 내부적으로 순서 정보를 알 수 있도록 구현해야 한다. ArrayList도
		 * List 인터페이스를 구현한 클래스이므로, 순서 정보를 관리해야 하며, 이를 위해 내부적으로 배열(Array)을 사용하여 구현되어 있다.
		 * 그렇기 때문에 상대적으로 나중에 저장된 9,000,000을 배열 순서대로 찾다 보니 시간이 오래 걸린 것이다.
		 * 
		 * 반면에 HashSet 은 순서를 보장할 필요가 없다. 그러므로 Set에 저장된 무언가를 찾을 때는, 순서와 상관없이 그냥 찾으면 되는
		 * 것이므로, 찾는 방법이 List에 비해 자유로울 수 있다. 이때 찾는 속도를 극대화하기 위해 Set 을 구현할 때 Hash를 사용한 것이
		 * HashSet이다. Hash는 다음 시간에 다루겠지만 지금은
		 * "Hash로 검색하면 검색 시간이 데이터 크기에 상관없이 일정하게 매우 짧다"고만 이해하면 된다.
		 * 
		 * (참고)
		 * Map : key(중복허용x),value(중복허용o) , 순서보장x (단, LinkedHashMap은 순서보장o).
		 * Set : 중복값 x, 순서보장x
		 * list : 중복값 o, 순서보장o
		 * 
		 */
		// 3. 금지된 단어를 Set에 저장
		for (String word : banned) {
			bannedWords.add(word);
		}
	
		Map<String, Integer> wordCount = new HashMap();
		// 4. 금지된 단어를 제외한 단어를 카운트 한다 
		for (String word : words) {
			if (!bannedWords.contains(word))
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		//entrySet은 key-value로 이루어진 데이터를 set객체에 담아 리턴 
		System.out.println("entrySet : " + wordCount.entrySet());
		//keySet은 key 데이터를 set객체에 담아 리턴
		System.out.println("keySet : " + wordCount.keySet());
		System.out.println("max : " +  Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()));
		// 5. 최대값을 찾아서 반환한다.
		// HashMap에 담긴 key:value 데이터를 대상으로 , value값을 비교하여 max 인 key:value 값을 찾는다. 그리고 그 key값을 getKey한다.
		return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
	}
}
