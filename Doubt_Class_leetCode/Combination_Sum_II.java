package Doubt_Class_leetCode;

import java.util.Arrays;

public class Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(arr);
		int target = 8;
		Combination_Sum2(arr, target, 0, "");
	}

	public static void Combination_Sum2(int[] arr, int target, int idx, String ans) {
		if (target == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			if (i > idx && arr[i] == arr[i - 1]) {
				continue;
			}
			if (target >= arr[i]) {
				Combination_Sum2(arr, target - arr[i], i + 1, ans + arr[i]);
			}

		}
	}

}
