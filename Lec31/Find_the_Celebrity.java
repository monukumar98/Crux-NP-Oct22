package Lec31;

import java.util.Stack;

public class Find_the_Celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int celebrity(int n) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(i);

		}
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (knows(a, b) == true) {
				st.push(b);
			} else {
				st.push(a);
			}
		}
		int cand = st.pop();
		for (int i = 0; i < n; i++) {
			if (i != cand && (knows(i, cand) == false || knows(cand, i) == true)) {
				return -1;
			}

		}
		return cand;

	}

	private static boolean knows(int a, int b) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
