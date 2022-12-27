package Doubt_Class;

public class MaximumSum_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int[] arr2 = { 1, 5, 7, 8, 10, 15, 16, 19 };
		System.out.println(MaximumSumPath(arr1, arr2));

	}

	public static int MaximumSumPath(int[] arr1, int[] arr2) {

		int i = 0;
		int j = 0;
		int sum1 = 0;// 1st Array
		int sum2 = 0;// 2nd Array
		int ans = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				sum2 = sum2 + arr2[j];
				j++;
			} else if (arr1[i] < arr2[j]) {
				sum1 = sum1 + arr1[i];
				i++;
			} else {
				ans += Math.max(sum2, sum1) + arr1[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		while (j < arr2.length) {
			sum2 = sum2 + arr2[j];
			j++;
		}

		while (i < arr1.length) {
			sum1 = sum1 + arr1[i];
			i++;
		}
		ans += Math.max(sum2, sum1);
		return ans;

	}

}
