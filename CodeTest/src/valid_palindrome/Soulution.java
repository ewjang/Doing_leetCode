package valid_palindrome;

public class Soulution {
	// 1. ������ �ľ�
	// -�Ķ���ͷ� ������ s�� ����
	// -ȸ������ �ƴ��� �Ǵ��Ѵ�.
	// 1) ����� Ư�����ڸ� �����Ѵ�
	// 2) ���δ� �ҹ��ڷ� ����
	// 3) �����´�
	// 4) ���� ���ڿ��� ��¤�� ���ڿ��� ��
	// 5) ������� �����Ѵ� (������ true Ʋ���� false)
	// 2. ������ �ذ��� ���� �����.
	// 3. �ڵ� 
	// 4. �׽�Ʈ
	public boolean isPalindrome(String s) {
		
		// ��ó��
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
		s=s.replaceAll(" ", ""); //�߰����� ����
		s=s.replaceAll(match, ""); //Ư������ ����
		//s.trim(); //�յڰ��� ����
		s=s.toLowerCase(); //�ҹ��ڷ� ����
		System.out.println("sssss : " + s);
		
		StringBuffer sb= new StringBuffer(s);
			
		// �����´�
		String rvsString = sb.reverse().toString();
		
		Boolean returnStatement = false;
		
		// ���ڿ� �� 
		if(s.equals(rvsString)) {
			//ȸ�� ok
			returnStatement = true;
		} else if (!s.equals(rvsString)) {
			//ȸ�� No
			returnStatement = false;
		}
		// ���� ����
		return returnStatement;
	}
}
