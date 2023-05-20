package Lec44;

public class LinkedList<T> {

	public class Node {
		T val;
		Node next;
	}

	private Node head;
	private int size;
	private Node tail;

	public void Addfirst(T item) {

		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}

	}

	public void Addlast(T item) {
		if (size == 0) {
			Addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;

		}

	}

	public void Addatindex(T item, int k) throws Exception {
		if (k == 0) {
			Addfirst(item);
		} else if (k == size) {
			Addlast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;

		}

	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k sahi dede");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public T getfirst() {
		return head.val;
	}

	public T getlast() {
		return tail.val;
	}

	public T getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

	public T removeFirst() {
		Node rv = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			size--;
			rv.next = null;

		}
		return rv.val;
	}

	public T removelast() throws Exception {

		if (size == 1) {
			return removeFirst();
		} else {
			Node rv = GetNode(size - 2);
			T val = tail.val;

			rv.next = null;
			tail = rv;
			size--;
			return val;
		}
	}

	public T removeatindex(int k) throws Exception {
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node k_1th = GetNode(k - 1);
			Node kth = k_1th.next;
			k_1th.next = kth.next;
			kth.next = null;
			size--;
			return kth.val;

		}
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.Addlast("Raj");
		ll.Addlast("Kaju");
		ll.Addlast("Anku");
		ll.Addlast("Puneet");
		ll.Addlast("Rupesh");
		ll.Addlast("Amisha");
		ll.Display();
	}

}