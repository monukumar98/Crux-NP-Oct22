package Lec48;

import java.util.*;

public class BellManFord {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFord(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost

	}

	public class EdgeList {
		int v1;
		int v2;
		int cost;

		public EdgeList(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}
	}

	public List<EdgeList> GetALlEdges() {
		List<EdgeList> ll = new ArrayList<>();
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				int cost = map.get(v1).get(v2);
				ll.add(new EdgeList(v1, v2, cost));
			}

		}
		return ll;

	}

	public void BellmanfordAlgo() {
		List<EdgeList> ll = GetALlEdges();
		int v = map.size();
		int[] arr = new int[v + 1];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = 10000000;

		}

		for (int i = 1; i <= v; i++) {
			for (EdgeList e : ll) {
				if (i == v && arr[e.v2] > arr[e.v1] + e.cost) {
					System.out.println("-ve wt ka cycle hai");
					return;
				}
				if (arr[e.v2] > arr[e.v1] + e.cost) {
					arr[e.v2] = arr[e.v1] + e.cost;
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		BellManFord bfd = new BellManFord(5);
		bfd.addEdge(1, 2, 8);
		 bfd.addEdge(2, 5, -2);
		//bfd.addEdge(2, 5, 2);
		bfd.addEdge(5, 2, 1);
		bfd.addEdge(4, 5, 4);
		bfd.addEdge(3, 4, -3);
		bfd.addEdge(1, 3, 4);
		bfd.addEdge(1, 4, 5);
		bfd.BellmanfordAlgo();
	}

}
