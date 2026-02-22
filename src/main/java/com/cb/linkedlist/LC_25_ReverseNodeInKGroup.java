package com.cb.linkedlist;

import java.util.Stack;

public class LC_25_ReverseNodeInKGroup {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			Stack<ListNode> st = new Stack<>();
			ListNode dummy = new ListNode();
			ListNode temp = dummy;
			ListNode previous = head;
			while (head != null) {
				// stack me k element add karna
				int c = 0;
				while (head != null && c < k) {
					st.push(head);
					head = head.next;
					c++;
				}

				// reverse attach karna
				if (c == k) {
					while (!st.isEmpty()) {
						dummy.next = st.pop();
						dummy = dummy.next;
					}
					dummy.next = null;
				} else {
					dummy.next = previous;
				}
				previous = head;

			}
			return temp.next;
		}
	}
}
