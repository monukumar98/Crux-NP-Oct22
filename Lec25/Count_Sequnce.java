package Lec25;

public class Count_Sequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Subsequnce("abc", "");
		System.out.println("\n"+Subsequnce1("abc", ""));

	}

	static int count = 0;

	public static int Subsequnce1(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		char ch = ques.charAt(0);
		int a1 = Subsequnce1(ques.substring(1), ans);
		int b1 = Subsequnce1(ques.substring(1), ans + ch);
		return a1 + b1;

	}

	public static void Subsequnce(String ques, String ans) {
		if (ques.length() == 0) {
			// System.out.print(ans + " ");
			count++;
			return;
		}

		char ch = ques.charAt(0);
		Subsequnce(ques.substring(1), ans);
		Subsequnce(ques.substring(1), ans + ch);

	}
}
