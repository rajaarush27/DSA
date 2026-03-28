package com.cb.leetcode.heap;

import java.util.PriorityQueue;

public class LeetCode23 {
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
		public ListNode mergeKLists(ListNode[] lists) {
			PriorityQueue<ListNode> pq = new PriorityQueue<>();
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					pq.add(lists[i]);
				}
			}
			ListNode dummy = new ListNode();
			ListNode temp = dummy;

			while (!pq.isEmpty()) {
				ListNode rn = pq.poll();
				dummy.next = rn;
				dummy = dummy.next;
				if (rn.next != null) {
					pq.add(rn.next);
				}
			}
			return temp.next;
		}
	}
}