package Lec33;

import Lec28.Stack;

public class DynmaicStack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if (isfull()) {
			int[] narr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				narr[i]=arr[i];
			}
			arr= narr;
		}
		//
		super.push(item);

	}

}
