package Lec53;

public class Maximum_SubSum_Window_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 7, 5, 11, 3, 2, 1 };
		int k = 3;
	}

	public static int maximumsum(int[] arr, int k) {
		// 1st window
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int ans = sum;
		// sliding window
		for (int i = k; i < arr.length; i++) {
			sum = sum + arr[i] - arr[i - k];
			ans = Math.max(ans, sum);
		}
		return ans;

	}

}
