package Lec25;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		GenerateParentheses(n, 0, 0, "", ll);
		System.out.println(ll);

	}

	public static void GenerateParentheses(int n, int open, int close, String ans, List<String> ll) {
		if (open == n && close == n) {
			// System.out.print(ans + " ");
			ll.add(ans);
			return;
		}

		if (open < n) {
			GenerateParentheses(n, open + 1, close, ans + "(", ll);
		}

		if (close < open) {
			GenerateParentheses(n, open, close + 1, ans + ")", ll);
		}
	}

}
