package Lec9;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 4, 5, 6 };
		System.out.println(Search(arr, 4));

	}

	public static int Search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {
				return i;
			}

		}

		return -1;
	}
}
