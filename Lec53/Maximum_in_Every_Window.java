package Lec53;

import java.util.Deque;
import java.util.LinkedList;

public class Maximum_in_Every_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] ans = Maximum(arr, k);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] Maximum(int[] arr, int k) {
		int max[] = new int[arr.length - k + 1];
		Deque<Integer> dq = new LinkedList<>();
		// 1st window
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
				dq.removeLast();
			}
			dq.add(i);// last me add krga
		}
		max[0] = arr[dq.getFirst()];
		int j = 1;
		for (int i = k; i < arr.length; i++) {
			while (!dq.isEmpty() && dq.getFirst() <= i - k) {
				dq.remove();// remove first;
			}
			while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
				dq.removeLast();
			}
			dq.add(i);
			max[j] = arr[dq.getFirst()];
			j++;
		}
		return max;

	}
}
