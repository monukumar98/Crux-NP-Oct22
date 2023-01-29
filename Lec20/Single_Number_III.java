package Lec20;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 8, 9, 13, 8, 7, 9, 3, 13 };
		Single_Number(arr);

	}

	public static void Single_Number(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans ^= arr[i];
		}
		int mask = (ans & (~(ans - 1)));// 010
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((mask & arr[i]) != 0) {
				a = a ^ arr[i];
			}
		}
		int b = a ^ ans;
		System.out.println(a + " " + b);
	}

}
