package Javademo;

import java.util.Scanner;

public class ArmstrongDemo {

	public static void main(String[] args) {
		int sum=0,a,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		temp=number;
		while(number>0)
		{
			a=number%10;
			sum=sum+(a*a*a);
			number=number/10;
			
		}

		if(temp==sum)
			System.out.println("The given number is Palindromw");
		else
			System.out.println("The given number is not Palindrome");
	}

}
