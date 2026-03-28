package com.cb.heap;

import java.util.*;

public class Heap {

	private List<Integer> ll = new ArrayList<>();

	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	private void swap(int i, int j) {
		int ith = ll.get(i);
		int jth = ll.get(j);

		ll.set(i, jth);
		ll.set(j, ith);
	}

	public int get() {
		return ll.get(0);
	}

	public int size() {
		return ll.size();
	}

	public void display() {
		System.out.println(ll);
	}

	public int remove() {
		swap(0, ll.size() - 1);
		int x = ll.remove(ll.size() - 1);
		downheapify(0);
		return x;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
			mini = lci;
		}
		if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}
}
