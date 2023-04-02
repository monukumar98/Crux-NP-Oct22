package Lec33;

import Lec28.Queue;

public class DynamicQueue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] narr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (i + front) % arr.length;
				narr[i] = arr[idx];

			}
			arr = narr;
			front = 0;
		}

		super.Enqueue(item);
	}

}
