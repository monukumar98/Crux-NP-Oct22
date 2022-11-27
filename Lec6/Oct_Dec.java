package Lec6;

import java.util.Scanner;

public class Oct_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			n /= 10;// n= n/2;
			mul = mul * 8;
		}
		System.out.println(sum);

	}

}
