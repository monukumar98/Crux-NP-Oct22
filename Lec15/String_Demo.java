package Lec15;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = s3;
		System.out.println(s1);
		System.out.println(s == s1);
		System.out.println(s3 == s1);
		System.out.println(s2 == s);
		System.out.println(s.charAt(2));
		System.out.println(s1.length());
		System.out.println(equals(s, s2));
		System.out.println(equals(s, s1));// apna wala 
		System.out.println(s.equals(s1));//  java wala

	}
	
	public static boolean equals(String s1, String s2) {
		if(s1==s2) {
			return true;
		}
		if(s1.length()!=s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
		
		
	}

}
