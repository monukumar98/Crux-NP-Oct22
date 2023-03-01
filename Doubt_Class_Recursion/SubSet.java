package Doubt_Class_Recursion;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		SubSetPrint(arr, 0, "", 3, 0);

	}

	public static void SubSetPrint(int[] arr, int i, String ans, int target, int sum) {
		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
			}
			return;
		}

		SubSetPrint(arr, i + 1, ans + arr[i] + " ", target, sum + arr[i]);
		SubSetPrint(arr, i + 1, ans, target, sum);

	}
}
