package com.cb.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimsAlgorithm {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public PrimsAlgorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "vtx=" + vtx + ", acqvtx=" + acqvtx + ", cost=" + cost + "";
		}

	}

	public int primsAlgo() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		int sum = 0;
		while (!pq.isEmpty()) {
			// 1. remove
			PrimsPair rp = pq.poll();

			// 2. Ignore if Already visited
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// 3. visited marked
			visited.add(rp.vtx);

			// 4. self work
			sum += rp.cost;

			// 5. add unvisited nbsr
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // vtx
		int m = sc.nextInt(); // edge

		PrimsAlgorithm p = new PrimsAlgorithm(n);
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			p.addEdge(v1, v2, cost);
		}
		System.out.println(p.primsAlgo());
		sc.close();
	}
}
