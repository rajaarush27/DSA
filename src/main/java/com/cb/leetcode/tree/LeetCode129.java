package com.cb.leetcode.tree;

public class LeetCode129 {

	class Solution {
		public int sumNumbers(TreeNode root) {
			return number(root, 0);
		}

		public int number(TreeNode root, int num) {
			if (root == null) {
				return 0;
			}
			if (root.left == null && root.right == null) {
				return num * 10 + root.val;
			}

			int left = number(root.left, num * 10 + root.val);
			int right = number(root.right, num * 10 + root.val);
			return left + right;
		}
	}
}
