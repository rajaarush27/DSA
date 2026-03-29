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
	private int size;

	public HashMap() {
		this(4);
	}

	public HashMap(int n) {
		for (int i = 0; i < n; i++) {
			arr.add(null);
		}
	}

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
		double lf = (1.0 * size) / arr.size();
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}
	}

	private void rehashing() {
		List<Node> newArr = new ArrayList<>();
		for (int i = 0; i < 2 * arr.size(); i++) {
			newArr.add(null);
		}
		List<Node> oldArr = arr;
		arr = newArr;
		size = 0;
		for (Node nn : oldArr) {
			while (nn != null) {
				put(nn.key, nn.value);
				nn = nn.next;
			}
		}
	}

	public boolean containsKey(K key) {
		int idx = hashFun(key);
		Node head = arr.get(idx);
		while (head != null) {
			if (head.key.equals(key)) {
				return true;
			}
			head = head.next;
		}
		return false;
	}

	public V remove(K key) {
		int idx = hashFun(key);
		Node curr = arr.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		if (prev == null) {
			arr.set(idx, curr.next);
		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return curr.value;
	}

	public int hashFun(K key) {
		int idx = key.hashCode() % arr.size();
		if (idx < 0)
			idx += arr.size();
		return idx;
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node nn : arr) {
			while (nn != null) {
				s = s + nn.key + "=" + nn.value + ", ";
				nn = nn.next;
			}
		}
		s = s.substring(0, s.length() - 2);
		return s + "}";
	}

}
