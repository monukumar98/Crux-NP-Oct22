package Lec38;

import java.util.*;

public class BinaryTree {

	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {// has left child
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {// has right child
			nn.right = CreateTree();
		}

		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = s + nn.data;
		s = "<--" + s + "-->";
		if (nn.left != null) {
			s = nn.left.data + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.data;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int left = max(nn.left);
		int right = max(nn.right);

		return Math.max(left, Math.max(right, nn.data));
	}

	public boolean find(int item) {

		return find(this.root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.data == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;
	}

	public int ht() {

		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

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
		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.data + " ");
		INOrder(node.right);
	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		if (node == null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void levelorder() {
		// LinkedList<Node> q = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.remove();// remove first
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				q.add(rv.left);// last me add krega
			}
			if (rv.right != null) {
				q.add(rv.right);// last me add krega
			}
		}
		System.out.println();
	}

}
