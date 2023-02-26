package Lec25;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 4;
		// matrix 3*4
		PrintPath(0, 0, n - 1, m - 1, "");

	}

	public static void PrintPath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}
		if (cc > ec || cr > er) {
			return;
		}

		PrintPath(cr, cc + 1, er, ec, ans + "H");
		PrintPath(cr + 1, cc, er, ec, ans + "V");

	}

}
