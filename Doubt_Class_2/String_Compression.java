package Doubt_Class_2;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 1;
		String ans = "";
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {

				ans = ans + str.charAt(i - 1) + count;

				count = 1;
			}

		}
		ans = ans + str.charAt(str.length() - 1) + count;
		System.out.println(ans);
	}

}
