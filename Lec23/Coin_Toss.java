package Lec23;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		printWays(n, "");

	}

	public static void printWays(int n, String ans) {
		if (n == 0) {
			System.out.print(ans+" ");
			return;
		}

		printWays(n - 1, ans + "H");
		printWays(n - 1, ans + "T");
	}

}
