package Lec51;

public class Min_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[maze.length][maze[0].length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(minpathsum(maze, 0, 0, dp));
	}

	public static int minpathsum(int[][] maze, int cc, int cr, int[][] dp) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			return maze[cr][cc];
		}
		if (cr >= maze.length || cc >= maze[0].length) {
			return Integer.MAX_VALUE;
		}
		if(dp[cr][cc]!=-1) {
			return dp[cr][cc];
		}
		int left = minpathsum(maze, cc + 1, cr, dp);
		int right = minpathsum(maze, cc, cr + 1, dp);
		int ans = Math.min(left, right) + maze[cr][cc];
		return dp[cr][cc] = ans;
	}

}
