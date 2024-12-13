package Week1.Day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		int n = scanner.nextInt();
		scanner.close();
		int a = 0;
		int b = 1;
		System.out.println("Fibonacci Series: ");
		for(int i =1; i<n; i++) {
			System.out.println( a + " ");
			int sum = a+b;
			a=b;
			b=sum;
		}
		

	}

}
