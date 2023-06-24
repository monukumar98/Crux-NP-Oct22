package Lec53;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(countProduct(arr, k));

	}

	public static int countProduct(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int count = 0;
		int p = 1;
		while (ei < arr.length) {
			// growing
			p = p * arr[ei];
			// shrinking
			while (p >= k && si<=ei) {
				p /= arr[si];
				si++;
			}
			// answer
			count += (ei - si + 1);
			ei++;

		}
		return count;

	}

}
