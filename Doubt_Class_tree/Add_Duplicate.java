package Doubt_Class_tree;
import java.util.*;
public class Add_Duplicate {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		public Node(){
			
		}
	}

	private Node root;
	private int size;

	public Add_Duplicate() {
		this.root = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int data) {
		this.add(data, this.root);
	}

	private void add(int data, Node node) {
		if (this.isEmpty()) {
			Node n = new Node(data, null, null);
			this.size++;
			this.root = n;
			return;
		} else {
			if (data > node.data && node.right == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.right = n;
			} else if (data < node.data && node.left == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.left = n;
			} else if (data > node.data) {
				add(data, node.right);
			} else if (data < node.data) {
				add(data, node.left);
			}
		}
	}

	public void display() {
		this.display(this.root);
	}

       


	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}	
	public void duplicate() {
	        this.duplicate(this.root);
	    }

	    private void duplicate(Node node) {
                //Your Code Goes Here
				if(node==null){
					return;
				}
				Node nn = new Node();
				nn.data=node.data;
				nn.left=node.left;
				node.left=nn;
				duplicate(node.left.left);
				duplicate(node.right);
	    }
	    
	    public static void main (String[] args) {
	        Add_Duplicate Main=new Add_Duplicate();
            Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        for(int i=0;i<n;i++){
	           Main.add(s.nextInt()); 
	        }
		    Main.duplicate();
		    Main.display();
	    }
}
