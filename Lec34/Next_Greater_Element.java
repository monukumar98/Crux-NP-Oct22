package Lec34;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 3, 23, 9, 15 };
		NGE(arr);

	}

	private static void NGE(int[] arr) {
		// TODO Auto-generated method stub
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ans.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}

	}

}
