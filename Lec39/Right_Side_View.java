package Lec39;

import java.util.*;

public class Right_Side_View {
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
		public List<Integer> rightSideView(TreeNode root) {

			List<Integer> ll = new ArrayList<>();
			View(root, ll, 0);
			return ll;
		}

		int maxdepth = -1;

		public void View(TreeNode root, List<Integer> ll, int curr) {
			if (root == null) {
				return;
			}
			if (maxdepth < curr) {
				ll.add(root.val);
				maxdepth = curr;
			}
			View(root.right, ll, curr + 1);
			View(root.left, ll, curr + 1);

		}
	}
}
