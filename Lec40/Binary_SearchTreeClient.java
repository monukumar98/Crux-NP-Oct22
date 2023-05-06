package Lec40;

public class Binary_SearchTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = { 10, 20, 34, 56, 78, 89, 90 };
		BinarySearch_tree bst = new BinarySearch_tree(in);
		bst.PreOrder();
		System.out.println(bst.min());

	}

}
