package Doubt_Class_Stack;

import java.util.Scanner;

public class Only_Ladders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ladder = makeladder(n);
		System.out.println("\n" + Printanswer(0, n, "", ladder));
	}

	public static int Printanswer(int curr, int end, String ans, int[] ladder) {
		if (curr == end) {
			System.out.print(ans + "END , ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		if (ladder[curr] != 0) {
			count += Printanswer(curr + ladder[curr], end, ans + curr + " ", ladder);

		}
		// else {
		for (int dice = 1; dice <= 6; dice++) {
			count += Printanswer(curr + dice, end, ans + curr + " ", ladder);

			// }
		}
		return count;

	}

	public static int[] makeladder(int n) {
		int[] ladder = new int[n + 1];
		boolean[] prime = PrimeSieve(n);
		int i = 0, j = n;
		while (i < j) {
			while (i < j && prime[i]) {
				i++;
			}
			while (i < j && prime[j]) {
				j--;
			}
			if (i < j) {
				ladder[i] = j;
				i++;
				j--;
			}
		}
		return ladder;
	}

	// jis index pe false aagya iska mtlb index prime hai
	public static boolean[] PrimeSieve(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// prime number nhi h
		prime[1] = true;// prime number nhi h

		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i] == false) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[j * i] = true;// marked prime nhi hai
				}
			}

		}
		return prime;

	}

}
