package Lec40;



public class Delete_Node_in_a_BST {

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
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null) {
				return null;
			}
			if (root.val < key) {
				root.right = deleteNode(root.right, key);
			} else if (root.val > key) {
				root.left = deleteNode(root.left, key);
			} else {
				// 1 or 0 child
				if (root.left == null) {
					return root.right;
				} else if (root.right == null) {
					return root.left;
				} else {
					int min = min(root.right);
					root.val = min;
					root.right = deleteNode(root.right, min);
				}
			}
			return root;

		}

		private int min(TreeNode node) {
			// TODO Auto-generated method stub
			if (node == null) {
				return Integer.MAX_VALUE;
			}
			int left = min(node.left);
			return Math.min(left, node.val);
		}
	}

}
