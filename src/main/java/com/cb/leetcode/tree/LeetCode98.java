package com.cb.leetcode.tree;

public class LeetCode98 {
	class Solution {

		public boolean isValidBST(TreeNode root) {
			return validBST(root).isBst;
		}

		public BSTPair validBST(TreeNode root) {
			if (root == null) {
				return new BSTPair();
			}

			BSTPair lbp = validBST(root.left);
			BSTPair rbp = validBST(root.right);
			BSTPair sbp = new BSTPair();
			sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
			if (lbp.isBst && rbp.isBst && lbp.max < root.val && rbp.min > root.val) {
				sbp.isBst = true;
			} else {
				sbp.isBst = false;
			}
			return sbp;
		}

		class BSTPair {
			boolean isBst = true;
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
		}
	}
}
