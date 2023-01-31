package Doubt_Class_2;

import java.util.Scanner;

public class Dnf_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		int i = 0;
		int l = 0;// sort 0 ke liye
		int r = arr.length - 1;// sort 2 ke liye
		while (i <= r) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[l];
				arr[l] = temp;
				i++;
				l++;
			} else if (arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[r];
				arr[r] = temp;
				r--;

			} else {
				i++;
			}
		}
	}

}
