package Lec47;


import java.util.*;

public class Graph_Valid_Tree {

	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());

			}
			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];
				int v2 = edges[i][1];
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}
			return IsValid(map);

		}

		public boolean IsValid(HashMap<Integer, List<Integer>> map) {
			Queue<Integer> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int count=0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				count++;
				q.add(src);
				while (!q.isEmpty()) {
					// 1 remove;
					int rv = q.poll();
					// 2 Ignore if Already visited
					if (visited.contains(rv)) {
						return false;
					}
					// 3 visited marked
					visited.add(rv);
	
					// Nbrs Add krna
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}

				}
			}
			return count==1;

		}
	}

}
