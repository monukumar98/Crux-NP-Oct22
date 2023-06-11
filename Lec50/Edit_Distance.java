package Lec50;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		System.out.println(minOps(s, t, 0, 0));
	}

	public static int minOps(String s, String t, int i, int j) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = minOps(s, t, i + 1, j + 1);
		} else {
			int ii = minOps(s, t, i, j + 1);
			int d = minOps(s, t, i + 1, j);
			int r = minOps(s, t, i + 1, j + 1);
			ans = Math.min(d, Math.min(ii, r)) + 1;
		}
		return ans;

	}

}
