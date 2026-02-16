package com.cb.stack;

import java.util.LinkedList;
import java.util.Queue;


//Push Efficient
public class StackUsingQueue {

	private Queue<Integer> q;

	public StackUsingQueue() {
		q = new LinkedList<>();
	}

	public void push(int item) {
		q.add(item);
	}

	public int pop() {
		Queue<Integer> hlp = new LinkedList<>();
		while (q.size() > 1) {
			hlp.add(q.remove());
		}
		int x = q.poll();
		while (hlp.size() > 0) {
			q.add(hlp.remove());
		}
		return x;
	}

	public int peek() {
		Queue<Integer> hlp = new LinkedList<>();
		while (q.size() > 1) {
			hlp.add(q.remove());
		}
		int x = q.poll();
		while (hlp.size() > 0) {
			q.add(hlp.remove());
		}
		q.add(x);
		return x;
	}

	public static void main(String[] args) {
		StackUsingQueue st = new StackUsingQueue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}
