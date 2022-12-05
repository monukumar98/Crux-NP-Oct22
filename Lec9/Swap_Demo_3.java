package Lec9;

public class Swap_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 4 };
		int[] other = { 20, 13, 11, 9 };
		System.out.println(arr[0] + " " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + " " + other[0]);
	}

	public static void Swap(int[] arr, int[] other) {
		// TODO Auto-generated method stub
		int[] temp = arr;
		arr = other;
		other = temp;

	}

}
