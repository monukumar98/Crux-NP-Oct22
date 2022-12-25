package Lec13;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];
		arr[0] = new int[5];
		arr[1] = new int[2];
		arr[2] = new int[7];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

	}

}
