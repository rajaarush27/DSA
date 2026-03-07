package com.cb.leetcode.tree;

import java.util.*;

public class LeetCode199 {

	class Solution {

		int maximumDepth = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightView(root, 1, ll);
			return ll;
		}

		public void rightView(TreeNode root, int currLevel, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (maximumDepth < currLevel) {
				maximumDepth = currLevel;
				ll.add(root.val);
			}
			rightView(root.right, currLevel + 1, ll);
			rightView(root.left, currLevel + 1, ll);
		}
	}
}
