package Lec48;



public class StringBulider_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String_Demo();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hey");
		sb.append('a');
		sb.append(1);
//		sb.append(true);
//		sb.append(new int [4]);
		System.out.println(sb);
		System.out.println(sb.charAt(2));
		System.out.println(sb.length());
		sb.append("hellohelloo");
		System.out.println(sb.length());
		sb.append('s');
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		System.out.println(sb.delete(1, 3));
		String s=sb.toString();
		StringBuilder sb1 = new  StringBuilder(s);
		Stringbuilder_Demo();
		String_Demo();

	}

	public static void String_Demo() {
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s + i;
		}
		System.out.println(s);

	}

	public static void Stringbuilder_Demo() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		System.out.println(sb);

	}

}
