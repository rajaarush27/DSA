package com.cb.map;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	}

	private List<Node> arr = new ArrayList<>();

	public HashMap() {
		this(4);
	}

	public HashMap(int n) {
		for (int i = 0; i < n; i++) {
			arr.add(null);
		}
	}

	private int size;

	public void put(K key, V value) {
		int idx = hashFun(key);
		Node head = arr.get(idx);
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		head = arr.get(idx);
		nn.next = head;
		size++;
		arr.set(idx, nn);
	}

	public int hashFun(K key) {
		int idx = key.hashCode() % arr.size();
		if (idx < 0)
			idx += arr.size();
		return idx;
	}
}
