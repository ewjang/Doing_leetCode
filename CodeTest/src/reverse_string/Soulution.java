package reverse_string;

public class Soulution {
	public void reverseString(char[] s) {
		//1.���� �ľ� - �䱸���� �м�
		// - ���ڿ��� ������ ����� ���� �Լ� �ۼ�
		// - input char[] s
		// [����]
		// -�ٸ� array�� ������ �ʴ´�.
		// -O(1) extra memory�� ����ؼ� > char tmp;
		
		//2. ���� �ذ� ��
		// 1) ������
		//  (1)���ڿ��� ���̸� �ľ��Ѵ�. >> �ݺ��� Ȱ��
		//  (2)������ �迭������ ù��° �迭������ �ִ� ���ڿ��� ��ƾ� �Ѵ�.
		//  (3)���� �ϳ��ϳ��� ���� ������ ����(����)�� Ȱ��
		int endPoint = s.length-1;
		int j=0;
		
		for(int i = 0 ; i < endPoint-j ; i++) {
			System.out.println(i + " : " + (endPoint-j));
			
			char tmp = s[endPoint-j];
			s[endPoint-j] = s[i];
		   s[i]= tmp;
		   System.out.println(s[i]);
			j++;
			/*if(i == endPoint-j) {
				break;
			}*/
		}
	
		System.out.println(s);
	}
}
