package calculator;

import java.util.Scanner;

public class Calclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter a num : ");
				int a = scan.nextInt();
				System.out.println("Enter other num : ");
				long b = scan.nextInt();
				System.out.println("Enter the operator");
				String opr=scan.next();
			
				switch(opr)
				{
				case "+" :
					System.out.println(" Addition " +(a+b));
				break;
				case "-" :
					System.out.println("Subtaction " +(a-b));
				break;
				case "*" :
					System.out.println(" Multiplication " +(a*b));
				break;
				case "/" :
					System.out.println(("Dividion " +a/b));
				break;
				/*{
					if(a==0||b==0)
					{
						System.out.println("Zero is not Divisible");
					}
				}*/
		default:System.out.print("An Invalid Operator");
					
				}
			
	}	
	}
