package Doubt_Class_Backtraking;

import java.util.Scanner;

public class Chess_Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("\n"+ChessBoard(n, 0, 0, ""));

	}

	public static int  ChessBoard(int n, int cr, int cc, String ans) {
		if (cr == n - 1 && cc == n - 1) {
			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			return 1;
		}
		if (cr >= n || cc >= n) {
			return 0;
		}
		int count=0;
		// knight
		count+=ChessBoard(n, cr + 2, cc + 1, ans + "{" + cr + "-" + cc + "}K");
		count+=ChessBoard(n, cr + 1, cc + 2, ans + "{" + cr + "-" + cc + "}K");
		// rook Move
		// Rook in Col
		if (cc == 0 || cr == 0 || cc == n - 1 || cr == n - 1) {
			for (int i = 1; i <= n; i++) {
				count+=ChessBoard(n, cr, cc + i, ans + "{" + cr + "-" + cc + "}R");
			}
			// Rook in Row
			for (int i = 1; i <= n; i++) {
				count+=ChessBoard(n, cr + i, cc, ans + "{" + cr + "-" + cc + "}R");
			}
		}
		// bishop Move
		if (cr == cc || cr + cc == n - 1) {
			for (int i = 1; i <= n; i++) {
				count+=ChessBoard(n, cr + i, cc + i, ans + "{" + cr + "-" + cc + "}B");
			}
		}
		return count;

	}

}
