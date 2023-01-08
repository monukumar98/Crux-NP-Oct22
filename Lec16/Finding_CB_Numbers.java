package Lec16;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "699239";
		PrintSubString(s);

	}

	public static void PrintSubString(String s) {
		int count = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str = s.substring(i, j);
				// Long.parseLong(str)-->String to long
				// Integer.parseInt(str)--> string to int
				long n = Long.parseLong(str);
				if (iscbnumber(n) == true && isvisited(visited, i, j - 1) == true) {
					count++;
					for (int k = i; k < j; k++) {
						visited[k] = true;// marked as Cb Number

					}
				}
			}

		}
		System.out.println(count);
	}

	public static boolean isvisited(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub
		for (int i = si; i <= ei; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean iscbnumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}
}
