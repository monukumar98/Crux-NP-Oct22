package Doubt_Class;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
		System.out.println(Circular_Sum(arr));
	}

	public static int Circular_Sum(int[] arr) {

		int len_Sum = MaximumSum(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			arr[i] *= -1;
		}
		int mid_sum = MaximumSum(arr);
		int curr = sum + mid_sum;
		if (curr == 0) {
			return len_Sum;
		}

		return Math.max(curr, len_Sum);

	}

	public static int MaximumSum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
