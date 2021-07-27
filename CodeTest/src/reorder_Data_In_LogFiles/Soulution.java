package reorder_Data_In_LogFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Soulution {
	//문자로그 정렬 메서드
	public List<String> strSort(List<String> strArrays) {
		
		List<String> sort = new ArrayList<>();
		List<String> resultList = new ArrayList<>();
		HashMap<String , String> map =new HashMap<>();
		
		for (String strArray : strArrays) {

			String a = "";

			String[] tmp = strArray.split(" ");
			
			for (int i = 1; i < tmp.length; i++) {
				a += tmp[i];
			}
			a += tmp[0];
			
			map.put(a,strArray);
			
			sort.add(a);
		}
		Collections.sort(sort);
		
		for(int i = 0 ; i < sort.size(); i++) {
			resultList.add(map.get(sort.get(i)));
		}
		//문자로그 순서 정렬해서 최종리턴..
		return resultList;
	}

	public String[] reorderLogFiles(String[] logs) {
		//1. 리스트 선언
		// 문자로그 저장
		List<String> strArrays = new ArrayList<>();
		// 숫자로그 저장 
		List<String> digitArrays = new ArrayList<>();
		// 합치기
		List<String> plusArrays =  new ArrayList<>();
		
		//2. 문자로그 숫자로그 구분
		for (String log : logs) {
			String[] tmp = log.split(" ");
			
			if (!Character.isDigit(tmp[1].charAt(0))) {
				strArrays.add(log);
			} else {
				digitArrays.add(log);
			}
		}
		//3. 문자로그 소팅
		strArrays = strSort(strArrays);
		//4. 리스트 병합
		plusArrays.addAll(strArrays);
		plusArrays.addAll(digitArrays);
		
		//4. List to Array
		logs = new String[plusArrays.size()];
		int size = 0;
		for(String plusArray : plusArrays) {
			logs[size++] = plusArray;
		}
		//plusArrays.toArray(); //List to Array
	
		return logs;
	}
}
