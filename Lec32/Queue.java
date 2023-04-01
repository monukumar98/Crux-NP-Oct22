package Lec32;

public class Queue {

	private int[] arr;
	private int front = 0;
	private int size = 0;//

	public Queue() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		arr = new int[cap];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Queue is Full");
		}
		int idx = (size + front) % arr.length;
		arr[idx] = item;
		size++;
	}

	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int val = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return val;
	}

	public int Getfront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		int val = arr[front];

		return val;
	}

	public int size() {
		return size;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % arr.length;
			System.out.print(arr[idx] + " ");

		}
		System.out.println();
	}
}
