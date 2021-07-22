package reorder_Data_In_LogFiles;

import java.util.Arrays;

public class Result {

//	 1.���� �ľ�-�䱸���� �м�
//    1) ��Ȳ �ľ�
//    - string[] logs
//    - each log�� space delimited ����
//    - ù��° �ܾ�� �ĺ��� : �ĺ��ڴ� �α׺��� �ٸ�.
//    - �������� �α� - ���� �α� / ���� �α�
//        �� letter-logs : �ĺ��ڸ� �����ϰ� ��� ���� �ҹ���.
//        �� digit-logs : �ĺ��ڸ� �����ϰ� ��� ����.
//    
//    2) �䱸���� - Reorder ������(logs)
//    - 1�� ���� ��� ���� �α״� ���� �α� ������ �´�. 
//    - 2�� ���� - �� �α� �� ���� ����
//        �� ���� �α�
//            - (1) ������ ���ĺ� �� ����
//            - (2) log�� ������ ������ �ĺ��ڸ� ���Ͽ� ����
//        �� ���� �α�
//            - �����ľ��� ���� ������ �����Ѵ�.
//            
//    3) �������
//     - log ������ū�� �������� ���еȴ�.
//     - logs[i]�� �ĺ��ڰ� 1�� �ְ� �ּ� �ϳ��� �ܾ ����.
//    
//    2.���� �ذ� ���� - ���ξ��ϰ� �۷� ��� ä��â�� ����
	
//    #�䱸���� - Reorder ������(logs)
//    1. ���ڷα� ���ڷα� ����.
//     1) ���� log�� ���ڷα����� ���ڷα����� ������ �ʿ�.
//      �� ���ڷα׿� ���ڷα��� ���� : 2��° ������ ���� �ٸ���.
//      �� ù��° �����ϰ� 2��°�� �� : �������? ������ Ÿ��. cast int false
//          
//     2) ���� �α׿� ���� �α׸� �и��Ͽ� 2���� �迭�� �����.
//      �� logs�� �ݺ����� ���鼭 '1)' �ܰ踦 ��ġ��
//      �� '1)' �ܰ迡 �Ǵܿ� ���� ���ڷα� append, ���ڷα� append
//      �� append�� ������ ����.
//    
//    2. ���ڷα� ����
//      1) �� log���� ������ ���� ���ĺ� �� ����
//       �� �и��� ���ڷα� ���ο��� ���ĺ� ����
//            - ����/���� �α� ���а� ���� �ι�° ���Һ��� ���ĺ� �� ��
//            - �ι�° ���Ұ� �����ϸ�, ���� ���� �� : ��� ��.
//            - ��� ���Ұ� �����ϸ� '2)' �ܰ�ΰ���.
//      2) log�� ������ ������ �ĺ��ڸ� ���Ͽ� ����
//        �� ó�� �ĺ��� ������ ��.        
//        
//    3. ���ڷα� ���� (��������)
//      - ���� ���� ���� ���� �Ͱ���.
//                
//    4. ���ڷα� + ���ڷα� �迭�����
//      - �迭�� ��ģ��? new �迭.
//      - ���� �迭���� �����Ѵ�. logs ���� �۾��Ѵ�.
//    
//    5. string[] ������ ����.

	
	
	
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