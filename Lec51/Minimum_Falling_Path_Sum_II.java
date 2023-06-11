package Lec51;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1000_000;
			}
		}
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < matrix[0].length; i++) {

			ans = Math.min(ans, Falling_Path_Sum(matrix, 0, i, dp));
		}
		System.out.println(ans);
	}

	public static int Falling_Path_Sum(int[][] matrix, int cr, int cc,int [][]dp) {
		if (cr >= matrix.length || cc < 0 || cc >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if (dp[cr][cc] != -1000_000) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			if (i == cc) {
				continue;
			}
			ans = Math.min(ans, Falling_Path_Sum(matrix, cr + 1, i, dp));
		}
		return dp[cr][cc] = ans + matrix[cr][cc];
	}
}
