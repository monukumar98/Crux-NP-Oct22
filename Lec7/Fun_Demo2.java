package Lec7;

public class Fun_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 7;
		int b = 9;
		Addition(a, b);
		System.out.println("Hello");
		
	}

	public static void Addition(int a, int b) {

		int c = a + b;
		sub(c, a);
		System.out.println(c);
	}

	public static void sub(int a, int b) {

		int c = a - b;
		System.out.println(c);
	}

}
