package Lec15;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		s = s + "bye";
		String s1 = new String("hello");
		s1 = s1 + "bye";
		System.out.println(s1);

		String s2 = "hello" + "bye";
		String s3 = s2;
		s2 = s2 + "okay";
		System.out.println(s2 == s3);
		System.out.println(s2);
		System.out.println(s3);

	}

}
