package Lec17;

public class Wrapper_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		int a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		int i = 189;
		Integer ii = i;// autoBoxing
		System.out.println(ii);
		System.out.println(i);
		Long l = 1899l;
		long ll = l;// unBoxing

		Integer x = 19;
		Integer x1 = 19;

		Integer y = 781;
		Integer y1 = 781;
		System.out.println(x == x1);
		System.out.println(y == y1);
		Character ch = 'ê';
		Character ch1 = 'ê';
		char c =(char)(234); 
		Character ch2 = 'a';
		Character ch3 = 'a';
		System.out.println(c);
		System.out.println(ch==ch1);
		System.out.println(ch2==ch3);

	}

}
