package Lec51;

import java.util.Arrays;

public class Counting_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
		arr = Sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] Sort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int[] frq = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			frq[arr[i]]++;

		}
		for (int i = 1; i < frq.length; i++) {
			frq[i] = frq[i - 1] + frq[i];

		}
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[frq[arr[i]] - 1] = arr[i];
			frq[arr[i]]--;
		}
		return ans;

	}

}
