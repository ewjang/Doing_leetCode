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
			Collections.sort(sort);
			
			
		}
		for(int i = 0 ; i < sort.size(); i++) {
			resultList.add(map.get(sort.get(i)));
		}
		//문자로그 순서 정렬해서 최종리턴..
		return resultList;
	}

	public String[] reorderLogFiles(String[] logs) {

		// 문자로그 저장
		List<String> strArrays = new ArrayList<>();
		// 숫자로그 저장 
		List<String> digitArrays = new ArrayList<>();
		// 합치기
		List<String> plusArrays =  new ArrayList<>();
		
		
		for (String log : logs) {
			String[] tmp = log.split(" ");

			// 문자로그 숫자로그 구분
			if (!Character.isDigit(tmp[1].charAt(0))) {
				strArrays.add(log);
				
			} else {
				digitArrays.add(log);
			}
		}

		strArrays = strSort(strArrays);

		plusArrays.addAll(strArrays);
		plusArrays.addAll(digitArrays);
		
		logs = new String[plusArrays.size()];
		int size = 0;
		for(String plusArray : plusArrays) {
			logs[size++] = plusArray;
		}
	
		return logs;
	}
}
