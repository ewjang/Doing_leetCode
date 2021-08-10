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

        // 3. answer 출력
        for (List<String> ans : answer) {
            System.out.println("answer : " + ans.toString());
        }
//        Output:[["bat"],["nat","tan"],["ate","eat","tea"]]
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        //1. str : {"eat", "tea", "tan", "ate", "nat", "bat"}

        //2. anagramGroups를 저장할 공간을 미리 만들어둔다.
        Map<String, List<String>> anagramGroups = new HashMap<>();
        // 1) 기대하는 아웃 형상으로 자료구조를 만든다.
        // 2) Output:[  ["bat"],["nat","tan"],["ate","eat","tea"]   ]
        // 3) str의 원소 재배열을 통해서, 동일한 원소를가진 word를 모아야한다.
        //    (1) str 원소의 재배열 (String) - key
        //    (2) 동일한 원소를 가진 word를 모운다. (array, list -> List) value
        // 4) key, value => String, List<String>
        // 5) Map<String, List<String>>
        //  => Map<'str 원소 재배열 값', '재배열값과 동일한 원소를가지는 word'>

        for (String str : strs) {
        	/*
            //1.단어를 분리하고 알파벳 순 정렬 후 병합해서 key를 만듦
            //1) 단어를 알파벳으로 스플릿
            String[] strArr = str.split("");

            //2) 스플릿한 단어를 오름차순 정렬
            Arrays.sort(strArr);

            //3) 정렬한 알파벳을 하나로 합쳐 단어로 만든다
            String key2 = Arrays.toString(strArr);
			*/
        	
            // 1) + 2) + 3)
            String key = Arrays.stream(str.split("")).sorted().collect(Collectors.joining());
            System.out.println(" key  : " + key);
            //2. map에서 알파벳 순으로 정렬된 키 검색, 없으며 리스트 생성
            // input : eat -> aet
            // key : aet
            // value : eat
            
            /*
            // case 1
            if (anagramGroups.get(key) == null) {
                // 1) 기존에 값이 없다.
                List<String> group3 = new ArrayList<String>();
                group3.add(str);
                anagramGroups.put(key, group3);
            } else {
                // 2) 기존에 값이 있다.
                List<String> groups2 = anagramGroups.get(key);
                groups2.add(str);
                anagramGroups.put(key, groups2);
            }
            // 값이 있고 없고에 따라 달라짐.
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
