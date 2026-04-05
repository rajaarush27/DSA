package com.cb.leetcode.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LeetCode785 {

	class Solution {
		public boolean isBipartite(int[][] graph) {
             return BFT(graph);
		}

		public boolean BFT(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			Map<Integer, Integer> visited = new HashMap<>();
			for (int src = 0; src < graph.length; src++) {
				if (visited.containsKey(src)) {
					continue;
				}
				q.add(new BipartitePair(src, 0));
				while (!q.isEmpty()) {
					BipartitePair r = q.poll();
					if (visited.containsKey(r.vtx)) {
						if(visited.get(r.vtx) != r.dis) {
							return false;
						}
						continue;
					}
					visited.put(r.vtx, r.dis);
					for (int nbrs : graph[r.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, r.dis + 1));
						}
					}
				}
			}
			return true;
		}

	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			this.vtx = vtx;
			this.dis = dis;
		}

	}
}
