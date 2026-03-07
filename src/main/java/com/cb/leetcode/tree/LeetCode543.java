package com.cb.leetcode.tree;

public class LeetCode543 {

	class Solution {

		public int diameterOfBinaryTree(TreeNode root) {
			if (root == null) {
				return 0;
			}

			int ld = diameterOfBinaryTree(root.left);
			int rd = diameterOfBinaryTree(root.right);
			int sd = height(root.left) + height(root.right) + 2;
			return Math.max(ld, Math.max(rd, sd));
		}

		private int height(TreeNode node) {
			if (node == null) {
				return -1;
			}

			int lh = height(node.left);
			int rh = height(node.right);

			return Math.max(lh, rh) + 1;
		}
	}

	class Solution2 {
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).d;
		}

		public DiameterPair diameter(TreeNode root) {
			 if(root == null){
	                return new DiameterPair();
	            }
			DiameterPair ldp = diameter(root.left);
			DiameterPair rdp = diameter(root.right);

			int sd = ldp.ht + rdp.ht + 2;

			DiameterPair sdp = new DiameterPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			sdp.d = Math.max(ldp.d, Math.max(rdp.d, sd));
			return sdp;
		}

	}

	class DiameterPair {
		int d = 0;
		int ht = -1;
	}
}
