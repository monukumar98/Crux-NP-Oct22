package Lec45;

import java.util.ArrayList;

public class Generic_Heap<T extends Comparable<T>> {
	private ArrayList<T> list = new ArrayList<>();

	public void add(T item) {
		list.add(item);
		upheapify(list.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		// if (list.get(pi) > list.get(ci)) {
		if (islarge(list.get(ci), list.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);

		}

	}

	private void swap(int pi, int ci) {
		T pith = list.get(pi);
		T cith = list.get(ci);
		list.set(pi, cith);
		list.set(ci, pith);

	}

	public T remove() {
		swap(0, list.size() - 1);
		T rv = list.remove(list.size() - 1);
		downheapify(0);

		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
//		if (lci < list.size() && list.get(mini) > list.get(lci)) {
		if (lci < list.size() && islarge(list.get(lci), list.get(mini)) > 0) {
			mini = lci;
		}
		if (rci < list.size() && islarge(list.get(rci), list.get(mini)) > 0) {
			mini = rci;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}

	}

	public T get() {
		return list.get(0);
	}

	public void display() {
		System.out.println(list);
	}

	public int islarge(T o1, T o2) {
		return o1.compareTo(o2);

	}

}
