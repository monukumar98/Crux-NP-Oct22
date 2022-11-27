package Lec7;

public class FunDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		System.out.println("Bye");
		Addition();
		System.out.println("Hello");
		sub();
	}

	public static void Addition() {
		int a = 7;
		int b = 9;
		int c = a + b;

		System.out.println(c);
	}

	public static void sub() {
		int a = 7;
		int b = 9;
		int c = a - b;
		System.out.println(c);
	}
}
