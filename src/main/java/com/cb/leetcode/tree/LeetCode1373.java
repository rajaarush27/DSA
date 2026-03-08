package com.cb.leetcode.tree;

public class LeetCode1373 {

	class Solution {
		public int maxSumBST(TreeNode root) {
			return validBST(root).asnwer;
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
			sbp.sum = lbp.sum + rbp.sum + root.val;
			if (lbp.isBst && rbp.isBst && lbp.max < root.val && rbp.min > root.val) {
				sbp.isBst = true;
				sbp.asnwer = Math.max(sbp.sum, Math.max(lbp.asnwer, rbp.asnwer));
			} else {
				sbp.isBst = false;
				sbp.asnwer = Math.max(lbp.asnwer, rbp.asnwer);
			}
			return sbp;
		}

		class BSTPair {
			boolean isBst = true;
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			int sum = 0;
			int asnwer = 0;
		}
	}
}
