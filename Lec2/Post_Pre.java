package Lec2;

public class Post_Pre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		// System.out.println(a);
		// System.out.println(a++);
		// System.out.println(a);
		// int c = a++ + a-- + 8 - a-- - a++;
		// int c = a++ + a-- + 8 + a-- - a++ - a++;
		// System.out.println(c);
//		System.out.println(++a);
//		System.out.println(a);
		int c = ++a - --a + ++a - a-- + a++ + --a;
		System.out.println(c);
	}

}
