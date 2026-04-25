package com.cb.trie;

import java.util.HashMap;

public class TriesContacts {

	private class Node {
		char ch;
		HashMap<Character, Node> child;
		boolean isTerminal;
		int c = 1;

		public Node(char ch) {
			this.ch = ch;
			child = new HashMap<>();
		}
	}

	private Node root;

	public TriesContacts() {
		root = new Node('*');
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.c++;
			} else {
				Node nn = new Node(ch);
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isTerminal = true;
	}

	public int startWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.c;
	}
}
