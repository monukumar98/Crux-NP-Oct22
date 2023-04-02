package Lec33;

public class DynmaicStack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynmaicStack ds = new DynmaicStack();
		ds.push(1);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.Display();
		ds.push(60);
		ds.Display();
		

	}

}
