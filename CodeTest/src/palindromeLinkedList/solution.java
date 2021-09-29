package palindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class solution {
	public static boolean isPalindrome(ListNode head) {
		/*
		char temp = s[i];
		s[i] = s[s.length - 1 - i];
		s[s.length - 1 - i] = temp;
		*/
		
		System.out.println(head.val + ", " + head.next);
		List<Integer> temp = new ArrayList<>();
		
		while(head.next != null) {
			temp.add(head.val);
			head=head.next;
		}
		temp.add(head.val);
		System.out.println("!!!! : " +temp);
		
		for(int i = 0 ; i < temp.size()/2 ;i++) {
			int leftPoint = i;
			int rightPoint = temp.size() - i;
			
			if(!(temp.get(leftPoint) == temp.get(rightPoint))) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {

		ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

		boolean result = isPalindrome(listNode);
	}

}
