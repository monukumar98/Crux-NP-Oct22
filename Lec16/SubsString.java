package Lec16;

public class SubsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		PrintSubString(s);

	}

	public static void PrintSubString(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (isPalindrom(s1) == true) {
					System.out.println(s1);
				}
			}

		}

	}

	public static boolean isPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
