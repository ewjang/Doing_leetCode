package group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class soul {

	public static void main(String[] args) {
        // 1. input
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // 2. groupAnagrams
        List<List<String>> answer = groupAnagrams(strs);

        // 3. answer ���
        for (List<String> ans : answer) {
            System.out.println("answer : " + ans.toString());
        }
//        Output:[["bat"],["nat","tan"],["ate","eat","tea"]]
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        //1. str : {"eat", "tea", "tan", "ate", "nat", "bat"}

        //2. anagramGroups�� ������ ������ �̸� �����д�.
        Map<String, List<String>> anagramGroups = new HashMap<>();
        // 1) ����ϴ� �ƿ� �������� �ڷᱸ���� �����.
        // 2) Output:[  ["bat"],["nat","tan"],["ate","eat","tea"]   ]
        // 3) str�� ���� ��迭�� ���ؼ�, ������ ���Ҹ����� word�� ��ƾ��Ѵ�.
        //    (1) str ������ ��迭 (String) - key
        //    (2) ������ ���Ҹ� ���� word�� ����. (array, list -> List) value
        // 4) key, value => String, List<String>
        // 5) Map<String, List<String>>
        //  => Map<'str ���� ��迭 ��', '��迭���� ������ ���Ҹ������� word'>

        for (String str : strs) {
        	/*
            //1.�ܾ �и��ϰ� ���ĺ� �� ���� �� �����ؼ� key�� ����
            //1) �ܾ ���ĺ����� ���ø�
            String[] strArr = str.split("");

            //2) ���ø��� �ܾ �������� ����
            Arrays.sort(strArr);

            //3) ������ ���ĺ��� �ϳ��� ���� �ܾ�� �����
            String key2 = Arrays.toString(strArr);
			*/
        	
            // 1) + 2) + 3)
            String key = Arrays.stream(str.split("")).sorted().collect(Collectors.joining());
            System.out.println(" key  : " + key);
            //2. map���� ���ĺ� ������ ���ĵ� Ű �˻�, ������ ����Ʈ ����
            // input : eat -> aet
            // key : aet
            // value : eat
            
            /*
            // case 1
            if (anagramGroups.get(key) == null) {
                // 1) ������ ���� ����.
                List<String> group3 = new ArrayList<String>();
                group3.add(str);
                anagramGroups.put(key, group3);
            } else {
                // 2) ������ ���� �ִ�.
                List<String> groups2 = anagramGroups.get(key);
                groups2.add(str);
                anagramGroups.put(key, groups2);
            }
            // ���� �ְ� ���� ���� �޶���.
            List<String> group3 = new ArrayList<String>();
            List<String> groups2 = anagramGroups.get(key);
            */
            
            // case 2
            List<String> groups = anagramGroups.getOrDefault(key, new ArrayList<String>());
            System.out.println("groups : " + groups);
            groups.add(str);
            anagramGroups.put(key, groups);
            System.out.println(anagramGroups);
        }
		return new ArrayList<>(anagramGroups.values());
    }
}
