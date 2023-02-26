package Lec27;

public class Letter_Combinations {
	static String[] arr = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "189";
		Print(ques, "");

	}

	public static void Print(String Ques, String ans) {
		if (Ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = Ques.charAt(0);
		String key = arr[ch - '0'];
		for (int i = 0; i < key.length(); i++) {
			Print(Ques.substring(1), ans + key.charAt(i));

		}

	}

}
