package com.cb.queue;

import java.util.Stack;

// Dequeue Efficient
public class QueueUsingStack {

	private Stack<Integer> st;

	public QueueUsingStack() {
		st = new Stack<>();
	}

	// o(n)
	public void enqueue(int x) {
		Stack<Integer> hlp = new Stack<>();
		while (st.size() > 0) {
			hlp.push(st.pop());
		}
		st.push(x);
		while (hlp.size() > 0) {
			st.push(hlp.pop());
		}
	}

	public int dequeue() {
		return st.pop();
	}

	public int getFront() {
		return st.peek();
	}
}
