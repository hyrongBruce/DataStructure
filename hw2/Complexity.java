package hw2;

import javax.security.auth.x500.X500Principal;

public class Complexity {

	/* CS-570-hw2
	 * Author:Haoyu Rong
	 * CWID:10438329
	 */
	
	/* public static void method1(int n): a method that has time complexity
	 * O(n^2). 
	 * public static void method2(int n): a method that has time
	 * complexity O(n^3). 
	 * public static void method3(int n): a method that has
	 * time complexity O(logn) 
	 * public static void method4(int n): a method that
	 * has time complexity O(nlogn) 
	 * public static void method5(int n): a method
	 * that has time complexity O(loglogn)
	 * (Optional) public static int method6(int n): a method that 
	 * has time complexity O(2^n).
	 */
	//data field
	private static int sum =0 ;
	private static int count = 0;
	
	// Static Methods
	/* Using System.nanoTime() to estimate the seconds consumed;
	 * By setting x1 before starting loop, setting x2 in the end of the loop
	 * x2-x1 shows the nanoseconds consumed
	 * 
	 * Using "counter" to count how many loops were executed;
	 * */

	// O(n^2)
	public static void method1(int n) {
		int counter = 0;
		long x1 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				counter++;
				System.out.println("O(n^2):Operation  " + counter);
			}
		}
		long x2 = System.nanoTime();
		System.out.println("Method1 Nano Sceond Consumed: ");
		System.out.println(x2-x1);
	}

	// O(n^3)
	public static void method2(int n) {
		int counter = 0;
		long x1 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					counter++;
					System.out.println("O(n^3):Operation  " + counter);
				}
			}
		}
		long x2 = System.nanoTime();
		System.out.println("Method2 Nano Sceond Consumed: ");
		System.out.println(x2-x1);
	}

	// O(logn)
	public static void method3(int n) {
		int counter = 0;
		long x1 = System.nanoTime();
		for (int i = 1; i < n; i = i * 2) {
			counter++;
			System.out.println("O(logn):Operation  " + counter);
		}
		long x2 = System.nanoTime();
		System.out.println("Method3 Nano Sceond Consumed: ");
		System.out.println(x2-x1);
	}

	// O(nlogn)
	public static void method4(int n) {
		int counter = 0;
		long x1 = System.nanoTime();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j = j * 2) {
				counter++;
				System.out.println("O(nlogn):Operation  " + counter);
			}
		}
		long x2 = System.nanoTime();
		System.out.println("Method4 Nano Sceond Consumed: ");
		System.out.println(x2-x1);
	}

	// O(log(logn))
	// total time = 2^i, and i = i*2*2, so it would be log(log n)  
	public static void method5(int n) {
		int counter = 0;
		long x1 = System.nanoTime();
		for(int i = 2;i<n;i=i*i){
			counter++;
			System.out.println("O(log(logn)):Operation  " + counter);
		}
		long x2 = System.nanoTime();
		System.out.println("Method5 Nano Sceond Consumed: ");
		System.out.println(x2-x1);
	}
	
	/* O(2^n) No.1
	 * alike a full binary tree
	 * x(n)=x(n-1)+x(n-1)
	 * so finally count=2^n-1
	 */
	public static int method6(int n){
		count++;
		if(n<=1){
			 sum = sum + n;
			 System.out.println("O(2^n) Operation:"+ count);
			 return sum;
		}else{
			System.out.println("O(2^n) Operation:"+ count);
			 return sum = sum + method6(n-1)+method6(n-1);
		}
	}
	
	/* O(2^n) No.2
	 * It's a trick
	 * just by fixing the "i < n" to "i < 2^n"
	 * */
//	public static void method7(int n){
//		int counter = 0;
//		long x1 = System.nanoTime();
//		// a little trick
//		for(int i=0;i<Math.pow(2, n);i++){
//			counter++;
//			System.out.println("O(2^n):Operation  " + counter);
//		}
//		long x2 = System.nanoTime();
//		System.out.println("Method7 Nano Sceond Consumed: ");
//		System.out.println(x2-x1);
//	}
	

	
	
	// test & print the methods here
	public static void main(String[] args) {
		Complexity.method1(10);
		Complexity.method2(7);
		Complexity.method3(16);
		Complexity.method4(16);
		Complexity.method5(65535);
		System.out.println(Complexity.method6(10));
//		Complexity.method7(4);
	}
}
