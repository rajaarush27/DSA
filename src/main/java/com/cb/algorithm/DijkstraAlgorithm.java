package com.cb.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public DijkstraAlgorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class DijkstraPair {
		int vtx;
		String acqpath;
		int cost;

		public DijkstraPair(int vtx, String acqpath, int cost) {
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "vtx=" + vtx + ", acqpath=" + acqpath + ", cost=" + cost + "";
		}

	}

	public void DijkstraAlgo(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();

			// 2. Ignore if Already visited
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// 3. visited marked
			visited.add(rp.vtx);

			// 4. self work
			System.out.println(rp);

			// 5. add unvisited nbsr
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.acqpath + nbrs, rp.cost + cost));
				}
			}
		}
	}

	public static void main(String[] args) {
		DijkstraAlgorithm dj = new DijkstraAlgorithm(7);
		dj.addEdge(1, 2, 2);
		dj.addEdge(2, 3, 3);
		dj.addEdge(1, 4, 10);
		dj.addEdge(4, 5, 8);
		dj.addEdge(3, 4, 1);
		dj.addEdge(5, 6, 5);
		dj.addEdge(5, 7, 6);
		dj.addEdge(6, 7, 4);
		dj.DijkstraAlgo(1);
	}
}
