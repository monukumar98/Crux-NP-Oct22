package Doubt_Class_Recursion;

import java.util.Scanner;

public class Replace_all_PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			Replace_allPI(s, "");
			System.out.println();
		}
	}

	public static void Replace_allPI(String ques, String ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		if (ques.length() >= 2 && ques.charAt(0) == 'p' && ques.charAt(1) == 'i') {
			Replace_allPI(ques.substring(2), ans + "3.14");
		} else {
			Replace_allPI(ques.substring(1), ans + ques.charAt(0));
		}

	}

}
