package com.cb.leetcode.graph;

import java.util.*;

public class LeetCode261 {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			return BFT(map);
		}

		public boolean BFT(HashMap<Integer, List<Integer>> map) {
			Queue<Integer> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				q.add(src);
				while (!q.isEmpty()) {
					// 1.remove
					int r = q.poll();
					// 2.ignore if already visited
					if (visited.contains(r)) {
						return false;
					}
					// 3.visited
					visited.add(r);
					// 4.self work
					if (r == src) {
						return true;
					}
					// 5.add unvisited nbrs
					for (int nbrs : map.get(r)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
				}
			}
			System.out.println();
			return c == 1;
		}
	}

}
