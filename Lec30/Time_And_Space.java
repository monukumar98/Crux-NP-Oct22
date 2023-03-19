package Lec30;

public class Time_And_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//
//		for (int i = 0; i < 1000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		int n = 100000;

		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// O Log(N)
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
		}

		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}

		while (i <= n) {
			System.out.println("Hey");
			// Log(N) base 6
			i *= 2;
			i *= 3;
		}
		int k = 4;
		while (n > 0) {
			System.out.println("Hey");

			n /= 2;
			n /= 3;
			// Log(N) base 6
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N/k)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// Log(N) base k
			i *= k;

		}
	
		while (n > 0) {
			System.out.println("Hey");
            //O(N)
			n = n - 1;
		}
		
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				//O(N^2)
			}
		}
		
		
		for  (i = 0; i <n; i++) {
			for (int j = i+1; j <n; j++) {
				System.out.println("hey");
				//O(N^2)
			}
		}
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			
			//Sqrt(N)
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for ( k = 1; k <= n / 2; k++) {
					System.out.println("hey");
				}
			}
		}
		

		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
			// O Log(N)
		}
		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for( k=1; k<=n; k=k*2) {
					System.out.println("hey");
					//O(N^2) logn
				}
			}
		}
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
			}
		}
		
	}

}
