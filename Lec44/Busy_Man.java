package Lec44;

import java.util.*;

public class Busy_Man {
	public static class Pair {
		int st;
		int et;

		public Pair(int st, int et) {
			// TODO Auto-generated constructor stub
			this.st = st;
			this.et = et;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			List<Pair> ll = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int st = sc.nextInt();
				int et = sc.nextInt();
				ll.add(new Pair(st, et));
			}
			Collections.sort(ll, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
			int activities = 1;
			int end = ll.get(0).et;
			for (int i = 1; i < ll.size(); i++) {
				if (end <= ll.get(i).st) {
					activities++;
					end = ll.get(i).et;
				}
			}
			System.out.println(activities);

		}

	}

}
