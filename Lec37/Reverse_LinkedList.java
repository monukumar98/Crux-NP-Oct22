package Lec37;

public class Reverse_LinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	class Solution {
		public ListNode reverseList(ListNode head) {

			ListNode prev = null;
			ListNode curr = head;
			while (curr != null) {
				ListNode ahead = curr.next;
				curr.next = prev;
				prev = curr;
				curr = ahead;
			}
			return prev;

		}
	}

}
