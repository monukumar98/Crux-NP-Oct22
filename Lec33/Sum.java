package Lec33;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(2, 4));
		System.out.println(Add(2, 4, 8));
		System.out.println(Add(2, 3, 4, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 1));

	}

	public static int Add(int a, int b) {
		return a + b;
	}

	public static int Add(int a, int b, int c) {
		return a + b + c;
	}

	public static int Add(int a, int b, float c) {
		return (int) (a + b + c);
	}

	public static int Add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
