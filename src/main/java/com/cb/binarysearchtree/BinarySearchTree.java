package com.cb.binarysearchtree;

public class BinarySearchTree {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node root;

	public BinarySearchTree(int... n) {
		root = createTree(n, 0, n.length - 1);
	}

	private Node createTree(int[] in, int si, int ei) {
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node(in[mid]);
		nn.left = createTree(in, si, mid - 1);
		nn.right = createTree(in, mid + 1, ei);
		return nn;
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int r = max(nn.right);
		return Math.max(r, nn.val);
	}
}
