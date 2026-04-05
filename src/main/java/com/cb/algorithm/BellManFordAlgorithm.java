package com.cb.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellManFordAlgorithm {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFordAlgorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
	}

	class BellManFordPair {
		int e1;
		int e2;
		int cost;

		public BellManFordPair(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}
	}

	public List<BellManFordPair> getAllEdge() {
		List<BellManFordPair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new BellManFordPair(e1, e2, cost));
			}
		}
		return ll;
	}

	public void BellManFordAlgo(int src) {
		int[] dis = new int[map.size() + 1];
		for (int i = 0; i < dis.length; i++) {
			if (i != src) {
				dis[i] = 999999;
			}
		}
		List<BellManFordPair> ll = getAllEdge();
		for (int i = 1; i < map.size(); i++) {
			for (BellManFordPair e : ll) {
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.println(i + " " + dis[i]);
		}
	}

	public static void main(String[] args) {
		BellManFordAlgorithm bf = new BellManFordAlgorithm(5);
		bf.addEdge(1, 2, 8);
		bf.addEdge(1, 3, 4);
		bf.addEdge(1, 4, 5);
		bf.addEdge(2, 5, 2);
		bf.addEdge(5, 2, 1);
		bf.addEdge(3, 4, -3);
		bf.addEdge(4, 5, 4);
		bf.BellManFordAlgo(1);
	}
}
