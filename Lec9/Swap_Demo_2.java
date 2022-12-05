package Lec9;

public class Swap_Demo_2 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 5, 6 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int[] k, int i, int j) {
		int temp = k[i];
		k[i] = k[j];
		k[j] = temp;

	}

}
