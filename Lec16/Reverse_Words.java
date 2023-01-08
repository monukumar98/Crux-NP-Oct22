package Lec16;

public class Reverse_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    a good    example    ";
		System.out.println(Reverse(s));

	}

	public static String Reverse(String s) {
		s = s.trim();
		String[] arr = s.split("\s+");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}

		return ans.trim();

	}

}
