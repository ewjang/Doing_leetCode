package reverseLinkedList;

public class Solution {

	public static ListNode reverseList(ListNode head) {
		/*
		 * if (head == null || head.next == null) return head;
		 * 
		 * ListNode result = reverseList(head.next);
		 * 
		 * head.next.next = head; head.next = null;
		 * 
		 * return result;
		 */

		ListNode parent = null;

		while (head != null) {
			ListNode current = head;

			head = head.next;
			current.next = parent;
			parent = current;
		}

		return parent;

	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

		reverseList(l1);
	}

}
