package com.cb.leetcode.tree;

public class LeetCode450 {

	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null) {
				return root;
			}
			if (root.val < key) {
				root.right = deleteNode(root.right, key);
			} else if (root.val > key) {
				root.left = deleteNode(root.left, key);
			} else {
				if (root.left == null) {
					return root.right;
				} else if (root.right == null) {
					return root.left;
				} else {
					int max = max(root.left);
					root.left = deleteNode(root, max);
					root.val = max;
				}
			}
			return root;
		}

		private int max(TreeNode nn) {
			if (nn == null) {
				return Integer.MIN_VALUE;
			}
			int r = max(nn.right);
			return Math.max(r, nn.val);
		}
	}
}
