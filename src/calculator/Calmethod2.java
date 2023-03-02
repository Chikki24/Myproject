package calculator;

import java.util.Scanner;

public class Calmethod2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			{
			System.out.println("Enter 1st no : ");
			int a=scan.nextInt();
			System.out.println("Enter 2nd no : ");
			int b=scan.nextInt();

			int c = Sum(a , b);
			int c1 = Subtract(a,b);
			int c2 = Multiple(a,b);
			 float c3 = Divide(a,b);
			System.out.println("Sum : "+a+"+"+b+"="+c);
			System.out.println("Sub : "+a+"-"+b+"="+c1);
			System.out.println("Mul : "+a+"*"+b+"="+c2);
			System.out.println("Div : "+a+"/"+b+"="+c3);
				}
		}

			}

		public static int Sum(int a, int b)
		{
		 int c = a + b;
		return c;
		}
		public static int Subtract(int a, int b) 
		{
		int  c1 = a-b;
		return c1;
		}
		public static int Multiple(int a, int b)
		{
		int c2 = a*b;
		return c2;
		}
		public static float Divide(int a, int b)
		{
		float c3 = a/b;
		return c3;
		
	}

}
