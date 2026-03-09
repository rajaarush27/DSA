package com.cb.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateTreeUsingLevelOrder {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public CreateTreeUsingLevelOrder() {
		createTree();
	}

	private void createTree() {
		Queue<Node> q = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		q.add(nn);

		while (!q.isEmpty()) {
			Node n = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();

			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				n.left = node;
				q.add(node);
			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				n.right = node;
				q.add(node);
			}
		}
	}
}
