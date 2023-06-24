package Lec53;

import java.util.Scanner;

public class Kartik_Bhaiya_and_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();
		int flipa = maximumlength(str, k, 'a');
		int flipb = maximumlength(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));
	}

	private static int maximumlength(String str, int k, char ch) {
		// TODO Auto-generated method stub
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < str.length()) {
			// growing
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// shrink
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// answer
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}
