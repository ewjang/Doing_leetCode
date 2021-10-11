package mergeTwoSortedLists;

public class Solution {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		// 1. l1, l2 비교해서 l1에 들어가는 값이 작은 값이 들어가도록 스왑 해준다.
		outputPrint(l1);
		outputPrint(l2);
		System.out.println();
		if ((l1 == null) || (l2 != null && l1.val > l2.val)) {
			ListNode tmp = l1;
			l1 = l2;
			l2 = tmp;
		}

		if (l1 != null) {
			l1.next = mergeTwoLists(l1.next, l2);
		}

		return l1;

		/*
		 * List<Integer> mergeList = new ArrayList<Integer>();
		 * 
		 * while (l1.next != null) { mergeList.add(l1.val); l1 = l1.next; }
		 * mergeList.add(l1.val);
		 * 
		 * while (l2.next != null) { mergeList.add(l2.val); l2 = l2.next; }
		 * mergeList.add(l2.val);
		 * 
		 * Collections.sort(mergeList); System.out.println(mergeList); mergeList.size();
		 * ListNode l3 = new ListNode(); int idxzero = mergeList.get(0); int lastInt =0;
		 * for (int i = 1; i < mergeList.size(); i++) {
		 * 
		 * if (l3.next == null) { l3 = new ListNode(idxzero, new
		 * ListNode(mergeList.get(i))); lastInt=mergeList.get(i); }else { l3 = new
		 * ListNode(lastInt, new ListNode(mergeList.get(i))); lastInt=mergeList.get(i);
		 * } System.out.println("i : " +i +"  l3 : " + l3.val + " next: " + l3.next +
		 * " ZZ : " + l3); }
		 * 
		 * return l3;
		 */

	}

	public static void outputPrint(ListNode answer) {
		while (answer.next != null) {
			System.out.print(answer.val + ", ");
			answer = answer.next;
		}
		System.out.println(answer.val);
	}

	public static void outputPrint(ListNode answer, String name) {
		System.out.print(name + " : ");
		while (answer.next != null) {
			System.out.print(answer.val + ", ");
			answer = answer.next;
		}
		System.out.println(answer.val);
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		mergeTwoLists(l1, l2);
	}

}
