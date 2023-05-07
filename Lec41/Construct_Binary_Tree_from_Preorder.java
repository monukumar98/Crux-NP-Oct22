package Lec41;

public class Construct_Binary_Tree_from_Preorder {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
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
	}
}
