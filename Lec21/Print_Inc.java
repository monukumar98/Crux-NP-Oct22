package Lec21;

public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PI(n);

	}

	public static void PI(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}

		PI(n - 1);
		System.out.println(n);

	}

}
