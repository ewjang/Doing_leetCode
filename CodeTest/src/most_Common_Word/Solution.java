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

		// 1. ��ó��
		paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");

		// 2. ������ ������ �������� �ܾ� �и�
		String[] words = paragraph.split("\\s+");

		//List<String> bannedWords = new ArrayList<String>();
		Set<String> bannedWords =new HashSet<String>();		
		/*
		 * �� List�� ���������� ������ ���� �����ؾ� �ϱ� ������ ���������� ���� ������ �� �� �ֵ��� �����ؾ� �Ѵ�. ArrayList��
		 * List �������̽��� ������ Ŭ�����̹Ƿ�, ���� ������ �����ؾ� �ϸ�, �̸� ���� ���������� �迭(Array)�� ����Ͽ� �����Ǿ� �ִ�.
		 * �׷��� ������ ��������� ���߿� ����� 9,000,000�� �迭 ������� ã�� ���� �ð��� ���� �ɸ� ���̴�.
		 * 
		 * �ݸ鿡 HashSet �� ������ ������ �ʿ䰡 ����. �׷��Ƿ� Set�� ����� ���𰡸� ã�� ����, ������ ������� �׳� ã���� �Ǵ�
		 * ���̹Ƿ�, ã�� ����� List�� ���� �����ο� �� �ִ�. �̶� ã�� �ӵ��� �ش�ȭ�ϱ� ���� Set �� ������ �� Hash�� ����� ����
		 * HashSet�̴�. Hash�� ���� �ð��� �ٷ������ ������
		 * "Hash�� �˻��ϸ� �˻� �ð��� ������ ũ�⿡ ������� �����ϰ� �ſ� ª��"�� �����ϸ� �ȴ�.
		 * 
		 * (����)
		 * Map : key(�ߺ����x),value(�ߺ����o) , ��������x (��, LinkedHashMap�� ��������o).
		 * Set : �ߺ��� x, ��������x
		 * list : �ߺ��� o, ��������o
		 * 
		 */
		// 3. ������ �ܾ Set�� ����
		for (String word : banned) {
			bannedWords.add(word);
		}
	
		Map<String, Integer> wordCount = new HashMap();
		// 4. ������ �ܾ ������ �ܾ ī��Ʈ �Ѵ� 
		for (String word : words) {
			if (!bannedWords.contains(word))
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		//entrySet�� key-value�� �̷���� �����͸� set��ü�� ��� ���� 
		System.out.println("entrySet : " + wordCount.entrySet());
		//keySet�� key �����͸� set��ü�� ��� ����
		System.out.println("keySet : " + wordCount.keySet());
		System.out.println("max : " +  Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()));
		// 5. �ִ밪�� ã�Ƽ� ��ȯ�Ѵ�.
		// HashMap�� ��� key:value �����͸� ������� , value���� ���Ͽ� max �� key:value ���� ã�´�. �׸��� �� key���� getKey�Ѵ�.
		return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
	}
}
