package Doubt_Class_leetCode;

public class Combination_Sum_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[10];
		int k = 3;
		int n = 9;
		Combination_Sum3(board, k, n, "", 1);

	}

	public static void Combination_Sum3(boolean[] board, int k, int n, String ans, int idx) {
		if (k == 0 && n == 0) {
			System.out.println(ans);
			return;
		}
		if (k == 0) {
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Combination_Sum3(board, k - 1, n - i, ans + i, i + 1);
				board[i] = false;
			}

		}
	}

}
