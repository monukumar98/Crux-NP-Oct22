package Lec8;

public class Static_Var {
	static int val = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 9;
		fun(8, 5);
		System.out.println(val);

	}
	public static void fun(int x, int y) {
		x = x + 9;
		System.out.println(x);
		System.out.println(val);
		int val = 9;
		Static_Var.val = Static_Var.val + 6;
		System.out.println(val);

	}

}
