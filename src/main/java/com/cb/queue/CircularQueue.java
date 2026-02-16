package com.cb.queue;

public class CircularQueue {
	private int[] arr;
	private int front = 0;
	private int size = 0; // rear

	public CircularQueue() {
		this(10);
	}

	public CircularQueue(int x) {
		arr = new int[x];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	private boolean isFull() {
		return size == arr.length;
	}

	public void enqueue(int x) {
		if (isFull()) {
			throw new RuntimeException("Queue is already full !!!");
		}
		int idx = front + size % arr.length;
		arr[idx] = x;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty !!!");
		}
		int x = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return x;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

	public int getFront() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty !!!");
		}
		return arr[front];
	}
}
