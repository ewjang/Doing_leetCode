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
		}
		Collections.sort(sort);
		
		for(int i = 0 ; i < sort.size(); i++) {
			resultList.add(map.get(sort.get(i)));
		}
		//���ڷα� ���� �����ؼ� ��������..
		return resultList;
	}

	public String[] reorderLogFiles(String[] logs) {
		//1. ����Ʈ ����
		// ���ڷα� ����
		List<String> strArrays = new ArrayList<>();
		// ���ڷα� ���� 
		List<String> digitArrays = new ArrayList<>();
		// ��ġ��
		List<String> plusArrays =  new ArrayList<>();
		
		//2. ���ڷα� ���ڷα� ����
		for (String log : logs) {
			String[] tmp = log.split(" ");
			
			if (!Character.isDigit(tmp[1].charAt(0))) {
				strArrays.add(log);
			} else {
				digitArrays.add(log);
			}
		}
		//3. ���ڷα� ����
		strArrays = strSort(strArrays);
		//4. ����Ʈ ����
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
