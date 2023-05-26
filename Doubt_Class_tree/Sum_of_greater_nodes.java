package Doubt_Class_tree;

import java.util.Scanner;

public class Sum_of_greater_nodes {
	public class Node {
		int val;
		Node left;
		Node right;
	}

	Node root;

	public Sum_of_greater_nodes(int[] in) {
		// TODO Auto-generated constructor stub
		root = createTree(in, 0, in.length - 1);
	}

	private Node createTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = in[mid];
		nn.left = createTree(in, si, mid - 1);
		nn.right = createTree(in, mid + 1, ei);
		return nn;
	}

	public void replaceSum() {
		
		replaceSum(root);
	}

	int sum = 0;

	private void replaceSum(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		replaceSum(node.right);
		sum = node.val + sum;
		node.val = sum;
		
		replaceSum(node.left);

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
		
			arr[i] = sc.nextInt();
		}
		Sum_of_greater_nodes sb = new Sum_of_greater_nodes(arr);
		sb.replaceSum();
		sb.PreOrder();
	}

}
