package Lec47;

import java.util.*;

public class Prims {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}

	public class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.cost = cost;
			this.acqvtx = acqvtx;
		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acqvtx + " @ " + this.cost;

		}

	}

	public void PrimsAlgo() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			// 1 remove
			PrimsPair rp = pq.poll();
			// 2 Ignore if ALready Visited
			if (visited.contains(rp.vtx)) {
				continue;
			}
			// 3 Marked Visited
			visited.add(rp.vtx);
			// self Work
			System.out.println(rp);
			// Add Nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int newcost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, newcost));
				}

			}
		}

	}

	public static void main(String[] args) {
		Prims g = new Prims(7);

		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.PrimsAlgo();
	}

}
