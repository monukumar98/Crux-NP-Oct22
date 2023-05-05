package Doubt_Class_Stack;

import java.util.*;

public class Hoodies_At_Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> order = new LinkedList<>();
		ArrayList<Queue<Integer>> id = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			id.add(new LinkedList<>());
		}
		for (int i = 0; i < n; i++) {
			char ch = sc.next().charAt(0);
			
			if (ch == 'E') {
				int course = sc.nextInt();
				int roll = sc.nextInt();
				if (id.get(course).size() == 0) {
					id.get(course).add(roll);
					order.add(course);
				} else {
					id.get(course).add(roll);
				}

			} else {
				int course = order.peek();
				int roll = id.get(course).remove();
				System.out.println(course + " " + roll);
				if (id.get(course).size() == 0) {
					order.remove();
				}

			}

		}
	}

}
