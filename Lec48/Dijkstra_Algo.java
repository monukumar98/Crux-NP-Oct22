package Lec48;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
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

	public class DijkstraPair {
		int vtx;
		String acqpath;
		int cost;

		public DijkstraPair(int vtx, String acqpath, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acqpath + " @ " + this.cost;
		}
	}

	public void DijkstraALgo(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			// remove
			DijkstraPair rp = pq.remove();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs) + rp.cost;
					pq.add(new DijkstraPair(nbrs, rp.acqpath + nbrs, cost));
				}
			}

		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo pa = new Dijkstra_Algo(7);

		pa.AddEdge(1, 2, 10);
		pa.AddEdge(2, 3, 4);
		pa.AddEdge(1, 4, 1);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 2);
		pa.AddEdge(5, 6, 7);
		pa.AddEdge(5, 7, 9);
		pa.AddEdge(6, 7, 1);
		pa.DijkstraALgo(1);
	}

}
