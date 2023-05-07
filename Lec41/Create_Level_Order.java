package Lec41;

import java.util.*;

public class Create_Level_Order {
	public class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Create_Level_Order() {
		// TODO Auto-generated constructor stub
		root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		q.add(nn);
		while (!q.isEmpty()) {
			Node rn = q.poll();// remove first
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node n = new Node();
				n.val = c1;
				rn.left = n;
				q.add(n);
			}
			if (c2 != -1) {
				Node n = new Node();
				n.val = c2;
				rn.right = n;
				q.add(n);
			}

		}
		return nn;

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
		Create_Level_Order cl = new Create_Level_Order();
		cl.PreOrder();
	}
	// 10 20 30 40 -1 -1 50 -1 -1 60 -1 -1 -1

}
