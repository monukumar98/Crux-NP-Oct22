package Doubt_Class_leetCode;

import java.util.ArrayList;
import java.util.List;

public class SubSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		PrintSubSet(arr, 0, ll, ans);
		System.out.println(ans);

	}

	public static void PrintSubSet(int[] arr, int idx, List<Integer> ll, List<List<Integer>> ans) {
		// System.out.println(ll);
		ans.add(new ArrayList<Integer>(ll));
		for (int i = idx; i < arr.length; i++) {
			ll.add(arr[i]);
			PrintSubSet(arr, i + 1, ll, ans);
			ll.remove(ll.size() - 1);

		}

	}

}
