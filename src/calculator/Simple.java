package calculator;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
			
				System.out.println("Enter numbers : " );
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Addition = " +(a+b));
				System.out.println("Subtraction = " +(a-b));
				System.out.println("Multiplication = " + (a*b));
				System.out.println("Division = " + (a/b));
			}
		

}
