package addTwoNumbers;

public class Solution {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode parent = new ListNode(0);
		ListNode root = parent;
		int carryNum = 0;
		while (l1 != null || l2 != null || carryNum > 0) {

			if (l1 == null) {
				l1 = new ListNode(0);
			}

			if (l2 == null) {
				l2 = new ListNode(0);
			}

			int sumVar = carryNum + l1.val + l2.val;

			l1 = l1.next;
			l2 = l2.next;

			// carryNum +1
			if (sumVar > 9) {
				sumVar = sumVar - 10;
				carryNum = 1;

			} else {
				carryNum = 0;
			}

			System.out.println("sum : " + sumVar);
			System.out.println("carrNum : " + carryNum);

			parent.next = new ListNode(sumVar);

			parent = parent.next;

			if (parent.next != null) {
				System.out.println("  parent.next : " + parent.next);
			}

		}

		return root.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(5)));

		addTwoNumbers(l1, l2);
	}
}
