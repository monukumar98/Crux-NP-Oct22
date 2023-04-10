package Lec31;

import Lec29.DynamicQueue;

public class Stack_Using_queue {

	DynamicQueue q;

	public Stack_Using_queue() {
		// TODO Auto-generated constructor stub
		q = new DynamicQueue();
	}

	public boolean isEmpty() {
		return q.size() == 0;
	}

	public int size() {
		return q.size();
	}

	public void push(int item) throws Exception {
		DynamicQueue hlp = new DynamicQueue();
		while (!q.isEmpty()) {
			hlp.Enqueue(q.Dequeue());
		}
		q.Enqueue(item);
		while (!hlp.isEmpty()) {
			q.Enqueue(hlp.Dequeue());
		}

	}

	public int pop() throws Exception {
		return q.Dequeue();

	}

	public int peek() throws Exception {
		return q.Getfront();
	}
}
