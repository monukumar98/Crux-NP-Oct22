package Lec45;

import Lec40.Cars;

public class Heap_Gen_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Generic_Heap<Cars> gp = new Generic_Heap<>();
gp.add(new Cars(200, 10, "White"));
gp.add(new Cars(1000, 20, "Black"));
gp.add(new Cars(345, 3, "Yellow"));
gp.add(new Cars(34, 89, "Grey"));
gp.add(new Cars(8907, 6, "Red"));
gp.display();
	}

}
