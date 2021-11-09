package oddEvenLinkedList;

public class solution {
	public static ListNode oddEvenList(ListNode head) {
		if (head == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (odd.next != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
	}

	public static void main(String[] args) {

		ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		oddEvenList(listNode);
	}

}
