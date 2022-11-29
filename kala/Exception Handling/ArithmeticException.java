package exceptionHandling;

import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
		int a, b, c;
		try {
			System.out.println("Enter two integers");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Result: " +c);
			

			}catch(ArithmeticException e) {
				System.out.println("Please do not enter value 0"); 
			}
		
		System.out.println("More code");
	}
}
