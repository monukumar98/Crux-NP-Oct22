package Lec32;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	private static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			return;
		}

		int val = st.pop();
		Reverse(st);
		Insert_Down(st, val);

	}

	private static void Insert_Down(Stack<Integer> st, int item) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			st.push(item);
			return;
		}

		int val = st.pop();
		Insert_Down(st, item);
		st.push(val);
	}

}
