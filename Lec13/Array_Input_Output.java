package Lec13;

import java.util.Scanner;

public class Array_Input_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// no of row
		int m = sc.nextInt();// no of col
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		
		Display(arr);

	}

	public static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
