package Lec50;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[coin.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Noways(coin, amount, 0, dp));

	}

	public static int Noways(int[] coin, int amount, int idx, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coin.length) {
			return 0;
		}
		if (dp[idx][amount] != -1) {
			return dp[idx][amount];
		}
		int inc = 0;
		int exc = 0;

		if (amount >= coin[idx]) {
			inc += Noways(coin, amount - coin[idx], idx, dp);
		}

		exc += Noways(coin, amount, idx + 1, dp);
		return dp[idx][amount] = inc + exc;
	}

	public static int NowaysBU(int[] coin, int amount) {
		int[][] dp = new int[coin.length+1][amount + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int am = 1; am < dp[0].length; am++) {
				int inc = 0;
				int exc = 0;

				if (am >= coin[i - 1]) {
					inc += dp[i][am - coin[i - 1]];
				}

				exc += dp[i - 1][am];
				dp[i][am] = inc + exc;

			}
		}
        
		return dp[dp.length - 1][dp[0].length-1];

	}

}
