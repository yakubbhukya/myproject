package Javademo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Values: ");
		Double first= sc.nextDouble();
		Double Second= sc.nextDouble();
		System.out.println("Enter the Operators(+,-,*,/):");
		char ch=sc.next().charAt(0);
		Double result;
		switch(ch) {
		case '+': 
				result=first+Second;
				break;
		case '-': 
			result=first-Second;
			break;
		case '*': 
			result=first*Second;
			break;
		case '/': 
			result=first/Second;
			break;
			default:
				System.out.println("incorrect Operator");
				return;
		}
		
		System.out.printf("% .1f %c %.1f = %.1f",first,ch,Second,result);
	}

	
}
