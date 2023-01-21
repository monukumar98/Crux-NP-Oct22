package Lec17;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.add(1, -9);
		System.out.println(list);

		System.out.println(list.remove(2));
		System.out.println(list);
		list.set(1, -11);// update krega
		System.out.println(list);
		list.add(31);
		list.add(7);
		list.add(91);
		list.add(311);
		list.add(71);
		list.add(971);
		list.add(310);
		
		list.add(-971);
		System.out.println(list.size());
		System.out.println(list);
		for (int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for(int val:list) {
			System.out.print(val+" ");
		}
		

	}

}
