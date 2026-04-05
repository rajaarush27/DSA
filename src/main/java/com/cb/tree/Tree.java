package com.cb.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public List<Integer> topView(TreeNode root) {
			Queue<Pair> q = new PriorityQueue<>();
			Map<Integer, Integer> map = new TreeMap<>();
			q.add(new Pair(root, 0));
			while (!q.isEmpty()) {
				Pair rp = q.poll();
				if (map.containsKey(rp.vl)) {
					map.put(rp.vl, rp.node.val);
				}
				if (rp.node.left != null) {
					q.add(new Pair(rp.node.left, rp.vl - 1));
				}
				if (rp.node.right != null) {
					q.add(new Pair(rp.node.left, rp.vl + 1));
				}
			}
			List<Integer> ll = new ArrayList<>();
			for (int key : map.keySet()) {
				ll.add(map.get(key));
			}
			return ll;
		}

	}

	class Pair {
		TreeNode node;
		int vl;

		public Pair(TreeNode node, int vl) {
			this.node = node;
			this.vl = vl;
		}
	}

}
