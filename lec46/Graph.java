package lec46;

import java.util.*;

public class Graph {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);

	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum += map.get(key).size();
		}
		return sum / 2;

	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);

	}

	public void removevertex(int v1) {

		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);

		}
		map.remove(v1);

	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}

	public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, des, visited);
				if (ans) {
					return ans;
				}
			}
		}
		return false;
	}

	public void Allpath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + des);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				Allpath(nbrs, des, visited, ans + src);

			}
		}
		visited.remove(src);

	}

	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1 remove;
			int rv = q.poll();
			// 2 Ignore if Already visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3 visited marked
			visited.add(rv);
			// 4 Self Work
			if (rv == des) {
				return true;
			}
			// Nbrs Add krna
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}

		}
		return false;

	}

	public boolean DFS(int src, int des) {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		s.push(src);
		while (!s.isEmpty()) {
			// 1 remove;
			int rv = s.pop();
			// 2 Ignore if Already visited
			if (visited.contains(rv)) {
				continue;
			}
			// 3 visited marked
			visited.add(rv);
			// 4 Self Work
			if (rv == des) {
				return true;
			}
			// Nbrs Add krna
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}

		}
		return false;

	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1 remove;
				int rv = q.poll();
				// 2 Ignore if Already visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3 visited marked
				visited.add(rv);
				// 4 Self Work
				System.out.print(rv + " ");
				// Nbrs Add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}

			}
		}
		System.out.println();
	}

	public void DFT() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			s.push(src);
			while (!s.isEmpty()) {
				// 1 remove;
				int rv = s.pop();
				// 2 Ignore if Already visited
				if (visited.contains(rv)) {
					continue;
				}
				// 3 visited marked
				visited.add(rv);
				// 4 Self Work
				System.out.print(rv + " ");
				// Nbrs Add krna
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}

			}
		}

		System.out.println();
	}

}
