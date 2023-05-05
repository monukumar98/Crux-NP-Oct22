package Doubt_Class_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Playing_with_cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < n; i++) {
			s.push(sc.nextInt());
		}
		for (int i = 1; i <= q; i++) {
			int ithprime = nthprime(i);
			Stack<Integer> A = new Stack<>();
			Stack<Integer> B = new Stack<>();
			while (!s.isEmpty()) {
				int item = s.pop();
				if (item % ithprime == 0) {
					B.push(item);
				} else {
					A.push(item);
				}
			}
			while (!B.isEmpty()) {
				System.out.println(B.pop());
			}
			s = A;

		}
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

	public static int nthprime(int n) {
		int count = 0;
		int i = 2;
		while (count < n) {
			if (Isprime(i)) {
				count++;
			}
			i++;
		}
		return i - 1;

	}

	public static boolean Isprime(int i) {
		int div = 2;
		while (div * div <= i) {
			if (i % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
