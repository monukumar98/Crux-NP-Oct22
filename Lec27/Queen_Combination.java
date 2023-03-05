package Lec27;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		QueenCom(board, tq, "", 0, 0);
	}

	public static void QueenCom(boolean[] board, int tq, String ans, int qpsf, int idx) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				QueenCom(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1, i + 1);
				board[i] = false;
			}

		}

	}

}
