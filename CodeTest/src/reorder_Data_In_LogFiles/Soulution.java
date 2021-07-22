package reorder_Data_In_LogFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Soulution {
	//���ڷα� ���� �޼���
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
		//���ڷα� ���� �����ؼ� ��������..
		return resultList;
	}

	public String[] reorderLogFiles(String[] logs) {

		// ���ڷα� ����
		List<String> strArrays = new ArrayList<>();
		// ���ڷα� ���� 
		List<String> digitArrays = new ArrayList<>();
		// ��ġ��
		List<String> plusArrays =  new ArrayList<>();
		
		
		for (String log : logs) {
			String[] tmp = log.split(" ");

			// ���ڷα� ���ڷα� ����
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
