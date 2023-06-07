package Lec49;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int lcsBU(int[] arr1, int[] arr2) {
		int[][] dp = new int[arr1.length + 1][arr2.length + 1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (arr1[i - 1] == arr2[i - 1]) {
					ans = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					ans = Math.max(f, s);
				}
				dp[i][j] = ans;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

}
