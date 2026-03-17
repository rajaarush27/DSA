package com.cb.leetcode.tree;

public class LeetCode105 {

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
		}

		public TreeNode build(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {
			if (phi < plo || ilo > ihi) {
				return null;
			}
			TreeNode node = new TreeNode(pre[plo]);
			int idx = search(in, ilo, ihi, pre[plo]);
			int count = idx - ilo;
			node.left = build(pre, in, plo + 1, plo + count, ilo, idx - 1);
			node.right = build(pre, in, plo + count + 1, phi, idx + 1, ihi);
			return node;
		}

		public int search(int[] in, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return -1;
		}
	}
}
