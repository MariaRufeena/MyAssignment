package Week1.Day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		int n = scanner.nextInt();
		scanner.close();
		boolean isprime = true;
		for (int i=2; i < n; i++) {
		
		if (n % 2 == 0) {
			isprime = false;
			break;
			}
		}
		
			if (isprime && n >1) {
	System.out.println("The number " +n+ " is a prime number");
}else {
	System.out.println("The number " +n+ " is not a prime number");
	}

}
}
