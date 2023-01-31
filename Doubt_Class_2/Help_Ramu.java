package Doubt_Class_2;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int rn = sc.nextInt();
			int cn = sc.nextInt();
			int[] ride_rickshaw = new int[rn];
			int[] ride_cab = new int[cn];
			for (int i = 0; i < ride_rickshaw.length; i++) {
				ride_rickshaw[i] = sc.nextInt();
			}
			for (int i = 0; i < ride_cab.length; i++) {
				ride_cab[i] = sc.nextInt();
			}
			System.out.println(MinCost(ride_rickshaw, ride_cab, c1, c2, c3, c4));

			t--;
		}

	}

	public static int MinCost(int[] ride_rickshaw, int[] ride_cab, int c1, int c2, int c3, int c4) {
		int cost_r = 0;
		int cost_c = 0;
		for (int i = 0; i < ride_rickshaw.length; i++) {
			cost_r = cost_r + Math.min(ride_rickshaw[i] * c1, c2);

		}
		for (int i = 0; i < ride_cab.length; i++) {
			cost_c = cost_c + Math.min(ride_cab[i] * c1, c2);

		}
		cost_r = Math.min(cost_r, c3);
		cost_c = Math.min(cost_c, c3);
		int ans = Math.min(cost_r + cost_c, c4);
		return ans;

	}

}
