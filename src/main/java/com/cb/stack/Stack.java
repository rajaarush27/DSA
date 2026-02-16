package com.cb.stack;

public class Stack {

	protected int[] arr;
	private int idx = -1;

	public Stack() {
		this(5);
	}

	public Stack(int n) {
		arr = new int[n];
	}

	public boolean isEmpty() {
		return idx == -1;
	}

	public int size() {
		return idx + 1;
	}

	public void push(int x) {
		if (isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		arr[++idx] = x;
	}

	public boolean isFull() {
		return idx == arr.length - 1;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return arr[idx];
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return arr[idx--];
	}

	public void display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
