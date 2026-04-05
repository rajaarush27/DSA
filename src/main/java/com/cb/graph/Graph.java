package com.cb.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean containsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}

	public boolean containsVertex(int v1) {
		return map.containsKey(v1);
	}

	public int noOfEdge() {
		int sum = 0;
		for (int vtx : map.keySet()) {
			sum += map.get(vtx).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removeVertex(int v1) {
		for (int nvr : map.get(v1).keySet()) {
			map.get(nvr).remove(v1);
		}
		map.remove(v1);
	}

	public void display() {
		for (int vtx : map.keySet()) {
			System.out.println(vtx + " " + map.get(vtx));
		}
	}

	public boolean hasPath(int src, int dest, HashSet<Integer> visited) {
		if (src == dest) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, dest, visited);
				if (ans) {
					return ans;
				}
			}
		}
		visited.remove(src);
		return false;
	}

	public void printAllPath(int src, int dest, HashSet<Integer> visited, String ans) {
		if (src == dest) {
			System.out.println(ans + dest);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printAllPath(nbrs, dest, visited, ans + src);
			}
		}
		visited.remove(src);
	}

	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		Set<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
//			1. remove
			int r = q.poll();

//			2. Ignore if Already Visited
			if (visited.contains(r)) {
				continue;
			}

//			3. Visited Marked
			visited.add(r);

//			4. Self Work
			if (r == des) {
				return true;
			}

//			5. Add Unvisited nbrs
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}

	public boolean DFS(int src, int des) {
		Stack<Integer> st = new Stack<>();
		Set<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {

//			1. remove
			int r = st.pop();

//			2. Ignore if Already Visited
			if (visited.contains(r)) {
				continue;
			}

//			3. Visited Marked
			visited.add(r);

//			4. Self Work
			if (r == des) {
				return true;
			}

//			5. Add Unvisited nbrs
			for (int nbrs : map.get(r).keySet()) {
				if (!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		return false;
	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		Set<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
//				1. remove
				int r = q.poll();

//				2. Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}

//				3. Visited Marked
				visited.add(r);

//				4. Self Work

				System.out.print(r + " ");

//				5. Add Unvisited nbrs
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println();
	}

	public void DFT() {
		Stack<Integer> st = new Stack<>();
		Set<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.push(src);
			while (!st.isEmpty()) {

//			1. remove
				int r = st.pop();

//			2. Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}

//			3. Visited Marked
				visited.add(r);

//			4. Self Work
				System.out.print(r + " ");

//			5. Add Unvisited nbrs
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
		}
		System.out.println();
	}

}
