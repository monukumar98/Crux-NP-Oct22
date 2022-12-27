package Doubt_Class;

public class Painter_Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;// no Partition
		int[] board = { 10, 20, 30, 40 };// board wala array
		System.out.println(Partition(board, k));

	}

	public static int Partition(int[] board, int k) {

		int lo = 0;
		int hi = 0;
		for (int i = 0; i < board.length; i++) {
			hi = hi + board[i];

		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (ispossible(board, k, mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	public static boolean ispossible(int[] board, int k, int mid) {
		// TODO Auto-generated method stub
		int p = 1;
		int time = 0;
		for (int i = 0; i < board.length;) {
			if (time + board[i] <= mid) {
				time += board[i];
				i++;
			} else {
				p++;
				time = 0;
			}
			if (p > k) {
				return false;
			}
		}

		return true;
	}

}
