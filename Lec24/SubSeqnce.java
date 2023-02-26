package Lec24;

public class SubSeqnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PrintSubSeq(str);
	}
	public static void PrintSubSeq(String str) {

		int len = str.length();
		for (int i = 0; i < (1 << len); i++) {
			Pattern(i, str);

		}

	}
	public static void Pattern(int i, String str) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i != 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();
	}

}
