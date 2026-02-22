package com.cb.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

	private class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node root;

	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		root = createTree();
	}

	private Node createTree() {
		int val = sc.nextInt();
		Node nn = new Node(val);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = createTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = createTree();
		}
		return nn;
	}

	public void display() {
		display(root);
	}

	private void display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(nn.left);
		int rmax = max(nn.right);
		return Math.max(nn.val, Math.max(lmax, rmax));
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;
	}

	public int height() {
		return height(root);
	}

	private int height(Node nn) {
		if (nn == null) {
			return -1;
		}

		int lh = height(nn.left);
		int rh = height(nn.right);
		return Math.max(lh, rh) + 1;
	}

	public void preOrder() {
		preOdrder(this.root);
		System.out.println();
	}

	private void preOdrder(Node nn) {
		if (nn == null) {
			return;
		}
		System.out.print(nn.val + " ");
		preOdrder(nn.left);
		preOdrder(nn.right);
	}

	public void postOrder() {
		postOdrder(this.root);
		System.out.println();
	}

	private void postOdrder(Node nn) {
		if (nn == null) {
			return;
		}
		preOdrder(nn.left);
		preOdrder(nn.right);
		System.out.print(nn.val + " ");
	}

	public void inOrder() {
		inOrder(this.root);
		System.out.println();
	}

	private void inOrder(Node nn) {
		if (nn == null) {
			return;
		}
		preOdrder(nn.left);
		System.out.print(nn.val + " ");
		preOdrder(nn.right);
	}

	public void leveleOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.print(n.val + " ");
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
		}
	}
}
