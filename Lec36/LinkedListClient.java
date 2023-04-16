package Lec36;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.Addfirst(10);
		ll.Addfirst(-10);
		ll.Addfirst(4);
		ll.Display();
		ll.Addlast(80);
		ll.Addatindex(3, 2);
		ll.Display();
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
        System.out.println(ll.getatindex(2));
        
	}

}
