package Doubt_Class_tree;

import java.util.Scanner;

public class Largest_BST {

	public class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int i) {
			// TODO Auto-generated constructor stub
			val = i;

		}
	}

	TreeNode root;

	public Largest_BST(int[] preorder, int[] inorder) {
		// TODO Auto-generated constructor stub
		root = buildTree(preorder, inorder);
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return Bulid(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
	}

	public TreeNode Bulid(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {
		if (plo > phi || ilo > ihi) {
			return null;
		}

		TreeNode node = new TreeNode(pre[plo]);
		int idx = Search(in, ilo, ihi, pre[plo]);
		int net = idx - ilo;
		node.left = Bulid(pre, in, plo + 1, plo + net, ilo, idx - 1);
		node.right = Bulid(pre, in, plo + net + 1, phi, idx + 1, ihi);
		return node;

	}

	public int Search(int[] in, int ilo, int ihi, int item) {
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == item) {
				return i;
			}
		}
		return 0;
	}

	public BstPair ValidBst(TreeNode root) {
		if (root == null) {
			return new BstPair();
		}
		BstPair lbstp = ValidBst(root.left);
		BstPair rbstp = ValidBst(root.right);
		BstPair sbstp = new BstPair();
		sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));
		sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
		if (lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min > root.val) {
			sbstp.isbst = true;
			sbstp.size = lbstp.size + rbstp.size + 1;

		} else {
			sbstp.isbst = false;
			sbstp.size = Math.max(lbstp.size, rbstp.size);
		}
		return sbstp;
	}

	class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		int size = 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] pre = new int[n];
		for (int i = 0; i < pre.length; i++) {
			pre[i] = sc.nextInt();
		}
		int[] in = new int[n];
		for (int i = 0; i < in.length; i++) {
			in[i] = sc.nextInt();

		}
	}
}
