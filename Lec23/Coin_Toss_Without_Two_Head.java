package Lec23;

public class Coin_Toss_Without_Two_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		printWays(n, "");

	}

	public static void printWays(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			printWays(n - 1, ans + "H");
		}
		printWays(n - 1, ans + "T");
	}
}
