package Lec45;


import java.util.*;

public class Kth_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 5, 1, 2, 4, 5, 3, 13, 4, 4, 6, 6, 6, 7, 7, 6, 11, 12, 5 };
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		// PriorityQueue<Integer> pq = new
		// PriorityQueue<>(Collections.reverseOrder());//max heap
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] > pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		System.out.println(pq.peek());

	}

}
