package com.cb.linkedlist;

public class SinglyLinkedList {
	private class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	// o(1)
	public void addFirst(int item) {
		Node nn = new Node(item);
		if (size == 0) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		size++;
	}

	public int size() {
		return size;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public void addLast(int item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node(item);
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	// o(n)
	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// o(n)
	public void addAtIndex(int item, int k) {
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node nn = new Node(item);
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}

	// o(1)
	public int getFirst() {
		return head.val;
	}

	// o(1)
	public int getLast() {
		return tail.val;
	}

	// o(n)
	public int getAtIndex(int k) {
		return getNode(k).val;
	}

	// o(1)
	public int removeFirst() {
		Node temp = head;
		if (size == 0) {
			throw new NullPointerException();
		} else if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			temp.next = null;
		}
		size--;
		return temp.val;
	}

	// o(n)
	public int removeLast() {
		if (size == 0) {
			throw new NullPointerException();
		} else if (size == 1) {
			return removeFirst();
		} else {
			Node prev = getNode(size - 1);
			int val = tail.val;
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}
	}

	public int removeAtIndex(int k) {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeFirst();
		} else {
			Node prev = getNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}
	}
}
