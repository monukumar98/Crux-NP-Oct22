package Lec4;

import java.util.Scanner;

public class Pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n / 2;
		int space = 1;

		int row = 1;
		while (row <= n) {
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int k = 1;
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			if (row <= n / 2) {// if(row<n/2+1)
				star--;
				space += 2;// space = space+2;

			} else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();
		}
	}

}
