package Lec27;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5, 6 };
		int amount = 10;
		Coin_Per(coin, amount, "");

	}

	public static void Coin_Per(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Coin_Per(coin, amount - coin[i], ans + coin[i]);
			}

		}
	}

}
