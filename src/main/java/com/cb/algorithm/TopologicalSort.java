package com.cb.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {

	private HashMap<Integer, List<Integer>> map;

	public TopologicalSort(int v) {
		map = new HashMap<>();
		for (int i = 0; i < v; i++) {
			map.put(i, new ArrayList<>());
		}
	}

	public void addEdge(int v1, int v2) {
		map.get(v1).add(v2);
	}

	public int[] indegree() {
		int[] in = new int[map.size()];
		for (int vtx1 : map.keySet()) {
			for (int vtx2 : map.get(vtx1)) {
				in[vtx2]++;
			}
		}
		return in;
	}

	public void topological() {
		int[] in = indegree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int r = q.poll();
			System.out.print(r + " ");
			for (int nbrs : map.get(r)) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		System.out.println();
	}

	public boolean isCycle() {
		int[] in = indegree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int c = 0;
		while (!q.isEmpty()) {
			int r = q.poll();
			c++;
			for (int nbrs : map.get(r)) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return c != map.size(); // Cycle hai
	}

	public static void main(String[] args) {
		TopologicalSort ts = new TopologicalSort(8);
		ts.addEdge(1, 2);
		ts.addEdge(1, 0);
		ts.addEdge(1, 4);
		ts.addEdge(4, 3);
		ts.addEdge(3, 2);
		ts.addEdge(4, 5);
		ts.addEdge(5, 7);
		ts.addEdge(6, 3);
		ts.addEdge(6, 7);
		ts.topological();
	}

}
