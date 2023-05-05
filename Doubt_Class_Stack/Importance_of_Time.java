package Doubt_Class_Stack;

import java.util.LinkedList;
import java.util.Scanner;

public class Importance_of_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> calling = new LinkedList<>();
		LinkedList<Integer> processes = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			calling.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			processes.add(sc.nextInt());
		}
		System.out.println(time(calling, processes));
	}

	public static int time(LinkedList<Integer> calling, LinkedList<Integer> processes) {
		int t = 0;
		while (!calling.isEmpty()) {
			if (calling.peek() == processes.peek()) {
				calling.remove();
				processes.remove();
			} else {
				int ii = calling.remove();
				calling.add(ii);
			}
			t++;
		}
		return t;
	}

}
