package com.cb.leetcode.tree;

public class LeetCode114 {

	class Solution {
		public void flatten(TreeNode root) {
			makeLL(root);
		}
		

		public TreeNode makeLL(TreeNode root) {
			if (root == null) {
				return null;
			}
			if(root.left == null && root.right == null) {
              return root;
			}
			TreeNode leftTail = makeLL(root.left);
			TreeNode rightTail = makeLL(root.right);
			if (leftTail != null) {
				leftTail.right = root.right;
				root.right = root.left;
				root.left = null;
			}
			return rightTail != null ? rightTail : leftTail;
		}
	}
}
