package Doubt_Class_Recursion;

public class Codes_of_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "8214";
		PrintString(s, "");

	}

	public static void PrintString(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);
		PrintString(ques.substring(1), ans + (char) (ch + 16));
		if (ques.length() >= 2) {
			String s1 = ques.substring(0, 2);
			int num = Integer.parseInt(s1);
			if (num <= 26) {
				PrintString(ques.substring(2), ans + (char) (64 + num));
			}

		}

	}

}
