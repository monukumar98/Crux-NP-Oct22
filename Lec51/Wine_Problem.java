package Lec51;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];

		// System.out.println(MaxProfit(wine, 0, wine.length - 1, 1, dp));
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(MaxProfit(wine));
	}

	private static int MaxProfit(int[] wine, int i, int j, int year, int[][] dp) {
		// TODO Auto-generated method stub
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int left = wine[i] * year + MaxProfit(wine, i + 1, j, year + 1, dp);
		int right = wine[j] * year + MaxProfit(wine, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(left, right);
	}

	private static int MaxProfit(int[] wine) {

		int[][] dp = new int[wine.length][wine.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * wine.length;

		}
		int year = wine.length - 1;
		for (int gap = 1; gap < dp.length; gap++) {
			for (int j = gap; j < dp.length; j++) {

				int i = j - gap;
				int left = wine[i] * year + dp[i + 1][j];
				int right = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(left, right);
			}
			year--;
		}

		return dp[0][dp[0].length - 1];

	}

}
