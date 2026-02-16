package com.cb.queue;

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int x) {
		if (isFull()) {
			int[] newArr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				newArr[i] = arr[idx];
			}
			arr = newArr;
			front = 0;
		}
		super.enqueue(x);
	}

	public static void main(String[] args) {
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.enqueue(60);
		dq.enqueue(70);
		dq.display();
	}
}
